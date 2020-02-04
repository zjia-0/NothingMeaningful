package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SettleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SettleExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Float value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Float value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Float value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Float value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Float value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Float> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Float> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Float value1, Float value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Float value1, Float value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTaxIsNull() {
            addCriterion("tax is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("tax is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(String value) {
            addCriterion("tax =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(String value) {
            addCriterion("tax <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(String value) {
            addCriterion("tax >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(String value) {
            addCriterion("tax >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(String value) {
            addCriterion("tax <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(String value) {
            addCriterion("tax <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLike(String value) {
            addCriterion("tax like", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotLike(String value) {
            addCriterion("tax not like", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<String> values) {
            addCriterion("tax in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<String> values) {
            addCriterion("tax not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(String value1, String value2) {
            addCriterion("tax between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(String value1, String value2) {
            addCriterion("tax not between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxesIsNull() {
            addCriterion("taxes is null");
            return (Criteria) this;
        }

        public Criteria andTaxesIsNotNull() {
            addCriterion("taxes is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesEqualTo(Float value) {
            addCriterion("taxes =", value, "taxes");
            return (Criteria) this;
        }

        public Criteria andTaxesNotEqualTo(Float value) {
            addCriterion("taxes <>", value, "taxes");
            return (Criteria) this;
        }

        public Criteria andTaxesGreaterThan(Float value) {
            addCriterion("taxes >", value, "taxes");
            return (Criteria) this;
        }

        public Criteria andTaxesGreaterThanOrEqualTo(Float value) {
            addCriterion("taxes >=", value, "taxes");
            return (Criteria) this;
        }

        public Criteria andTaxesLessThan(Float value) {
            addCriterion("taxes <", value, "taxes");
            return (Criteria) this;
        }

        public Criteria andTaxesLessThanOrEqualTo(Float value) {
            addCriterion("taxes <=", value, "taxes");
            return (Criteria) this;
        }

        public Criteria andTaxesIn(List<Float> values) {
            addCriterion("taxes in", values, "taxes");
            return (Criteria) this;
        }

        public Criteria andTaxesNotIn(List<Float> values) {
            addCriterion("taxes not in", values, "taxes");
            return (Criteria) this;
        }

        public Criteria andTaxesBetween(Float value1, Float value2) {
            addCriterion("taxes between", value1, value2, "taxes");
            return (Criteria) this;
        }

        public Criteria andTaxesNotBetween(Float value1, Float value2) {
            addCriterion("taxes not between", value1, value2, "taxes");
            return (Criteria) this;
        }

        public Criteria andWipeIsNull() {
            addCriterion("wipe is null");
            return (Criteria) this;
        }

        public Criteria andWipeIsNotNull() {
            addCriterion("wipe is not null");
            return (Criteria) this;
        }

        public Criteria andWipeEqualTo(Float value) {
            addCriterion("wipe =", value, "wipe");
            return (Criteria) this;
        }

        public Criteria andWipeNotEqualTo(Float value) {
            addCriterion("wipe <>", value, "wipe");
            return (Criteria) this;
        }

        public Criteria andWipeGreaterThan(Float value) {
            addCriterion("wipe >", value, "wipe");
            return (Criteria) this;
        }

        public Criteria andWipeGreaterThanOrEqualTo(Float value) {
            addCriterion("wipe >=", value, "wipe");
            return (Criteria) this;
        }

        public Criteria andWipeLessThan(Float value) {
            addCriterion("wipe <", value, "wipe");
            return (Criteria) this;
        }

        public Criteria andWipeLessThanOrEqualTo(Float value) {
            addCriterion("wipe <=", value, "wipe");
            return (Criteria) this;
        }

        public Criteria andWipeIn(List<Float> values) {
            addCriterion("wipe in", values, "wipe");
            return (Criteria) this;
        }

        public Criteria andWipeNotIn(List<Float> values) {
            addCriterion("wipe not in", values, "wipe");
            return (Criteria) this;
        }

        public Criteria andWipeBetween(Float value1, Float value2) {
            addCriterion("wipe between", value1, value2, "wipe");
            return (Criteria) this;
        }

        public Criteria andWipeNotBetween(Float value1, Float value2) {
            addCriterion("wipe not between", value1, value2, "wipe");
            return (Criteria) this;
        }

        public Criteria andDeductionIsNull() {
            addCriterion("deduction is null");
            return (Criteria) this;
        }

        public Criteria andDeductionIsNotNull() {
            addCriterion("deduction is not null");
            return (Criteria) this;
        }

        public Criteria andDeductionEqualTo(Float value) {
            addCriterion("deduction =", value, "deduction");
            return (Criteria) this;
        }

        public Criteria andDeductionNotEqualTo(Float value) {
            addCriterion("deduction <>", value, "deduction");
            return (Criteria) this;
        }

        public Criteria andDeductionGreaterThan(Float value) {
            addCriterion("deduction >", value, "deduction");
            return (Criteria) this;
        }

        public Criteria andDeductionGreaterThanOrEqualTo(Float value) {
            addCriterion("deduction >=", value, "deduction");
            return (Criteria) this;
        }

        public Criteria andDeductionLessThan(Float value) {
            addCriterion("deduction <", value, "deduction");
            return (Criteria) this;
        }

        public Criteria andDeductionLessThanOrEqualTo(Float value) {
            addCriterion("deduction <=", value, "deduction");
            return (Criteria) this;
        }

        public Criteria andDeductionIn(List<Float> values) {
            addCriterion("deduction in", values, "deduction");
            return (Criteria) this;
        }

        public Criteria andDeductionNotIn(List<Float> values) {
            addCriterion("deduction not in", values, "deduction");
            return (Criteria) this;
        }

        public Criteria andDeductionBetween(Float value1, Float value2) {
            addCriterion("deduction between", value1, value2, "deduction");
            return (Criteria) this;
        }

        public Criteria andDeductionNotBetween(Float value1, Float value2) {
            addCriterion("deduction not between", value1, value2, "deduction");
            return (Criteria) this;
        }

        public Criteria andCashIsNull() {
            addCriterion("cash is null");
            return (Criteria) this;
        }

        public Criteria andCashIsNotNull() {
            addCriterion("cash is not null");
            return (Criteria) this;
        }

        public Criteria andCashEqualTo(Float value) {
            addCriterion("cash =", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashNotEqualTo(Float value) {
            addCriterion("cash <>", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashGreaterThan(Float value) {
            addCriterion("cash >", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashGreaterThanOrEqualTo(Float value) {
            addCriterion("cash >=", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashLessThan(Float value) {
            addCriterion("cash <", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashLessThanOrEqualTo(Float value) {
            addCriterion("cash <=", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashIn(List<Float> values) {
            addCriterion("cash in", values, "cash");
            return (Criteria) this;
        }

        public Criteria andCashNotIn(List<Float> values) {
            addCriterion("cash not in", values, "cash");
            return (Criteria) this;
        }

        public Criteria andCashBetween(Float value1, Float value2) {
            addCriterion("cash between", value1, value2, "cash");
            return (Criteria) this;
        }

        public Criteria andCashNotBetween(Float value1, Float value2) {
            addCriterion("cash not between", value1, value2, "cash");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("Bank is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("Bank is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(Float value) {
            addCriterion("Bank =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(Float value) {
            addCriterion("Bank <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(Float value) {
            addCriterion("Bank >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(Float value) {
            addCriterion("Bank >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(Float value) {
            addCriterion("Bank <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(Float value) {
            addCriterion("Bank <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<Float> values) {
            addCriterion("Bank in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<Float> values) {
            addCriterion("Bank not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(Float value1, Float value2) {
            addCriterion("Bank between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(Float value1, Float value2) {
            addCriterion("Bank not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andProcedureIsNull() {
            addCriterion("procedure is null");
            return (Criteria) this;
        }

        public Criteria andProcedureIsNotNull() {
            addCriterion("procedure is not null");
            return (Criteria) this;
        }

        public Criteria andProcedureEqualTo(Float value) {
            addCriterion("procedure =", value, "procedure");
            return (Criteria) this;
        }

        public Criteria andProcedureNotEqualTo(Float value) {
            addCriterion("procedure <>", value, "procedure");
            return (Criteria) this;
        }

        public Criteria andProcedureGreaterThan(Float value) {
            addCriterion("procedure >", value, "procedure");
            return (Criteria) this;
        }

        public Criteria andProcedureGreaterThanOrEqualTo(Float value) {
            addCriterion("procedure >=", value, "procedure");
            return (Criteria) this;
        }

        public Criteria andProcedureLessThan(Float value) {
            addCriterion("procedure <", value, "procedure");
            return (Criteria) this;
        }

        public Criteria andProcedureLessThanOrEqualTo(Float value) {
            addCriterion("procedure <=", value, "procedure");
            return (Criteria) this;
        }

        public Criteria andProcedureIn(List<Float> values) {
            addCriterion("procedure in", values, "procedure");
            return (Criteria) this;
        }

        public Criteria andProcedureNotIn(List<Float> values) {
            addCriterion("procedure not in", values, "procedure");
            return (Criteria) this;
        }

        public Criteria andProcedureBetween(Float value1, Float value2) {
            addCriterion("procedure between", value1, value2, "procedure");
            return (Criteria) this;
        }

        public Criteria andProcedureNotBetween(Float value1, Float value2) {
            addCriterion("procedure not between", value1, value2, "procedure");
            return (Criteria) this;
        }

        public Criteria andBankclassifyIsNull() {
            addCriterion("bankclassify is null");
            return (Criteria) this;
        }

        public Criteria andBankclassifyIsNotNull() {
            addCriterion("bankclassify is not null");
            return (Criteria) this;
        }

        public Criteria andBankclassifyEqualTo(String value) {
            addCriterion("bankclassify =", value, "bankclassify");
            return (Criteria) this;
        }

        public Criteria andBankclassifyNotEqualTo(String value) {
            addCriterion("bankclassify <>", value, "bankclassify");
            return (Criteria) this;
        }

        public Criteria andBankclassifyGreaterThan(String value) {
            addCriterion("bankclassify >", value, "bankclassify");
            return (Criteria) this;
        }

        public Criteria andBankclassifyGreaterThanOrEqualTo(String value) {
            addCriterion("bankclassify >=", value, "bankclassify");
            return (Criteria) this;
        }

        public Criteria andBankclassifyLessThan(String value) {
            addCriterion("bankclassify <", value, "bankclassify");
            return (Criteria) this;
        }

        public Criteria andBankclassifyLessThanOrEqualTo(String value) {
            addCriterion("bankclassify <=", value, "bankclassify");
            return (Criteria) this;
        }

        public Criteria andBankclassifyLike(String value) {
            addCriterion("bankclassify like", value, "bankclassify");
            return (Criteria) this;
        }

        public Criteria andBankclassifyNotLike(String value) {
            addCriterion("bankclassify not like", value, "bankclassify");
            return (Criteria) this;
        }

        public Criteria andBankclassifyIn(List<String> values) {
            addCriterion("bankclassify in", values, "bankclassify");
            return (Criteria) this;
        }

        public Criteria andBankclassifyNotIn(List<String> values) {
            addCriterion("bankclassify not in", values, "bankclassify");
            return (Criteria) this;
        }

        public Criteria andBankclassifyBetween(String value1, String value2) {
            addCriterion("bankclassify between", value1, value2, "bankclassify");
            return (Criteria) this;
        }

        public Criteria andBankclassifyNotBetween(String value1, String value2) {
            addCriterion("bankclassify not between", value1, value2, "bankclassify");
            return (Criteria) this;
        }

        public Criteria andBillIsNull() {
            addCriterion("Bill is null");
            return (Criteria) this;
        }

        public Criteria andBillIsNotNull() {
            addCriterion("Bill is not null");
            return (Criteria) this;
        }

        public Criteria andBillEqualTo(Float value) {
            addCriterion("Bill =", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillNotEqualTo(Float value) {
            addCriterion("Bill <>", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillGreaterThan(Float value) {
            addCriterion("Bill >", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillGreaterThanOrEqualTo(Float value) {
            addCriterion("Bill >=", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillLessThan(Float value) {
            addCriterion("Bill <", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillLessThanOrEqualTo(Float value) {
            addCriterion("Bill <=", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillIn(List<Float> values) {
            addCriterion("Bill in", values, "bill");
            return (Criteria) this;
        }

        public Criteria andBillNotIn(List<Float> values) {
            addCriterion("Bill not in", values, "bill");
            return (Criteria) this;
        }

        public Criteria andBillBetween(Float value1, Float value2) {
            addCriterion("Bill between", value1, value2, "bill");
            return (Criteria) this;
        }

        public Criteria andBillNotBetween(Float value1, Float value2) {
            addCriterion("Bill not between", value1, value2, "bill");
            return (Criteria) this;
        }

        public Criteria andRechargeIsNull() {
            addCriterion("recharge is null");
            return (Criteria) this;
        }

        public Criteria andRechargeIsNotNull() {
            addCriterion("recharge is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeEqualTo(Float value) {
            addCriterion("recharge =", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeNotEqualTo(Float value) {
            addCriterion("recharge <>", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeGreaterThan(Float value) {
            addCriterion("recharge >", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeGreaterThanOrEqualTo(Float value) {
            addCriterion("recharge >=", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeLessThan(Float value) {
            addCriterion("recharge <", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeLessThanOrEqualTo(Float value) {
            addCriterion("recharge <=", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeIn(List<Float> values) {
            addCriterion("recharge in", values, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeNotIn(List<Float> values) {
            addCriterion("recharge not in", values, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeBetween(Float value1, Float value2) {
            addCriterion("recharge between", value1, value2, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeNotBetween(Float value1, Float value2) {
            addCriterion("recharge not between", value1, value2, "recharge");
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

        public Criteria andSubscriptionIsNull() {
            addCriterion("subscription is null");
            return (Criteria) this;
        }

        public Criteria andSubscriptionIsNotNull() {
            addCriterion("subscription is not null");
            return (Criteria) this;
        }

        public Criteria andSubscriptionEqualTo(Float value) {
            addCriterion("subscription =", value, "subscription");
            return (Criteria) this;
        }

        public Criteria andSubscriptionNotEqualTo(Float value) {
            addCriterion("subscription <>", value, "subscription");
            return (Criteria) this;
        }

        public Criteria andSubscriptionGreaterThan(Float value) {
            addCriterion("subscription >", value, "subscription");
            return (Criteria) this;
        }

        public Criteria andSubscriptionGreaterThanOrEqualTo(Float value) {
            addCriterion("subscription >=", value, "subscription");
            return (Criteria) this;
        }

        public Criteria andSubscriptionLessThan(Float value) {
            addCriterion("subscription <", value, "subscription");
            return (Criteria) this;
        }

        public Criteria andSubscriptionLessThanOrEqualTo(Float value) {
            addCriterion("subscription <=", value, "subscription");
            return (Criteria) this;
        }

        public Criteria andSubscriptionIn(List<Float> values) {
            addCriterion("subscription in", values, "subscription");
            return (Criteria) this;
        }

        public Criteria andSubscriptionNotIn(List<Float> values) {
            addCriterion("subscription not in", values, "subscription");
            return (Criteria) this;
        }

        public Criteria andSubscriptionBetween(Float value1, Float value2) {
            addCriterion("subscription between", value1, value2, "subscription");
            return (Criteria) this;
        }

        public Criteria andSubscriptionNotBetween(Float value1, Float value2) {
            addCriterion("subscription not between", value1, value2, "subscription");
            return (Criteria) this;
        }

        public Criteria andInteriorIsNull() {
            addCriterion("interior is null");
            return (Criteria) this;
        }

        public Criteria andInteriorIsNotNull() {
            addCriterion("interior is not null");
            return (Criteria) this;
        }

        public Criteria andInteriorEqualTo(Float value) {
            addCriterion("interior =", value, "interior");
            return (Criteria) this;
        }

        public Criteria andInteriorNotEqualTo(Float value) {
            addCriterion("interior <>", value, "interior");
            return (Criteria) this;
        }

        public Criteria andInteriorGreaterThan(Float value) {
            addCriterion("interior >", value, "interior");
            return (Criteria) this;
        }

        public Criteria andInteriorGreaterThanOrEqualTo(Float value) {
            addCriterion("interior >=", value, "interior");
            return (Criteria) this;
        }

        public Criteria andInteriorLessThan(Float value) {
            addCriterion("interior <", value, "interior");
            return (Criteria) this;
        }

        public Criteria andInteriorLessThanOrEqualTo(Float value) {
            addCriterion("interior <=", value, "interior");
            return (Criteria) this;
        }

        public Criteria andInteriorIn(List<Float> values) {
            addCriterion("interior in", values, "interior");
            return (Criteria) this;
        }

        public Criteria andInteriorNotIn(List<Float> values) {
            addCriterion("interior not in", values, "interior");
            return (Criteria) this;
        }

        public Criteria andInteriorBetween(Float value1, Float value2) {
            addCriterion("interior between", value1, value2, "interior");
            return (Criteria) this;
        }

        public Criteria andInteriorNotBetween(Float value1, Float value2) {
            addCriterion("interior not between", value1, value2, "interior");
            return (Criteria) this;
        }

        public Criteria andInteriortypeIsNull() {
            addCriterion("interiorType is null");
            return (Criteria) this;
        }

        public Criteria andInteriortypeIsNotNull() {
            addCriterion("interiorType is not null");
            return (Criteria) this;
        }

        public Criteria andInteriortypeEqualTo(String value) {
            addCriterion("interiorType =", value, "interiortype");
            return (Criteria) this;
        }

        public Criteria andInteriortypeNotEqualTo(String value) {
            addCriterion("interiorType <>", value, "interiortype");
            return (Criteria) this;
        }

        public Criteria andInteriortypeGreaterThan(String value) {
            addCriterion("interiorType >", value, "interiortype");
            return (Criteria) this;
        }

        public Criteria andInteriortypeGreaterThanOrEqualTo(String value) {
            addCriterion("interiorType >=", value, "interiortype");
            return (Criteria) this;
        }

        public Criteria andInteriortypeLessThan(String value) {
            addCriterion("interiorType <", value, "interiortype");
            return (Criteria) this;
        }

        public Criteria andInteriortypeLessThanOrEqualTo(String value) {
            addCriterion("interiorType <=", value, "interiortype");
            return (Criteria) this;
        }

        public Criteria andInteriortypeLike(String value) {
            addCriterion("interiorType like", value, "interiortype");
            return (Criteria) this;
        }

        public Criteria andInteriortypeNotLike(String value) {
            addCriterion("interiorType not like", value, "interiortype");
            return (Criteria) this;
        }

        public Criteria andInteriortypeIn(List<String> values) {
            addCriterion("interiorType in", values, "interiortype");
            return (Criteria) this;
        }

        public Criteria andInteriortypeNotIn(List<String> values) {
            addCriterion("interiorType not in", values, "interiortype");
            return (Criteria) this;
        }

        public Criteria andInteriortypeBetween(String value1, String value2) {
            addCriterion("interiorType between", value1, value2, "interiortype");
            return (Criteria) this;
        }

        public Criteria andInteriortypeNotBetween(String value1, String value2) {
            addCriterion("interiorType not between", value1, value2, "interiortype");
            return (Criteria) this;
        }

        public Criteria andVoucherIsNull() {
            addCriterion("voucher is null");
            return (Criteria) this;
        }

        public Criteria andVoucherIsNotNull() {
            addCriterion("voucher is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherEqualTo(Float value) {
            addCriterion("voucher =", value, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherNotEqualTo(Float value) {
            addCriterion("voucher <>", value, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherGreaterThan(Float value) {
            addCriterion("voucher >", value, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherGreaterThanOrEqualTo(Float value) {
            addCriterion("voucher >=", value, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherLessThan(Float value) {
            addCriterion("voucher <", value, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherLessThanOrEqualTo(Float value) {
            addCriterion("voucher <=", value, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherIn(List<Float> values) {
            addCriterion("voucher in", values, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherNotIn(List<Float> values) {
            addCriterion("voucher not in", values, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherBetween(Float value1, Float value2) {
            addCriterion("voucher between", value1, value2, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherNotBetween(Float value1, Float value2) {
            addCriterion("voucher not between", value1, value2, "voucher");
            return (Criteria) this;
        }

        public Criteria andVouchertypeIsNull() {
            addCriterion("voucherType is null");
            return (Criteria) this;
        }

        public Criteria andVouchertypeIsNotNull() {
            addCriterion("voucherType is not null");
            return (Criteria) this;
        }

        public Criteria andVouchertypeEqualTo(String value) {
            addCriterion("voucherType =", value, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeNotEqualTo(String value) {
            addCriterion("voucherType <>", value, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeGreaterThan(String value) {
            addCriterion("voucherType >", value, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeGreaterThanOrEqualTo(String value) {
            addCriterion("voucherType >=", value, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeLessThan(String value) {
            addCriterion("voucherType <", value, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeLessThanOrEqualTo(String value) {
            addCriterion("voucherType <=", value, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeLike(String value) {
            addCriterion("voucherType like", value, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeNotLike(String value) {
            addCriterion("voucherType not like", value, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeIn(List<String> values) {
            addCriterion("voucherType in", values, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeNotIn(List<String> values) {
            addCriterion("voucherType not in", values, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeBetween(String value1, String value2) {
            addCriterion("voucherType between", value1, value2, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchertypeNotBetween(String value1, String value2) {
            addCriterion("voucherType not between", value1, value2, "vouchertype");
            return (Criteria) this;
        }

        public Criteria andVouchernumIsNull() {
            addCriterion("voucherNum is null");
            return (Criteria) this;
        }

        public Criteria andVouchernumIsNotNull() {
            addCriterion("voucherNum is not null");
            return (Criteria) this;
        }

        public Criteria andVouchernumEqualTo(String value) {
            addCriterion("voucherNum =", value, "vouchernum");
            return (Criteria) this;
        }

        public Criteria andVouchernumNotEqualTo(String value) {
            addCriterion("voucherNum <>", value, "vouchernum");
            return (Criteria) this;
        }

        public Criteria andVouchernumGreaterThan(String value) {
            addCriterion("voucherNum >", value, "vouchernum");
            return (Criteria) this;
        }

        public Criteria andVouchernumGreaterThanOrEqualTo(String value) {
            addCriterion("voucherNum >=", value, "vouchernum");
            return (Criteria) this;
        }

        public Criteria andVouchernumLessThan(String value) {
            addCriterion("voucherNum <", value, "vouchernum");
            return (Criteria) this;
        }

        public Criteria andVouchernumLessThanOrEqualTo(String value) {
            addCriterion("voucherNum <=", value, "vouchernum");
            return (Criteria) this;
        }

        public Criteria andVouchernumLike(String value) {
            addCriterion("voucherNum like", value, "vouchernum");
            return (Criteria) this;
        }

        public Criteria andVouchernumNotLike(String value) {
            addCriterion("voucherNum not like", value, "vouchernum");
            return (Criteria) this;
        }

        public Criteria andVouchernumIn(List<String> values) {
            addCriterion("voucherNum in", values, "vouchernum");
            return (Criteria) this;
        }

        public Criteria andVouchernumNotIn(List<String> values) {
            addCriterion("voucherNum not in", values, "vouchernum");
            return (Criteria) this;
        }

        public Criteria andVouchernumBetween(String value1, String value2) {
            addCriterion("voucherNum between", value1, value2, "vouchernum");
            return (Criteria) this;
        }

        public Criteria andVouchernumNotBetween(String value1, String value2) {
            addCriterion("voucherNum not between", value1, value2, "vouchernum");
            return (Criteria) this;
        }

        public Criteria andBillnumIsNull() {
            addCriterion("billNum is null");
            return (Criteria) this;
        }

        public Criteria andBillnumIsNotNull() {
            addCriterion("billNum is not null");
            return (Criteria) this;
        }

        public Criteria andBillnumEqualTo(String value) {
            addCriterion("billNum =", value, "billnum");
            return (Criteria) this;
        }

        public Criteria andBillnumNotEqualTo(String value) {
            addCriterion("billNum <>", value, "billnum");
            return (Criteria) this;
        }

        public Criteria andBillnumGreaterThan(String value) {
            addCriterion("billNum >", value, "billnum");
            return (Criteria) this;
        }

        public Criteria andBillnumGreaterThanOrEqualTo(String value) {
            addCriterion("billNum >=", value, "billnum");
            return (Criteria) this;
        }

        public Criteria andBillnumLessThan(String value) {
            addCriterion("billNum <", value, "billnum");
            return (Criteria) this;
        }

        public Criteria andBillnumLessThanOrEqualTo(String value) {
            addCriterion("billNum <=", value, "billnum");
            return (Criteria) this;
        }

        public Criteria andBillnumLike(String value) {
            addCriterion("billNum like", value, "billnum");
            return (Criteria) this;
        }

        public Criteria andBillnumNotLike(String value) {
            addCriterion("billNum not like", value, "billnum");
            return (Criteria) this;
        }

        public Criteria andBillnumIn(List<String> values) {
            addCriterion("billNum in", values, "billnum");
            return (Criteria) this;
        }

        public Criteria andBillnumNotIn(List<String> values) {
            addCriterion("billNum not in", values, "billnum");
            return (Criteria) this;
        }

        public Criteria andBillnumBetween(String value1, String value2) {
            addCriterion("billNum between", value1, value2, "billnum");
            return (Criteria) this;
        }

        public Criteria andBillnumNotBetween(String value1, String value2) {
            addCriterion("billNum not between", value1, value2, "billnum");
            return (Criteria) this;
        }

        public Criteria andBillpriceIsNull() {
            addCriterion("BillPrice is null");
            return (Criteria) this;
        }

        public Criteria andBillpriceIsNotNull() {
            addCriterion("BillPrice is not null");
            return (Criteria) this;
        }

        public Criteria andBillpriceEqualTo(Float value) {
            addCriterion("BillPrice =", value, "billprice");
            return (Criteria) this;
        }

        public Criteria andBillpriceNotEqualTo(Float value) {
            addCriterion("BillPrice <>", value, "billprice");
            return (Criteria) this;
        }

        public Criteria andBillpriceGreaterThan(Float value) {
            addCriterion("BillPrice >", value, "billprice");
            return (Criteria) this;
        }

        public Criteria andBillpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("BillPrice >=", value, "billprice");
            return (Criteria) this;
        }

        public Criteria andBillpriceLessThan(Float value) {
            addCriterion("BillPrice <", value, "billprice");
            return (Criteria) this;
        }

        public Criteria andBillpriceLessThanOrEqualTo(Float value) {
            addCriterion("BillPrice <=", value, "billprice");
            return (Criteria) this;
        }

        public Criteria andBillpriceIn(List<Float> values) {
            addCriterion("BillPrice in", values, "billprice");
            return (Criteria) this;
        }

        public Criteria andBillpriceNotIn(List<Float> values) {
            addCriterion("BillPrice not in", values, "billprice");
            return (Criteria) this;
        }

        public Criteria andBillpriceBetween(Float value1, Float value2) {
            addCriterion("BillPrice between", value1, value2, "billprice");
            return (Criteria) this;
        }

        public Criteria andBillpriceNotBetween(Float value1, Float value2) {
            addCriterion("BillPrice not between", value1, value2, "billprice");
            return (Criteria) this;
        }

        public Criteria andBilldateIsNull() {
            addCriterion("Billdate is null");
            return (Criteria) this;
        }

        public Criteria andBilldateIsNotNull() {
            addCriterion("Billdate is not null");
            return (Criteria) this;
        }

        public Criteria andBilldateEqualTo(Date value) {
            addCriterion("Billdate =", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateNotEqualTo(Date value) {
            addCriterion("Billdate <>", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateGreaterThan(Date value) {
            addCriterion("Billdate >", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateGreaterThanOrEqualTo(Date value) {
            addCriterion("Billdate >=", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateLessThan(Date value) {
            addCriterion("Billdate <", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateLessThanOrEqualTo(Date value) {
            addCriterion("Billdate <=", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateIn(List<Date> values) {
            addCriterion("Billdate in", values, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateNotIn(List<Date> values) {
            addCriterion("Billdate not in", values, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateBetween(Date value1, Date value2) {
            addCriterion("Billdate between", value1, value2, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateNotBetween(Date value1, Date value2) {
            addCriterion("Billdate not between", value1, value2, "billdate");
            return (Criteria) this;
        }

        public Criteria andChangeIsNull() {
            addCriterion("change is null");
            return (Criteria) this;
        }

        public Criteria andChangeIsNotNull() {
            addCriterion("change is not null");
            return (Criteria) this;
        }

        public Criteria andChangeEqualTo(Float value) {
            addCriterion("change =", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeNotEqualTo(Float value) {
            addCriterion("change <>", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeGreaterThan(Float value) {
            addCriterion("change >", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeGreaterThanOrEqualTo(Float value) {
            addCriterion("change >=", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeLessThan(Float value) {
            addCriterion("change <", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeLessThanOrEqualTo(Float value) {
            addCriterion("change <=", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeIn(List<Float> values) {
            addCriterion("change in", values, "change");
            return (Criteria) this;
        }

        public Criteria andChangeNotIn(List<Float> values) {
            addCriterion("change not in", values, "change");
            return (Criteria) this;
        }

        public Criteria andChangeBetween(Float value1, Float value2) {
            addCriterion("change between", value1, value2, "change");
            return (Criteria) this;
        }

        public Criteria andChangeNotBetween(Float value1, Float value2) {
            addCriterion("change not between", value1, value2, "change");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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