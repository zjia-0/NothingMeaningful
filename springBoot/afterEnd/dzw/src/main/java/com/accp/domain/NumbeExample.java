package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class NumbeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NumbeExample() {
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

        public Criteria andNumbeidIsNull() {
            addCriterion("numbeid is null");
            return (Criteria) this;
        }

        public Criteria andNumbeidIsNotNull() {
            addCriterion("numbeid is not null");
            return (Criteria) this;
        }

        public Criteria andNumbeidEqualTo(String value) {
            addCriterion("numbeid =", value, "numbeid");
            return (Criteria) this;
        }

        public Criteria andNumbeidNotEqualTo(String value) {
            addCriterion("numbeid <>", value, "numbeid");
            return (Criteria) this;
        }

        public Criteria andNumbeidGreaterThan(String value) {
            addCriterion("numbeid >", value, "numbeid");
            return (Criteria) this;
        }

        public Criteria andNumbeidGreaterThanOrEqualTo(String value) {
            addCriterion("numbeid >=", value, "numbeid");
            return (Criteria) this;
        }

        public Criteria andNumbeidLessThan(String value) {
            addCriterion("numbeid <", value, "numbeid");
            return (Criteria) this;
        }

        public Criteria andNumbeidLessThanOrEqualTo(String value) {
            addCriterion("numbeid <=", value, "numbeid");
            return (Criteria) this;
        }

        public Criteria andNumbeidLike(String value) {
            addCriterion("numbeid like", value, "numbeid");
            return (Criteria) this;
        }

        public Criteria andNumbeidNotLike(String value) {
            addCriterion("numbeid not like", value, "numbeid");
            return (Criteria) this;
        }

        public Criteria andNumbeidIn(List<String> values) {
            addCriterion("numbeid in", values, "numbeid");
            return (Criteria) this;
        }

        public Criteria andNumbeidNotIn(List<String> values) {
            addCriterion("numbeid not in", values, "numbeid");
            return (Criteria) this;
        }

        public Criteria andNumbeidBetween(String value1, String value2) {
            addCriterion("numbeid between", value1, value2, "numbeid");
            return (Criteria) this;
        }

        public Criteria andNumbeidNotBetween(String value1, String value2) {
            addCriterion("numbeid not between", value1, value2, "numbeid");
            return (Criteria) this;
        }

        public Criteria andNumbenameIsNull() {
            addCriterion("numbename is null");
            return (Criteria) this;
        }

        public Criteria andNumbenameIsNotNull() {
            addCriterion("numbename is not null");
            return (Criteria) this;
        }

        public Criteria andNumbenameEqualTo(String value) {
            addCriterion("numbename =", value, "numbename");
            return (Criteria) this;
        }

        public Criteria andNumbenameNotEqualTo(String value) {
            addCriterion("numbename <>", value, "numbename");
            return (Criteria) this;
        }

        public Criteria andNumbenameGreaterThan(String value) {
            addCriterion("numbename >", value, "numbename");
            return (Criteria) this;
        }

        public Criteria andNumbenameGreaterThanOrEqualTo(String value) {
            addCriterion("numbename >=", value, "numbename");
            return (Criteria) this;
        }

        public Criteria andNumbenameLessThan(String value) {
            addCriterion("numbename <", value, "numbename");
            return (Criteria) this;
        }

        public Criteria andNumbenameLessThanOrEqualTo(String value) {
            addCriterion("numbename <=", value, "numbename");
            return (Criteria) this;
        }

        public Criteria andNumbenameLike(String value) {
            addCriterion("numbename like", value, "numbename");
            return (Criteria) this;
        }

        public Criteria andNumbenameNotLike(String value) {
            addCriterion("numbename not like", value, "numbename");
            return (Criteria) this;
        }

        public Criteria andNumbenameIn(List<String> values) {
            addCriterion("numbename in", values, "numbename");
            return (Criteria) this;
        }

        public Criteria andNumbenameNotIn(List<String> values) {
            addCriterion("numbename not in", values, "numbename");
            return (Criteria) this;
        }

        public Criteria andNumbenameBetween(String value1, String value2) {
            addCriterion("numbename between", value1, value2, "numbename");
            return (Criteria) this;
        }

        public Criteria andNumbenameNotBetween(String value1, String value2) {
            addCriterion("numbename not between", value1, value2, "numbename");
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