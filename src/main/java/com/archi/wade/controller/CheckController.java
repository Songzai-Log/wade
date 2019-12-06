package com.archi.wade.controller;

import com.archi.wade.model.Wade;
import com.archi.wade.service.CheckService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CheckController {
    @Resource
    CheckService checkService;

    @PostMapping("/getFeedbackInit")
    public String getFeedbackInit(){
        return checkService.findALLFeedback();
    }

    @PostMapping("/deleteFeedback")
    public String deleteFeedback(int id) {
        checkService.deleteFeedback(id);
        String retStr= "initHtml();alert('删除成功！');";
        return retStr;
    }

    @PostMapping("/insertWade")
    public String insertWade(int id,String wade,String chinese) {
        Wade wade1 = new Wade(id,wade,chinese);
        checkService.insertWade(wade1);
        return "success";
    }

    @PostMapping("/deleteWade")
    public String deleteWade(int id,String wade,String chinese) {
        Wade wade1 = new Wade(id,wade,chinese);
        checkService.deleteWade(wade1);
        return "success";
    }

    @PostMapping("/updateWade")
    public String updateWade(int oldid,String oldwade,String oldchinese,int newid,String newwade,String newchinese) {
        Wade wade1 = new Wade(oldid,oldwade,oldchinese);
        checkService.deleteWade(wade1);
        Wade wade2 = new Wade(newid,newwade,newchinese);
        checkService.insertWade(wade2);
        return "success";
    }
}
