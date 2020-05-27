package com.company.sms.mapper;

import com.company.sms.model.Teacher;
import com.company.sms.model.TeacherExample;

public interface TeacherMapper {
    long countByExample(TeacherExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}