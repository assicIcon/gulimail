package com.guli.product.mapper;

import com.guli.product.entity.GroupAttr;
import com.guli.product.entity.GroupAttrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupAttrMapper {
    long countByExample(GroupAttrExample example);

    int deleteByExample(GroupAttrExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GroupAttr record);

    int insertSelective(GroupAttr record);

    List<GroupAttr> selectByExample(GroupAttrExample example);

    GroupAttr selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GroupAttr record, @Param("example") GroupAttrExample example);

    int updateByExample(@Param("record") GroupAttr record, @Param("example") GroupAttrExample example);

    int updateByPrimaryKeySelective(GroupAttr record);

    int updateByPrimaryKey(GroupAttr record);
}
