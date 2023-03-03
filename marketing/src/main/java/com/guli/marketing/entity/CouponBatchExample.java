package com.guli.marketing.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponBatchExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public CouponBatchExample() {
		oredCriteria = new ArrayList<>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andCouponBatchIdIsNull() {
			addCriterion("coupon_batch_id is null");
			return (Criteria) this;
		}

		public Criteria andCouponBatchIdIsNotNull() {
			addCriterion("coupon_batch_id is not null");
			return (Criteria) this;
		}

		public Criteria andCouponBatchIdEqualTo(String value) {
			addCriterion("coupon_batch_id =", value, "couponBatchId");
			return (Criteria) this;
		}

		public Criteria andCouponBatchIdNotEqualTo(String value) {
			addCriterion("coupon_batch_id <>", value, "couponBatchId");
			return (Criteria) this;
		}

		public Criteria andCouponBatchIdGreaterThan(String value) {
			addCriterion("coupon_batch_id >", value, "couponBatchId");
			return (Criteria) this;
		}

		public Criteria andCouponBatchIdGreaterThanOrEqualTo(String value) {
			addCriterion("coupon_batch_id >=", value, "couponBatchId");
			return (Criteria) this;
		}

		public Criteria andCouponBatchIdLessThan(String value) {
			addCriterion("coupon_batch_id <", value, "couponBatchId");
			return (Criteria) this;
		}

		public Criteria andCouponBatchIdLessThanOrEqualTo(String value) {
			addCriterion("coupon_batch_id <=", value, "couponBatchId");
			return (Criteria) this;
		}

		public Criteria andCouponBatchIdLike(String value) {
			addCriterion("coupon_batch_id like", value, "couponBatchId");
			return (Criteria) this;
		}

		public Criteria andCouponBatchIdNotLike(String value) {
			addCriterion("coupon_batch_id not like", value, "couponBatchId");
			return (Criteria) this;
		}

		public Criteria andCouponBatchIdIn(List<String> values) {
			addCriterion("coupon_batch_id in", values, "couponBatchId");
			return (Criteria) this;
		}

		public Criteria andCouponBatchIdNotIn(List<String> values) {
			addCriterion("coupon_batch_id not in", values, "couponBatchId");
			return (Criteria) this;
		}

		public Criteria andCouponBatchIdBetween(String value1, String value2) {
			addCriterion("coupon_batch_id between", value1, value2, "couponBatchId");
			return (Criteria) this;
		}

		public Criteria andCouponBatchIdNotBetween(String value1, String value2) {
			addCriterion("coupon_batch_id not between", value1, value2, "couponBatchId");
			return (Criteria) this;
		}

		public Criteria andCouponNameIsNull() {
			addCriterion("coupon_name is null");
			return (Criteria) this;
		}

		public Criteria andCouponNameIsNotNull() {
			addCriterion("coupon_name is not null");
			return (Criteria) this;
		}

		public Criteria andCouponNameEqualTo(String value) {
			addCriterion("coupon_name =", value, "couponName");
			return (Criteria) this;
		}

		public Criteria andCouponNameNotEqualTo(String value) {
			addCriterion("coupon_name <>", value, "couponName");
			return (Criteria) this;
		}

		public Criteria andCouponNameGreaterThan(String value) {
			addCriterion("coupon_name >", value, "couponName");
			return (Criteria) this;
		}

		public Criteria andCouponNameGreaterThanOrEqualTo(String value) {
			addCriterion("coupon_name >=", value, "couponName");
			return (Criteria) this;
		}

		public Criteria andCouponNameLessThan(String value) {
			addCriterion("coupon_name <", value, "couponName");
			return (Criteria) this;
		}

		public Criteria andCouponNameLessThanOrEqualTo(String value) {
			addCriterion("coupon_name <=", value, "couponName");
			return (Criteria) this;
		}

		public Criteria andCouponNameLike(String value) {
			addCriterion("coupon_name like", value, "couponName");
			return (Criteria) this;
		}

		public Criteria andCouponNameNotLike(String value) {
			addCriterion("coupon_name not like", value, "couponName");
			return (Criteria) this;
		}

		public Criteria andCouponNameIn(List<String> values) {
			addCriterion("coupon_name in", values, "couponName");
			return (Criteria) this;
		}

		public Criteria andCouponNameNotIn(List<String> values) {
			addCriterion("coupon_name not in", values, "couponName");
			return (Criteria) this;
		}

		public Criteria andCouponNameBetween(String value1, String value2) {
			addCriterion("coupon_name between", value1, value2, "couponName");
			return (Criteria) this;
		}

		public Criteria andCouponNameNotBetween(String value1, String value2) {
			addCriterion("coupon_name not between", value1, value2, "couponName");
			return (Criteria) this;
		}

		public Criteria andImageIsNull() {
			addCriterion("image is null");
			return (Criteria) this;
		}

		public Criteria andImageIsNotNull() {
			addCriterion("image is not null");
			return (Criteria) this;
		}

		public Criteria andImageEqualTo(String value) {
			addCriterion("image =", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageNotEqualTo(String value) {
			addCriterion("image <>", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageGreaterThan(String value) {
			addCriterion("image >", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageGreaterThanOrEqualTo(String value) {
			addCriterion("image >=", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageLessThan(String value) {
			addCriterion("image <", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageLessThanOrEqualTo(String value) {
			addCriterion("image <=", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageLike(String value) {
			addCriterion("image like", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageNotLike(String value) {
			addCriterion("image not like", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageIn(List<String> values) {
			addCriterion("image in", values, "image");
			return (Criteria) this;
		}

		public Criteria andImageNotIn(List<String> values) {
			addCriterion("image not in", values, "image");
			return (Criteria) this;
		}

		public Criteria andImageBetween(String value1, String value2) {
			addCriterion("image between", value1, value2, "image");
			return (Criteria) this;
		}

		public Criteria andImageNotBetween(String value1, String value2) {
			addCriterion("image not between", value1, value2, "image");
			return (Criteria) this;
		}

		public Criteria andValidStatusIsNull() {
			addCriterion("valid_status is null");
			return (Criteria) this;
		}

		public Criteria andValidStatusIsNotNull() {
			addCriterion("valid_status is not null");
			return (Criteria) this;
		}

		public Criteria andValidStatusEqualTo(Byte value) {
			addCriterion("valid_status =", value, "validStatus");
			return (Criteria) this;
		}

		public Criteria andValidStatusNotEqualTo(Byte value) {
			addCriterion("valid_status <>", value, "validStatus");
			return (Criteria) this;
		}

		public Criteria andValidStatusGreaterThan(Byte value) {
			addCriterion("valid_status >", value, "validStatus");
			return (Criteria) this;
		}

		public Criteria andValidStatusGreaterThanOrEqualTo(Byte value) {
			addCriterion("valid_status >=", value, "validStatus");
			return (Criteria) this;
		}

		public Criteria andValidStatusLessThan(Byte value) {
			addCriterion("valid_status <", value, "validStatus");
			return (Criteria) this;
		}

		public Criteria andValidStatusLessThanOrEqualTo(Byte value) {
			addCriterion("valid_status <=", value, "validStatus");
			return (Criteria) this;
		}

		public Criteria andValidStatusIn(List<Byte> values) {
			addCriterion("valid_status in", values, "validStatus");
			return (Criteria) this;
		}

		public Criteria andValidStatusNotIn(List<Byte> values) {
			addCriterion("valid_status not in", values, "validStatus");
			return (Criteria) this;
		}

		public Criteria andValidStatusBetween(Byte value1, Byte value2) {
			addCriterion("valid_status between", value1, value2, "validStatus");
			return (Criteria) this;
		}

		public Criteria andValidStatusNotBetween(Byte value1, Byte value2) {
			addCriterion("valid_status not between", value1, value2, "validStatus");
			return (Criteria) this;
		}

		public Criteria andCouponTypeIsNull() {
			addCriterion("coupon_type is null");
			return (Criteria) this;
		}

		public Criteria andCouponTypeIsNotNull() {
			addCriterion("coupon_type is not null");
			return (Criteria) this;
		}

		public Criteria andCouponTypeEqualTo(String value) {
			addCriterion("coupon_type =", value, "couponType");
			return (Criteria) this;
		}

		public Criteria andCouponTypeNotEqualTo(String value) {
			addCriterion("coupon_type <>", value, "couponType");
			return (Criteria) this;
		}

		public Criteria andCouponTypeGreaterThan(String value) {
			addCriterion("coupon_type >", value, "couponType");
			return (Criteria) this;
		}

		public Criteria andCouponTypeGreaterThanOrEqualTo(String value) {
			addCriterion("coupon_type >=", value, "couponType");
			return (Criteria) this;
		}

		public Criteria andCouponTypeLessThan(String value) {
			addCriterion("coupon_type <", value, "couponType");
			return (Criteria) this;
		}

		public Criteria andCouponTypeLessThanOrEqualTo(String value) {
			addCriterion("coupon_type <=", value, "couponType");
			return (Criteria) this;
		}

		public Criteria andCouponTypeLike(String value) {
			addCriterion("coupon_type like", value, "couponType");
			return (Criteria) this;
		}

		public Criteria andCouponTypeNotLike(String value) {
			addCriterion("coupon_type not like", value, "couponType");
			return (Criteria) this;
		}

		public Criteria andCouponTypeIn(List<String> values) {
			addCriterion("coupon_type in", values, "couponType");
			return (Criteria) this;
		}

		public Criteria andCouponTypeNotIn(List<String> values) {
			addCriterion("coupon_type not in", values, "couponType");
			return (Criteria) this;
		}

		public Criteria andCouponTypeBetween(String value1, String value2) {
			addCriterion("coupon_type between", value1, value2, "couponType");
			return (Criteria) this;
		}

		public Criteria andCouponTypeNotBetween(String value1, String value2) {
			addCriterion("coupon_type not between", value1, value2, "couponType");
			return (Criteria) this;
		}

		public Criteria andDiscountIsNull() {
			addCriterion("discount is null");
			return (Criteria) this;
		}

		public Criteria andDiscountIsNotNull() {
			addCriterion("discount is not null");
			return (Criteria) this;
		}

		public Criteria andDiscountEqualTo(BigDecimal value) {
			addCriterion("discount =", value, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountNotEqualTo(BigDecimal value) {
			addCriterion("discount <>", value, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountGreaterThan(BigDecimal value) {
			addCriterion("discount >", value, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("discount >=", value, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountLessThan(BigDecimal value) {
			addCriterion("discount <", value, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
			addCriterion("discount <=", value, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountIn(List<BigDecimal> values) {
			addCriterion("discount in", values, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountNotIn(List<BigDecimal> values) {
			addCriterion("discount not in", values, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("discount between", value1, value2, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("discount not between", value1, value2, "discount");
			return (Criteria) this;
		}

		public Criteria andUnitIsNull() {
			addCriterion("unit is null");
			return (Criteria) this;
		}

		public Criteria andUnitIsNotNull() {
			addCriterion("unit is not null");
			return (Criteria) this;
		}

		public Criteria andUnitEqualTo(String value) {
			addCriterion("unit =", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitNotEqualTo(String value) {
			addCriterion("unit <>", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitGreaterThan(String value) {
			addCriterion("unit >", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitGreaterThanOrEqualTo(String value) {
			addCriterion("unit >=", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitLessThan(String value) {
			addCriterion("unit <", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitLessThanOrEqualTo(String value) {
			addCriterion("unit <=", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitLike(String value) {
			addCriterion("unit like", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitNotLike(String value) {
			addCriterion("unit not like", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitIn(List<String> values) {
			addCriterion("unit in", values, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitNotIn(List<String> values) {
			addCriterion("unit not in", values, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitBetween(String value1, String value2) {
			addCriterion("unit between", value1, value2, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitNotBetween(String value1, String value2) {
			addCriterion("unit not between", value1, value2, "unit");
			return (Criteria) this;
		}

		public Criteria andCountIsNull() {
			addCriterion("`count` is null");
			return (Criteria) this;
		}

		public Criteria andCountIsNotNull() {
			addCriterion("`count` is not null");
			return (Criteria) this;
		}

		public Criteria andCountEqualTo(Integer value) {
			addCriterion("`count` =", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountNotEqualTo(Integer value) {
			addCriterion("`count` <>", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountGreaterThan(Integer value) {
			addCriterion("`count` >", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountGreaterThanOrEqualTo(Integer value) {
			addCriterion("`count` >=", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountLessThan(Integer value) {
			addCriterion("`count` <", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountLessThanOrEqualTo(Integer value) {
			addCriterion("`count` <=", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountIn(List<Integer> values) {
			addCriterion("`count` in", values, "count");
			return (Criteria) this;
		}

		public Criteria andCountNotIn(List<Integer> values) {
			addCriterion("`count` not in", values, "count");
			return (Criteria) this;
		}

		public Criteria andCountBetween(Integer value1, Integer value2) {
			addCriterion("`count` between", value1, value2, "count");
			return (Criteria) this;
		}

		public Criteria andCountNotBetween(Integer value1, Integer value2) {
			addCriterion("`count` not between", value1, value2, "count");
			return (Criteria) this;
		}

		public Criteria andEnableStartTimeIsNull() {
			addCriterion("enable_start_time is null");
			return (Criteria) this;
		}

		public Criteria andEnableStartTimeIsNotNull() {
			addCriterion("enable_start_time is not null");
			return (Criteria) this;
		}

		public Criteria andEnableStartTimeEqualTo(Date value) {
			addCriterion("enable_start_time =", value, "enableStartTime");
			return (Criteria) this;
		}

		public Criteria andEnableStartTimeNotEqualTo(Date value) {
			addCriterion("enable_start_time <>", value, "enableStartTime");
			return (Criteria) this;
		}

		public Criteria andEnableStartTimeGreaterThan(Date value) {
			addCriterion("enable_start_time >", value, "enableStartTime");
			return (Criteria) this;
		}

		public Criteria andEnableStartTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("enable_start_time >=", value, "enableStartTime");
			return (Criteria) this;
		}

		public Criteria andEnableStartTimeLessThan(Date value) {
			addCriterion("enable_start_time <", value, "enableStartTime");
			return (Criteria) this;
		}

		public Criteria andEnableStartTimeLessThanOrEqualTo(Date value) {
			addCriterion("enable_start_time <=", value, "enableStartTime");
			return (Criteria) this;
		}

		public Criteria andEnableStartTimeIn(List<Date> values) {
			addCriterion("enable_start_time in", values, "enableStartTime");
			return (Criteria) this;
		}

		public Criteria andEnableStartTimeNotIn(List<Date> values) {
			addCriterion("enable_start_time not in", values, "enableStartTime");
			return (Criteria) this;
		}

		public Criteria andEnableStartTimeBetween(Date value1, Date value2) {
			addCriterion("enable_start_time between", value1, value2, "enableStartTime");
			return (Criteria) this;
		}

		public Criteria andEnableStartTimeNotBetween(Date value1, Date value2) {
			addCriterion("enable_start_time not between", value1, value2, "enableStartTime");
			return (Criteria) this;
		}

		public Criteria andEnableEndTimeIsNull() {
			addCriterion("enable_end_time is null");
			return (Criteria) this;
		}

		public Criteria andEnableEndTimeIsNotNull() {
			addCriterion("enable_end_time is not null");
			return (Criteria) this;
		}

		public Criteria andEnableEndTimeEqualTo(Date value) {
			addCriterion("enable_end_time =", value, "enableEndTime");
			return (Criteria) this;
		}

		public Criteria andEnableEndTimeNotEqualTo(Date value) {
			addCriterion("enable_end_time <>", value, "enableEndTime");
			return (Criteria) this;
		}

		public Criteria andEnableEndTimeGreaterThan(Date value) {
			addCriterion("enable_end_time >", value, "enableEndTime");
			return (Criteria) this;
		}

		public Criteria andEnableEndTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("enable_end_time >=", value, "enableEndTime");
			return (Criteria) this;
		}

		public Criteria andEnableEndTimeLessThan(Date value) {
			addCriterion("enable_end_time <", value, "enableEndTime");
			return (Criteria) this;
		}

		public Criteria andEnableEndTimeLessThanOrEqualTo(Date value) {
			addCriterion("enable_end_time <=", value, "enableEndTime");
			return (Criteria) this;
		}

		public Criteria andEnableEndTimeIn(List<Date> values) {
			addCriterion("enable_end_time in", values, "enableEndTime");
			return (Criteria) this;
		}

		public Criteria andEnableEndTimeNotIn(List<Date> values) {
			addCriterion("enable_end_time not in", values, "enableEndTime");
			return (Criteria) this;
		}

		public Criteria andEnableEndTimeBetween(Date value1, Date value2) {
			addCriterion("enable_end_time between", value1, value2, "enableEndTime");
			return (Criteria) this;
		}

		public Criteria andEnableEndTimeNotBetween(Date value1, Date value2) {
			addCriterion("enable_end_time not between", value1, value2, "enableEndTime");
			return (Criteria) this;
		}

		public Criteria andAvailableTimeTypeIsNull() {
			addCriterion("available_time_type is null");
			return (Criteria) this;
		}

		public Criteria andAvailableTimeTypeIsNotNull() {
			addCriterion("available_time_type is not null");
			return (Criteria) this;
		}

		public Criteria andAvailableTimeTypeEqualTo(String value) {
			addCriterion("available_time_type =", value, "availableTimeType");
			return (Criteria) this;
		}

		public Criteria andAvailableTimeTypeNotEqualTo(String value) {
			addCriterion("available_time_type <>", value, "availableTimeType");
			return (Criteria) this;
		}

		public Criteria andAvailableTimeTypeGreaterThan(String value) {
			addCriterion("available_time_type >", value, "availableTimeType");
			return (Criteria) this;
		}

		public Criteria andAvailableTimeTypeGreaterThanOrEqualTo(String value) {
			addCriterion("available_time_type >=", value, "availableTimeType");
			return (Criteria) this;
		}

		public Criteria andAvailableTimeTypeLessThan(String value) {
			addCriterion("available_time_type <", value, "availableTimeType");
			return (Criteria) this;
		}

		public Criteria andAvailableTimeTypeLessThanOrEqualTo(String value) {
			addCriterion("available_time_type <=", value, "availableTimeType");
			return (Criteria) this;
		}

		public Criteria andAvailableTimeTypeLike(String value) {
			addCriterion("available_time_type like", value, "availableTimeType");
			return (Criteria) this;
		}

		public Criteria andAvailableTimeTypeNotLike(String value) {
			addCriterion("available_time_type not like", value, "availableTimeType");
			return (Criteria) this;
		}

		public Criteria andAvailableTimeTypeIn(List<String> values) {
			addCriterion("available_time_type in", values, "availableTimeType");
			return (Criteria) this;
		}

		public Criteria andAvailableTimeTypeNotIn(List<String> values) {
			addCriterion("available_time_type not in", values, "availableTimeType");
			return (Criteria) this;
		}

		public Criteria andAvailableTimeTypeBetween(String value1, String value2) {
			addCriterion("available_time_type between", value1, value2, "availableTimeType");
			return (Criteria) this;
		}

		public Criteria andAvailableTimeTypeNotBetween(String value1, String value2) {
			addCriterion("available_time_type not between", value1, value2, "availableTimeType");
			return (Criteria) this;
		}

		public Criteria andAvailableTimeRuleIsNull() {
			addCriterion("available_time_rule is null");
			return (Criteria) this;
		}

		public Criteria andAvailableTimeRuleIsNotNull() {
			addCriterion("available_time_rule is not null");
			return (Criteria) this;
		}

		public Criteria andAvailableTimeRuleEqualTo(String value) {
			addCriterion("available_time_rule =", value, "availableTimeRule");
			return (Criteria) this;
		}

		public Criteria andAvailableTimeRuleNotEqualTo(String value) {
			addCriterion("available_time_rule <>", value, "availableTimeRule");
			return (Criteria) this;
		}

		public Criteria andAvailableTimeRuleGreaterThan(String value) {
			addCriterion("available_time_rule >", value, "availableTimeRule");
			return (Criteria) this;
		}

		public Criteria andAvailableTimeRuleGreaterThanOrEqualTo(String value) {
			addCriterion("available_time_rule >=", value, "availableTimeRule");
			return (Criteria) this;
		}

		public Criteria andAvailableTimeRuleLessThan(String value) {
			addCriterion("available_time_rule <", value, "availableTimeRule");
			return (Criteria) this;
		}

		public Criteria andAvailableTimeRuleLessThanOrEqualTo(String value) {
			addCriterion("available_time_rule <=", value, "availableTimeRule");
			return (Criteria) this;
		}

		public Criteria andAvailableTimeRuleLike(String value) {
			addCriterion("available_time_rule like", value, "availableTimeRule");
			return (Criteria) this;
		}

		public Criteria andAvailableTimeRuleNotLike(String value) {
			addCriterion("available_time_rule not like", value, "availableTimeRule");
			return (Criteria) this;
		}

		public Criteria andAvailableTimeRuleIn(List<String> values) {
			addCriterion("available_time_rule in", values, "availableTimeRule");
			return (Criteria) this;
		}

		public Criteria andAvailableTimeRuleNotIn(List<String> values) {
			addCriterion("available_time_rule not in", values, "availableTimeRule");
			return (Criteria) this;
		}

		public Criteria andAvailableTimeRuleBetween(String value1, String value2) {
			addCriterion("available_time_rule between", value1, value2, "availableTimeRule");
			return (Criteria) this;
		}

		public Criteria andAvailableTimeRuleNotBetween(String value1, String value2) {
			addCriterion("available_time_rule not between", value1, value2, "availableTimeRule");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNull() {
			addCriterion("description is null");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNotNull() {
			addCriterion("description is not null");
			return (Criteria) this;
		}

		public Criteria andDescriptionEqualTo(String value) {
			addCriterion("description =", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotEqualTo(String value) {
			addCriterion("description <>", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThan(String value) {
			addCriterion("description >", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("description >=", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThan(String value) {
			addCriterion("description <", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThanOrEqualTo(String value) {
			addCriterion("description <=", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLike(String value) {
			addCriterion("description like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotLike(String value) {
			addCriterion("description not like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionIn(List<String> values) {
			addCriterion("description in", values, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotIn(List<String> values) {
			addCriterion("description not in", values, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionBetween(String value1, String value2) {
			addCriterion("description between", value1, value2, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotBetween(String value1, String value2) {
			addCriterion("description not between", value1, value2, "description");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNull() {
			addCriterion("create_time is null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNotNull() {
			addCriterion("create_time is not null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeEqualTo(Date value) {
			addCriterion("create_time =", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotEqualTo(Date value) {
			addCriterion("create_time <>", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThan(Date value) {
			addCriterion("create_time >", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("create_time >=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThan(Date value) {
			addCriterion("create_time <", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
			addCriterion("create_time <=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIn(List<Date> values) {
			addCriterion("create_time in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotIn(List<Date> values) {
			addCriterion("create_time not in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBetween(Date value1, Date value2) {
			addCriterion("create_time between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
			addCriterion("create_time not between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNull() {
			addCriterion("update_time is null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNotNull() {
			addCriterion("update_time is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeEqualTo(Date value) {
			addCriterion("update_time =", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotEqualTo(Date value) {
			addCriterion("update_time <>", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThan(Date value) {
			addCriterion("update_time >", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("update_time >=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThan(Date value) {
			addCriterion("update_time <", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
			addCriterion("update_time <=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIn(List<Date> values) {
			addCriterion("update_time in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotIn(List<Date> values) {
			addCriterion("update_time not in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBetween(Date value1, Date value2) {
			addCriterion("update_time between", value1, value2, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
			addCriterion("update_time not between", value1, value2, "updateTime");
			return (Criteria) this;
		}
	}

	/**
	 *
	 */
	public static class Criteria extends GeneratedCriteria {
		protected Criteria() {
			super();
		}
	}

	public static class Criterion {
		private String condition;

		private Object value;

		private Object secondValue;

		private boolean noValue;

		private boolean singleValue;

		private boolean betweenValue;

		private boolean listValue;

		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}
}
