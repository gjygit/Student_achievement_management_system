package com.company.sms.mapper;

import com.company.sms.model.TeacherLogin;
import com.company.sms.service.TeacherLoginExample;

public interface TeacherLoginMapper {
    long countByExample(TeacherLoginExample example);

    int insert(TeacherLogin record);

    int insertSelective(TeacherLogin record);
}