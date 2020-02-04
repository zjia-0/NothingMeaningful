package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class PersonnelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonnelExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andPersonnelidIsNull() {
            addCriterion("personnelid is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelidIsNotNull() {
            addCriterion("personnelid is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelidEqualTo(String value) {
            addCriterion("personnelid =", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidNotEqualTo(String value) {
            addCriterion("personnelid <>", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidGreaterThan(String value) {
            addCriterion("personnelid >", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidGreaterThanOrEqualTo(String value) {
            addCriterion("personnelid >=", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidLessThan(String value) {
            addCriterion("personnelid <", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidLessThanOrEqualTo(String value) {
            addCriterion("personnelid <=", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidLike(String value) {
            addCriterion("personnelid like", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidNotLike(String value) {
            addCriterion("personnelid not like", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidIn(List<String> values) {
            addCriterion("personnelid in", values, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidNotIn(List<String> values) {
            addCriterion("personnelid not in", values, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidBetween(String value1, String value2) {
            addCriterion("personnelid between", value1, value2, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidNotBetween(String value1, String value2) {
            addCriterion("personnelid not between", value1, value2, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelnameIsNull() {
            addCriterion("personnelname is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelnameIsNotNull() {
            addCriterion("personnelname is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelnameEqualTo(String value) {
            addCriterion("personnelname =", value, "personnelname");
            return (Criteria) this;
        }

        public Criteria andPersonnelnameNotEqualTo(String value) {
            addCriterion("personnelname <>", value, "personnelname");
            return (Criteria) this;
        }

        public Criteria andPersonnelnameGreaterThan(String value) {
            addCriterion("personnelname >", value, "personnelname");
            return (Criteria) this;
        }

        public Criteria andPersonnelnameGreaterThanOrEqualTo(String value) {
            addCriterion("personnelname >=", value, "personnelname");
            return (Criteria) this;
        }

        public Criteria andPersonnelnameLessThan(String value) {
            addCriterion("personnelname <", value, "personnelname");
            return (Criteria) this;
        }

        public Criteria andPersonnelnameLessThanOrEqualTo(String value) {
            addCriterion("personnelname <=", value, "personnelname");
            return (Criteria) this;
        }

        public Criteria andPersonnelnameLike(String value) {
            addCriterion("personnelname like", value, "personnelname");
            return (Criteria) this;
        }

        public Criteria andPersonnelnameNotLike(String value) {
            addCriterion("personnelname not like", value, "personnelname");
            return (Criteria) this;
        }

        public Criteria andPersonnelnameIn(List<String> values) {
            addCriterion("personnelname in", values, "personnelname");
            return (Criteria) this;
        }

        public Criteria andPersonnelnameNotIn(List<String> values) {
            addCriterion("personnelname not in", values, "personnelname");
            return (Criteria) this;
        }

        public Criteria andPersonnelnameBetween(String value1, String value2) {
            addCriterion("personnelname between", value1, value2, "personnelname");
            return (Criteria) this;
        }

        public Criteria andPersonnelnameNotBetween(String value1, String value2) {
            addCriterion("personnelname not between", value1, value2, "personnelname");
            return (Criteria) this;
        }

        public Criteria andEnteridIsNull() {
            addCriterion("enterid is null");
            return (Criteria) this;
        }

        public Criteria andEnteridIsNotNull() {
            addCriterion("enterid is not null");
            return (Criteria) this;
        }

        public Criteria andEnteridEqualTo(String value) {
            addCriterion("enterid =", value, "enterid");
            return (Criteria) this;
        }

        public Criteria andEnteridNotEqualTo(String value) {
            addCriterion("enterid <>", value, "enterid");
            return (Criteria) this;
        }

        public Criteria andEnteridGreaterThan(String value) {
            addCriterion("enterid >", value, "enterid");
            return (Criteria) this;
        }

        public Criteria andEnteridGreaterThanOrEqualTo(String value) {
            addCriterion("enterid >=", value, "enterid");
            return (Criteria) this;
        }

        public Criteria andEnteridLessThan(String value) {
            addCriterion("enterid <", value, "enterid");
            return (Criteria) this;
        }

        public Criteria andEnteridLessThanOrEqualTo(String value) {
            addCriterion("enterid <=", value, "enterid");
            return (Criteria) this;
        }

        public Criteria andEnteridLike(String value) {
            addCriterion("enterid like", value, "enterid");
            return (Criteria) this;
        }

        public Criteria andEnteridNotLike(String value) {
            addCriterion("enterid not like", value, "enterid");
            return (Criteria) this;
        }

        public Criteria andEnteridIn(List<String> values) {
            addCriterion("enterid in", values, "enterid");
            return (Criteria) this;
        }

        public Criteria andEnteridNotIn(List<String> values) {
            addCriterion("enterid not in", values, "enterid");
            return (Criteria) this;
        }

        public Criteria andEnteridBetween(String value1, String value2) {
            addCriterion("enterid between", value1, value2, "enterid");
            return (Criteria) this;
        }

        public Criteria andEnteridNotBetween(String value1, String value2) {
            addCriterion("enterid not between", value1, value2, "enterid");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andStoreidIsNull() {
            addCriterion("storeid is null");
            return (Criteria) this;
        }

        public Criteria andStoreidIsNotNull() {
            addCriterion("storeid is not null");
            return (Criteria) this;
        }

        public Criteria andStoreidEqualTo(Integer value) {
            addCriterion("storeid =", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotEqualTo(Integer value) {
            addCriterion("storeid <>", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThan(Integer value) {
            addCriterion("storeid >", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("storeid >=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThan(Integer value) {
            addCriterion("storeid <", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThanOrEqualTo(Integer value) {
            addCriterion("storeid <=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidIn(List<Integer> values) {
            addCriterion("storeid in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotIn(List<Integer> values) {
            addCriterion("storeid not in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidBetween(Integer value1, Integer value2) {
            addCriterion("storeid between", value1, value2, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotBetween(Integer value1, Integer value2) {
            addCriterion("storeid not between", value1, value2, "storeid");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andPostIsNull() {
            addCriterion("post is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("post is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(String value) {
            addCriterion("post =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(String value) {
            addCriterion("post <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(String value) {
            addCriterion("post >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(String value) {
            addCriterion("post >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(String value) {
            addCriterion("post <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(String value) {
            addCriterion("post <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLike(String value) {
            addCriterion("post like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotLike(String value) {
            addCriterion("post not like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<String> values) {
            addCriterion("post in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<String> values) {
            addCriterion("post not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(String value1, String value2) {
            addCriterion("post between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(String value1, String value2) {
            addCriterion("post not between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateIsNull() {
            addCriterion("physicalstate is null");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateIsNotNull() {
            addCriterion("physicalstate is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateEqualTo(String value) {
            addCriterion("physicalstate =", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateNotEqualTo(String value) {
            addCriterion("physicalstate <>", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateGreaterThan(String value) {
            addCriterion("physicalstate >", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateGreaterThanOrEqualTo(String value) {
            addCriterion("physicalstate >=", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateLessThan(String value) {
            addCriterion("physicalstate <", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateLessThanOrEqualTo(String value) {
            addCriterion("physicalstate <=", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateLike(String value) {
            addCriterion("physicalstate like", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateNotLike(String value) {
            addCriterion("physicalstate not like", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateIn(List<String> values) {
            addCriterion("physicalstate in", values, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateNotIn(List<String> values) {
            addCriterion("physicalstate not in", values, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateBetween(String value1, String value2) {
            addCriterion("physicalstate between", value1, value2, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateNotBetween(String value1, String value2) {
            addCriterion("physicalstate not between", value1, value2, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(String value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(String value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(String value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(String value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(String value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(String value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLike(String value) {
            addCriterion("height like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotLike(String value) {
            addCriterion("height not like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<String> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<String> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(String value1, String value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(String value1, String value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andCardIsNull() {
            addCriterion("card is null");
            return (Criteria) this;
        }

        public Criteria andCardIsNotNull() {
            addCriterion("card is not null");
            return (Criteria) this;
        }

        public Criteria andCardEqualTo(String value) {
            addCriterion("card =", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotEqualTo(String value) {
            addCriterion("card <>", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThan(String value) {
            addCriterion("card >", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThanOrEqualTo(String value) {
            addCriterion("card >=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThan(String value) {
            addCriterion("card <", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThanOrEqualTo(String value) {
            addCriterion("card <=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLike(String value) {
            addCriterion("card like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotLike(String value) {
            addCriterion("card not like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardIn(List<String> values) {
            addCriterion("card in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotIn(List<String> values) {
            addCriterion("card not in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardBetween(String value1, String value2) {
            addCriterion("card between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotBetween(String value1, String value2) {
            addCriterion("card not between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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

        public Criteria andDegreeIsNull() {
            addCriterion("degree is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("degree is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(String value) {
            addCriterion("degree =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(String value) {
            addCriterion("degree <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(String value) {
            addCriterion("degree >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("degree >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(String value) {
            addCriterion("degree <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(String value) {
            addCriterion("degree <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLike(String value) {
            addCriterion("degree like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotLike(String value) {
            addCriterion("degree not like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<String> values) {
            addCriterion("degree in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<String> values) {
            addCriterion("degree not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(String value1, String value2) {
            addCriterion("degree between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(String value1, String value2) {
            addCriterion("degree not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIsNull() {
            addCriterion("birthplace is null");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIsNotNull() {
            addCriterion("birthplace is not null");
            return (Criteria) this;
        }

        public Criteria andBirthplaceEqualTo(String value) {
            addCriterion("birthplace =", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotEqualTo(String value) {
            addCriterion("birthplace <>", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceGreaterThan(String value) {
            addCriterion("birthplace >", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceGreaterThanOrEqualTo(String value) {
            addCriterion("birthplace >=", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLessThan(String value) {
            addCriterion("birthplace <", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLessThanOrEqualTo(String value) {
            addCriterion("birthplace <=", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLike(String value) {
            addCriterion("birthplace like", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotLike(String value) {
            addCriterion("birthplace not like", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIn(List<String> values) {
            addCriterion("birthplace in", values, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotIn(List<String> values) {
            addCriterion("birthplace not in", values, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceBetween(String value1, String value2) {
            addCriterion("birthplace between", value1, value2, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotBetween(String value1, String value2) {
            addCriterion("birthplace not between", value1, value2, "birthplace");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andSchooltagIsNull() {
            addCriterion("schooltag is null");
            return (Criteria) this;
        }

        public Criteria andSchooltagIsNotNull() {
            addCriterion("schooltag is not null");
            return (Criteria) this;
        }

        public Criteria andSchooltagEqualTo(String value) {
            addCriterion("schooltag =", value, "schooltag");
            return (Criteria) this;
        }

        public Criteria andSchooltagNotEqualTo(String value) {
            addCriterion("schooltag <>", value, "schooltag");
            return (Criteria) this;
        }

        public Criteria andSchooltagGreaterThan(String value) {
            addCriterion("schooltag >", value, "schooltag");
            return (Criteria) this;
        }

        public Criteria andSchooltagGreaterThanOrEqualTo(String value) {
            addCriterion("schooltag >=", value, "schooltag");
            return (Criteria) this;
        }

        public Criteria andSchooltagLessThan(String value) {
            addCriterion("schooltag <", value, "schooltag");
            return (Criteria) this;
        }

        public Criteria andSchooltagLessThanOrEqualTo(String value) {
            addCriterion("schooltag <=", value, "schooltag");
            return (Criteria) this;
        }

        public Criteria andSchooltagLike(String value) {
            addCriterion("schooltag like", value, "schooltag");
            return (Criteria) this;
        }

        public Criteria andSchooltagNotLike(String value) {
            addCriterion("schooltag not like", value, "schooltag");
            return (Criteria) this;
        }

        public Criteria andSchooltagIn(List<String> values) {
            addCriterion("schooltag in", values, "schooltag");
            return (Criteria) this;
        }

        public Criteria andSchooltagNotIn(List<String> values) {
            addCriterion("schooltag not in", values, "schooltag");
            return (Criteria) this;
        }

        public Criteria andSchooltagBetween(String value1, String value2) {
            addCriterion("schooltag between", value1, value2, "schooltag");
            return (Criteria) this;
        }

        public Criteria andSchooltagNotBetween(String value1, String value2) {
            addCriterion("schooltag not between", value1, value2, "schooltag");
            return (Criteria) this;
        }

        public Criteria andMartialIsNull() {
            addCriterion("martial is null");
            return (Criteria) this;
        }

        public Criteria andMartialIsNotNull() {
            addCriterion("martial is not null");
            return (Criteria) this;
        }

        public Criteria andMartialEqualTo(String value) {
            addCriterion("martial =", value, "martial");
            return (Criteria) this;
        }

        public Criteria andMartialNotEqualTo(String value) {
            addCriterion("martial <>", value, "martial");
            return (Criteria) this;
        }

        public Criteria andMartialGreaterThan(String value) {
            addCriterion("martial >", value, "martial");
            return (Criteria) this;
        }

        public Criteria andMartialGreaterThanOrEqualTo(String value) {
            addCriterion("martial >=", value, "martial");
            return (Criteria) this;
        }

        public Criteria andMartialLessThan(String value) {
            addCriterion("martial <", value, "martial");
            return (Criteria) this;
        }

        public Criteria andMartialLessThanOrEqualTo(String value) {
            addCriterion("martial <=", value, "martial");
            return (Criteria) this;
        }

        public Criteria andMartialLike(String value) {
            addCriterion("martial like", value, "martial");
            return (Criteria) this;
        }

        public Criteria andMartialNotLike(String value) {
            addCriterion("martial not like", value, "martial");
            return (Criteria) this;
        }

        public Criteria andMartialIn(List<String> values) {
            addCriterion("martial in", values, "martial");
            return (Criteria) this;
        }

        public Criteria andMartialNotIn(List<String> values) {
            addCriterion("martial not in", values, "martial");
            return (Criteria) this;
        }

        public Criteria andMartialBetween(String value1, String value2) {
            addCriterion("martial between", value1, value2, "martial");
            return (Criteria) this;
        }

        public Criteria andMartialNotBetween(String value1, String value2) {
            addCriterion("martial not between", value1, value2, "martial");
            return (Criteria) this;
        }

        public Criteria andCompileIsNull() {
            addCriterion("compile is null");
            return (Criteria) this;
        }

        public Criteria andCompileIsNotNull() {
            addCriterion("compile is not null");
            return (Criteria) this;
        }

        public Criteria andCompileEqualTo(String value) {
            addCriterion("compile =", value, "compile");
            return (Criteria) this;
        }

        public Criteria andCompileNotEqualTo(String value) {
            addCriterion("compile <>", value, "compile");
            return (Criteria) this;
        }

        public Criteria andCompileGreaterThan(String value) {
            addCriterion("compile >", value, "compile");
            return (Criteria) this;
        }

        public Criteria andCompileGreaterThanOrEqualTo(String value) {
            addCriterion("compile >=", value, "compile");
            return (Criteria) this;
        }

        public Criteria andCompileLessThan(String value) {
            addCriterion("compile <", value, "compile");
            return (Criteria) this;
        }

        public Criteria andCompileLessThanOrEqualTo(String value) {
            addCriterion("compile <=", value, "compile");
            return (Criteria) this;
        }

        public Criteria andCompileLike(String value) {
            addCriterion("compile like", value, "compile");
            return (Criteria) this;
        }

        public Criteria andCompileNotLike(String value) {
            addCriterion("compile not like", value, "compile");
            return (Criteria) this;
        }

        public Criteria andCompileIn(List<String> values) {
            addCriterion("compile in", values, "compile");
            return (Criteria) this;
        }

        public Criteria andCompileNotIn(List<String> values) {
            addCriterion("compile not in", values, "compile");
            return (Criteria) this;
        }

        public Criteria andCompileBetween(String value1, String value2) {
            addCriterion("compile between", value1, value2, "compile");
            return (Criteria) this;
        }

        public Criteria andCompileNotBetween(String value1, String value2) {
            addCriterion("compile not between", value1, value2, "compile");
            return (Criteria) this;
        }

        public Criteria andBankcodeIsNull() {
            addCriterion("bankcode is null");
            return (Criteria) this;
        }

        public Criteria andBankcodeIsNotNull() {
            addCriterion("bankcode is not null");
            return (Criteria) this;
        }

        public Criteria andBankcodeEqualTo(String value) {
            addCriterion("bankcode =", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotEqualTo(String value) {
            addCriterion("bankcode <>", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeGreaterThan(String value) {
            addCriterion("bankcode >", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeGreaterThanOrEqualTo(String value) {
            addCriterion("bankcode >=", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLessThan(String value) {
            addCriterion("bankcode <", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLessThanOrEqualTo(String value) {
            addCriterion("bankcode <=", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLike(String value) {
            addCriterion("bankcode like", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotLike(String value) {
            addCriterion("bankcode not like", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeIn(List<String> values) {
            addCriterion("bankcode in", values, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotIn(List<String> values) {
            addCriterion("bankcode not in", values, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeBetween(String value1, String value2) {
            addCriterion("bankcode between", value1, value2, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotBetween(String value1, String value2) {
            addCriterion("bankcode not between", value1, value2, "bankcode");
            return (Criteria) this;
        }

        public Criteria andEmergencynameIsNull() {
            addCriterion("emergencyname is null");
            return (Criteria) this;
        }

        public Criteria andEmergencynameIsNotNull() {
            addCriterion("emergencyname is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencynameEqualTo(String value) {
            addCriterion("emergencyname =", value, "emergencyname");
            return (Criteria) this;
        }

        public Criteria andEmergencynameNotEqualTo(String value) {
            addCriterion("emergencyname <>", value, "emergencyname");
            return (Criteria) this;
        }

        public Criteria andEmergencynameGreaterThan(String value) {
            addCriterion("emergencyname >", value, "emergencyname");
            return (Criteria) this;
        }

        public Criteria andEmergencynameGreaterThanOrEqualTo(String value) {
            addCriterion("emergencyname >=", value, "emergencyname");
            return (Criteria) this;
        }

        public Criteria andEmergencynameLessThan(String value) {
            addCriterion("emergencyname <", value, "emergencyname");
            return (Criteria) this;
        }

        public Criteria andEmergencynameLessThanOrEqualTo(String value) {
            addCriterion("emergencyname <=", value, "emergencyname");
            return (Criteria) this;
        }

        public Criteria andEmergencynameLike(String value) {
            addCriterion("emergencyname like", value, "emergencyname");
            return (Criteria) this;
        }

        public Criteria andEmergencynameNotLike(String value) {
            addCriterion("emergencyname not like", value, "emergencyname");
            return (Criteria) this;
        }

        public Criteria andEmergencynameIn(List<String> values) {
            addCriterion("emergencyname in", values, "emergencyname");
            return (Criteria) this;
        }

        public Criteria andEmergencynameNotIn(List<String> values) {
            addCriterion("emergencyname not in", values, "emergencyname");
            return (Criteria) this;
        }

        public Criteria andEmergencynameBetween(String value1, String value2) {
            addCriterion("emergencyname between", value1, value2, "emergencyname");
            return (Criteria) this;
        }

        public Criteria andEmergencynameNotBetween(String value1, String value2) {
            addCriterion("emergencyname not between", value1, value2, "emergencyname");
            return (Criteria) this;
        }

        public Criteria andEmergencyphoneIsNull() {
            addCriterion("emergencyphone is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyphoneIsNotNull() {
            addCriterion("emergencyphone is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyphoneEqualTo(String value) {
            addCriterion("emergencyphone =", value, "emergencyphone");
            return (Criteria) this;
        }

        public Criteria andEmergencyphoneNotEqualTo(String value) {
            addCriterion("emergencyphone <>", value, "emergencyphone");
            return (Criteria) this;
        }

        public Criteria andEmergencyphoneGreaterThan(String value) {
            addCriterion("emergencyphone >", value, "emergencyphone");
            return (Criteria) this;
        }

        public Criteria andEmergencyphoneGreaterThanOrEqualTo(String value) {
            addCriterion("emergencyphone >=", value, "emergencyphone");
            return (Criteria) this;
        }

        public Criteria andEmergencyphoneLessThan(String value) {
            addCriterion("emergencyphone <", value, "emergencyphone");
            return (Criteria) this;
        }

        public Criteria andEmergencyphoneLessThanOrEqualTo(String value) {
            addCriterion("emergencyphone <=", value, "emergencyphone");
            return (Criteria) this;
        }

        public Criteria andEmergencyphoneLike(String value) {
            addCriterion("emergencyphone like", value, "emergencyphone");
            return (Criteria) this;
        }

        public Criteria andEmergencyphoneNotLike(String value) {
            addCriterion("emergencyphone not like", value, "emergencyphone");
            return (Criteria) this;
        }

        public Criteria andEmergencyphoneIn(List<String> values) {
            addCriterion("emergencyphone in", values, "emergencyphone");
            return (Criteria) this;
        }

        public Criteria andEmergencyphoneNotIn(List<String> values) {
            addCriterion("emergencyphone not in", values, "emergencyphone");
            return (Criteria) this;
        }

        public Criteria andEmergencyphoneBetween(String value1, String value2) {
            addCriterion("emergencyphone between", value1, value2, "emergencyphone");
            return (Criteria) this;
        }

        public Criteria andEmergencyphoneNotBetween(String value1, String value2) {
            addCriterion("emergencyphone not between", value1, value2, "emergencyphone");
            return (Criteria) this;
        }

        public Criteria andHiredateIsNull() {
            addCriterion("hiredate is null");
            return (Criteria) this;
        }

        public Criteria andHiredateIsNotNull() {
            addCriterion("hiredate is not null");
            return (Criteria) this;
        }

        public Criteria andHiredateEqualTo(String value) {
            addCriterion("hiredate =", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateNotEqualTo(String value) {
            addCriterion("hiredate <>", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateGreaterThan(String value) {
            addCriterion("hiredate >", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateGreaterThanOrEqualTo(String value) {
            addCriterion("hiredate >=", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateLessThan(String value) {
            addCriterion("hiredate <", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateLessThanOrEqualTo(String value) {
            addCriterion("hiredate <=", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateLike(String value) {
            addCriterion("hiredate like", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateNotLike(String value) {
            addCriterion("hiredate not like", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateIn(List<String> values) {
            addCriterion("hiredate in", values, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateNotIn(List<String> values) {
            addCriterion("hiredate not in", values, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateBetween(String value1, String value2) {
            addCriterion("hiredate between", value1, value2, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateNotBetween(String value1, String value2) {
            addCriterion("hiredate not between", value1, value2, "hiredate");
            return (Criteria) this;
        }

        public Criteria andApplicableIsNull() {
            addCriterion("applicable is null");
            return (Criteria) this;
        }

        public Criteria andApplicableIsNotNull() {
            addCriterion("applicable is not null");
            return (Criteria) this;
        }

        public Criteria andApplicableEqualTo(String value) {
            addCriterion("applicable =", value, "applicable");
            return (Criteria) this;
        }

        public Criteria andApplicableNotEqualTo(String value) {
            addCriterion("applicable <>", value, "applicable");
            return (Criteria) this;
        }

        public Criteria andApplicableGreaterThan(String value) {
            addCriterion("applicable >", value, "applicable");
            return (Criteria) this;
        }

        public Criteria andApplicableGreaterThanOrEqualTo(String value) {
            addCriterion("applicable >=", value, "applicable");
            return (Criteria) this;
        }

        public Criteria andApplicableLessThan(String value) {
            addCriterion("applicable <", value, "applicable");
            return (Criteria) this;
        }

        public Criteria andApplicableLessThanOrEqualTo(String value) {
            addCriterion("applicable <=", value, "applicable");
            return (Criteria) this;
        }

        public Criteria andApplicableLike(String value) {
            addCriterion("applicable like", value, "applicable");
            return (Criteria) this;
        }

        public Criteria andApplicableNotLike(String value) {
            addCriterion("applicable not like", value, "applicable");
            return (Criteria) this;
        }

        public Criteria andApplicableIn(List<String> values) {
            addCriterion("applicable in", values, "applicable");
            return (Criteria) this;
        }

        public Criteria andApplicableNotIn(List<String> values) {
            addCriterion("applicable not in", values, "applicable");
            return (Criteria) this;
        }

        public Criteria andApplicableBetween(String value1, String value2) {
            addCriterion("applicable between", value1, value2, "applicable");
            return (Criteria) this;
        }

        public Criteria andApplicableNotBetween(String value1, String value2) {
            addCriterion("applicable not between", value1, value2, "applicable");
            return (Criteria) this;
        }

        public Criteria andBorndateIsNull() {
            addCriterion("borndate is null");
            return (Criteria) this;
        }

        public Criteria andBorndateIsNotNull() {
            addCriterion("borndate is not null");
            return (Criteria) this;
        }

        public Criteria andBorndateEqualTo(String value) {
            addCriterion("borndate =", value, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateNotEqualTo(String value) {
            addCriterion("borndate <>", value, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateGreaterThan(String value) {
            addCriterion("borndate >", value, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateGreaterThanOrEqualTo(String value) {
            addCriterion("borndate >=", value, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateLessThan(String value) {
            addCriterion("borndate <", value, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateLessThanOrEqualTo(String value) {
            addCriterion("borndate <=", value, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateLike(String value) {
            addCriterion("borndate like", value, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateNotLike(String value) {
            addCriterion("borndate not like", value, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateIn(List<String> values) {
            addCriterion("borndate in", values, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateNotIn(List<String> values) {
            addCriterion("borndate not in", values, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateBetween(String value1, String value2) {
            addCriterion("borndate between", value1, value2, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateNotBetween(String value1, String value2) {
            addCriterion("borndate not between", value1, value2, "borndate");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startdate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startdate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(String value) {
            addCriterion("startdate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(String value) {
            addCriterion("startdate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(String value) {
            addCriterion("startdate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(String value) {
            addCriterion("startdate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(String value) {
            addCriterion("startdate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(String value) {
            addCriterion("startdate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLike(String value) {
            addCriterion("startdate like", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotLike(String value) {
            addCriterion("startdate not like", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<String> values) {
            addCriterion("startdate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<String> values) {
            addCriterion("startdate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(String value1, String value2) {
            addCriterion("startdate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(String value1, String value2) {
            addCriterion("startdate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(String value) {
            addCriterion("enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(String value) {
            addCriterion("enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(String value) {
            addCriterion("enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(String value) {
            addCriterion("enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(String value) {
            addCriterion("enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(String value) {
            addCriterion("enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLike(String value) {
            addCriterion("enddate like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotLike(String value) {
            addCriterion("enddate not like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<String> values) {
            addCriterion("enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<String> values) {
            addCriterion("enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(String value1, String value2) {
            addCriterion("enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(String value1, String value2) {
            addCriterion("enddate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andReferrerIsNull() {
            addCriterion("referrer is null");
            return (Criteria) this;
        }

        public Criteria andReferrerIsNotNull() {
            addCriterion("referrer is not null");
            return (Criteria) this;
        }

        public Criteria andReferrerEqualTo(String value) {
            addCriterion("referrer =", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerNotEqualTo(String value) {
            addCriterion("referrer <>", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerGreaterThan(String value) {
            addCriterion("referrer >", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerGreaterThanOrEqualTo(String value) {
            addCriterion("referrer >=", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerLessThan(String value) {
            addCriterion("referrer <", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerLessThanOrEqualTo(String value) {
            addCriterion("referrer <=", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerLike(String value) {
            addCriterion("referrer like", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerNotLike(String value) {
            addCriterion("referrer not like", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerIn(List<String> values) {
            addCriterion("referrer in", values, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerNotIn(List<String> values) {
            addCriterion("referrer not in", values, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerBetween(String value1, String value2) {
            addCriterion("referrer between", value1, value2, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerNotBetween(String value1, String value2) {
            addCriterion("referrer not between", value1, value2, "referrer");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNull() {
            addCriterion("remark1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("remark1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("remark1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("remark1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("remark1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("remark1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("remark1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("remark1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("remark1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("remark1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("remark1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("remark1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("remark1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("remark1 not between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNull() {
            addCriterion("remark2 is null");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNotNull() {
            addCriterion("remark2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark2EqualTo(String value) {
            addCriterion("remark2 =", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotEqualTo(String value) {
            addCriterion("remark2 <>", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThan(String value) {
            addCriterion("remark2 >", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("remark2 >=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThan(String value) {
            addCriterion("remark2 <", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThanOrEqualTo(String value) {
            addCriterion("remark2 <=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Like(String value) {
            addCriterion("remark2 like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotLike(String value) {
            addCriterion("remark2 not like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2In(List<String> values) {
            addCriterion("remark2 in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotIn(List<String> values) {
            addCriterion("remark2 not in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Between(String value1, String value2) {
            addCriterion("remark2 between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotBetween(String value1, String value2) {
            addCriterion("remark2 not between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark3IsNull() {
            addCriterion("remark3 is null");
            return (Criteria) this;
        }

        public Criteria andRemark3IsNotNull() {
            addCriterion("remark3 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark3EqualTo(String value) {
            addCriterion("remark3 =", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotEqualTo(String value) {
            addCriterion("remark3 <>", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3GreaterThan(String value) {
            addCriterion("remark3 >", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3GreaterThanOrEqualTo(String value) {
            addCriterion("remark3 >=", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3LessThan(String value) {
            addCriterion("remark3 <", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3LessThanOrEqualTo(String value) {
            addCriterion("remark3 <=", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3Like(String value) {
            addCriterion("remark3 like", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotLike(String value) {
            addCriterion("remark3 not like", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3In(List<String> values) {
            addCriterion("remark3 in", values, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotIn(List<String> values) {
            addCriterion("remark3 not in", values, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3Between(String value1, String value2) {
            addCriterion("remark3 between", value1, value2, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotBetween(String value1, String value2) {
            addCriterion("remark3 not between", value1, value2, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark4IsNull() {
            addCriterion("remark4 is null");
            return (Criteria) this;
        }

        public Criteria andRemark4IsNotNull() {
            addCriterion("remark4 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark4EqualTo(String value) {
            addCriterion("remark4 =", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotEqualTo(String value) {
            addCriterion("remark4 <>", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4GreaterThan(String value) {
            addCriterion("remark4 >", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4GreaterThanOrEqualTo(String value) {
            addCriterion("remark4 >=", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4LessThan(String value) {
            addCriterion("remark4 <", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4LessThanOrEqualTo(String value) {
            addCriterion("remark4 <=", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4Like(String value) {
            addCriterion("remark4 like", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotLike(String value) {
            addCriterion("remark4 not like", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4In(List<String> values) {
            addCriterion("remark4 in", values, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotIn(List<String> values) {
            addCriterion("remark4 not in", values, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4Between(String value1, String value2) {
            addCriterion("remark4 between", value1, value2, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotBetween(String value1, String value2) {
            addCriterion("remark4 not between", value1, value2, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark5IsNull() {
            addCriterion("remark5 is null");
            return (Criteria) this;
        }

        public Criteria andRemark5IsNotNull() {
            addCriterion("remark5 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark5EqualTo(String value) {
            addCriterion("remark5 =", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5NotEqualTo(String value) {
            addCriterion("remark5 <>", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5GreaterThan(String value) {
            addCriterion("remark5 >", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5GreaterThanOrEqualTo(String value) {
            addCriterion("remark5 >=", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5LessThan(String value) {
            addCriterion("remark5 <", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5LessThanOrEqualTo(String value) {
            addCriterion("remark5 <=", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5Like(String value) {
            addCriterion("remark5 like", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5NotLike(String value) {
            addCriterion("remark5 not like", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5In(List<String> values) {
            addCriterion("remark5 in", values, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5NotIn(List<String> values) {
            addCriterion("remark5 not in", values, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5Between(String value1, String value2) {
            addCriterion("remark5 between", value1, value2, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5NotBetween(String value1, String value2) {
            addCriterion("remark5 not between", value1, value2, "remark5");
            return (Criteria) this;
        }
    }

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