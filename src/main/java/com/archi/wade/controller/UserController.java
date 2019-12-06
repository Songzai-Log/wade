package com.archi.wade.controller;

import com.archi.wade.model.Feedback;
import com.archi.wade.model.Wade;
import com.archi.wade.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;


@RestController
public class UserController {
    @Resource
    UserService userService;

    @PostMapping("Wade2Chinese")
    public String Wade2Chinese(String wade) {
        String s = "";
        String retstr="";
        List<Wade> wadeList = userService.Wade2Chinese(wade.toUpperCase());
        if (wadeList.size() != 0) {
            for (Wade wade1 : wadeList) {
                s = s + wade1.getChinese() + "，";
            }
            s = s.substring(0, s.length() - 1);
            retstr ="document.getElementById(\"chinese\").innerText=\"\";"+
                    "document.getElementById(\"chinese\").innerText=\"" + s + "\";";
        } else {
            retstr ="document.getElementById(\"chinese\").innerText=\"\";"+
                    "document.getElementById(\"chinese\").placeholder=\"请输入中文\";";
        }
        return retstr;
    }
    @PostMapping("Chinese2Wade")
    public String Chinese2Wade(String chinese){
        String s = "";
        String retstr="";
        List<Wade> wadeList = userService.Chinese2Wade(chinese);
        if (wadeList.size() != 0) {
            for (Wade wade1 : wadeList) {
                s = s + wade1.getWade() + "，";
            }
            s = s.substring(0, s.length() - 1);
            retstr = "document.getElementById(\"wade\").innerText=\"\";"+
                    "document.getElementById(\"wade\").innerText=\"" + s + "\";";
        } else {
            retstr = "document.getElementById(\"wade\").innerText=\"\";"+
                    "document.getElementById(\"wade\").placeholder=\"请输入威妥玛\";";
        }
        return retstr;
    }

   @PostMapping("/insertFeedback")
    public String insertFeedback(String feedback,String info){
       int id=0;
       Date date = new Date();
       feedback=feedback+info;
       int state=0;
       Feedback feedback1 = new Feedback(id,date,feedback,state);
       userService.insertFeedback(feedback1);
       return "success";
    }


    @PostMapping("/CarouselById")
    public String CarouselById(int id){
        int uuid=(int)(1+Math.random()*(1000-1+1));
        String wade = "";
        String chinese="";
        String retstr="";
        List<Wade> wadeList = userService.CarouselById(uuid);
        if (wadeList.size() != 0) {
            for (Wade wade1 : wadeList) {
                wade = wade + wade1.getWade();
                chinese= chinese+wade1.getChinese();
            }
            retstr = "document.getElementById(\"carousel1\").innerHTML=\"" + wade+ "<br><br><br>"+ "\";" +
                    "setTimeout( function(){\n" +
                    "document.getElementById(\"carousel1\").innerHTML=\"" + wade+ "<br><br>"+ chinese+"\"" +
                    "}, 1 * 1000 );";
        }
        return retstr;
    }
}
