package com.guli.member.mapper;

import com.guli.member.entity.MemberGrowthFlow;
import com.guli.member.entity.MemberGrowthFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberGrowthFlowMapper {
    long countByExample(MemberGrowthFlowExample example);

    int deleteByExample(MemberGrowthFlowExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberGrowthFlow record);

    int insertSelective(MemberGrowthFlow record);

    List<MemberGrowthFlow> selectByExample(MemberGrowthFlowExample example);

    MemberGrowthFlow selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberGrowthFlow record, @Param("example") MemberGrowthFlowExample example);

    int updateByExample(@Param("record") MemberGrowthFlow record, @Param("example") MemberGrowthFlowExample example);

    int updateByPrimaryKeySelective(MemberGrowthFlow record);

    int updateByPrimaryKey(MemberGrowthFlow record);
}
