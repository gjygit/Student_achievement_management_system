package com.company.sms.mapper;

import com.company.sms.model.Team;
import com.company.sms.service.TeamExample;

public interface TeamMapper {
    long countByExample(TeamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Team record);

    int insertSelective(Team record);
}