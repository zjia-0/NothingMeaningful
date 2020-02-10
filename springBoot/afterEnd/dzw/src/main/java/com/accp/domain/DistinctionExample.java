package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class DistinctionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DistinctionExample() {
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

        public Criteria andDisidIsNull() {
            addCriterion("disid is null");
            return (Criteria) this;
        }

        public Criteria andDisidIsNotNull() {
            addCriterion("disid is not null");
            return (Criteria) this;
        }

        public Criteria andDisidEqualTo(Integer value) {
            addCriterion("disid =", value, "disid");
            return (Criteria) this;
        }

        public Criteria andDisidNotEqualTo(Integer value) {
            addCriterion("disid <>", value, "disid");
            return (Criteria) this;
        }

        public Criteria andDisidGreaterThan(Integer value) {
            addCriterion("disid >", value, "disid");
            return (Criteria) this;
        }

        public Criteria andDisidGreaterThanOrEqualTo(Integer value) {
            addCriterion("disid >=", value, "disid");
            return (Criteria) this;
        }

        public Criteria andDisidLessThan(Integer value) {
            addCriterion("disid <", value, "disid");
            return (Criteria) this;
        }

        public Criteria andDisidLessThanOrEqualTo(Integer value) {
            addCriterion("disid <=", value, "disid");
            return (Criteria) this;
        }

        public Criteria andDisidIn(List<Integer> values) {
            addCriterion("disid in", values, "disid");
            return (Criteria) this;
        }

        public Criteria andDisidNotIn(List<Integer> values) {
            addCriterion("disid not in", values, "disid");
            return (Criteria) this;
        }

        public Criteria andDisidBetween(Integer value1, Integer value2) {
            addCriterion("disid between", value1, value2, "disid");
            return (Criteria) this;
        }

        public Criteria andDisidNotBetween(Integer value1, Integer value2) {
            addCriterion("disid not between", value1, value2, "disid");
            return (Criteria) this;
        }

        public Criteria andImpIsNull() {
            addCriterion("imp is null");
            return (Criteria) this;
        }

        public Criteria andImpIsNotNull() {
            addCriterion("imp is not null");
            return (Criteria) this;
        }

        public Criteria andImpEqualTo(String value) {
            addCriterion("imp =", value, "imp");
            return (Criteria) this;
        }

        public Criteria andImpNotEqualTo(String value) {
            addCriterion("imp <>", value, "imp");
            return (Criteria) this;
        }

        public Criteria andImpGreaterThan(String value) {
            addCriterion("imp >", value, "imp");
            return (Criteria) this;
        }

        public Criteria andImpGreaterThanOrEqualTo(String value) {
            addCriterion("imp >=", value, "imp");
            return (Criteria) this;
        }

        public Criteria andImpLessThan(String value) {
            addCriterion("imp <", value, "imp");
            return (Criteria) this;
        }

        public Criteria andImpLessThanOrEqualTo(String value) {
            addCriterion("imp <=", value, "imp");
            return (Criteria) this;
        }

        public Criteria andImpLike(String value) {
            addCriterion("imp like", value, "imp");
            return (Criteria) this;
        }

        public Criteria andImpNotLike(String value) {
            addCriterion("imp not like", value, "imp");
            return (Criteria) this;
        }

        public Criteria andImpIn(List<String> values) {
            addCriterion("imp in", values, "imp");
            return (Criteria) this;
        }

        public Criteria andImpNotIn(List<String> values) {
            addCriterion("imp not in", values, "imp");
            return (Criteria) this;
        }

        public Criteria andImpBetween(String value1, String value2) {
            addCriterion("imp between", value1, value2, "imp");
            return (Criteria) this;
        }

        public Criteria andImpNotBetween(String value1, String value2) {
            addCriterion("imp not between", value1, value2, "imp");
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