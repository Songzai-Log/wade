package com.archi.wade.dao;

import com.archi.wade.model.Wade;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WadeDao {

    public List<Wade> CarouselById(int id);

    //Wade查找Chinese  一个wade对多个chinese
    public List<Wade> Wade2Chinese(String string);

    //Chinese查找Wade  一个chinese对一个wade
    public List<Wade> Chinese2Wade(String string);

    //增加
    public void insertWade(@Param("wade") Wade wade);

    //删除
    public void deleteWade(@Param("wade") Wade wade);

    //修改
    public void updateWade(@Param("wade") Wade wade);
}
