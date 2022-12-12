package com.guli.pms.mapper;

import com.guli.pms.entity.ProductSkuSaleAttr;
import com.guli.pms.entity.ProductSkuSaleAttrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSkuSaleAttrMapper {
    long countByExample(ProductSkuSaleAttrExample example);

    int deleteByExample(ProductSkuSaleAttrExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductSkuSaleAttr record);

    int insertSelective(ProductSkuSaleAttr record);

    List<ProductSkuSaleAttr> selectByExample(ProductSkuSaleAttrExample example);

    ProductSkuSaleAttr selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductSkuSaleAttr record, @Param("example") ProductSkuSaleAttrExample example);

    int updateByExample(@Param("record") ProductSkuSaleAttr record, @Param("example") ProductSkuSaleAttrExample example);

    int updateByPrimaryKeySelective(ProductSkuSaleAttr record);

    int updateByPrimaryKey(ProductSkuSaleAttr record);
}