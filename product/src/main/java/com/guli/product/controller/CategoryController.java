package com.guli.product.controller;

import com.common.response.Response;
import com.common.response.ResponseBuilder;
import com.guli.product.entity.Category;
import com.guli.product.service.CategoryService;
import com.guli.product.vo.CategoryVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * CategoryController
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

	@Resource
	private CategoryService service;

	@GetMapping("/tree")
	public Response<List<CategoryVo>> listByTree() {
		return ResponseBuilder.success(service.listByTree());
	}


}
