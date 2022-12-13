package com.guli.product.mapper;

import com.guli.product.entity.ProductSpu;
import com.guli.product.entity.ProductSpuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSpuMapper {
    long countByExample(ProductSpuExample example);

    int deleteByExample(ProductSpuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductSpu record);

    int insertSelective(ProductSpu record);

    List<ProductSpu> selectByExample(ProductSpuExample example);

    ProductSpu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductSpu record, @Param("example") ProductSpuExample example);

    int updateByExample(@Param("record") ProductSpu record, @Param("example") ProductSpuExample example);

    int updateByPrimaryKeySelective(ProductSpu record);

    int updateByPrimaryKey(ProductSpu record);
}
