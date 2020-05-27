package com.company.sms.mapper;

import com.company.sms.model.Student;
import com.company.sms.service.StudentExample;

public interface StudentMapper {
    long countByExample(StudentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}