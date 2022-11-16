package com.example.codeapp.mapper;

import com.example.codeapp.pojo.Codetype;
import com.example.codeapp.pojo.CodetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CodetypeMapper {
    int countByExample(CodetypeExample example);

    int deleteByExample(CodetypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Codetype record);

    int insertSelective(Codetype record);

    List<Codetype> selectByExample(CodetypeExample example);

    Codetype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Codetype record, @Param("example") CodetypeExample example);

    int updateByExample(@Param("record") Codetype record, @Param("example") CodetypeExample example);

    int updateByPrimaryKeySelective(Codetype record);

    int updateByPrimaryKey(Codetype record);
}