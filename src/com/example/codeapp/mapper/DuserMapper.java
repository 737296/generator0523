package com.example.codeapp.mapper;

import com.example.codeapp.pojo.Duser;
import com.example.codeapp.pojo.DuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DuserMapper {
    int countByExample(DuserExample example);

    int deleteByExample(DuserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Duser record);

    int insertSelective(Duser record);

    List<Duser> selectByExample(DuserExample example);

    Duser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Duser record, @Param("example") DuserExample example);

    int updateByExample(@Param("record") Duser record, @Param("example") DuserExample example);

    int updateByPrimaryKeySelective(Duser record);

    int updateByPrimaryKey(Duser record);
}