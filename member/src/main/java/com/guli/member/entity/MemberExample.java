package com.guli.member.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemberExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public MemberExample() {
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

		protected void addCriterionForJDBCDate(String condition, Date value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()), property);
		}

		protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property + " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

		public Criteria andLevelIdIsNull() {
			addCriterion("level_id is null");
			return (Criteria) this;
		}

		public Criteria andLevelIdIsNotNull() {
			addCriterion("level_id is not null");
			return (Criteria) this;
		}

		public Criteria andLevelIdEqualTo(String value) {
			addCriterion("level_id =", value, "levelId");
			return (Criteria) this;
		}

		public Criteria andLevelIdNotEqualTo(String value) {
			addCriterion("level_id <>", value, "levelId");
			return (Criteria) this;
		}

		public Criteria andLevelIdGreaterThan(String value) {
			addCriterion("level_id >", value, "levelId");
			return (Criteria) this;
		}

		public Criteria andLevelIdGreaterThanOrEqualTo(String value) {
			addCriterion("level_id >=", value, "levelId");
			return (Criteria) this;
		}

		public Criteria andLevelIdLessThan(String value) {
			addCriterion("level_id <", value, "levelId");
			return (Criteria) this;
		}

		public Criteria andLevelIdLessThanOrEqualTo(String value) {
			addCriterion("level_id <=", value, "levelId");
			return (Criteria) this;
		}

		public Criteria andLevelIdLike(String value) {
			addCriterion("level_id like", value, "levelId");
			return (Criteria) this;
		}

		public Criteria andLevelIdNotLike(String value) {
			addCriterion("level_id not like", value, "levelId");
			return (Criteria) this;
		}

		public Criteria andLevelIdIn(List<String> values) {
			addCriterion("level_id in", values, "levelId");
			return (Criteria) this;
		}

		public Criteria andLevelIdNotIn(List<String> values) {
			addCriterion("level_id not in", values, "levelId");
			return (Criteria) this;
		}

		public Criteria andLevelIdBetween(String value1, String value2) {
			addCriterion("level_id between", value1, value2, "levelId");
			return (Criteria) this;
		}

		public Criteria andLevelIdNotBetween(String value1, String value2) {
			addCriterion("level_id not between", value1, value2, "levelId");
			return (Criteria) this;
		}

		public Criteria andUsernameIsNull() {
			addCriterion("username is null");
			return (Criteria) this;
		}

		public Criteria andUsernameIsNotNull() {
			addCriterion("username is not null");
			return (Criteria) this;
		}

		public Criteria andUsernameEqualTo(String value) {
			addCriterion("username =", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotEqualTo(String value) {
			addCriterion("username <>", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThan(String value) {
			addCriterion("username >", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThanOrEqualTo(String value) {
			addCriterion("username >=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThan(String value) {
			addCriterion("username <", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThanOrEqualTo(String value) {
			addCriterion("username <=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLike(String value) {
			addCriterion("username like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotLike(String value) {
			addCriterion("username not like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameIn(List<String> values) {
			addCriterion("username in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotIn(List<String> values) {
			addCriterion("username not in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameBetween(String value1, String value2) {
			addCriterion("username between", value1, value2, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotBetween(String value1, String value2) {
			addCriterion("username not between", value1, value2, "username");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNull() {
			addCriterion("`password` is null");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNotNull() {
			addCriterion("`password` is not null");
			return (Criteria) this;
		}

		public Criteria andPasswordEqualTo(String value) {
			addCriterion("`password` =", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotEqualTo(String value) {
			addCriterion("`password` <>", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThan(String value) {
			addCriterion("`password` >", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("`password` >=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThan(String value) {
			addCriterion("`password` <", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThanOrEqualTo(String value) {
			addCriterion("`password` <=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLike(String value) {
			addCriterion("`password` like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotLike(String value) {
			addCriterion("`password` not like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordIn(List<String> values) {
			addCriterion("`password` in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotIn(List<String> values) {
			addCriterion("`password` not in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordBetween(String value1, String value2) {
			addCriterion("`password` between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotBetween(String value1, String value2) {
			addCriterion("`password` not between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andPhoneNumberIsNull() {
			addCriterion("phone_number is null");
			return (Criteria) this;
		}

		public Criteria andPhoneNumberIsNotNull() {
			addCriterion("phone_number is not null");
			return (Criteria) this;
		}

		public Criteria andPhoneNumberEqualTo(String value) {
			addCriterion("phone_number =", value, "phoneNumber");
			return (Criteria) this;
		}

		public Criteria andPhoneNumberNotEqualTo(String value) {
			addCriterion("phone_number <>", value, "phoneNumber");
			return (Criteria) this;
		}

		public Criteria andPhoneNumberGreaterThan(String value) {
			addCriterion("phone_number >", value, "phoneNumber");
			return (Criteria) this;
		}

		public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
			addCriterion("phone_number >=", value, "phoneNumber");
			return (Criteria) this;
		}

		public Criteria andPhoneNumberLessThan(String value) {
			addCriterion("phone_number <", value, "phoneNumber");
			return (Criteria) this;
		}

		public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
			addCriterion("phone_number <=", value, "phoneNumber");
			return (Criteria) this;
		}

		public Criteria andPhoneNumberLike(String value) {
			addCriterion("phone_number like", value, "phoneNumber");
			return (Criteria) this;
		}

		public Criteria andPhoneNumberNotLike(String value) {
			addCriterion("phone_number not like", value, "phoneNumber");
			return (Criteria) this;
		}

		public Criteria andPhoneNumberIn(List<String> values) {
			addCriterion("phone_number in", values, "phoneNumber");
			return (Criteria) this;
		}

		public Criteria andPhoneNumberNotIn(List<String> values) {
			addCriterion("phone_number not in", values, "phoneNumber");
			return (Criteria) this;
		}

		public Criteria andPhoneNumberBetween(String value1, String value2) {
			addCriterion("phone_number between", value1, value2, "phoneNumber");
			return (Criteria) this;
		}

		public Criteria andPhoneNumberNotBetween(String value1, String value2) {
			addCriterion("phone_number not between", value1, value2, "phoneNumber");
			return (Criteria) this;
		}

		public Criteria andEmailIsNull() {
			addCriterion("email is null");
			return (Criteria) this;
		}

		public Criteria andEmailIsNotNull() {
			addCriterion("email is not null");
			return (Criteria) this;
		}

		public Criteria andEmailEqualTo(String value) {
			addCriterion("email =", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotEqualTo(String value) {
			addCriterion("email <>", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThan(String value) {
			addCriterion("email >", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThanOrEqualTo(String value) {
			addCriterion("email >=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThan(String value) {
			addCriterion("email <", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThanOrEqualTo(String value) {
			addCriterion("email <=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLike(String value) {
			addCriterion("email like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotLike(String value) {
			addCriterion("email not like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailIn(List<String> values) {
			addCriterion("email in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotIn(List<String> values) {
			addCriterion("email not in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailBetween(String value1, String value2) {
			addCriterion("email between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotBetween(String value1, String value2) {
			addCriterion("email not between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andAvatarIsNull() {
			addCriterion("avatar is null");
			return (Criteria) this;
		}

		public Criteria andAvatarIsNotNull() {
			addCriterion("avatar is not null");
			return (Criteria) this;
		}

		public Criteria andAvatarEqualTo(String value) {
			addCriterion("avatar =", value, "avatar");
			return (Criteria) this;
		}

		public Criteria andAvatarNotEqualTo(String value) {
			addCriterion("avatar <>", value, "avatar");
			return (Criteria) this;
		}

		public Criteria andAvatarGreaterThan(String value) {
			addCriterion("avatar >", value, "avatar");
			return (Criteria) this;
		}

		public Criteria andAvatarGreaterThanOrEqualTo(String value) {
			addCriterion("avatar >=", value, "avatar");
			return (Criteria) this;
		}

		public Criteria andAvatarLessThan(String value) {
			addCriterion("avatar <", value, "avatar");
			return (Criteria) this;
		}

		public Criteria andAvatarLessThanOrEqualTo(String value) {
			addCriterion("avatar <=", value, "avatar");
			return (Criteria) this;
		}

		public Criteria andAvatarLike(String value) {
			addCriterion("avatar like", value, "avatar");
			return (Criteria) this;
		}

		public Criteria andAvatarNotLike(String value) {
			addCriterion("avatar not like", value, "avatar");
			return (Criteria) this;
		}

		public Criteria andAvatarIn(List<String> values) {
			addCriterion("avatar in", values, "avatar");
			return (Criteria) this;
		}

		public Criteria andAvatarNotIn(List<String> values) {
			addCriterion("avatar not in", values, "avatar");
			return (Criteria) this;
		}

		public Criteria andAvatarBetween(String value1, String value2) {
			addCriterion("avatar between", value1, value2, "avatar");
			return (Criteria) this;
		}

		public Criteria andAvatarNotBetween(String value1, String value2) {
			addCriterion("avatar not between", value1, value2, "avatar");
			return (Criteria) this;
		}

		public Criteria andGenderIsNull() {
			addCriterion("gender is null");
			return (Criteria) this;
		}

		public Criteria andGenderIsNotNull() {
			addCriterion("gender is not null");
			return (Criteria) this;
		}

		public Criteria andGenderEqualTo(Byte value) {
			addCriterion("gender =", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotEqualTo(Byte value) {
			addCriterion("gender <>", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderGreaterThan(Byte value) {
			addCriterion("gender >", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderGreaterThanOrEqualTo(Byte value) {
			addCriterion("gender >=", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderLessThan(Byte value) {
			addCriterion("gender <", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderLessThanOrEqualTo(Byte value) {
			addCriterion("gender <=", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderIn(List<Byte> values) {
			addCriterion("gender in", values, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotIn(List<Byte> values) {
			addCriterion("gender not in", values, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderBetween(Byte value1, Byte value2) {
			addCriterion("gender between", value1, value2, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotBetween(Byte value1, Byte value2) {
			addCriterion("gender not between", value1, value2, "gender");
			return (Criteria) this;
		}

		public Criteria andBirthDayIsNull() {
			addCriterion("birth_day is null");
			return (Criteria) this;
		}

		public Criteria andBirthDayIsNotNull() {
			addCriterion("birth_day is not null");
			return (Criteria) this;
		}

		public Criteria andBirthDayEqualTo(Date value) {
			addCriterionForJDBCDate("birth_day =", value, "birthDay");
			return (Criteria) this;
		}

		public Criteria andBirthDayNotEqualTo(Date value) {
			addCriterionForJDBCDate("birth_day <>", value, "birthDay");
			return (Criteria) this;
		}

		public Criteria andBirthDayGreaterThan(Date value) {
			addCriterionForJDBCDate("birth_day >", value, "birthDay");
			return (Criteria) this;
		}

		public Criteria andBirthDayGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("birth_day >=", value, "birthDay");
			return (Criteria) this;
		}

		public Criteria andBirthDayLessThan(Date value) {
			addCriterionForJDBCDate("birth_day <", value, "birthDay");
			return (Criteria) this;
		}

		public Criteria andBirthDayLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("birth_day <=", value, "birthDay");
			return (Criteria) this;
		}

		public Criteria andBirthDayIn(List<Date> values) {
			addCriterionForJDBCDate("birth_day in", values, "birthDay");
			return (Criteria) this;
		}

		public Criteria andBirthDayNotIn(List<Date> values) {
			addCriterionForJDBCDate("birth_day not in", values, "birthDay");
			return (Criteria) this;
		}

		public Criteria andBirthDayBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("birth_day between", value1, value2, "birthDay");
			return (Criteria) this;
		}

		public Criteria andBirthDayNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("birth_day not between", value1, value2, "birthDay");
			return (Criteria) this;
		}

		public Criteria andCityIsNull() {
			addCriterion("city is null");
			return (Criteria) this;
		}

		public Criteria andCityIsNotNull() {
			addCriterion("city is not null");
			return (Criteria) this;
		}

		public Criteria andCityEqualTo(String value) {
			addCriterion("city =", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityNotEqualTo(String value) {
			addCriterion("city <>", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityGreaterThan(String value) {
			addCriterion("city >", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityGreaterThanOrEqualTo(String value) {
			addCriterion("city >=", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityLessThan(String value) {
			addCriterion("city <", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityLessThanOrEqualTo(String value) {
			addCriterion("city <=", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityLike(String value) {
			addCriterion("city like", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityNotLike(String value) {
			addCriterion("city not like", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityIn(List<String> values) {
			addCriterion("city in", values, "city");
			return (Criteria) this;
		}

		public Criteria andCityNotIn(List<String> values) {
			addCriterion("city not in", values, "city");
			return (Criteria) this;
		}

		public Criteria andCityBetween(String value1, String value2) {
			addCriterion("city between", value1, value2, "city");
			return (Criteria) this;
		}

		public Criteria andCityNotBetween(String value1, String value2) {
			addCriterion("city not between", value1, value2, "city");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("`status` is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("`status` is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(Byte value) {
			addCriterion("`status` =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(Byte value) {
			addCriterion("`status` <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(Byte value) {
			addCriterion("`status` >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
			addCriterion("`status` >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(Byte value) {
			addCriterion("`status` <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(Byte value) {
			addCriterion("`status` <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<Byte> values) {
			addCriterion("`status` in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<Byte> values) {
			addCriterion("`status` not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(Byte value1, Byte value2) {
			addCriterion("`status` between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(Byte value1, Byte value2) {
			addCriterion("`status` not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andIntegrationIsNull() {
			addCriterion("integration is null");
			return (Criteria) this;
		}

		public Criteria andIntegrationIsNotNull() {
			addCriterion("integration is not null");
			return (Criteria) this;
		}

		public Criteria andIntegrationEqualTo(Integer value) {
			addCriterion("integration =", value, "integration");
			return (Criteria) this;
		}

		public Criteria andIntegrationNotEqualTo(Integer value) {
			addCriterion("integration <>", value, "integration");
			return (Criteria) this;
		}

		public Criteria andIntegrationGreaterThan(Integer value) {
			addCriterion("integration >", value, "integration");
			return (Criteria) this;
		}

		public Criteria andIntegrationGreaterThanOrEqualTo(Integer value) {
			addCriterion("integration >=", value, "integration");
			return (Criteria) this;
		}

		public Criteria andIntegrationLessThan(Integer value) {
			addCriterion("integration <", value, "integration");
			return (Criteria) this;
		}

		public Criteria andIntegrationLessThanOrEqualTo(Integer value) {
			addCriterion("integration <=", value, "integration");
			return (Criteria) this;
		}

		public Criteria andIntegrationIn(List<Integer> values) {
			addCriterion("integration in", values, "integration");
			return (Criteria) this;
		}

		public Criteria andIntegrationNotIn(List<Integer> values) {
			addCriterion("integration not in", values, "integration");
			return (Criteria) this;
		}

		public Criteria andIntegrationBetween(Integer value1, Integer value2) {
			addCriterion("integration between", value1, value2, "integration");
			return (Criteria) this;
		}

		public Criteria andIntegrationNotBetween(Integer value1, Integer value2) {
			addCriterion("integration not between", value1, value2, "integration");
			return (Criteria) this;
		}

		public Criteria andGrowthPointIsNull() {
			addCriterion("growth_point is null");
			return (Criteria) this;
		}

		public Criteria andGrowthPointIsNotNull() {
			addCriterion("growth_point is not null");
			return (Criteria) this;
		}

		public Criteria andGrowthPointEqualTo(Integer value) {
			addCriterion("growth_point =", value, "growthPoint");
			return (Criteria) this;
		}

		public Criteria andGrowthPointNotEqualTo(Integer value) {
			addCriterion("growth_point <>", value, "growthPoint");
			return (Criteria) this;
		}

		public Criteria andGrowthPointGreaterThan(Integer value) {
			addCriterion("growth_point >", value, "growthPoint");
			return (Criteria) this;
		}

		public Criteria andGrowthPointGreaterThanOrEqualTo(Integer value) {
			addCriterion("growth_point >=", value, "growthPoint");
			return (Criteria) this;
		}

		public Criteria andGrowthPointLessThan(Integer value) {
			addCriterion("growth_point <", value, "growthPoint");
			return (Criteria) this;
		}

		public Criteria andGrowthPointLessThanOrEqualTo(Integer value) {
			addCriterion("growth_point <=", value, "growthPoint");
			return (Criteria) this;
		}

		public Criteria andGrowthPointIn(List<Integer> values) {
			addCriterion("growth_point in", values, "growthPoint");
			return (Criteria) this;
		}

		public Criteria andGrowthPointNotIn(List<Integer> values) {
			addCriterion("growth_point not in", values, "growthPoint");
			return (Criteria) this;
		}

		public Criteria andGrowthPointBetween(Integer value1, Integer value2) {
			addCriterion("growth_point between", value1, value2, "growthPoint");
			return (Criteria) this;
		}

		public Criteria andGrowthPointNotBetween(Integer value1, Integer value2) {
			addCriterion("growth_point not between", value1, value2, "growthPoint");
			return (Criteria) this;
		}

		public Criteria andSourceTypeIsNull() {
			addCriterion("source_type is null");
			return (Criteria) this;
		}

		public Criteria andSourceTypeIsNotNull() {
			addCriterion("source_type is not null");
			return (Criteria) this;
		}

		public Criteria andSourceTypeEqualTo(String value) {
			addCriterion("source_type =", value, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeNotEqualTo(String value) {
			addCriterion("source_type <>", value, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeGreaterThan(String value) {
			addCriterion("source_type >", value, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeGreaterThanOrEqualTo(String value) {
			addCriterion("source_type >=", value, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeLessThan(String value) {
			addCriterion("source_type <", value, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeLessThanOrEqualTo(String value) {
			addCriterion("source_type <=", value, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeLike(String value) {
			addCriterion("source_type like", value, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeNotLike(String value) {
			addCriterion("source_type not like", value, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeIn(List<String> values) {
			addCriterion("source_type in", values, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeNotIn(List<String> values) {
			addCriterion("source_type not in", values, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeBetween(String value1, String value2) {
			addCriterion("source_type between", value1, value2, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeNotBetween(String value1, String value2) {
			addCriterion("source_type not between", value1, value2, "sourceType");
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
