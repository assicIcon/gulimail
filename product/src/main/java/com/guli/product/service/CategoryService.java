package com.guli.product.service;

import com.common.service.ExampleSupportService;
import com.guli.product.entity.Category;
import com.guli.product.vo.CategoryVo;

import java.util.List;

/**
 * CategoryService
 *
 * @author Runhu-Wu
 * @since 1.0
 */
public interface CategoryService extends ExampleSupportService<Category> {

	List<CategoryVo> listByTree();

}
