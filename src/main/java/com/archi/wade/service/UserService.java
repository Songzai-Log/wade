package com.archi.wade.service;

import com.archi.wade.model.Feedback;
import com.archi.wade.model.Wade;

import java.util.List;

public interface UserService {

    public List<Wade> CarouselById(int id);

    //Wade查找Chinese  一个wade对多个chinese
    public List<Wade> Wade2Chinese(String string);

    //Chinese查找Wade  一个chinese对一个wade
    public List<Wade>  Chinese2Wade(String string);

    public void insertFeedback(Feedback feedback);
}
