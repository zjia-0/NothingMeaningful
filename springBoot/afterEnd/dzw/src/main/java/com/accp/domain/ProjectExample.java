package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMaintainidIsNull() {
            addCriterion("maintainid is null");
            return (Criteria) this;
        }

        public Criteria andMaintainidIsNotNull() {
            addCriterion("maintainid is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainidEqualTo(Integer value) {
            addCriterion("maintainid =", value, "maintainid");
            return (Criteria) this;
        }

        public Criteria andMaintainidNotEqualTo(Integer value) {
            addCriterion("maintainid <>", value, "maintainid");
            return (Criteria) this;
        }

        public Criteria andMaintainidGreaterThan(Integer value) {
            addCriterion("maintainid >", value, "maintainid");
            return (Criteria) this;
        }

        public Criteria andMaintainidGreaterThanOrEqualTo(Integer value) {
            addCriterion("maintainid >=", value, "maintainid");
            return (Criteria) this;
        }

        public Criteria andMaintainidLessThan(Integer value) {
            addCriterion("maintainid <", value, "maintainid");
            return (Criteria) this;
        }

        public Criteria andMaintainidLessThanOrEqualTo(Integer value) {
            addCriterion("maintainid <=", value, "maintainid");
            return (Criteria) this;
        }

        public Criteria andMaintainidIn(List<Integer> values) {
            addCriterion("maintainid in", values, "maintainid");
            return (Criteria) this;
        }

        public Criteria andMaintainidNotIn(List<Integer> values) {
            addCriterion("maintainid not in", values, "maintainid");
            return (Criteria) this;
        }

        public Criteria andMaintainidBetween(Integer value1, Integer value2) {
            addCriterion("maintainid between", value1, value2, "maintainid");
            return (Criteria) this;
        }

        public Criteria andMaintainidNotBetween(Integer value1, Integer value2) {
            addCriterion("maintainid not between", value1, value2, "maintainid");
            return (Criteria) this;
        }

        public Criteria andPnumIsNull() {
            addCriterion("pnum is null");
            return (Criteria) this;
        }

        public Criteria andPnumIsNotNull() {
            addCriterion("pnum is not null");
            return (Criteria) this;
        }

        public Criteria andPnumEqualTo(String value) {
            addCriterion("pnum =", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumNotEqualTo(String value) {
            addCriterion("pnum <>", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumGreaterThan(String value) {
            addCriterion("pnum >", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumGreaterThanOrEqualTo(String value) {
            addCriterion("pnum >=", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumLessThan(String value) {
            addCriterion("pnum <", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumLessThanOrEqualTo(String value) {
            addCriterion("pnum <=", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumLike(String value) {
            addCriterion("pnum like", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumNotLike(String value) {
            addCriterion("pnum not like", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumIn(List<String> values) {
            addCriterion("pnum in", values, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumNotIn(List<String> values) {
            addCriterion("pnum not in", values, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumBetween(String value1, String value2) {
            addCriterion("pnum between", value1, value2, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumNotBetween(String value1, String value2) {
            addCriterion("pnum not between", value1, value2, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnameIsNull() {
            addCriterion("pname is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pname is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pname =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pname <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pname >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pname >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pname <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pname <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pname like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pname not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pname in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pname not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pname between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pname not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andIncomeidIsNull() {
            addCriterion("incomeid is null");
            return (Criteria) this;
        }

        public Criteria andIncomeidIsNotNull() {
            addCriterion("incomeid is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeidEqualTo(Integer value) {
            addCriterion("incomeid =", value, "incomeid");
            return (Criteria) this;
        }

        public Criteria andIncomeidNotEqualTo(Integer value) {
            addCriterion("incomeid <>", value, "incomeid");
            return (Criteria) this;
        }

        public Criteria andIncomeidGreaterThan(Integer value) {
            addCriterion("incomeid >", value, "incomeid");
            return (Criteria) this;
        }

        public Criteria andIncomeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("incomeid >=", value, "incomeid");
            return (Criteria) this;
        }

        public Criteria andIncomeidLessThan(Integer value) {
            addCriterion("incomeid <", value, "incomeid");
            return (Criteria) this;
        }

        public Criteria andIncomeidLessThanOrEqualTo(Integer value) {
            addCriterion("incomeid <=", value, "incomeid");
            return (Criteria) this;
        }

        public Criteria andIncomeidIn(List<Integer> values) {
            addCriterion("incomeid in", values, "incomeid");
            return (Criteria) this;
        }

        public Criteria andIncomeidNotIn(List<Integer> values) {
            addCriterion("incomeid not in", values, "incomeid");
            return (Criteria) this;
        }

        public Criteria andIncomeidBetween(Integer value1, Integer value2) {
            addCriterion("incomeid between", value1, value2, "incomeid");
            return (Criteria) this;
        }

        public Criteria andIncomeidNotBetween(Integer value1, Integer value2) {
            addCriterion("incomeid not between", value1, value2, "incomeid");
            return (Criteria) this;
        }

        public Criteria andStandardpriceIsNull() {
            addCriterion("standardprice is null");
            return (Criteria) this;
        }

        public Criteria andStandardpriceIsNotNull() {
            addCriterion("standardprice is not null");
            return (Criteria) this;
        }

        public Criteria andStandardpriceEqualTo(Float value) {
            addCriterion("standardprice =", value, "standardprice");
            return (Criteria) this;
        }

        public Criteria andStandardpriceNotEqualTo(Float value) {
            addCriterion("standardprice <>", value, "standardprice");
            return (Criteria) this;
        }

        public Criteria andStandardpriceGreaterThan(Float value) {
            addCriterion("standardprice >", value, "standardprice");
            return (Criteria) this;
        }

        public Criteria andStandardpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("standardprice >=", value, "standardprice");
            return (Criteria) this;
        }

        public Criteria andStandardpriceLessThan(Float value) {
            addCriterion("standardprice <", value, "standardprice");
            return (Criteria) this;
        }

        public Criteria andStandardpriceLessThanOrEqualTo(Float value) {
            addCriterion("standardprice <=", value, "standardprice");
            return (Criteria) this;
        }

        public Criteria andStandardpriceIn(List<Float> values) {
            addCriterion("standardprice in", values, "standardprice");
            return (Criteria) this;
        }

        public Criteria andStandardpriceNotIn(List<Float> values) {
            addCriterion("standardprice not in", values, "standardprice");
            return (Criteria) this;
        }

        public Criteria andStandardpriceBetween(Float value1, Float value2) {
            addCriterion("standardprice between", value1, value2, "standardprice");
            return (Criteria) this;
        }

        public Criteria andStandardpriceNotBetween(Float value1, Float value2) {
            addCriterion("standardprice not between", value1, value2, "standardprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceIsNull() {
            addCriterion("memberprice is null");
            return (Criteria) this;
        }

        public Criteria andMemberpriceIsNotNull() {
            addCriterion("memberprice is not null");
            return (Criteria) this;
        }

        public Criteria andMemberpriceEqualTo(Float value) {
            addCriterion("memberprice =", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceNotEqualTo(Float value) {
            addCriterion("memberprice <>", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceGreaterThan(Float value) {
            addCriterion("memberprice >", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("memberprice >=", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceLessThan(Float value) {
            addCriterion("memberprice <", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceLessThanOrEqualTo(Float value) {
            addCriterion("memberprice <=", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceIn(List<Float> values) {
            addCriterion("memberprice in", values, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceNotIn(List<Float> values) {
            addCriterion("memberprice not in", values, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceBetween(Float value1, Float value2) {
            addCriterion("memberprice between", value1, value2, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceNotBetween(Float value1, Float value2) {
            addCriterion("memberprice not between", value1, value2, "memberprice");
            return (Criteria) this;
        }

        public Criteria andVippriceIsNull() {
            addCriterion("vipprice is null");
            return (Criteria) this;
        }

        public Criteria andVippriceIsNotNull() {
            addCriterion("vipprice is not null");
            return (Criteria) this;
        }

        public Criteria andVippriceEqualTo(Float value) {
            addCriterion("vipprice =", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotEqualTo(Float value) {
            addCriterion("vipprice <>", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceGreaterThan(Float value) {
            addCriterion("vipprice >", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceGreaterThanOrEqualTo(Float value) {
            addCriterion("vipprice >=", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceLessThan(Float value) {
            addCriterion("vipprice <", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceLessThanOrEqualTo(Float value) {
            addCriterion("vipprice <=", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceIn(List<Float> values) {
            addCriterion("vipprice in", values, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotIn(List<Float> values) {
            addCriterion("vipprice not in", values, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceBetween(Float value1, Float value2) {
            addCriterion("vipprice between", value1, value2, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotBetween(Float value1, Float value2) {
            addCriterion("vipprice not between", value1, value2, "vipprice");
            return (Criteria) this;
        }

        public Criteria andDealpriceIsNull() {
            addCriterion("dealprice is null");
            return (Criteria) this;
        }

        public Criteria andDealpriceIsNotNull() {
            addCriterion("dealprice is not null");
            return (Criteria) this;
        }

        public Criteria andDealpriceEqualTo(Float value) {
            addCriterion("dealprice =", value, "dealprice");
            return (Criteria) this;
        }

        public Criteria andDealpriceNotEqualTo(Float value) {
            addCriterion("dealprice <>", value, "dealprice");
            return (Criteria) this;
        }

        public Criteria andDealpriceGreaterThan(Float value) {
            addCriterion("dealprice >", value, "dealprice");
            return (Criteria) this;
        }

        public Criteria andDealpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("dealprice >=", value, "dealprice");
            return (Criteria) this;
        }

        public Criteria andDealpriceLessThan(Float value) {
            addCriterion("dealprice <", value, "dealprice");
            return (Criteria) this;
        }

        public Criteria andDealpriceLessThanOrEqualTo(Float value) {
            addCriterion("dealprice <=", value, "dealprice");
            return (Criteria) this;
        }

        public Criteria andDealpriceIn(List<Float> values) {
            addCriterion("dealprice in", values, "dealprice");
            return (Criteria) this;
        }

        public Criteria andDealpriceNotIn(List<Float> values) {
            addCriterion("dealprice not in", values, "dealprice");
            return (Criteria) this;
        }

        public Criteria andDealpriceBetween(Float value1, Float value2) {
            addCriterion("dealprice between", value1, value2, "dealprice");
            return (Criteria) this;
        }

        public Criteria andDealpriceNotBetween(Float value1, Float value2) {
            addCriterion("dealprice not between", value1, value2, "dealprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceIsNull() {
            addCriterion("claimprice is null");
            return (Criteria) this;
        }

        public Criteria andClaimpriceIsNotNull() {
            addCriterion("claimprice is not null");
            return (Criteria) this;
        }

        public Criteria andClaimpriceEqualTo(Float value) {
            addCriterion("claimprice =", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceNotEqualTo(Float value) {
            addCriterion("claimprice <>", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceGreaterThan(Float value) {
            addCriterion("claimprice >", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("claimprice >=", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceLessThan(Float value) {
            addCriterion("claimprice <", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceLessThanOrEqualTo(Float value) {
            addCriterion("claimprice <=", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceIn(List<Float> values) {
            addCriterion("claimprice in", values, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceNotIn(List<Float> values) {
            addCriterion("claimprice not in", values, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceBetween(Float value1, Float value2) {
            addCriterion("claimprice between", value1, value2, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceNotBetween(Float value1, Float value2) {
            addCriterion("claimprice not between", value1, value2, "claimprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceIsNull() {
            addCriterion("insuranceprice is null");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceIsNotNull() {
            addCriterion("insuranceprice is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceEqualTo(Float value) {
            addCriterion("insuranceprice =", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceNotEqualTo(Float value) {
            addCriterion("insuranceprice <>", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceGreaterThan(Float value) {
            addCriterion("insuranceprice >", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceGreaterThanOrEqualTo(Float value) {
            addCriterion("insuranceprice >=", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceLessThan(Float value) {
            addCriterion("insuranceprice <", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceLessThanOrEqualTo(Float value) {
            addCriterion("insuranceprice <=", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceIn(List<Float> values) {
            addCriterion("insuranceprice in", values, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceNotIn(List<Float> values) {
            addCriterion("insuranceprice not in", values, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceBetween(Float value1, Float value2) {
            addCriterion("insuranceprice between", value1, value2, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceNotBetween(Float value1, Float value2) {
            addCriterion("insuranceprice not between", value1, value2, "insuranceprice");
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