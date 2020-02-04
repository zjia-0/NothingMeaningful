package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class CarbrandinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarbrandinfoExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(String value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(String value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(String value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(String value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(String value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(String value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLike(String value) {
            addCriterion("cid like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotLike(String value) {
            addCriterion("cid not like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<String> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<String> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(String value1, String value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(String value1, String value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
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

        public Criteria andCpriceIsNull() {
            addCriterion("cprice is null");
            return (Criteria) this;
        }

        public Criteria andCpriceIsNotNull() {
            addCriterion("cprice is not null");
            return (Criteria) this;
        }

        public Criteria andCpriceEqualTo(Float value) {
            addCriterion("cprice =", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceNotEqualTo(Float value) {
            addCriterion("cprice <>", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceGreaterThan(Float value) {
            addCriterion("cprice >", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("cprice >=", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceLessThan(Float value) {
            addCriterion("cprice <", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceLessThanOrEqualTo(Float value) {
            addCriterion("cprice <=", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceIn(List<Float> values) {
            addCriterion("cprice in", values, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceNotIn(List<Float> values) {
            addCriterion("cprice not in", values, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceBetween(Float value1, Float value2) {
            addCriterion("cprice between", value1, value2, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceNotBetween(Float value1, Float value2) {
            addCriterion("cprice not between", value1, value2, "cprice");
            return (Criteria) this;
        }

        public Criteria andCyearIsNull() {
            addCriterion("cyear is null");
            return (Criteria) this;
        }

        public Criteria andCyearIsNotNull() {
            addCriterion("cyear is not null");
            return (Criteria) this;
        }

        public Criteria andCyearEqualTo(Float value) {
            addCriterion("cyear =", value, "cyear");
            return (Criteria) this;
        }

        public Criteria andCyearNotEqualTo(Float value) {
            addCriterion("cyear <>", value, "cyear");
            return (Criteria) this;
        }

        public Criteria andCyearGreaterThan(Float value) {
            addCriterion("cyear >", value, "cyear");
            return (Criteria) this;
        }

        public Criteria andCyearGreaterThanOrEqualTo(Float value) {
            addCriterion("cyear >=", value, "cyear");
            return (Criteria) this;
        }

        public Criteria andCyearLessThan(Float value) {
            addCriterion("cyear <", value, "cyear");
            return (Criteria) this;
        }

        public Criteria andCyearLessThanOrEqualTo(Float value) {
            addCriterion("cyear <=", value, "cyear");
            return (Criteria) this;
        }

        public Criteria andCyearIn(List<Float> values) {
            addCriterion("cyear in", values, "cyear");
            return (Criteria) this;
        }

        public Criteria andCyearNotIn(List<Float> values) {
            addCriterion("cyear not in", values, "cyear");
            return (Criteria) this;
        }

        public Criteria andCyearBetween(Float value1, Float value2) {
            addCriterion("cyear between", value1, value2, "cyear");
            return (Criteria) this;
        }

        public Criteria andCyearNotBetween(Float value1, Float value2) {
            addCriterion("cyear not between", value1, value2, "cyear");
            return (Criteria) this;
        }

        public Criteria andCdischargeIsNull() {
            addCriterion("cdischarge is null");
            return (Criteria) this;
        }

        public Criteria andCdischargeIsNotNull() {
            addCriterion("cdischarge is not null");
            return (Criteria) this;
        }

        public Criteria andCdischargeEqualTo(String value) {
            addCriterion("cdischarge =", value, "cdischarge");
            return (Criteria) this;
        }

        public Criteria andCdischargeNotEqualTo(String value) {
            addCriterion("cdischarge <>", value, "cdischarge");
            return (Criteria) this;
        }

        public Criteria andCdischargeGreaterThan(String value) {
            addCriterion("cdischarge >", value, "cdischarge");
            return (Criteria) this;
        }

        public Criteria andCdischargeGreaterThanOrEqualTo(String value) {
            addCriterion("cdischarge >=", value, "cdischarge");
            return (Criteria) this;
        }

        public Criteria andCdischargeLessThan(String value) {
            addCriterion("cdischarge <", value, "cdischarge");
            return (Criteria) this;
        }

        public Criteria andCdischargeLessThanOrEqualTo(String value) {
            addCriterion("cdischarge <=", value, "cdischarge");
            return (Criteria) this;
        }

        public Criteria andCdischargeLike(String value) {
            addCriterion("cdischarge like", value, "cdischarge");
            return (Criteria) this;
        }

        public Criteria andCdischargeNotLike(String value) {
            addCriterion("cdischarge not like", value, "cdischarge");
            return (Criteria) this;
        }

        public Criteria andCdischargeIn(List<String> values) {
            addCriterion("cdischarge in", values, "cdischarge");
            return (Criteria) this;
        }

        public Criteria andCdischargeNotIn(List<String> values) {
            addCriterion("cdischarge not in", values, "cdischarge");
            return (Criteria) this;
        }

        public Criteria andCdischargeBetween(String value1, String value2) {
            addCriterion("cdischarge between", value1, value2, "cdischarge");
            return (Criteria) this;
        }

        public Criteria andCdischargeNotBetween(String value1, String value2) {
            addCriterion("cdischarge not between", value1, value2, "cdischarge");
            return (Criteria) this;
        }

        public Criteria andCdomesticIsNull() {
            addCriterion("cdomestic is null");
            return (Criteria) this;
        }

        public Criteria andCdomesticIsNotNull() {
            addCriterion("cdomestic is not null");
            return (Criteria) this;
        }

        public Criteria andCdomesticEqualTo(String value) {
            addCriterion("cdomestic =", value, "cdomestic");
            return (Criteria) this;
        }

        public Criteria andCdomesticNotEqualTo(String value) {
            addCriterion("cdomestic <>", value, "cdomestic");
            return (Criteria) this;
        }

        public Criteria andCdomesticGreaterThan(String value) {
            addCriterion("cdomestic >", value, "cdomestic");
            return (Criteria) this;
        }

        public Criteria andCdomesticGreaterThanOrEqualTo(String value) {
            addCriterion("cdomestic >=", value, "cdomestic");
            return (Criteria) this;
        }

        public Criteria andCdomesticLessThan(String value) {
            addCriterion("cdomestic <", value, "cdomestic");
            return (Criteria) this;
        }

        public Criteria andCdomesticLessThanOrEqualTo(String value) {
            addCriterion("cdomestic <=", value, "cdomestic");
            return (Criteria) this;
        }

        public Criteria andCdomesticLike(String value) {
            addCriterion("cdomestic like", value, "cdomestic");
            return (Criteria) this;
        }

        public Criteria andCdomesticNotLike(String value) {
            addCriterion("cdomestic not like", value, "cdomestic");
            return (Criteria) this;
        }

        public Criteria andCdomesticIn(List<String> values) {
            addCriterion("cdomestic in", values, "cdomestic");
            return (Criteria) this;
        }

        public Criteria andCdomesticNotIn(List<String> values) {
            addCriterion("cdomestic not in", values, "cdomestic");
            return (Criteria) this;
        }

        public Criteria andCdomesticBetween(String value1, String value2) {
            addCriterion("cdomestic between", value1, value2, "cdomestic");
            return (Criteria) this;
        }

        public Criteria andCdomesticNotBetween(String value1, String value2) {
            addCriterion("cdomestic not between", value1, value2, "cdomestic");
            return (Criteria) this;
        }

        public Criteria andCfuelIsNull() {
            addCriterion("cfuel is null");
            return (Criteria) this;
        }

        public Criteria andCfuelIsNotNull() {
            addCriterion("cfuel is not null");
            return (Criteria) this;
        }

        public Criteria andCfuelEqualTo(String value) {
            addCriterion("cfuel =", value, "cfuel");
            return (Criteria) this;
        }

        public Criteria andCfuelNotEqualTo(String value) {
            addCriterion("cfuel <>", value, "cfuel");
            return (Criteria) this;
        }

        public Criteria andCfuelGreaterThan(String value) {
            addCriterion("cfuel >", value, "cfuel");
            return (Criteria) this;
        }

        public Criteria andCfuelGreaterThanOrEqualTo(String value) {
            addCriterion("cfuel >=", value, "cfuel");
            return (Criteria) this;
        }

        public Criteria andCfuelLessThan(String value) {
            addCriterion("cfuel <", value, "cfuel");
            return (Criteria) this;
        }

        public Criteria andCfuelLessThanOrEqualTo(String value) {
            addCriterion("cfuel <=", value, "cfuel");
            return (Criteria) this;
        }

        public Criteria andCfuelLike(String value) {
            addCriterion("cfuel like", value, "cfuel");
            return (Criteria) this;
        }

        public Criteria andCfuelNotLike(String value) {
            addCriterion("cfuel not like", value, "cfuel");
            return (Criteria) this;
        }

        public Criteria andCfuelIn(List<String> values) {
            addCriterion("cfuel in", values, "cfuel");
            return (Criteria) this;
        }

        public Criteria andCfuelNotIn(List<String> values) {
            addCriterion("cfuel not in", values, "cfuel");
            return (Criteria) this;
        }

        public Criteria andCfuelBetween(String value1, String value2) {
            addCriterion("cfuel between", value1, value2, "cfuel");
            return (Criteria) this;
        }

        public Criteria andCfuelNotBetween(String value1, String value2) {
            addCriterion("cfuel not between", value1, value2, "cfuel");
            return (Criteria) this;
        }

        public Criteria andCfourIsNull() {
            addCriterion("cfour is null");
            return (Criteria) this;
        }

        public Criteria andCfourIsNotNull() {
            addCriterion("cfour is not null");
            return (Criteria) this;
        }

        public Criteria andCfourEqualTo(String value) {
            addCriterion("cfour =", value, "cfour");
            return (Criteria) this;
        }

        public Criteria andCfourNotEqualTo(String value) {
            addCriterion("cfour <>", value, "cfour");
            return (Criteria) this;
        }

        public Criteria andCfourGreaterThan(String value) {
            addCriterion("cfour >", value, "cfour");
            return (Criteria) this;
        }

        public Criteria andCfourGreaterThanOrEqualTo(String value) {
            addCriterion("cfour >=", value, "cfour");
            return (Criteria) this;
        }

        public Criteria andCfourLessThan(String value) {
            addCriterion("cfour <", value, "cfour");
            return (Criteria) this;
        }

        public Criteria andCfourLessThanOrEqualTo(String value) {
            addCriterion("cfour <=", value, "cfour");
            return (Criteria) this;
        }

        public Criteria andCfourLike(String value) {
            addCriterion("cfour like", value, "cfour");
            return (Criteria) this;
        }

        public Criteria andCfourNotLike(String value) {
            addCriterion("cfour not like", value, "cfour");
            return (Criteria) this;
        }

        public Criteria andCfourIn(List<String> values) {
            addCriterion("cfour in", values, "cfour");
            return (Criteria) this;
        }

        public Criteria andCfourNotIn(List<String> values) {
            addCriterion("cfour not in", values, "cfour");
            return (Criteria) this;
        }

        public Criteria andCfourBetween(String value1, String value2) {
            addCriterion("cfour between", value1, value2, "cfour");
            return (Criteria) this;
        }

        public Criteria andCfourNotBetween(String value1, String value2) {
            addCriterion("cfour not between", value1, value2, "cfour");
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