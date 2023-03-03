package com.guli.member.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberFavoriteExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public MemberFavoriteExample() {
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

		public Criteria andMemberIdIsNull() {
			addCriterion("member_id is null");
			return (Criteria) this;
		}

		public Criteria andMemberIdIsNotNull() {
			addCriterion("member_id is not null");
			return (Criteria) this;
		}

		public Criteria andMemberIdEqualTo(String value) {
			addCriterion("member_id =", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdNotEqualTo(String value) {
			addCriterion("member_id <>", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdGreaterThan(String value) {
			addCriterion("member_id >", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
			addCriterion("member_id >=", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdLessThan(String value) {
			addCriterion("member_id <", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdLessThanOrEqualTo(String value) {
			addCriterion("member_id <=", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdLike(String value) {
			addCriterion("member_id like", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdNotLike(String value) {
			addCriterion("member_id not like", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdIn(List<String> values) {
			addCriterion("member_id in", values, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdNotIn(List<String> values) {
			addCriterion("member_id not in", values, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdBetween(String value1, String value2) {
			addCriterion("member_id between", value1, value2, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdNotBetween(String value1, String value2) {
			addCriterion("member_id not between", value1, value2, "memberId");
			return (Criteria) this;
		}

		public Criteria andRelationIdIsNull() {
			addCriterion("relation_id is null");
			return (Criteria) this;
		}

		public Criteria andRelationIdIsNotNull() {
			addCriterion("relation_id is not null");
			return (Criteria) this;
		}

		public Criteria andRelationIdEqualTo(String value) {
			addCriterion("relation_id =", value, "relationId");
			return (Criteria) this;
		}

		public Criteria andRelationIdNotEqualTo(String value) {
			addCriterion("relation_id <>", value, "relationId");
			return (Criteria) this;
		}

		public Criteria andRelationIdGreaterThan(String value) {
			addCriterion("relation_id >", value, "relationId");
			return (Criteria) this;
		}

		public Criteria andRelationIdGreaterThanOrEqualTo(String value) {
			addCriterion("relation_id >=", value, "relationId");
			return (Criteria) this;
		}

		public Criteria andRelationIdLessThan(String value) {
			addCriterion("relation_id <", value, "relationId");
			return (Criteria) this;
		}

		public Criteria andRelationIdLessThanOrEqualTo(String value) {
			addCriterion("relation_id <=", value, "relationId");
			return (Criteria) this;
		}

		public Criteria andRelationIdLike(String value) {
			addCriterion("relation_id like", value, "relationId");
			return (Criteria) this;
		}

		public Criteria andRelationIdNotLike(String value) {
			addCriterion("relation_id not like", value, "relationId");
			return (Criteria) this;
		}

		public Criteria andRelationIdIn(List<String> values) {
			addCriterion("relation_id in", values, "relationId");
			return (Criteria) this;
		}

		public Criteria andRelationIdNotIn(List<String> values) {
			addCriterion("relation_id not in", values, "relationId");
			return (Criteria) this;
		}

		public Criteria andRelationIdBetween(String value1, String value2) {
			addCriterion("relation_id between", value1, value2, "relationId");
			return (Criteria) this;
		}

		public Criteria andRelationIdNotBetween(String value1, String value2) {
			addCriterion("relation_id not between", value1, value2, "relationId");
			return (Criteria) this;
		}

		public Criteria andFavoriteNameIsNull() {
			addCriterion("favorite_name is null");
			return (Criteria) this;
		}

		public Criteria andFavoriteNameIsNotNull() {
			addCriterion("favorite_name is not null");
			return (Criteria) this;
		}

		public Criteria andFavoriteNameEqualTo(String value) {
			addCriterion("favorite_name =", value, "favoriteName");
			return (Criteria) this;
		}

		public Criteria andFavoriteNameNotEqualTo(String value) {
			addCriterion("favorite_name <>", value, "favoriteName");
			return (Criteria) this;
		}

		public Criteria andFavoriteNameGreaterThan(String value) {
			addCriterion("favorite_name >", value, "favoriteName");
			return (Criteria) this;
		}

		public Criteria andFavoriteNameGreaterThanOrEqualTo(String value) {
			addCriterion("favorite_name >=", value, "favoriteName");
			return (Criteria) this;
		}

		public Criteria andFavoriteNameLessThan(String value) {
			addCriterion("favorite_name <", value, "favoriteName");
			return (Criteria) this;
		}

		public Criteria andFavoriteNameLessThanOrEqualTo(String value) {
			addCriterion("favorite_name <=", value, "favoriteName");
			return (Criteria) this;
		}

		public Criteria andFavoriteNameLike(String value) {
			addCriterion("favorite_name like", value, "favoriteName");
			return (Criteria) this;
		}

		public Criteria andFavoriteNameNotLike(String value) {
			addCriterion("favorite_name not like", value, "favoriteName");
			return (Criteria) this;
		}

		public Criteria andFavoriteNameIn(List<String> values) {
			addCriterion("favorite_name in", values, "favoriteName");
			return (Criteria) this;
		}

		public Criteria andFavoriteNameNotIn(List<String> values) {
			addCriterion("favorite_name not in", values, "favoriteName");
			return (Criteria) this;
		}

		public Criteria andFavoriteNameBetween(String value1, String value2) {
			addCriterion("favorite_name between", value1, value2, "favoriteName");
			return (Criteria) this;
		}

		public Criteria andFavoriteNameNotBetween(String value1, String value2) {
			addCriterion("favorite_name not between", value1, value2, "favoriteName");
			return (Criteria) this;
		}

		public Criteria andFavoriteTypeIsNull() {
			addCriterion("favorite_type is null");
			return (Criteria) this;
		}

		public Criteria andFavoriteTypeIsNotNull() {
			addCriterion("favorite_type is not null");
			return (Criteria) this;
		}

		public Criteria andFavoriteTypeEqualTo(String value) {
			addCriterion("favorite_type =", value, "favoriteType");
			return (Criteria) this;
		}

		public Criteria andFavoriteTypeNotEqualTo(String value) {
			addCriterion("favorite_type <>", value, "favoriteType");
			return (Criteria) this;
		}

		public Criteria andFavoriteTypeGreaterThan(String value) {
			addCriterion("favorite_type >", value, "favoriteType");
			return (Criteria) this;
		}

		public Criteria andFavoriteTypeGreaterThanOrEqualTo(String value) {
			addCriterion("favorite_type >=", value, "favoriteType");
			return (Criteria) this;
		}

		public Criteria andFavoriteTypeLessThan(String value) {
			addCriterion("favorite_type <", value, "favoriteType");
			return (Criteria) this;
		}

		public Criteria andFavoriteTypeLessThanOrEqualTo(String value) {
			addCriterion("favorite_type <=", value, "favoriteType");
			return (Criteria) this;
		}

		public Criteria andFavoriteTypeLike(String value) {
			addCriterion("favorite_type like", value, "favoriteType");
			return (Criteria) this;
		}

		public Criteria andFavoriteTypeNotLike(String value) {
			addCriterion("favorite_type not like", value, "favoriteType");
			return (Criteria) this;
		}

		public Criteria andFavoriteTypeIn(List<String> values) {
			addCriterion("favorite_type in", values, "favoriteType");
			return (Criteria) this;
		}

		public Criteria andFavoriteTypeNotIn(List<String> values) {
			addCriterion("favorite_type not in", values, "favoriteType");
			return (Criteria) this;
		}

		public Criteria andFavoriteTypeBetween(String value1, String value2) {
			addCriterion("favorite_type between", value1, value2, "favoriteType");
			return (Criteria) this;
		}

		public Criteria andFavoriteTypeNotBetween(String value1, String value2) {
			addCriterion("favorite_type not between", value1, value2, "favoriteType");
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

		public Criteria andLinkIsNull() {
			addCriterion("link is null");
			return (Criteria) this;
		}

		public Criteria andLinkIsNotNull() {
			addCriterion("link is not null");
			return (Criteria) this;
		}

		public Criteria andLinkEqualTo(String value) {
			addCriterion("link =", value, "link");
			return (Criteria) this;
		}

		public Criteria andLinkNotEqualTo(String value) {
			addCriterion("link <>", value, "link");
			return (Criteria) this;
		}

		public Criteria andLinkGreaterThan(String value) {
			addCriterion("link >", value, "link");
			return (Criteria) this;
		}

		public Criteria andLinkGreaterThanOrEqualTo(String value) {
			addCriterion("link >=", value, "link");
			return (Criteria) this;
		}

		public Criteria andLinkLessThan(String value) {
			addCriterion("link <", value, "link");
			return (Criteria) this;
		}

		public Criteria andLinkLessThanOrEqualTo(String value) {
			addCriterion("link <=", value, "link");
			return (Criteria) this;
		}

		public Criteria andLinkLike(String value) {
			addCriterion("link like", value, "link");
			return (Criteria) this;
		}

		public Criteria andLinkNotLike(String value) {
			addCriterion("link not like", value, "link");
			return (Criteria) this;
		}

		public Criteria andLinkIn(List<String> values) {
			addCriterion("link in", values, "link");
			return (Criteria) this;
		}

		public Criteria andLinkNotIn(List<String> values) {
			addCriterion("link not in", values, "link");
			return (Criteria) this;
		}

		public Criteria andLinkBetween(String value1, String value2) {
			addCriterion("link between", value1, value2, "link");
			return (Criteria) this;
		}

		public Criteria andLinkNotBetween(String value1, String value2) {
			addCriterion("link not between", value1, value2, "link");
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
