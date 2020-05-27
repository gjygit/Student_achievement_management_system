package com.company.sms.mapper;

import com.company.sms.model.TeacherCourse;
import com.company.sms.service.TeacherCourseExample;

public interface TeacherCourseMapper {
    long countByExample(TeacherCourseExample example);

    int deleteByPrimaryKey(Integer teacherCourseId);

    int insert(TeacherCourse record);

    int insertSelective(TeacherCourse record);

    TeacherCourse selectByPrimaryKey(Integer teacherCourseId);

    int updateByPrimaryKeySelective(TeacherCourse record);

    int updateByPrimaryKey(TeacherCourse record);
}