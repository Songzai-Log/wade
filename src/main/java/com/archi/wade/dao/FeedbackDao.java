package com.archi.wade.dao;

import com.archi.wade.model.Feedback;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FeedbackDao {
    //查询
    public List<Feedback> findALLFeedback();
    //删除
    public void deleteFeedback(int id);
    public void insertFeedback(@Param("feedback") Feedback feedback);

}
