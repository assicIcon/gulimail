package com.guli.product.service.impl;

import com.common.service.impl.ServiceImpl;
import com.guli.product.entity.Category;
import com.guli.product.mapper.CategoryMapper;
import com.guli.product.service.CategoryService;
import com.guli.product.vo.CategoryVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * CategoryService
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Slf4j
@Service
public class CategoryServiceImpl extends ServiceImpl<Category> implements CategoryService {

	protected CategoryServiceImpl(CategoryMapper mapper) {
		super(mapper);
	}

	@Override
	public List<CategoryVo> listByTree() {
		List<Category> allCategory = listAll();
		List<CategoryVo> allCategoryVo = allCategory.stream().map(CategoryVo::new).collect(Collectors.toList());
		List<CategoryVo> topCategory = allCategoryVo.stream().filter(e -> ObjectUtils.isEmpty(e.getParentCategoryId())).collect(Collectors.toList());
		topCategory.forEach(c -> setChildren(c, allCategoryVo));
		return topCategory;
	}

	private void setChildren(CategoryVo categoryVo, List<CategoryVo> allCategoryVo) {
		List<CategoryVo> children = allCategoryVo.stream().filter(e -> e.getParentCategoryId().equals(categoryVo.getCategoryId())).collect(Collectors.toList());
		children.forEach(c -> setChildren(c, allCategoryVo));
		categoryVo.setChildren(children);
	}

}
