package com.archi.wade.service;

import com.archi.wade.model.Feedback;
import com.archi.wade.model.Wade;

import java.util.List;

public interface CheckService {

    public String findALLFeedback();

    public void deleteFeedback(int id);

    public void insertWade(Wade wade);

    public void deleteWade(Wade wade);
}
