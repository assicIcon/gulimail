package com.guli.product.mapper;

import com.guli.product.entity.ProductSkuImage;
import com.guli.product.entity.ProductSkuImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSkuImageMapper {
    long countByExample(ProductSkuImageExample example);

    int deleteByExample(ProductSkuImageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductSkuImage record);

    int insertSelective(ProductSkuImage record);

    List<ProductSkuImage> selectByExample(ProductSkuImageExample example);

    ProductSkuImage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductSkuImage record, @Param("example") ProductSkuImageExample example);

    int updateByExample(@Param("record") ProductSkuImage record, @Param("example") ProductSkuImageExample example);

    int updateByPrimaryKeySelective(ProductSkuImage record);

    int updateByPrimaryKey(ProductSkuImage record);
}
