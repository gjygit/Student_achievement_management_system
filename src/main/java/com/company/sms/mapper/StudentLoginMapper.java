package com.company.sms.mapper;

import com.company.sms.model.StudentLogin;
import com.company.sms.service.StudentLoginExample;

public interface StudentLoginMapper {
    long countByExample(StudentLoginExample example);

    int insert(StudentLogin record);

    int insertSelective(StudentLogin record);
}