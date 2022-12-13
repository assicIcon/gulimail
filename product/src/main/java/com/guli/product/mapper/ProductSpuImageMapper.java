package com.guli.product.mapper;

import com.guli.product.entity.ProductSpuImage;
import com.guli.product.entity.ProductSpuImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSpuImageMapper {
    long countByExample(ProductSpuImageExample example);

    int deleteByExample(ProductSpuImageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductSpuImage record);

    int insertSelective(ProductSpuImage record);

    List<ProductSpuImage> selectByExample(ProductSpuImageExample example);

    ProductSpuImage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductSpuImage record, @Param("example") ProductSpuImageExample example);

    int updateByExample(@Param("record") ProductSpuImage record, @Param("example") ProductSpuImageExample example);

    int updateByPrimaryKeySelective(ProductSpuImage record);

    int updateByPrimaryKey(ProductSpuImage record);
}
