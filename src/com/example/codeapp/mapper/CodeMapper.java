package com.example.codeapp.mapper;

import com.example.codeapp.pojo.Code;
import com.example.codeapp.pojo.CodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CodeMapper {
    int countByExample(CodeExample example);

    int deleteByExample(CodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Code record);

    int insertSelective(Code record);

    List<Code> selectByExample(CodeExample example);

    Code selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Code record, @Param("example") CodeExample example);

    int updateByExample(@Param("record") Code record, @Param("example") CodeExample example);

    int updateByPrimaryKeySelective(Code record);

    int updateByPrimaryKey(Code record);
}