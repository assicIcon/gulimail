package com.guli.pms.mapper;

import com.guli.pms.entity.AttrOptionalValue;
import com.guli.pms.entity.AttrOptionalValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttrOptionalValueMapper {
    long countByExample(AttrOptionalValueExample example);

    int deleteByExample(AttrOptionalValueExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AttrOptionalValue record);

    int insertSelective(AttrOptionalValue record);

    List<AttrOptionalValue> selectByExample(AttrOptionalValueExample example);

    AttrOptionalValue selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AttrOptionalValue record, @Param("example") AttrOptionalValueExample example);

    int updateByExample(@Param("record") AttrOptionalValue record, @Param("example") AttrOptionalValueExample example);

    int updateByPrimaryKeySelective(AttrOptionalValue record);

    int updateByPrimaryKey(AttrOptionalValue record);
}