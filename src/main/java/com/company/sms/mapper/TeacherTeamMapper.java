package com.company.sms.mapper;

import com.company.sms.model.TeacherTeam;
import com.company.sms.service.TeacherTeamExample;

public interface TeacherTeamMapper {
    long countByExample(TeacherTeamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TeacherTeam record);

    int insertSelective(TeacherTeam record);

    TeacherTeam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TeacherTeam record);

    int updateByPrimaryKey(TeacherTeam record);
}