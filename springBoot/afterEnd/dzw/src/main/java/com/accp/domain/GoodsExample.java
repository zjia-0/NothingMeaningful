package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Integer value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Integer value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Integer value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Integer value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Integer value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Integer> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Integer> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Integer value1, Integer value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Integer value1, Integer value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGnameIsNull() {
            addCriterion("gname is null");
            return (Criteria) this;
        }

        public Criteria andGnameIsNotNull() {
            addCriterion("gname is not null");
            return (Criteria) this;
        }

        public Criteria andGnameEqualTo(String value) {
            addCriterion("gname =", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotEqualTo(String value) {
            addCriterion("gname <>", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThan(String value) {
            addCriterion("gname >", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThanOrEqualTo(String value) {
            addCriterion("gname >=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThan(String value) {
            addCriterion("gname <", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThanOrEqualTo(String value) {
            addCriterion("gname <=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLike(String value) {
            addCriterion("gname like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotLike(String value) {
            addCriterion("gname not like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameIn(List<String> values) {
            addCriterion("gname in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotIn(List<String> values) {
            addCriterion("gname not in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameBetween(String value1, String value2) {
            addCriterion("gname between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotBetween(String value1, String value2) {
            addCriterion("gname not between", value1, value2, "gname");
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

        public Criteria andApplycarIsNull() {
            addCriterion("applycar is null");
            return (Criteria) this;
        }

        public Criteria andApplycarIsNotNull() {
            addCriterion("applycar is not null");
            return (Criteria) this;
        }

        public Criteria andApplycarEqualTo(String value) {
            addCriterion("applycar =", value, "applycar");
            return (Criteria) this;
        }

        public Criteria andApplycarNotEqualTo(String value) {
            addCriterion("applycar <>", value, "applycar");
            return (Criteria) this;
        }

        public Criteria andApplycarGreaterThan(String value) {
            addCriterion("applycar >", value, "applycar");
            return (Criteria) this;
        }

        public Criteria andApplycarGreaterThanOrEqualTo(String value) {
            addCriterion("applycar >=", value, "applycar");
            return (Criteria) this;
        }

        public Criteria andApplycarLessThan(String value) {
            addCriterion("applycar <", value, "applycar");
            return (Criteria) this;
        }

        public Criteria andApplycarLessThanOrEqualTo(String value) {
            addCriterion("applycar <=", value, "applycar");
            return (Criteria) this;
        }

        public Criteria andApplycarLike(String value) {
            addCriterion("applycar like", value, "applycar");
            return (Criteria) this;
        }

        public Criteria andApplycarNotLike(String value) {
            addCriterion("applycar not like", value, "applycar");
            return (Criteria) this;
        }

        public Criteria andApplycarIn(List<String> values) {
            addCriterion("applycar in", values, "applycar");
            return (Criteria) this;
        }

        public Criteria andApplycarNotIn(List<String> values) {
            addCriterion("applycar not in", values, "applycar");
            return (Criteria) this;
        }

        public Criteria andApplycarBetween(String value1, String value2) {
            addCriterion("applycar between", value1, value2, "applycar");
            return (Criteria) this;
        }

        public Criteria andApplycarNotBetween(String value1, String value2) {
            addCriterion("applycar not between", value1, value2, "applycar");
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

        public Criteria andBigclassifyIsNull() {
            addCriterion("bigclassify is null");
            return (Criteria) this;
        }

        public Criteria andBigclassifyIsNotNull() {
            addCriterion("bigclassify is not null");
            return (Criteria) this;
        }

        public Criteria andBigclassifyEqualTo(String value) {
            addCriterion("bigclassify =", value, "bigclassify");
            return (Criteria) this;
        }

        public Criteria andBigclassifyNotEqualTo(String value) {
            addCriterion("bigclassify <>", value, "bigclassify");
            return (Criteria) this;
        }

        public Criteria andBigclassifyGreaterThan(String value) {
            addCriterion("bigclassify >", value, "bigclassify");
            return (Criteria) this;
        }

        public Criteria andBigclassifyGreaterThanOrEqualTo(String value) {
            addCriterion("bigclassify >=", value, "bigclassify");
            return (Criteria) this;
        }

        public Criteria andBigclassifyLessThan(String value) {
            addCriterion("bigclassify <", value, "bigclassify");
            return (Criteria) this;
        }

        public Criteria andBigclassifyLessThanOrEqualTo(String value) {
            addCriterion("bigclassify <=", value, "bigclassify");
            return (Criteria) this;
        }

        public Criteria andBigclassifyLike(String value) {
            addCriterion("bigclassify like", value, "bigclassify");
            return (Criteria) this;
        }

        public Criteria andBigclassifyNotLike(String value) {
            addCriterion("bigclassify not like", value, "bigclassify");
            return (Criteria) this;
        }

        public Criteria andBigclassifyIn(List<String> values) {
            addCriterion("bigclassify in", values, "bigclassify");
            return (Criteria) this;
        }

        public Criteria andBigclassifyNotIn(List<String> values) {
            addCriterion("bigclassify not in", values, "bigclassify");
            return (Criteria) this;
        }

        public Criteria andBigclassifyBetween(String value1, String value2) {
            addCriterion("bigclassify between", value1, value2, "bigclassify");
            return (Criteria) this;
        }

        public Criteria andBigclassifyNotBetween(String value1, String value2) {
            addCriterion("bigclassify not between", value1, value2, "bigclassify");
            return (Criteria) this;
        }

        public Criteria andCentreclassifyIsNull() {
            addCriterion("centreclassify is null");
            return (Criteria) this;
        }

        public Criteria andCentreclassifyIsNotNull() {
            addCriterion("centreclassify is not null");
            return (Criteria) this;
        }

        public Criteria andCentreclassifyEqualTo(String value) {
            addCriterion("centreclassify =", value, "centreclassify");
            return (Criteria) this;
        }

        public Criteria andCentreclassifyNotEqualTo(String value) {
            addCriterion("centreclassify <>", value, "centreclassify");
            return (Criteria) this;
        }

        public Criteria andCentreclassifyGreaterThan(String value) {
            addCriterion("centreclassify >", value, "centreclassify");
            return (Criteria) this;
        }

        public Criteria andCentreclassifyGreaterThanOrEqualTo(String value) {
            addCriterion("centreclassify >=", value, "centreclassify");
            return (Criteria) this;
        }

        public Criteria andCentreclassifyLessThan(String value) {
            addCriterion("centreclassify <", value, "centreclassify");
            return (Criteria) this;
        }

        public Criteria andCentreclassifyLessThanOrEqualTo(String value) {
            addCriterion("centreclassify <=", value, "centreclassify");
            return (Criteria) this;
        }

        public Criteria andCentreclassifyLike(String value) {
            addCriterion("centreclassify like", value, "centreclassify");
            return (Criteria) this;
        }

        public Criteria andCentreclassifyNotLike(String value) {
            addCriterion("centreclassify not like", value, "centreclassify");
            return (Criteria) this;
        }

        public Criteria andCentreclassifyIn(List<String> values) {
            addCriterion("centreclassify in", values, "centreclassify");
            return (Criteria) this;
        }

        public Criteria andCentreclassifyNotIn(List<String> values) {
            addCriterion("centreclassify not in", values, "centreclassify");
            return (Criteria) this;
        }

        public Criteria andCentreclassifyBetween(String value1, String value2) {
            addCriterion("centreclassify between", value1, value2, "centreclassify");
            return (Criteria) this;
        }

        public Criteria andCentreclassifyNotBetween(String value1, String value2) {
            addCriterion("centreclassify not between", value1, value2, "centreclassify");
            return (Criteria) this;
        }

        public Criteria andSmallclassifyIsNull() {
            addCriterion("smallclassify is null");
            return (Criteria) this;
        }

        public Criteria andSmallclassifyIsNotNull() {
            addCriterion("smallclassify is not null");
            return (Criteria) this;
        }

        public Criteria andSmallclassifyEqualTo(String value) {
            addCriterion("smallclassify =", value, "smallclassify");
            return (Criteria) this;
        }

        public Criteria andSmallclassifyNotEqualTo(String value) {
            addCriterion("smallclassify <>", value, "smallclassify");
            return (Criteria) this;
        }

        public Criteria andSmallclassifyGreaterThan(String value) {
            addCriterion("smallclassify >", value, "smallclassify");
            return (Criteria) this;
        }

        public Criteria andSmallclassifyGreaterThanOrEqualTo(String value) {
            addCriterion("smallclassify >=", value, "smallclassify");
            return (Criteria) this;
        }

        public Criteria andSmallclassifyLessThan(String value) {
            addCriterion("smallclassify <", value, "smallclassify");
            return (Criteria) this;
        }

        public Criteria andSmallclassifyLessThanOrEqualTo(String value) {
            addCriterion("smallclassify <=", value, "smallclassify");
            return (Criteria) this;
        }

        public Criteria andSmallclassifyLike(String value) {
            addCriterion("smallclassify like", value, "smallclassify");
            return (Criteria) this;
        }

        public Criteria andSmallclassifyNotLike(String value) {
            addCriterion("smallclassify not like", value, "smallclassify");
            return (Criteria) this;
        }

        public Criteria andSmallclassifyIn(List<String> values) {
            addCriterion("smallclassify in", values, "smallclassify");
            return (Criteria) this;
        }

        public Criteria andSmallclassifyNotIn(List<String> values) {
            addCriterion("smallclassify not in", values, "smallclassify");
            return (Criteria) this;
        }

        public Criteria andSmallclassifyBetween(String value1, String value2) {
            addCriterion("smallclassify between", value1, value2, "smallclassify");
            return (Criteria) this;
        }

        public Criteria andSmallclassifyNotBetween(String value1, String value2) {
            addCriterion("smallclassify not between", value1, value2, "smallclassify");
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

        public Criteria andVenderIsNull() {
            addCriterion("vender is null");
            return (Criteria) this;
        }

        public Criteria andVenderIsNotNull() {
            addCriterion("vender is not null");
            return (Criteria) this;
        }

        public Criteria andVenderEqualTo(String value) {
            addCriterion("vender =", value, "vender");
            return (Criteria) this;
        }

        public Criteria andVenderNotEqualTo(String value) {
            addCriterion("vender <>", value, "vender");
            return (Criteria) this;
        }

        public Criteria andVenderGreaterThan(String value) {
            addCriterion("vender >", value, "vender");
            return (Criteria) this;
        }

        public Criteria andVenderGreaterThanOrEqualTo(String value) {
            addCriterion("vender >=", value, "vender");
            return (Criteria) this;
        }

        public Criteria andVenderLessThan(String value) {
            addCriterion("vender <", value, "vender");
            return (Criteria) this;
        }

        public Criteria andVenderLessThanOrEqualTo(String value) {
            addCriterion("vender <=", value, "vender");
            return (Criteria) this;
        }

        public Criteria andVenderLike(String value) {
            addCriterion("vender like", value, "vender");
            return (Criteria) this;
        }

        public Criteria andVenderNotLike(String value) {
            addCriterion("vender not like", value, "vender");
            return (Criteria) this;
        }

        public Criteria andVenderIn(List<String> values) {
            addCriterion("vender in", values, "vender");
            return (Criteria) this;
        }

        public Criteria andVenderNotIn(List<String> values) {
            addCriterion("vender not in", values, "vender");
            return (Criteria) this;
        }

        public Criteria andVenderBetween(String value1, String value2) {
            addCriterion("vender between", value1, value2, "vender");
            return (Criteria) this;
        }

        public Criteria andVenderNotBetween(String value1, String value2) {
            addCriterion("vender not between", value1, value2, "vender");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andYieldiyIsNull() {
            addCriterion("yieldiy is null");
            return (Criteria) this;
        }

        public Criteria andYieldiyIsNotNull() {
            addCriterion("yieldiy is not null");
            return (Criteria) this;
        }

        public Criteria andYieldiyEqualTo(String value) {
            addCriterion("yieldiy =", value, "yieldiy");
            return (Criteria) this;
        }

        public Criteria andYieldiyNotEqualTo(String value) {
            addCriterion("yieldiy <>", value, "yieldiy");
            return (Criteria) this;
        }

        public Criteria andYieldiyGreaterThan(String value) {
            addCriterion("yieldiy >", value, "yieldiy");
            return (Criteria) this;
        }

        public Criteria andYieldiyGreaterThanOrEqualTo(String value) {
            addCriterion("yieldiy >=", value, "yieldiy");
            return (Criteria) this;
        }

        public Criteria andYieldiyLessThan(String value) {
            addCriterion("yieldiy <", value, "yieldiy");
            return (Criteria) this;
        }

        public Criteria andYieldiyLessThanOrEqualTo(String value) {
            addCriterion("yieldiy <=", value, "yieldiy");
            return (Criteria) this;
        }

        public Criteria andYieldiyLike(String value) {
            addCriterion("yieldiy like", value, "yieldiy");
            return (Criteria) this;
        }

        public Criteria andYieldiyNotLike(String value) {
            addCriterion("yieldiy not like", value, "yieldiy");
            return (Criteria) this;
        }

        public Criteria andYieldiyIn(List<String> values) {
            addCriterion("yieldiy in", values, "yieldiy");
            return (Criteria) this;
        }

        public Criteria andYieldiyNotIn(List<String> values) {
            addCriterion("yieldiy not in", values, "yieldiy");
            return (Criteria) this;
        }

        public Criteria andYieldiyBetween(String value1, String value2) {
            addCriterion("yieldiy between", value1, value2, "yieldiy");
            return (Criteria) this;
        }

        public Criteria andYieldiyNotBetween(String value1, String value2) {
            addCriterion("yieldiy not between", value1, value2, "yieldiy");
            return (Criteria) this;
        }

        public Criteria andFactorynameIsNull() {
            addCriterion("factoryname is null");
            return (Criteria) this;
        }

        public Criteria andFactorynameIsNotNull() {
            addCriterion("factoryname is not null");
            return (Criteria) this;
        }

        public Criteria andFactorynameEqualTo(String value) {
            addCriterion("factoryname =", value, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameNotEqualTo(String value) {
            addCriterion("factoryname <>", value, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameGreaterThan(String value) {
            addCriterion("factoryname >", value, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameGreaterThanOrEqualTo(String value) {
            addCriterion("factoryname >=", value, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameLessThan(String value) {
            addCriterion("factoryname <", value, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameLessThanOrEqualTo(String value) {
            addCriterion("factoryname <=", value, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameLike(String value) {
            addCriterion("factoryname like", value, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameNotLike(String value) {
            addCriterion("factoryname not like", value, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameIn(List<String> values) {
            addCriterion("factoryname in", values, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameNotIn(List<String> values) {
            addCriterion("factoryname not in", values, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameBetween(String value1, String value2) {
            addCriterion("factoryname between", value1, value2, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameNotBetween(String value1, String value2) {
            addCriterion("factoryname not between", value1, value2, "factoryname");
            return (Criteria) this;
        }

        public Criteria andCodingIsNull() {
            addCriterion("coding is null");
            return (Criteria) this;
        }

        public Criteria andCodingIsNotNull() {
            addCriterion("coding is not null");
            return (Criteria) this;
        }

        public Criteria andCodingEqualTo(String value) {
            addCriterion("coding =", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingNotEqualTo(String value) {
            addCriterion("coding <>", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingGreaterThan(String value) {
            addCriterion("coding >", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingGreaterThanOrEqualTo(String value) {
            addCriterion("coding >=", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingLessThan(String value) {
            addCriterion("coding <", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingLessThanOrEqualTo(String value) {
            addCriterion("coding <=", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingLike(String value) {
            addCriterion("coding like", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingNotLike(String value) {
            addCriterion("coding not like", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingIn(List<String> values) {
            addCriterion("coding in", values, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingNotIn(List<String> values) {
            addCriterion("coding not in", values, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingBetween(String value1, String value2) {
            addCriterion("coding between", value1, value2, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingNotBetween(String value1, String value2) {
            addCriterion("coding not between", value1, value2, "coding");
            return (Criteria) this;
        }

        public Criteria andBarcodesIsNull() {
            addCriterion("barcodes is null");
            return (Criteria) this;
        }

        public Criteria andBarcodesIsNotNull() {
            addCriterion("barcodes is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodesEqualTo(String value) {
            addCriterion("barcodes =", value, "barcodes");
            return (Criteria) this;
        }

        public Criteria andBarcodesNotEqualTo(String value) {
            addCriterion("barcodes <>", value, "barcodes");
            return (Criteria) this;
        }

        public Criteria andBarcodesGreaterThan(String value) {
            addCriterion("barcodes >", value, "barcodes");
            return (Criteria) this;
        }

        public Criteria andBarcodesGreaterThanOrEqualTo(String value) {
            addCriterion("barcodes >=", value, "barcodes");
            return (Criteria) this;
        }

        public Criteria andBarcodesLessThan(String value) {
            addCriterion("barcodes <", value, "barcodes");
            return (Criteria) this;
        }

        public Criteria andBarcodesLessThanOrEqualTo(String value) {
            addCriterion("barcodes <=", value, "barcodes");
            return (Criteria) this;
        }

        public Criteria andBarcodesLike(String value) {
            addCriterion("barcodes like", value, "barcodes");
            return (Criteria) this;
        }

        public Criteria andBarcodesNotLike(String value) {
            addCriterion("barcodes not like", value, "barcodes");
            return (Criteria) this;
        }

        public Criteria andBarcodesIn(List<String> values) {
            addCriterion("barcodes in", values, "barcodes");
            return (Criteria) this;
        }

        public Criteria andBarcodesNotIn(List<String> values) {
            addCriterion("barcodes not in", values, "barcodes");
            return (Criteria) this;
        }

        public Criteria andBarcodesBetween(String value1, String value2) {
            addCriterion("barcodes between", value1, value2, "barcodes");
            return (Criteria) this;
        }

        public Criteria andBarcodesNotBetween(String value1, String value2) {
            addCriterion("barcodes not between", value1, value2, "barcodes");
            return (Criteria) this;
        }

        public Criteria andSpecsIsNull() {
            addCriterion("specs is null");
            return (Criteria) this;
        }

        public Criteria andSpecsIsNotNull() {
            addCriterion("specs is not null");
            return (Criteria) this;
        }

        public Criteria andSpecsEqualTo(String value) {
            addCriterion("specs =", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsNotEqualTo(String value) {
            addCriterion("specs <>", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsGreaterThan(String value) {
            addCriterion("specs >", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsGreaterThanOrEqualTo(String value) {
            addCriterion("specs >=", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsLessThan(String value) {
            addCriterion("specs <", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsLessThanOrEqualTo(String value) {
            addCriterion("specs <=", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsLike(String value) {
            addCriterion("specs like", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsNotLike(String value) {
            addCriterion("specs not like", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsIn(List<String> values) {
            addCriterion("specs in", values, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsNotIn(List<String> values) {
            addCriterion("specs not in", values, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsBetween(String value1, String value2) {
            addCriterion("specs between", value1, value2, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsNotBetween(String value1, String value2) {
            addCriterion("specs not between", value1, value2, "specs");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(String value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(String value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(String value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(String value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(String value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLike(String value) {
            addCriterion("volume like", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotLike(String value) {
            addCriterion("volume not like", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<String> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<String> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(String value1, String value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(String value1, String value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andNetweightIsNull() {
            addCriterion("netweight is null");
            return (Criteria) this;
        }

        public Criteria andNetweightIsNotNull() {
            addCriterion("netweight is not null");
            return (Criteria) this;
        }

        public Criteria andNetweightEqualTo(Integer value) {
            addCriterion("netweight =", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightNotEqualTo(Integer value) {
            addCriterion("netweight <>", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightGreaterThan(Integer value) {
            addCriterion("netweight >", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightGreaterThanOrEqualTo(Integer value) {
            addCriterion("netweight >=", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightLessThan(Integer value) {
            addCriterion("netweight <", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightLessThanOrEqualTo(Integer value) {
            addCriterion("netweight <=", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightIn(List<Integer> values) {
            addCriterion("netweight in", values, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightNotIn(List<Integer> values) {
            addCriterion("netweight not in", values, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightBetween(Integer value1, Integer value2) {
            addCriterion("netweight between", value1, value2, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightNotBetween(Integer value1, Integer value2) {
            addCriterion("netweight not between", value1, value2, "netweight");
            return (Criteria) this;
        }

        public Criteria andSuttleIsNull() {
            addCriterion("suttle is null");
            return (Criteria) this;
        }

        public Criteria andSuttleIsNotNull() {
            addCriterion("suttle is not null");
            return (Criteria) this;
        }

        public Criteria andSuttleEqualTo(Integer value) {
            addCriterion("suttle =", value, "suttle");
            return (Criteria) this;
        }

        public Criteria andSuttleNotEqualTo(Integer value) {
            addCriterion("suttle <>", value, "suttle");
            return (Criteria) this;
        }

        public Criteria andSuttleGreaterThan(Integer value) {
            addCriterion("suttle >", value, "suttle");
            return (Criteria) this;
        }

        public Criteria andSuttleGreaterThanOrEqualTo(Integer value) {
            addCriterion("suttle >=", value, "suttle");
            return (Criteria) this;
        }

        public Criteria andSuttleLessThan(Integer value) {
            addCriterion("suttle <", value, "suttle");
            return (Criteria) this;
        }

        public Criteria andSuttleLessThanOrEqualTo(Integer value) {
            addCriterion("suttle <=", value, "suttle");
            return (Criteria) this;
        }

        public Criteria andSuttleIn(List<Integer> values) {
            addCriterion("suttle in", values, "suttle");
            return (Criteria) this;
        }

        public Criteria andSuttleNotIn(List<Integer> values) {
            addCriterion("suttle not in", values, "suttle");
            return (Criteria) this;
        }

        public Criteria andSuttleBetween(Integer value1, Integer value2) {
            addCriterion("suttle between", value1, value2, "suttle");
            return (Criteria) this;
        }

        public Criteria andSuttleNotBetween(Integer value1, Integer value2) {
            addCriterion("suttle not between", value1, value2, "suttle");
            return (Criteria) this;
        }

        public Criteria andHikeIsNull() {
            addCriterion("hike is null");
            return (Criteria) this;
        }

        public Criteria andHikeIsNotNull() {
            addCriterion("hike is not null");
            return (Criteria) this;
        }

        public Criteria andHikeEqualTo(Float value) {
            addCriterion("hike =", value, "hike");
            return (Criteria) this;
        }

        public Criteria andHikeNotEqualTo(Float value) {
            addCriterion("hike <>", value, "hike");
            return (Criteria) this;
        }

        public Criteria andHikeGreaterThan(Float value) {
            addCriterion("hike >", value, "hike");
            return (Criteria) this;
        }

        public Criteria andHikeGreaterThanOrEqualTo(Float value) {
            addCriterion("hike >=", value, "hike");
            return (Criteria) this;
        }

        public Criteria andHikeLessThan(Float value) {
            addCriterion("hike <", value, "hike");
            return (Criteria) this;
        }

        public Criteria andHikeLessThanOrEqualTo(Float value) {
            addCriterion("hike <=", value, "hike");
            return (Criteria) this;
        }

        public Criteria andHikeIn(List<Float> values) {
            addCriterion("hike in", values, "hike");
            return (Criteria) this;
        }

        public Criteria andHikeNotIn(List<Float> values) {
            addCriterion("hike not in", values, "hike");
            return (Criteria) this;
        }

        public Criteria andHikeBetween(Float value1, Float value2) {
            addCriterion("hike between", value1, value2, "hike");
            return (Criteria) this;
        }

        public Criteria andHikeNotBetween(Float value1, Float value2) {
            addCriterion("hike not between", value1, value2, "hike");
            return (Criteria) this;
        }

        public Criteria andExchangeIsNull() {
            addCriterion("exchange is null");
            return (Criteria) this;
        }

        public Criteria andExchangeIsNotNull() {
            addCriterion("exchange is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeEqualTo(String value) {
            addCriterion("exchange =", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeNotEqualTo(String value) {
            addCriterion("exchange <>", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeGreaterThan(String value) {
            addCriterion("exchange >", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeGreaterThanOrEqualTo(String value) {
            addCriterion("exchange >=", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeLessThan(String value) {
            addCriterion("exchange <", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeLessThanOrEqualTo(String value) {
            addCriterion("exchange <=", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeLike(String value) {
            addCriterion("exchange like", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeNotLike(String value) {
            addCriterion("exchange not like", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeIn(List<String> values) {
            addCriterion("exchange in", values, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeNotIn(List<String> values) {
            addCriterion("exchange not in", values, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeBetween(String value1, String value2) {
            addCriterion("exchange between", value1, value2, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeNotBetween(String value1, String value2) {
            addCriterion("exchange not between", value1, value2, "exchange");
            return (Criteria) this;
        }

        public Criteria andPriceanIsNull() {
            addCriterion("pricean is null");
            return (Criteria) this;
        }

        public Criteria andPriceanIsNotNull() {
            addCriterion("pricean is not null");
            return (Criteria) this;
        }

        public Criteria andPriceanEqualTo(String value) {
            addCriterion("pricean =", value, "pricean");
            return (Criteria) this;
        }

        public Criteria andPriceanNotEqualTo(String value) {
            addCriterion("pricean <>", value, "pricean");
            return (Criteria) this;
        }

        public Criteria andPriceanGreaterThan(String value) {
            addCriterion("pricean >", value, "pricean");
            return (Criteria) this;
        }

        public Criteria andPriceanGreaterThanOrEqualTo(String value) {
            addCriterion("pricean >=", value, "pricean");
            return (Criteria) this;
        }

        public Criteria andPriceanLessThan(String value) {
            addCriterion("pricean <", value, "pricean");
            return (Criteria) this;
        }

        public Criteria andPriceanLessThanOrEqualTo(String value) {
            addCriterion("pricean <=", value, "pricean");
            return (Criteria) this;
        }

        public Criteria andPriceanLike(String value) {
            addCriterion("pricean like", value, "pricean");
            return (Criteria) this;
        }

        public Criteria andPriceanNotLike(String value) {
            addCriterion("pricean not like", value, "pricean");
            return (Criteria) this;
        }

        public Criteria andPriceanIn(List<String> values) {
            addCriterion("pricean in", values, "pricean");
            return (Criteria) this;
        }

        public Criteria andPriceanNotIn(List<String> values) {
            addCriterion("pricean not in", values, "pricean");
            return (Criteria) this;
        }

        public Criteria andPriceanBetween(String value1, String value2) {
            addCriterion("pricean between", value1, value2, "pricean");
            return (Criteria) this;
        }

        public Criteria andPriceanNotBetween(String value1, String value2) {
            addCriterion("pricean not between", value1, value2, "pricean");
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

        public Criteria andRemark6IsNull() {
            addCriterion("remark6 is null");
            return (Criteria) this;
        }

        public Criteria andRemark6IsNotNull() {
            addCriterion("remark6 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark6EqualTo(String value) {
            addCriterion("remark6 =", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6NotEqualTo(String value) {
            addCriterion("remark6 <>", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6GreaterThan(String value) {
            addCriterion("remark6 >", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6GreaterThanOrEqualTo(String value) {
            addCriterion("remark6 >=", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6LessThan(String value) {
            addCriterion("remark6 <", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6LessThanOrEqualTo(String value) {
            addCriterion("remark6 <=", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6Like(String value) {
            addCriterion("remark6 like", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6NotLike(String value) {
            addCriterion("remark6 not like", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6In(List<String> values) {
            addCriterion("remark6 in", values, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6NotIn(List<String> values) {
            addCriterion("remark6 not in", values, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6Between(String value1, String value2) {
            addCriterion("remark6 between", value1, value2, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6NotBetween(String value1, String value2) {
            addCriterion("remark6 not between", value1, value2, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark7IsNull() {
            addCriterion("remark7 is null");
            return (Criteria) this;
        }

        public Criteria andRemark7IsNotNull() {
            addCriterion("remark7 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark7EqualTo(String value) {
            addCriterion("remark7 =", value, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7NotEqualTo(String value) {
            addCriterion("remark7 <>", value, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7GreaterThan(String value) {
            addCriterion("remark7 >", value, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7GreaterThanOrEqualTo(String value) {
            addCriterion("remark7 >=", value, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7LessThan(String value) {
            addCriterion("remark7 <", value, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7LessThanOrEqualTo(String value) {
            addCriterion("remark7 <=", value, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7Like(String value) {
            addCriterion("remark7 like", value, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7NotLike(String value) {
            addCriterion("remark7 not like", value, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7In(List<String> values) {
            addCriterion("remark7 in", values, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7NotIn(List<String> values) {
            addCriterion("remark7 not in", values, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7Between(String value1, String value2) {
            addCriterion("remark7 between", value1, value2, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7NotBetween(String value1, String value2) {
            addCriterion("remark7 not between", value1, value2, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark8IsNull() {
            addCriterion("remark8 is null");
            return (Criteria) this;
        }

        public Criteria andRemark8IsNotNull() {
            addCriterion("remark8 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark8EqualTo(String value) {
            addCriterion("remark8 =", value, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8NotEqualTo(String value) {
            addCriterion("remark8 <>", value, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8GreaterThan(String value) {
            addCriterion("remark8 >", value, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8GreaterThanOrEqualTo(String value) {
            addCriterion("remark8 >=", value, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8LessThan(String value) {
            addCriterion("remark8 <", value, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8LessThanOrEqualTo(String value) {
            addCriterion("remark8 <=", value, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8Like(String value) {
            addCriterion("remark8 like", value, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8NotLike(String value) {
            addCriterion("remark8 not like", value, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8In(List<String> values) {
            addCriterion("remark8 in", values, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8NotIn(List<String> values) {
            addCriterion("remark8 not in", values, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8Between(String value1, String value2) {
            addCriterion("remark8 between", value1, value2, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8NotBetween(String value1, String value2) {
            addCriterion("remark8 not between", value1, value2, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark9IsNull() {
            addCriterion("remark9 is null");
            return (Criteria) this;
        }

        public Criteria andRemark9IsNotNull() {
            addCriterion("remark9 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark9EqualTo(String value) {
            addCriterion("remark9 =", value, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9NotEqualTo(String value) {
            addCriterion("remark9 <>", value, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9GreaterThan(String value) {
            addCriterion("remark9 >", value, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9GreaterThanOrEqualTo(String value) {
            addCriterion("remark9 >=", value, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9LessThan(String value) {
            addCriterion("remark9 <", value, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9LessThanOrEqualTo(String value) {
            addCriterion("remark9 <=", value, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9Like(String value) {
            addCriterion("remark9 like", value, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9NotLike(String value) {
            addCriterion("remark9 not like", value, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9In(List<String> values) {
            addCriterion("remark9 in", values, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9NotIn(List<String> values) {
            addCriterion("remark9 not in", values, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9Between(String value1, String value2) {
            addCriterion("remark9 between", value1, value2, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9NotBetween(String value1, String value2) {
            addCriterion("remark9 not between", value1, value2, "remark9");
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