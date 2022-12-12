package com.guli.pms.mapper;

import com.guli.pms.entity.ProductSpuAttr;
import com.guli.pms.entity.ProductSpuAttrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSpuAttrMapper {
    long countByExample(ProductSpuAttrExample example);

    int deleteByExample(ProductSpuAttrExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductSpuAttr record);

    int insertSelective(ProductSpuAttr record);

    List<ProductSpuAttr> selectByExample(ProductSpuAttrExample example);

    ProductSpuAttr selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductSpuAttr record, @Param("example") ProductSpuAttrExample example);

    int updateByExample(@Param("record") ProductSpuAttr record, @Param("example") ProductSpuAttrExample example);

    int updateByPrimaryKeySelective(ProductSpuAttr record);

    int updateByPrimaryKey(ProductSpuAttr record);
}