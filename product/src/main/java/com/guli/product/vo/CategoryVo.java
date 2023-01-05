package com.guli.product.vo;

import com.guli.product.entity.Category;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * CategoryVo
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CategoryVo extends Category {

	private List<CategoryVo> children;

	public CategoryVo(Category category) {
		BeanUtils.copyProperties(category, this);
	}


}
