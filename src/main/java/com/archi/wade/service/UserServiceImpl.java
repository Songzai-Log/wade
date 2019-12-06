package com.archi.wade.service;


import com.archi.wade.dao.FeedbackDao;
import com.archi.wade.dao.WadeDao;
import com.archi.wade.model.Feedback;
import com.archi.wade.model.Wade;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private WadeDao wadeDao;
    @Resource
    private FeedbackDao feedbackDao;

    public List<Wade> CarouselById(int id){
        return  wadeDao.CarouselById(id);
    }

    @Override
    public List<Wade> Wade2Chinese(String string) {
        return wadeDao.Wade2Chinese(string);
    }

    public  List<Wade>  Chinese2Wade(String string) {
        return wadeDao.Chinese2Wade(string);
    }

    public void insertFeedback(Feedback feedback){
        feedbackDao.insertFeedback(feedback);
    }
}
