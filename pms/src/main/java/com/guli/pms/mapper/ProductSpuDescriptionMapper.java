package com.guli.pms.mapper;

import com.guli.pms.entity.ProductSpuDescription;
import com.guli.pms.entity.ProductSpuDescriptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSpuDescriptionMapper {
    long countByExample(ProductSpuDescriptionExample example);

    int deleteByExample(ProductSpuDescriptionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductSpuDescription record);

    int insertSelective(ProductSpuDescription record);

    List<ProductSpuDescription> selectByExample(ProductSpuDescriptionExample example);

    ProductSpuDescription selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductSpuDescription record, @Param("example") ProductSpuDescriptionExample example);

    int updateByExample(@Param("record") ProductSpuDescription record, @Param("example") ProductSpuDescriptionExample example);

    int updateByPrimaryKeySelective(ProductSpuDescription record);

    int updateByPrimaryKey(ProductSpuDescription record);
}