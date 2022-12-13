package com.guli.member.mapper;

import com.guli.member.entity.LevelPrivilege;
import com.guli.member.entity.LevelPrivilegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LevelPrivilegeMapper {
    long countByExample(LevelPrivilegeExample example);

    int deleteByExample(LevelPrivilegeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LevelPrivilege record);

    int insertSelective(LevelPrivilege record);

    List<LevelPrivilege> selectByExample(LevelPrivilegeExample example);

    LevelPrivilege selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LevelPrivilege record, @Param("example") LevelPrivilegeExample example);

    int updateByExample(@Param("record") LevelPrivilege record, @Param("example") LevelPrivilegeExample example);

    int updateByPrimaryKeySelective(LevelPrivilege record);

    int updateByPrimaryKey(LevelPrivilege record);
}
