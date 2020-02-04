package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCnoIsNull() {
            addCriterion("cno is null");
            return (Criteria) this;
        }

        public Criteria andCnoIsNotNull() {
            addCriterion("cno is not null");
            return (Criteria) this;
        }

        public Criteria andCnoEqualTo(String value) {
            addCriterion("cno =", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotEqualTo(String value) {
            addCriterion("cno <>", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThan(String value) {
            addCriterion("cno >", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThanOrEqualTo(String value) {
            addCriterion("cno >=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThan(String value) {
            addCriterion("cno <", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThanOrEqualTo(String value) {
            addCriterion("cno <=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLike(String value) {
            addCriterion("cno like", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotLike(String value) {
            addCriterion("cno not like", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoIn(List<String> values) {
            addCriterion("cno in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotIn(List<String> values) {
            addCriterion("cno not in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoBetween(String value1, String value2) {
            addCriterion("cno between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotBetween(String value1, String value2) {
            addCriterion("cno not between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andCtnoIsNull() {
            addCriterion("ctno is null");
            return (Criteria) this;
        }

        public Criteria andCtnoIsNotNull() {
            addCriterion("ctno is not null");
            return (Criteria) this;
        }

        public Criteria andCtnoEqualTo(String value) {
            addCriterion("ctno =", value, "ctno");
            return (Criteria) this;
        }

        public Criteria andCtnoNotEqualTo(String value) {
            addCriterion("ctno <>", value, "ctno");
            return (Criteria) this;
        }

        public Criteria andCtnoGreaterThan(String value) {
            addCriterion("ctno >", value, "ctno");
            return (Criteria) this;
        }

        public Criteria andCtnoGreaterThanOrEqualTo(String value) {
            addCriterion("ctno >=", value, "ctno");
            return (Criteria) this;
        }

        public Criteria andCtnoLessThan(String value) {
            addCriterion("ctno <", value, "ctno");
            return (Criteria) this;
        }

        public Criteria andCtnoLessThanOrEqualTo(String value) {
            addCriterion("ctno <=", value, "ctno");
            return (Criteria) this;
        }

        public Criteria andCtnoLike(String value) {
            addCriterion("ctno like", value, "ctno");
            return (Criteria) this;
        }

        public Criteria andCtnoNotLike(String value) {
            addCriterion("ctno not like", value, "ctno");
            return (Criteria) this;
        }

        public Criteria andCtnoIn(List<String> values) {
            addCriterion("ctno in", values, "ctno");
            return (Criteria) this;
        }

        public Criteria andCtnoNotIn(List<String> values) {
            addCriterion("ctno not in", values, "ctno");
            return (Criteria) this;
        }

        public Criteria andCtnoBetween(String value1, String value2) {
            addCriterion("ctno between", value1, value2, "ctno");
            return (Criteria) this;
        }

        public Criteria andCtnoNotBetween(String value1, String value2) {
            addCriterion("ctno not between", value1, value2, "ctno");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCpeopleIsNull() {
            addCriterion("cpeople is null");
            return (Criteria) this;
        }

        public Criteria andCpeopleIsNotNull() {
            addCriterion("cpeople is not null");
            return (Criteria) this;
        }

        public Criteria andCpeopleEqualTo(String value) {
            addCriterion("cpeople =", value, "cpeople");
            return (Criteria) this;
        }

        public Criteria andCpeopleNotEqualTo(String value) {
            addCriterion("cpeople <>", value, "cpeople");
            return (Criteria) this;
        }

        public Criteria andCpeopleGreaterThan(String value) {
            addCriterion("cpeople >", value, "cpeople");
            return (Criteria) this;
        }

        public Criteria andCpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("cpeople >=", value, "cpeople");
            return (Criteria) this;
        }

        public Criteria andCpeopleLessThan(String value) {
            addCriterion("cpeople <", value, "cpeople");
            return (Criteria) this;
        }

        public Criteria andCpeopleLessThanOrEqualTo(String value) {
            addCriterion("cpeople <=", value, "cpeople");
            return (Criteria) this;
        }

        public Criteria andCpeopleLike(String value) {
            addCriterion("cpeople like", value, "cpeople");
            return (Criteria) this;
        }

        public Criteria andCpeopleNotLike(String value) {
            addCriterion("cpeople not like", value, "cpeople");
            return (Criteria) this;
        }

        public Criteria andCpeopleIn(List<String> values) {
            addCriterion("cpeople in", values, "cpeople");
            return (Criteria) this;
        }

        public Criteria andCpeopleNotIn(List<String> values) {
            addCriterion("cpeople not in", values, "cpeople");
            return (Criteria) this;
        }

        public Criteria andCpeopleBetween(String value1, String value2) {
            addCriterion("cpeople between", value1, value2, "cpeople");
            return (Criteria) this;
        }

        public Criteria andCpeopleNotBetween(String value1, String value2) {
            addCriterion("cpeople not between", value1, value2, "cpeople");
            return (Criteria) this;
        }

        public Criteria andCphoneIsNull() {
            addCriterion("cphone is null");
            return (Criteria) this;
        }

        public Criteria andCphoneIsNotNull() {
            addCriterion("cphone is not null");
            return (Criteria) this;
        }

        public Criteria andCphoneEqualTo(String value) {
            addCriterion("cphone =", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotEqualTo(String value) {
            addCriterion("cphone <>", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneGreaterThan(String value) {
            addCriterion("cphone >", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneGreaterThanOrEqualTo(String value) {
            addCriterion("cphone >=", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneLessThan(String value) {
            addCriterion("cphone <", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneLessThanOrEqualTo(String value) {
            addCriterion("cphone <=", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneLike(String value) {
            addCriterion("cphone like", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotLike(String value) {
            addCriterion("cphone not like", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneIn(List<String> values) {
            addCriterion("cphone in", values, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotIn(List<String> values) {
            addCriterion("cphone not in", values, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneBetween(String value1, String value2) {
            addCriterion("cphone between", value1, value2, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotBetween(String value1, String value2) {
            addCriterion("cphone not between", value1, value2, "cphone");
            return (Criteria) this;
        }

        public Criteria andCaddressIsNull() {
            addCriterion("caddress is null");
            return (Criteria) this;
        }

        public Criteria andCaddressIsNotNull() {
            addCriterion("caddress is not null");
            return (Criteria) this;
        }

        public Criteria andCaddressEqualTo(String value) {
            addCriterion("caddress =", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotEqualTo(String value) {
            addCriterion("caddress <>", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressGreaterThan(String value) {
            addCriterion("caddress >", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressGreaterThanOrEqualTo(String value) {
            addCriterion("caddress >=", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLessThan(String value) {
            addCriterion("caddress <", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLessThanOrEqualTo(String value) {
            addCriterion("caddress <=", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLike(String value) {
            addCriterion("caddress like", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotLike(String value) {
            addCriterion("caddress not like", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressIn(List<String> values) {
            addCriterion("caddress in", values, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotIn(List<String> values) {
            addCriterion("caddress not in", values, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressBetween(String value1, String value2) {
            addCriterion("caddress between", value1, value2, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotBetween(String value1, String value2) {
            addCriterion("caddress not between", value1, value2, "caddress");
            return (Criteria) this;
        }

        public Criteria andCbirthdayIsNull() {
            addCriterion("cbirthday is null");
            return (Criteria) this;
        }

        public Criteria andCbirthdayIsNotNull() {
            addCriterion("cbirthday is not null");
            return (Criteria) this;
        }

        public Criteria andCbirthdayEqualTo(Date value) {
            addCriterion("cbirthday =", value, "cbirthday");
            return (Criteria) this;
        }

        public Criteria andCbirthdayNotEqualTo(Date value) {
            addCriterion("cbirthday <>", value, "cbirthday");
            return (Criteria) this;
        }

        public Criteria andCbirthdayGreaterThan(Date value) {
            addCriterion("cbirthday >", value, "cbirthday");
            return (Criteria) this;
        }

        public Criteria andCbirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("cbirthday >=", value, "cbirthday");
            return (Criteria) this;
        }

        public Criteria andCbirthdayLessThan(Date value) {
            addCriterion("cbirthday <", value, "cbirthday");
            return (Criteria) this;
        }

        public Criteria andCbirthdayLessThanOrEqualTo(Date value) {
            addCriterion("cbirthday <=", value, "cbirthday");
            return (Criteria) this;
        }

        public Criteria andCbirthdayIn(List<Date> values) {
            addCriterion("cbirthday in", values, "cbirthday");
            return (Criteria) this;
        }

        public Criteria andCbirthdayNotIn(List<Date> values) {
            addCriterion("cbirthday not in", values, "cbirthday");
            return (Criteria) this;
        }

        public Criteria andCbirthdayBetween(Date value1, Date value2) {
            addCriterion("cbirthday between", value1, value2, "cbirthday");
            return (Criteria) this;
        }

        public Criteria andCbirthdayNotBetween(Date value1, Date value2) {
            addCriterion("cbirthday not between", value1, value2, "cbirthday");
            return (Criteria) this;
        }

        public Criteria andCperiodIsNull() {
            addCriterion("cperiod is null");
            return (Criteria) this;
        }

        public Criteria andCperiodIsNotNull() {
            addCriterion("cperiod is not null");
            return (Criteria) this;
        }

        public Criteria andCperiodEqualTo(Integer value) {
            addCriterion("cperiod =", value, "cperiod");
            return (Criteria) this;
        }

        public Criteria andCperiodNotEqualTo(Integer value) {
            addCriterion("cperiod <>", value, "cperiod");
            return (Criteria) this;
        }

        public Criteria andCperiodGreaterThan(Integer value) {
            addCriterion("cperiod >", value, "cperiod");
            return (Criteria) this;
        }

        public Criteria andCperiodGreaterThanOrEqualTo(Integer value) {
            addCriterion("cperiod >=", value, "cperiod");
            return (Criteria) this;
        }

        public Criteria andCperiodLessThan(Integer value) {
            addCriterion("cperiod <", value, "cperiod");
            return (Criteria) this;
        }

        public Criteria andCperiodLessThanOrEqualTo(Integer value) {
            addCriterion("cperiod <=", value, "cperiod");
            return (Criteria) this;
        }

        public Criteria andCperiodIn(List<Integer> values) {
            addCriterion("cperiod in", values, "cperiod");
            return (Criteria) this;
        }

        public Criteria andCperiodNotIn(List<Integer> values) {
            addCriterion("cperiod not in", values, "cperiod");
            return (Criteria) this;
        }

        public Criteria andCperiodBetween(Integer value1, Integer value2) {
            addCriterion("cperiod between", value1, value2, "cperiod");
            return (Criteria) this;
        }

        public Criteria andCperiodNotBetween(Integer value1, Integer value2) {
            addCriterion("cperiod not between", value1, value2, "cperiod");
            return (Criteria) this;
        }

        public Criteria andClimitIsNull() {
            addCriterion("climit is null");
            return (Criteria) this;
        }

        public Criteria andClimitIsNotNull() {
            addCriterion("climit is not null");
            return (Criteria) this;
        }

        public Criteria andClimitEqualTo(Float value) {
            addCriterion("climit =", value, "climit");
            return (Criteria) this;
        }

        public Criteria andClimitNotEqualTo(Float value) {
            addCriterion("climit <>", value, "climit");
            return (Criteria) this;
        }

        public Criteria andClimitGreaterThan(Float value) {
            addCriterion("climit >", value, "climit");
            return (Criteria) this;
        }

        public Criteria andClimitGreaterThanOrEqualTo(Float value) {
            addCriterion("climit >=", value, "climit");
            return (Criteria) this;
        }

        public Criteria andClimitLessThan(Float value) {
            addCriterion("climit <", value, "climit");
            return (Criteria) this;
        }

        public Criteria andClimitLessThanOrEqualTo(Float value) {
            addCriterion("climit <=", value, "climit");
            return (Criteria) this;
        }

        public Criteria andClimitIn(List<Float> values) {
            addCriterion("climit in", values, "climit");
            return (Criteria) this;
        }

        public Criteria andClimitNotIn(List<Float> values) {
            addCriterion("climit not in", values, "climit");
            return (Criteria) this;
        }

        public Criteria andClimitBetween(Float value1, Float value2) {
            addCriterion("climit between", value1, value2, "climit");
            return (Criteria) this;
        }

        public Criteria andClimitNotBetween(Float value1, Float value2) {
            addCriterion("climit not between", value1, value2, "climit");
            return (Criteria) this;
        }

        public Criteria andPersonnelidIsNull() {
            addCriterion("personnelid is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelidIsNotNull() {
            addCriterion("personnelid is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelidEqualTo(Integer value) {
            addCriterion("personnelid =", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidNotEqualTo(Integer value) {
            addCriterion("personnelid <>", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidGreaterThan(Integer value) {
            addCriterion("personnelid >", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("personnelid >=", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidLessThan(Integer value) {
            addCriterion("personnelid <", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidLessThanOrEqualTo(Integer value) {
            addCriterion("personnelid <=", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidIn(List<Integer> values) {
            addCriterion("personnelid in", values, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidNotIn(List<Integer> values) {
            addCriterion("personnelid not in", values, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidBetween(Integer value1, Integer value2) {
            addCriterion("personnelid between", value1, value2, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidNotBetween(Integer value1, Integer value2) {
            addCriterion("personnelid not between", value1, value2, "personnelid");
            return (Criteria) this;
        }

        public Criteria andCadviserphoneIsNull() {
            addCriterion("cadviserphone is null");
            return (Criteria) this;
        }

        public Criteria andCadviserphoneIsNotNull() {
            addCriterion("cadviserphone is not null");
            return (Criteria) this;
        }

        public Criteria andCadviserphoneEqualTo(String value) {
            addCriterion("cadviserphone =", value, "cadviserphone");
            return (Criteria) this;
        }

        public Criteria andCadviserphoneNotEqualTo(String value) {
            addCriterion("cadviserphone <>", value, "cadviserphone");
            return (Criteria) this;
        }

        public Criteria andCadviserphoneGreaterThan(String value) {
            addCriterion("cadviserphone >", value, "cadviserphone");
            return (Criteria) this;
        }

        public Criteria andCadviserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("cadviserphone >=", value, "cadviserphone");
            return (Criteria) this;
        }

        public Criteria andCadviserphoneLessThan(String value) {
            addCriterion("cadviserphone <", value, "cadviserphone");
            return (Criteria) this;
        }

        public Criteria andCadviserphoneLessThanOrEqualTo(String value) {
            addCriterion("cadviserphone <=", value, "cadviserphone");
            return (Criteria) this;
        }

        public Criteria andCadviserphoneLike(String value) {
            addCriterion("cadviserphone like", value, "cadviserphone");
            return (Criteria) this;
        }

        public Criteria andCadviserphoneNotLike(String value) {
            addCriterion("cadviserphone not like", value, "cadviserphone");
            return (Criteria) this;
        }

        public Criteria andCadviserphoneIn(List<String> values) {
            addCriterion("cadviserphone in", values, "cadviserphone");
            return (Criteria) this;
        }

        public Criteria andCadviserphoneNotIn(List<String> values) {
            addCriterion("cadviserphone not in", values, "cadviserphone");
            return (Criteria) this;
        }

        public Criteria andCadviserphoneBetween(String value1, String value2) {
            addCriterion("cadviserphone between", value1, value2, "cadviserphone");
            return (Criteria) this;
        }

        public Criteria andCadviserphoneNotBetween(String value1, String value2) {
            addCriterion("cadviserphone not between", value1, value2, "cadviserphone");
            return (Criteria) this;
        }

        public Criteria andCprovinceIsNull() {
            addCriterion("cprovince is null");
            return (Criteria) this;
        }

        public Criteria andCprovinceIsNotNull() {
            addCriterion("cprovince is not null");
            return (Criteria) this;
        }

        public Criteria andCprovinceEqualTo(String value) {
            addCriterion("cprovince =", value, "cprovince");
            return (Criteria) this;
        }

        public Criteria andCprovinceNotEqualTo(String value) {
            addCriterion("cprovince <>", value, "cprovince");
            return (Criteria) this;
        }

        public Criteria andCprovinceGreaterThan(String value) {
            addCriterion("cprovince >", value, "cprovince");
            return (Criteria) this;
        }

        public Criteria andCprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("cprovince >=", value, "cprovince");
            return (Criteria) this;
        }

        public Criteria andCprovinceLessThan(String value) {
            addCriterion("cprovince <", value, "cprovince");
            return (Criteria) this;
        }

        public Criteria andCprovinceLessThanOrEqualTo(String value) {
            addCriterion("cprovince <=", value, "cprovince");
            return (Criteria) this;
        }

        public Criteria andCprovinceLike(String value) {
            addCriterion("cprovince like", value, "cprovince");
            return (Criteria) this;
        }

        public Criteria andCprovinceNotLike(String value) {
            addCriterion("cprovince not like", value, "cprovince");
            return (Criteria) this;
        }

        public Criteria andCprovinceIn(List<String> values) {
            addCriterion("cprovince in", values, "cprovince");
            return (Criteria) this;
        }

        public Criteria andCprovinceNotIn(List<String> values) {
            addCriterion("cprovince not in", values, "cprovince");
            return (Criteria) this;
        }

        public Criteria andCprovinceBetween(String value1, String value2) {
            addCriterion("cprovince between", value1, value2, "cprovince");
            return (Criteria) this;
        }

        public Criteria andCprovinceNotBetween(String value1, String value2) {
            addCriterion("cprovince not between", value1, value2, "cprovince");
            return (Criteria) this;
        }

        public Criteria andCremarkIsNull() {
            addCriterion("cremark is null");
            return (Criteria) this;
        }

        public Criteria andCremarkIsNotNull() {
            addCriterion("cremark is not null");
            return (Criteria) this;
        }

        public Criteria andCremarkEqualTo(String value) {
            addCriterion("cremark =", value, "cremark");
            return (Criteria) this;
        }

        public Criteria andCremarkNotEqualTo(String value) {
            addCriterion("cremark <>", value, "cremark");
            return (Criteria) this;
        }

        public Criteria andCremarkGreaterThan(String value) {
            addCriterion("cremark >", value, "cremark");
            return (Criteria) this;
        }

        public Criteria andCremarkGreaterThanOrEqualTo(String value) {
            addCriterion("cremark >=", value, "cremark");
            return (Criteria) this;
        }

        public Criteria andCremarkLessThan(String value) {
            addCriterion("cremark <", value, "cremark");
            return (Criteria) this;
        }

        public Criteria andCremarkLessThanOrEqualTo(String value) {
            addCriterion("cremark <=", value, "cremark");
            return (Criteria) this;
        }

        public Criteria andCremarkLike(String value) {
            addCriterion("cremark like", value, "cremark");
            return (Criteria) this;
        }

        public Criteria andCremarkNotLike(String value) {
            addCriterion("cremark not like", value, "cremark");
            return (Criteria) this;
        }

        public Criteria andCremarkIn(List<String> values) {
            addCriterion("cremark in", values, "cremark");
            return (Criteria) this;
        }

        public Criteria andCremarkNotIn(List<String> values) {
            addCriterion("cremark not in", values, "cremark");
            return (Criteria) this;
        }

        public Criteria andCremarkBetween(String value1, String value2) {
            addCriterion("cremark between", value1, value2, "cremark");
            return (Criteria) this;
        }

        public Criteria andCremarkNotBetween(String value1, String value2) {
            addCriterion("cremark not between", value1, value2, "cremark");
            return (Criteria) this;
        }

        public Criteria andCtaxesIsNull() {
            addCriterion("ctaxes is null");
            return (Criteria) this;
        }

        public Criteria andCtaxesIsNotNull() {
            addCriterion("ctaxes is not null");
            return (Criteria) this;
        }

        public Criteria andCtaxesEqualTo(String value) {
            addCriterion("ctaxes =", value, "ctaxes");
            return (Criteria) this;
        }

        public Criteria andCtaxesNotEqualTo(String value) {
            addCriterion("ctaxes <>", value, "ctaxes");
            return (Criteria) this;
        }

        public Criteria andCtaxesGreaterThan(String value) {
            addCriterion("ctaxes >", value, "ctaxes");
            return (Criteria) this;
        }

        public Criteria andCtaxesGreaterThanOrEqualTo(String value) {
            addCriterion("ctaxes >=", value, "ctaxes");
            return (Criteria) this;
        }

        public Criteria andCtaxesLessThan(String value) {
            addCriterion("ctaxes <", value, "ctaxes");
            return (Criteria) this;
        }

        public Criteria andCtaxesLessThanOrEqualTo(String value) {
            addCriterion("ctaxes <=", value, "ctaxes");
            return (Criteria) this;
        }

        public Criteria andCtaxesLike(String value) {
            addCriterion("ctaxes like", value, "ctaxes");
            return (Criteria) this;
        }

        public Criteria andCtaxesNotLike(String value) {
            addCriterion("ctaxes not like", value, "ctaxes");
            return (Criteria) this;
        }

        public Criteria andCtaxesIn(List<String> values) {
            addCriterion("ctaxes in", values, "ctaxes");
            return (Criteria) this;
        }

        public Criteria andCtaxesNotIn(List<String> values) {
            addCriterion("ctaxes not in", values, "ctaxes");
            return (Criteria) this;
        }

        public Criteria andCtaxesBetween(String value1, String value2) {
            addCriterion("ctaxes between", value1, value2, "ctaxes");
            return (Criteria) this;
        }

        public Criteria andCtaxesNotBetween(String value1, String value2) {
            addCriterion("ctaxes not between", value1, value2, "ctaxes");
            return (Criteria) this;
        }

        public Criteria andCregistphoneIsNull() {
            addCriterion("cregistphone is null");
            return (Criteria) this;
        }

        public Criteria andCregistphoneIsNotNull() {
            addCriterion("cregistphone is not null");
            return (Criteria) this;
        }

        public Criteria andCregistphoneEqualTo(String value) {
            addCriterion("cregistphone =", value, "cregistphone");
            return (Criteria) this;
        }

        public Criteria andCregistphoneNotEqualTo(String value) {
            addCriterion("cregistphone <>", value, "cregistphone");
            return (Criteria) this;
        }

        public Criteria andCregistphoneGreaterThan(String value) {
            addCriterion("cregistphone >", value, "cregistphone");
            return (Criteria) this;
        }

        public Criteria andCregistphoneGreaterThanOrEqualTo(String value) {
            addCriterion("cregistphone >=", value, "cregistphone");
            return (Criteria) this;
        }

        public Criteria andCregistphoneLessThan(String value) {
            addCriterion("cregistphone <", value, "cregistphone");
            return (Criteria) this;
        }

        public Criteria andCregistphoneLessThanOrEqualTo(String value) {
            addCriterion("cregistphone <=", value, "cregistphone");
            return (Criteria) this;
        }

        public Criteria andCregistphoneLike(String value) {
            addCriterion("cregistphone like", value, "cregistphone");
            return (Criteria) this;
        }

        public Criteria andCregistphoneNotLike(String value) {
            addCriterion("cregistphone not like", value, "cregistphone");
            return (Criteria) this;
        }

        public Criteria andCregistphoneIn(List<String> values) {
            addCriterion("cregistphone in", values, "cregistphone");
            return (Criteria) this;
        }

        public Criteria andCregistphoneNotIn(List<String> values) {
            addCriterion("cregistphone not in", values, "cregistphone");
            return (Criteria) this;
        }

        public Criteria andCregistphoneBetween(String value1, String value2) {
            addCriterion("cregistphone between", value1, value2, "cregistphone");
            return (Criteria) this;
        }

        public Criteria andCregistphoneNotBetween(String value1, String value2) {
            addCriterion("cregistphone not between", value1, value2, "cregistphone");
            return (Criteria) this;
        }

        public Criteria andCbankIsNull() {
            addCriterion("cbank is null");
            return (Criteria) this;
        }

        public Criteria andCbankIsNotNull() {
            addCriterion("cbank is not null");
            return (Criteria) this;
        }

        public Criteria andCbankEqualTo(String value) {
            addCriterion("cbank =", value, "cbank");
            return (Criteria) this;
        }

        public Criteria andCbankNotEqualTo(String value) {
            addCriterion("cbank <>", value, "cbank");
            return (Criteria) this;
        }

        public Criteria andCbankGreaterThan(String value) {
            addCriterion("cbank >", value, "cbank");
            return (Criteria) this;
        }

        public Criteria andCbankGreaterThanOrEqualTo(String value) {
            addCriterion("cbank >=", value, "cbank");
            return (Criteria) this;
        }

        public Criteria andCbankLessThan(String value) {
            addCriterion("cbank <", value, "cbank");
            return (Criteria) this;
        }

        public Criteria andCbankLessThanOrEqualTo(String value) {
            addCriterion("cbank <=", value, "cbank");
            return (Criteria) this;
        }

        public Criteria andCbankLike(String value) {
            addCriterion("cbank like", value, "cbank");
            return (Criteria) this;
        }

        public Criteria andCbankNotLike(String value) {
            addCriterion("cbank not like", value, "cbank");
            return (Criteria) this;
        }

        public Criteria andCbankIn(List<String> values) {
            addCriterion("cbank in", values, "cbank");
            return (Criteria) this;
        }

        public Criteria andCbankNotIn(List<String> values) {
            addCriterion("cbank not in", values, "cbank");
            return (Criteria) this;
        }

        public Criteria andCbankBetween(String value1, String value2) {
            addCriterion("cbank between", value1, value2, "cbank");
            return (Criteria) this;
        }

        public Criteria andCbankNotBetween(String value1, String value2) {
            addCriterion("cbank not between", value1, value2, "cbank");
            return (Criteria) this;
        }

        public Criteria andCbanknumberIsNull() {
            addCriterion("cbanknumber is null");
            return (Criteria) this;
        }

        public Criteria andCbanknumberIsNotNull() {
            addCriterion("cbanknumber is not null");
            return (Criteria) this;
        }

        public Criteria andCbanknumberEqualTo(String value) {
            addCriterion("cbanknumber =", value, "cbanknumber");
            return (Criteria) this;
        }

        public Criteria andCbanknumberNotEqualTo(String value) {
            addCriterion("cbanknumber <>", value, "cbanknumber");
            return (Criteria) this;
        }

        public Criteria andCbanknumberGreaterThan(String value) {
            addCriterion("cbanknumber >", value, "cbanknumber");
            return (Criteria) this;
        }

        public Criteria andCbanknumberGreaterThanOrEqualTo(String value) {
            addCriterion("cbanknumber >=", value, "cbanknumber");
            return (Criteria) this;
        }

        public Criteria andCbanknumberLessThan(String value) {
            addCriterion("cbanknumber <", value, "cbanknumber");
            return (Criteria) this;
        }

        public Criteria andCbanknumberLessThanOrEqualTo(String value) {
            addCriterion("cbanknumber <=", value, "cbanknumber");
            return (Criteria) this;
        }

        public Criteria andCbanknumberLike(String value) {
            addCriterion("cbanknumber like", value, "cbanknumber");
            return (Criteria) this;
        }

        public Criteria andCbanknumberNotLike(String value) {
            addCriterion("cbanknumber not like", value, "cbanknumber");
            return (Criteria) this;
        }

        public Criteria andCbanknumberIn(List<String> values) {
            addCriterion("cbanknumber in", values, "cbanknumber");
            return (Criteria) this;
        }

        public Criteria andCbanknumberNotIn(List<String> values) {
            addCriterion("cbanknumber not in", values, "cbanknumber");
            return (Criteria) this;
        }

        public Criteria andCbanknumberBetween(String value1, String value2) {
            addCriterion("cbanknumber between", value1, value2, "cbanknumber");
            return (Criteria) this;
        }

        public Criteria andCbanknumberNotBetween(String value1, String value2) {
            addCriterion("cbanknumber not between", value1, value2, "cbanknumber");
            return (Criteria) this;
        }

        public Criteria andCdlicenseIsNull() {
            addCriterion("cdlicense is null");
            return (Criteria) this;
        }

        public Criteria andCdlicenseIsNotNull() {
            addCriterion("cdlicense is not null");
            return (Criteria) this;
        }

        public Criteria andCdlicenseEqualTo(String value) {
            addCriterion("cdlicense =", value, "cdlicense");
            return (Criteria) this;
        }

        public Criteria andCdlicenseNotEqualTo(String value) {
            addCriterion("cdlicense <>", value, "cdlicense");
            return (Criteria) this;
        }

        public Criteria andCdlicenseGreaterThan(String value) {
            addCriterion("cdlicense >", value, "cdlicense");
            return (Criteria) this;
        }

        public Criteria andCdlicenseGreaterThanOrEqualTo(String value) {
            addCriterion("cdlicense >=", value, "cdlicense");
            return (Criteria) this;
        }

        public Criteria andCdlicenseLessThan(String value) {
            addCriterion("cdlicense <", value, "cdlicense");
            return (Criteria) this;
        }

        public Criteria andCdlicenseLessThanOrEqualTo(String value) {
            addCriterion("cdlicense <=", value, "cdlicense");
            return (Criteria) this;
        }

        public Criteria andCdlicenseLike(String value) {
            addCriterion("cdlicense like", value, "cdlicense");
            return (Criteria) this;
        }

        public Criteria andCdlicenseNotLike(String value) {
            addCriterion("cdlicense not like", value, "cdlicense");
            return (Criteria) this;
        }

        public Criteria andCdlicenseIn(List<String> values) {
            addCriterion("cdlicense in", values, "cdlicense");
            return (Criteria) this;
        }

        public Criteria andCdlicenseNotIn(List<String> values) {
            addCriterion("cdlicense not in", values, "cdlicense");
            return (Criteria) this;
        }

        public Criteria andCdlicenseBetween(String value1, String value2) {
            addCriterion("cdlicense between", value1, value2, "cdlicense");
            return (Criteria) this;
        }

        public Criteria andCdlicenseNotBetween(String value1, String value2) {
            addCriterion("cdlicense not between", value1, value2, "cdlicense");
            return (Criteria) this;
        }

        public Criteria andCregistaddressIsNull() {
            addCriterion("cregistaddress is null");
            return (Criteria) this;
        }

        public Criteria andCregistaddressIsNotNull() {
            addCriterion("cregistaddress is not null");
            return (Criteria) this;
        }

        public Criteria andCregistaddressEqualTo(String value) {
            addCriterion("cregistaddress =", value, "cregistaddress");
            return (Criteria) this;
        }

        public Criteria andCregistaddressNotEqualTo(String value) {
            addCriterion("cregistaddress <>", value, "cregistaddress");
            return (Criteria) this;
        }

        public Criteria andCregistaddressGreaterThan(String value) {
            addCriterion("cregistaddress >", value, "cregistaddress");
            return (Criteria) this;
        }

        public Criteria andCregistaddressGreaterThanOrEqualTo(String value) {
            addCriterion("cregistaddress >=", value, "cregistaddress");
            return (Criteria) this;
        }

        public Criteria andCregistaddressLessThan(String value) {
            addCriterion("cregistaddress <", value, "cregistaddress");
            return (Criteria) this;
        }

        public Criteria andCregistaddressLessThanOrEqualTo(String value) {
            addCriterion("cregistaddress <=", value, "cregistaddress");
            return (Criteria) this;
        }

        public Criteria andCregistaddressLike(String value) {
            addCriterion("cregistaddress like", value, "cregistaddress");
            return (Criteria) this;
        }

        public Criteria andCregistaddressNotLike(String value) {
            addCriterion("cregistaddress not like", value, "cregistaddress");
            return (Criteria) this;
        }

        public Criteria andCregistaddressIn(List<String> values) {
            addCriterion("cregistaddress in", values, "cregistaddress");
            return (Criteria) this;
        }

        public Criteria andCregistaddressNotIn(List<String> values) {
            addCriterion("cregistaddress not in", values, "cregistaddress");
            return (Criteria) this;
        }

        public Criteria andCregistaddressBetween(String value1, String value2) {
            addCriterion("cregistaddress between", value1, value2, "cregistaddress");
            return (Criteria) this;
        }

        public Criteria andCregistaddressNotBetween(String value1, String value2) {
            addCriterion("cregistaddress not between", value1, value2, "cregistaddress");
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