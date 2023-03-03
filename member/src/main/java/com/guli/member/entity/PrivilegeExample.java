package com.guli.member.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrivilegeExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public PrivilegeExample() {
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

		public Criteria andPrivilegeIdIsNull() {
			addCriterion("privilege_id is null");
			return (Criteria) this;
		}

		public Criteria andPrivilegeIdIsNotNull() {
			addCriterion("privilege_id is not null");
			return (Criteria) this;
		}

		public Criteria andPrivilegeIdEqualTo(String value) {
			addCriterion("privilege_id =", value, "privilegeId");
			return (Criteria) this;
		}

		public Criteria andPrivilegeIdNotEqualTo(String value) {
			addCriterion("privilege_id <>", value, "privilegeId");
			return (Criteria) this;
		}

		public Criteria andPrivilegeIdGreaterThan(String value) {
			addCriterion("privilege_id >", value, "privilegeId");
			return (Criteria) this;
		}

		public Criteria andPrivilegeIdGreaterThanOrEqualTo(String value) {
			addCriterion("privilege_id >=", value, "privilegeId");
			return (Criteria) this;
		}

		public Criteria andPrivilegeIdLessThan(String value) {
			addCriterion("privilege_id <", value, "privilegeId");
			return (Criteria) this;
		}

		public Criteria andPrivilegeIdLessThanOrEqualTo(String value) {
			addCriterion("privilege_id <=", value, "privilegeId");
			return (Criteria) this;
		}

		public Criteria andPrivilegeIdLike(String value) {
			addCriterion("privilege_id like", value, "privilegeId");
			return (Criteria) this;
		}

		public Criteria andPrivilegeIdNotLike(String value) {
			addCriterion("privilege_id not like", value, "privilegeId");
			return (Criteria) this;
		}

		public Criteria andPrivilegeIdIn(List<String> values) {
			addCriterion("privilege_id in", values, "privilegeId");
			return (Criteria) this;
		}

		public Criteria andPrivilegeIdNotIn(List<String> values) {
			addCriterion("privilege_id not in", values, "privilegeId");
			return (Criteria) this;
		}

		public Criteria andPrivilegeIdBetween(String value1, String value2) {
			addCriterion("privilege_id between", value1, value2, "privilegeId");
			return (Criteria) this;
		}

		public Criteria andPrivilegeIdNotBetween(String value1, String value2) {
			addCriterion("privilege_id not between", value1, value2, "privilegeId");
			return (Criteria) this;
		}

		public Criteria andPrivilegeNameIsNull() {
			addCriterion("privilege_name is null");
			return (Criteria) this;
		}

		public Criteria andPrivilegeNameIsNotNull() {
			addCriterion("privilege_name is not null");
			return (Criteria) this;
		}

		public Criteria andPrivilegeNameEqualTo(String value) {
			addCriterion("privilege_name =", value, "privilegeName");
			return (Criteria) this;
		}

		public Criteria andPrivilegeNameNotEqualTo(String value) {
			addCriterion("privilege_name <>", value, "privilegeName");
			return (Criteria) this;
		}

		public Criteria andPrivilegeNameGreaterThan(String value) {
			addCriterion("privilege_name >", value, "privilegeName");
			return (Criteria) this;
		}

		public Criteria andPrivilegeNameGreaterThanOrEqualTo(String value) {
			addCriterion("privilege_name >=", value, "privilegeName");
			return (Criteria) this;
		}

		public Criteria andPrivilegeNameLessThan(String value) {
			addCriterion("privilege_name <", value, "privilegeName");
			return (Criteria) this;
		}

		public Criteria andPrivilegeNameLessThanOrEqualTo(String value) {
			addCriterion("privilege_name <=", value, "privilegeName");
			return (Criteria) this;
		}

		public Criteria andPrivilegeNameLike(String value) {
			addCriterion("privilege_name like", value, "privilegeName");
			return (Criteria) this;
		}

		public Criteria andPrivilegeNameNotLike(String value) {
			addCriterion("privilege_name not like", value, "privilegeName");
			return (Criteria) this;
		}

		public Criteria andPrivilegeNameIn(List<String> values) {
			addCriterion("privilege_name in", values, "privilegeName");
			return (Criteria) this;
		}

		public Criteria andPrivilegeNameNotIn(List<String> values) {
			addCriterion("privilege_name not in", values, "privilegeName");
			return (Criteria) this;
		}

		public Criteria andPrivilegeNameBetween(String value1, String value2) {
			addCriterion("privilege_name between", value1, value2, "privilegeName");
			return (Criteria) this;
		}

		public Criteria andPrivilegeNameNotBetween(String value1, String value2) {
			addCriterion("privilege_name not between", value1, value2, "privilegeName");
			return (Criteria) this;
		}

		public Criteria andIconIsNull() {
			addCriterion("icon is null");
			return (Criteria) this;
		}

		public Criteria andIconIsNotNull() {
			addCriterion("icon is not null");
			return (Criteria) this;
		}

		public Criteria andIconEqualTo(String value) {
			addCriterion("icon =", value, "icon");
			return (Criteria) this;
		}

		public Criteria andIconNotEqualTo(String value) {
			addCriterion("icon <>", value, "icon");
			return (Criteria) this;
		}

		public Criteria andIconGreaterThan(String value) {
			addCriterion("icon >", value, "icon");
			return (Criteria) this;
		}

		public Criteria andIconGreaterThanOrEqualTo(String value) {
			addCriterion("icon >=", value, "icon");
			return (Criteria) this;
		}

		public Criteria andIconLessThan(String value) {
			addCriterion("icon <", value, "icon");
			return (Criteria) this;
		}

		public Criteria andIconLessThanOrEqualTo(String value) {
			addCriterion("icon <=", value, "icon");
			return (Criteria) this;
		}

		public Criteria andIconLike(String value) {
			addCriterion("icon like", value, "icon");
			return (Criteria) this;
		}

		public Criteria andIconNotLike(String value) {
			addCriterion("icon not like", value, "icon");
			return (Criteria) this;
		}

		public Criteria andIconIn(List<String> values) {
			addCriterion("icon in", values, "icon");
			return (Criteria) this;
		}

		public Criteria andIconNotIn(List<String> values) {
			addCriterion("icon not in", values, "icon");
			return (Criteria) this;
		}

		public Criteria andIconBetween(String value1, String value2) {
			addCriterion("icon between", value1, value2, "icon");
			return (Criteria) this;
		}

		public Criteria andIconNotBetween(String value1, String value2) {
			addCriterion("icon not between", value1, value2, "icon");
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
