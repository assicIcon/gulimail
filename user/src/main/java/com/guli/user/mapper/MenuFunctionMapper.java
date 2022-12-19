package com.guli.user.mapper;

import com.guli.user.entity.MenuFunction;
import com.guli.user.entity.MenuFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuFunctionMapper {
    long countByExample(MenuFunctionExample example);

    int deleteByExample(MenuFunctionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MenuFunction record);

    int insertSelective(MenuFunction record);

    List<MenuFunction> selectByExample(MenuFunctionExample example);

    MenuFunction selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MenuFunction record, @Param("example") MenuFunctionExample example);

    int updateByExample(@Param("record") MenuFunction record, @Param("example") MenuFunctionExample example);

    int updateByPrimaryKeySelective(MenuFunction record);

    int updateByPrimaryKey(MenuFunction record);
}