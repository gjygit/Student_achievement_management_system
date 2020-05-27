package com.company.sms.mapper;

import com.company.sms.model.StudentCourse;
import com.company.sms.service.StudentCourseExample;

public interface StudentCourseMapper {
    long countByExample(StudentCourseExample example);

    int deleteByPrimaryKey(Integer studentCourseId);

    int insert(StudentCourse record);

    int insertSelective(StudentCourse record);

    StudentCourse selectByPrimaryKey(Integer studentCourseId);

    int updateByPrimaryKeySelective(StudentCourse record);

    int updateByPrimaryKey(StudentCourse record);
}