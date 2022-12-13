package com.guli.product.mapper;

import com.guli.product.entity.ProductSku;
import com.guli.product.entity.ProductSkuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSkuMapper {
    long countByExample(ProductSkuExample example);

    int deleteByExample(ProductSkuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductSku record);

    int insertSelective(ProductSku record);

    List<ProductSku> selectByExample(ProductSkuExample example);

    ProductSku selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductSku record, @Param("example") ProductSkuExample example);

    int updateByExample(@Param("record") ProductSku record, @Param("example") ProductSkuExample example);

    int updateByPrimaryKeySelective(ProductSku record);

    int updateByPrimaryKey(ProductSku record);
}
