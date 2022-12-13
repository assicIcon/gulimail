package com.guli.member.mapper;

import com.guli.member.entity.MemberIntegrationFlow;
import com.guli.member.entity.MemberIntegrationFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberIntegrationFlowMapper {
    long countByExample(MemberIntegrationFlowExample example);

    int deleteByExample(MemberIntegrationFlowExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberIntegrationFlow record);

    int insertSelective(MemberIntegrationFlow record);

    List<MemberIntegrationFlow> selectByExample(MemberIntegrationFlowExample example);

    MemberIntegrationFlow selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberIntegrationFlow record, @Param("example") MemberIntegrationFlowExample example);

    int updateByExample(@Param("record") MemberIntegrationFlow record, @Param("example") MemberIntegrationFlowExample example);

    int updateByPrimaryKeySelective(MemberIntegrationFlow record);

    int updateByPrimaryKey(MemberIntegrationFlow record);
}
