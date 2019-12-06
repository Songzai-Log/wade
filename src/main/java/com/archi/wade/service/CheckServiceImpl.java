package com.archi.wade.service;

import com.archi.wade.dao.FeedbackDao;
import com.archi.wade.dao.WadeDao;
import com.archi.wade.model.Feedback;
import com.archi.wade.model.Wade;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CheckServiceImpl implements CheckService {
    @Resource
    FeedbackDao feedbackDao;

    @Resource
    WadeDao wadeDao;

    @Override
    public String findALLFeedback() {
        String feedbackInit="";
        List<Feedback> sfb=feedbackDao.findALLFeedback();
        if(sfb.size()>0){
            for(Feedback fb:sfb){
                feedbackInit +="$(\"table tbody\").append(\"<tr align=\\\"center\\\">" +
                        "<td>"+fb.getId()+"</td>" +
                        "<td>"+fb.getFeedback()+"</td>" +
                        "<td>"+fb.getF_date()+"</td>" +
                        "<td>"+fb.getState()+"</td>" +
                        "<td><input type=\\\"button\\\" align=\\\"right\\\" value=\\\"删除\\\" class=\\\"btn btn-danger\\\" onclick=\\\"deletefeedback("+fb.getId()+")\\\"></td>" +
                        "</tr>\");\n";
            }
        }
        return feedbackInit;
    }

    @Override
    public void deleteFeedback(int id) {
        feedbackDao.deleteFeedback(id);
    }

    public void insertWade(Wade wade){
        wadeDao.insertWade(wade);
    }
    public void deleteWade(Wade wade){
        wadeDao.deleteWade(wade);
    }
}
