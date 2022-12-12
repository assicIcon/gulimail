package com.guli.pms.mapper;

import com.guli.pms.entity.Attr;
import com.guli.pms.entity.AttrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttrMapper {
    long countByExample(AttrExample example);

    int deleteByExample(AttrExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Attr record);

    int insertSelective(Attr record);

    List<Attr> selectByExample(AttrExample example);

    Attr selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Attr record, @Param("example") AttrExample example);

    int updateByExample(@Param("record") Attr record, @Param("example") AttrExample example);

    int updateByPrimaryKeySelective(Attr record);

    int updateByPrimaryKey(Attr record);
}