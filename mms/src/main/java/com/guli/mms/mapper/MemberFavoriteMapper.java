package com.guli.mms.mapper;

import com.guli.mms.entity.MemberFavorite;
import com.guli.mms.entity.MemberFavoriteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberFavoriteMapper {
    long countByExample(MemberFavoriteExample example);

    int deleteByExample(MemberFavoriteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberFavorite record);

    int insertSelective(MemberFavorite record);

    List<MemberFavorite> selectByExample(MemberFavoriteExample example);

    MemberFavorite selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberFavorite record, @Param("example") MemberFavoriteExample example);

    int updateByExample(@Param("record") MemberFavorite record, @Param("example") MemberFavoriteExample example);

    int updateByPrimaryKeySelective(MemberFavorite record);

    int updateByPrimaryKey(MemberFavorite record);
}