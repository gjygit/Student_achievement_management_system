package com.company.sms.mapper;

import com.company.sms.model.ScoreSheet;
import com.company.sms.service.ScoreSheetExample;

public interface ScoreSheetMapper {
    long countByExample(ScoreSheetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScoreSheet record);

    int insertSelective(ScoreSheet record);

    ScoreSheet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ScoreSheet record);

    int updateByPrimaryKey(ScoreSheet record);
}