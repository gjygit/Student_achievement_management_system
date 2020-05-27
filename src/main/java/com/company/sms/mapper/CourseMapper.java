package com.company.sms.mapper;

import com.company.sms.model.Course;
import com.company.sms.service.CourseExample;

/**
 * @author me
 */
public interface CourseMapper {
    long countByExample(CourseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}