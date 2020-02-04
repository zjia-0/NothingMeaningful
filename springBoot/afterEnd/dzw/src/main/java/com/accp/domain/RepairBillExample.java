package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepairBillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepairBillExample() {
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

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNull() {
            addCriterion("item_type is null");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNotNull() {
            addCriterion("item_type is not null");
            return (Criteria) this;
        }

        public Criteria andItemTypeEqualTo(Integer value) {
            addCriterion("item_type =", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotEqualTo(Integer value) {
            addCriterion("item_type <>", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThan(Integer value) {
            addCriterion("item_type >", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_type >=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThan(Integer value) {
            addCriterion("item_type <", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThanOrEqualTo(Integer value) {
            addCriterion("item_type <=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeIn(List<Integer> values) {
            addCriterion("item_type in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotIn(List<Integer> values) {
            addCriterion("item_type not in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeBetween(Integer value1, Integer value2) {
            addCriterion("item_type between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("item_type not between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("business_type is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("business_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(Integer value) {
            addCriterion("business_type =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(Integer value) {
            addCriterion("business_type <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(Integer value) {
            addCriterion("business_type >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_type >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(Integer value) {
            addCriterion("business_type <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(Integer value) {
            addCriterion("business_type <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<Integer> values) {
            addCriterion("business_type in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<Integer> values) {
            addCriterion("business_type not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(Integer value1, Integer value2) {
            addCriterion("business_type between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("business_type not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andWorkingShiftIsNull() {
            addCriterion("working_shift is null");
            return (Criteria) this;
        }

        public Criteria andWorkingShiftIsNotNull() {
            addCriterion("working_shift is not null");
            return (Criteria) this;
        }

        public Criteria andWorkingShiftEqualTo(String value) {
            addCriterion("working_shift =", value, "workingShift");
            return (Criteria) this;
        }

        public Criteria andWorkingShiftNotEqualTo(String value) {
            addCriterion("working_shift <>", value, "workingShift");
            return (Criteria) this;
        }

        public Criteria andWorkingShiftGreaterThan(String value) {
            addCriterion("working_shift >", value, "workingShift");
            return (Criteria) this;
        }

        public Criteria andWorkingShiftGreaterThanOrEqualTo(String value) {
            addCriterion("working_shift >=", value, "workingShift");
            return (Criteria) this;
        }

        public Criteria andWorkingShiftLessThan(String value) {
            addCriterion("working_shift <", value, "workingShift");
            return (Criteria) this;
        }

        public Criteria andWorkingShiftLessThanOrEqualTo(String value) {
            addCriterion("working_shift <=", value, "workingShift");
            return (Criteria) this;
        }

        public Criteria andWorkingShiftLike(String value) {
            addCriterion("working_shift like", value, "workingShift");
            return (Criteria) this;
        }

        public Criteria andWorkingShiftNotLike(String value) {
            addCriterion("working_shift not like", value, "workingShift");
            return (Criteria) this;
        }

        public Criteria andWorkingShiftIn(List<String> values) {
            addCriterion("working_shift in", values, "workingShift");
            return (Criteria) this;
        }

        public Criteria andWorkingShiftNotIn(List<String> values) {
            addCriterion("working_shift not in", values, "workingShift");
            return (Criteria) this;
        }

        public Criteria andWorkingShiftBetween(String value1, String value2) {
            addCriterion("working_shift between", value1, value2, "workingShift");
            return (Criteria) this;
        }

        public Criteria andWorkingShiftNotBetween(String value1, String value2) {
            addCriterion("working_shift not between", value1, value2, "workingShift");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIsNull() {
            addCriterion("owner_name is null");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIsNotNull() {
            addCriterion("owner_name is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerNameEqualTo(String value) {
            addCriterion("owner_name =", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotEqualTo(String value) {
            addCriterion("owner_name <>", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameGreaterThan(String value) {
            addCriterion("owner_name >", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameGreaterThanOrEqualTo(String value) {
            addCriterion("owner_name >=", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLessThan(String value) {
            addCriterion("owner_name <", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLessThanOrEqualTo(String value) {
            addCriterion("owner_name <=", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLike(String value) {
            addCriterion("owner_name like", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotLike(String value) {
            addCriterion("owner_name not like", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIn(List<String> values) {
            addCriterion("owner_name in", values, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotIn(List<String> values) {
            addCriterion("owner_name not in", values, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameBetween(String value1, String value2) {
            addCriterion("owner_name between", value1, value2, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotBetween(String value1, String value2) {
            addCriterion("owner_name not between", value1, value2, "ownerName");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIsNull() {
            addCriterion("plate_number is null");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIsNotNull() {
            addCriterion("plate_number is not null");
            return (Criteria) this;
        }

        public Criteria andPlateNumberEqualTo(String value) {
            addCriterion("plate_number =", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotEqualTo(String value) {
            addCriterion("plate_number <>", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberGreaterThan(String value) {
            addCriterion("plate_number >", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("plate_number >=", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLessThan(String value) {
            addCriterion("plate_number <", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLessThanOrEqualTo(String value) {
            addCriterion("plate_number <=", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLike(String value) {
            addCriterion("plate_number like", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotLike(String value) {
            addCriterion("plate_number not like", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIn(List<String> values) {
            addCriterion("plate_number in", values, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotIn(List<String> values) {
            addCriterion("plate_number not in", values, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberBetween(String value1, String value2) {
            addCriterion("plate_number between", value1, value2, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotBetween(String value1, String value2) {
            addCriterion("plate_number not between", value1, value2, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNull() {
            addCriterion("car_type is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNotNull() {
            addCriterion("car_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeEqualTo(String value) {
            addCriterion("car_type =", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotEqualTo(String value) {
            addCriterion("car_type <>", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThan(String value) {
            addCriterion("car_type >", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("car_type >=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThan(String value) {
            addCriterion("car_type <", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThanOrEqualTo(String value) {
            addCriterion("car_type <=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLike(String value) {
            addCriterion("car_type like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotLike(String value) {
            addCriterion("car_type not like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIn(List<String> values) {
            addCriterion("car_type in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotIn(List<String> values) {
            addCriterion("car_type not in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeBetween(String value1, String value2) {
            addCriterion("car_type between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotBetween(String value1, String value2) {
            addCriterion("car_type not between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andVinIsNull() {
            addCriterion("vin is null");
            return (Criteria) this;
        }

        public Criteria andVinIsNotNull() {
            addCriterion("vin is not null");
            return (Criteria) this;
        }

        public Criteria andVinEqualTo(String value) {
            addCriterion("vin =", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotEqualTo(String value) {
            addCriterion("vin <>", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThan(String value) {
            addCriterion("vin >", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThanOrEqualTo(String value) {
            addCriterion("vin >=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThan(String value) {
            addCriterion("vin <", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThanOrEqualTo(String value) {
            addCriterion("vin <=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLike(String value) {
            addCriterion("vin like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotLike(String value) {
            addCriterion("vin not like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinIn(List<String> values) {
            addCriterion("vin in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotIn(List<String> values) {
            addCriterion("vin not in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinBetween(String value1, String value2) {
            addCriterion("vin between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotBetween(String value1, String value2) {
            addCriterion("vin not between", value1, value2, "vin");
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

        public Criteria andPredictTimeIsNull() {
            addCriterion("predict_time is null");
            return (Criteria) this;
        }

        public Criteria andPredictTimeIsNotNull() {
            addCriterion("predict_time is not null");
            return (Criteria) this;
        }

        public Criteria andPredictTimeEqualTo(Date value) {
            addCriterion("predict_time =", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeNotEqualTo(Date value) {
            addCriterion("predict_time <>", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeGreaterThan(Date value) {
            addCriterion("predict_time >", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("predict_time >=", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeLessThan(Date value) {
            addCriterion("predict_time <", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeLessThanOrEqualTo(Date value) {
            addCriterion("predict_time <=", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeIn(List<Date> values) {
            addCriterion("predict_time in", values, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeNotIn(List<Date> values) {
            addCriterion("predict_time not in", values, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeBetween(Date value1, Date value2) {
            addCriterion("predict_time between", value1, value2, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeNotBetween(Date value1, Date value2) {
            addCriterion("predict_time not between", value1, value2, "predictTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNull() {
            addCriterion("finish_time is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualTo(Date value) {
            addCriterion("finish_time =", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(Date value) {
            addCriterion("finish_time <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(Date value) {
            addCriterion("finish_time >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finish_time >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(Date value) {
            addCriterion("finish_time <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("finish_time <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIn(List<Date> values) {
            addCriterion("finish_time in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotIn(List<Date> values) {
            addCriterion("finish_time not in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeBetween(Date value1, Date value2) {
            addCriterion("finish_time between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("finish_time not between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andDelaysReasonIsNull() {
            addCriterion("delays_reason is null");
            return (Criteria) this;
        }

        public Criteria andDelaysReasonIsNotNull() {
            addCriterion("delays_reason is not null");
            return (Criteria) this;
        }

        public Criteria andDelaysReasonEqualTo(String value) {
            addCriterion("delays_reason =", value, "delaysReason");
            return (Criteria) this;
        }

        public Criteria andDelaysReasonNotEqualTo(String value) {
            addCriterion("delays_reason <>", value, "delaysReason");
            return (Criteria) this;
        }

        public Criteria andDelaysReasonGreaterThan(String value) {
            addCriterion("delays_reason >", value, "delaysReason");
            return (Criteria) this;
        }

        public Criteria andDelaysReasonGreaterThanOrEqualTo(String value) {
            addCriterion("delays_reason >=", value, "delaysReason");
            return (Criteria) this;
        }

        public Criteria andDelaysReasonLessThan(String value) {
            addCriterion("delays_reason <", value, "delaysReason");
            return (Criteria) this;
        }

        public Criteria andDelaysReasonLessThanOrEqualTo(String value) {
            addCriterion("delays_reason <=", value, "delaysReason");
            return (Criteria) this;
        }

        public Criteria andDelaysReasonLike(String value) {
            addCriterion("delays_reason like", value, "delaysReason");
            return (Criteria) this;
        }

        public Criteria andDelaysReasonNotLike(String value) {
            addCriterion("delays_reason not like", value, "delaysReason");
            return (Criteria) this;
        }

        public Criteria andDelaysReasonIn(List<String> values) {
            addCriterion("delays_reason in", values, "delaysReason");
            return (Criteria) this;
        }

        public Criteria andDelaysReasonNotIn(List<String> values) {
            addCriterion("delays_reason not in", values, "delaysReason");
            return (Criteria) this;
        }

        public Criteria andDelaysReasonBetween(String value1, String value2) {
            addCriterion("delays_reason between", value1, value2, "delaysReason");
            return (Criteria) this;
        }

        public Criteria andDelaysReasonNotBetween(String value1, String value2) {
            addCriterion("delays_reason not between", value1, value2, "delaysReason");
            return (Criteria) this;
        }

        public Criteria andReworkNumberIsNull() {
            addCriterion("rework_number is null");
            return (Criteria) this;
        }

        public Criteria andReworkNumberIsNotNull() {
            addCriterion("rework_number is not null");
            return (Criteria) this;
        }

        public Criteria andReworkNumberEqualTo(Integer value) {
            addCriterion("rework_number =", value, "reworkNumber");
            return (Criteria) this;
        }

        public Criteria andReworkNumberNotEqualTo(Integer value) {
            addCriterion("rework_number <>", value, "reworkNumber");
            return (Criteria) this;
        }

        public Criteria andReworkNumberGreaterThan(Integer value) {
            addCriterion("rework_number >", value, "reworkNumber");
            return (Criteria) this;
        }

        public Criteria andReworkNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("rework_number >=", value, "reworkNumber");
            return (Criteria) this;
        }

        public Criteria andReworkNumberLessThan(Integer value) {
            addCriterion("rework_number <", value, "reworkNumber");
            return (Criteria) this;
        }

        public Criteria andReworkNumberLessThanOrEqualTo(Integer value) {
            addCriterion("rework_number <=", value, "reworkNumber");
            return (Criteria) this;
        }

        public Criteria andReworkNumberIn(List<Integer> values) {
            addCriterion("rework_number in", values, "reworkNumber");
            return (Criteria) this;
        }

        public Criteria andReworkNumberNotIn(List<Integer> values) {
            addCriterion("rework_number not in", values, "reworkNumber");
            return (Criteria) this;
        }

        public Criteria andReworkNumberBetween(Integer value1, Integer value2) {
            addCriterion("rework_number between", value1, value2, "reworkNumber");
            return (Criteria) this;
        }

        public Criteria andReworkNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("rework_number not between", value1, value2, "reworkNumber");
            return (Criteria) this;
        }

        public Criteria andReworkReasonIsNull() {
            addCriterion("rework_reason is null");
            return (Criteria) this;
        }

        public Criteria andReworkReasonIsNotNull() {
            addCriterion("rework_reason is not null");
            return (Criteria) this;
        }

        public Criteria andReworkReasonEqualTo(String value) {
            addCriterion("rework_reason =", value, "reworkReason");
            return (Criteria) this;
        }

        public Criteria andReworkReasonNotEqualTo(String value) {
            addCriterion("rework_reason <>", value, "reworkReason");
            return (Criteria) this;
        }

        public Criteria andReworkReasonGreaterThan(String value) {
            addCriterion("rework_reason >", value, "reworkReason");
            return (Criteria) this;
        }

        public Criteria andReworkReasonGreaterThanOrEqualTo(String value) {
            addCriterion("rework_reason >=", value, "reworkReason");
            return (Criteria) this;
        }

        public Criteria andReworkReasonLessThan(String value) {
            addCriterion("rework_reason <", value, "reworkReason");
            return (Criteria) this;
        }

        public Criteria andReworkReasonLessThanOrEqualTo(String value) {
            addCriterion("rework_reason <=", value, "reworkReason");
            return (Criteria) this;
        }

        public Criteria andReworkReasonLike(String value) {
            addCriterion("rework_reason like", value, "reworkReason");
            return (Criteria) this;
        }

        public Criteria andReworkReasonNotLike(String value) {
            addCriterion("rework_reason not like", value, "reworkReason");
            return (Criteria) this;
        }

        public Criteria andReworkReasonIn(List<String> values) {
            addCriterion("rework_reason in", values, "reworkReason");
            return (Criteria) this;
        }

        public Criteria andReworkReasonNotIn(List<String> values) {
            addCriterion("rework_reason not in", values, "reworkReason");
            return (Criteria) this;
        }

        public Criteria andReworkReasonBetween(String value1, String value2) {
            addCriterion("rework_reason between", value1, value2, "reworkReason");
            return (Criteria) this;
        }

        public Criteria andReworkReasonNotBetween(String value1, String value2) {
            addCriterion("rework_reason not between", value1, value2, "reworkReason");
            return (Criteria) this;
        }

        public Criteria andPersonLiableIsNull() {
            addCriterion("person_liable is null");
            return (Criteria) this;
        }

        public Criteria andPersonLiableIsNotNull() {
            addCriterion("person_liable is not null");
            return (Criteria) this;
        }

        public Criteria andPersonLiableEqualTo(String value) {
            addCriterion("person_liable =", value, "personLiable");
            return (Criteria) this;
        }

        public Criteria andPersonLiableNotEqualTo(String value) {
            addCriterion("person_liable <>", value, "personLiable");
            return (Criteria) this;
        }

        public Criteria andPersonLiableGreaterThan(String value) {
            addCriterion("person_liable >", value, "personLiable");
            return (Criteria) this;
        }

        public Criteria andPersonLiableGreaterThanOrEqualTo(String value) {
            addCriterion("person_liable >=", value, "personLiable");
            return (Criteria) this;
        }

        public Criteria andPersonLiableLessThan(String value) {
            addCriterion("person_liable <", value, "personLiable");
            return (Criteria) this;
        }

        public Criteria andPersonLiableLessThanOrEqualTo(String value) {
            addCriterion("person_liable <=", value, "personLiable");
            return (Criteria) this;
        }

        public Criteria andPersonLiableLike(String value) {
            addCriterion("person_liable like", value, "personLiable");
            return (Criteria) this;
        }

        public Criteria andPersonLiableNotLike(String value) {
            addCriterion("person_liable not like", value, "personLiable");
            return (Criteria) this;
        }

        public Criteria andPersonLiableIn(List<String> values) {
            addCriterion("person_liable in", values, "personLiable");
            return (Criteria) this;
        }

        public Criteria andPersonLiableNotIn(List<String> values) {
            addCriterion("person_liable not in", values, "personLiable");
            return (Criteria) this;
        }

        public Criteria andPersonLiableBetween(String value1, String value2) {
            addCriterion("person_liable between", value1, value2, "personLiable");
            return (Criteria) this;
        }

        public Criteria andPersonLiableNotBetween(String value1, String value2) {
            addCriterion("person_liable not between", value1, value2, "personLiable");
            return (Criteria) this;
        }

        public Criteria andPenaltyAmountIsNull() {
            addCriterion("penalty_amount is null");
            return (Criteria) this;
        }

        public Criteria andPenaltyAmountIsNotNull() {
            addCriterion("penalty_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPenaltyAmountEqualTo(Float value) {
            addCriterion("penalty_amount =", value, "penaltyAmount");
            return (Criteria) this;
        }

        public Criteria andPenaltyAmountNotEqualTo(Float value) {
            addCriterion("penalty_amount <>", value, "penaltyAmount");
            return (Criteria) this;
        }

        public Criteria andPenaltyAmountGreaterThan(Float value) {
            addCriterion("penalty_amount >", value, "penaltyAmount");
            return (Criteria) this;
        }

        public Criteria andPenaltyAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("penalty_amount >=", value, "penaltyAmount");
            return (Criteria) this;
        }

        public Criteria andPenaltyAmountLessThan(Float value) {
            addCriterion("penalty_amount <", value, "penaltyAmount");
            return (Criteria) this;
        }

        public Criteria andPenaltyAmountLessThanOrEqualTo(Float value) {
            addCriterion("penalty_amount <=", value, "penaltyAmount");
            return (Criteria) this;
        }

        public Criteria andPenaltyAmountIn(List<Float> values) {
            addCriterion("penalty_amount in", values, "penaltyAmount");
            return (Criteria) this;
        }

        public Criteria andPenaltyAmountNotIn(List<Float> values) {
            addCriterion("penalty_amount not in", values, "penaltyAmount");
            return (Criteria) this;
        }

        public Criteria andPenaltyAmountBetween(Float value1, Float value2) {
            addCriterion("penalty_amount between", value1, value2, "penaltyAmount");
            return (Criteria) this;
        }

        public Criteria andPenaltyAmountNotBetween(Float value1, Float value2) {
            addCriterion("penalty_amount not between", value1, value2, "penaltyAmount");
            return (Criteria) this;
        }

        public Criteria andEngineNumberIsNull() {
            addCriterion("engine_number is null");
            return (Criteria) this;
        }

        public Criteria andEngineNumberIsNotNull() {
            addCriterion("engine_number is not null");
            return (Criteria) this;
        }

        public Criteria andEngineNumberEqualTo(String value) {
            addCriterion("engine_number =", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberNotEqualTo(String value) {
            addCriterion("engine_number <>", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberGreaterThan(String value) {
            addCriterion("engine_number >", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberGreaterThanOrEqualTo(String value) {
            addCriterion("engine_number >=", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberLessThan(String value) {
            addCriterion("engine_number <", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberLessThanOrEqualTo(String value) {
            addCriterion("engine_number <=", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberLike(String value) {
            addCriterion("engine_number like", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberNotLike(String value) {
            addCriterion("engine_number not like", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberIn(List<String> values) {
            addCriterion("engine_number in", values, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberNotIn(List<String> values) {
            addCriterion("engine_number not in", values, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberBetween(String value1, String value2) {
            addCriterion("engine_number between", value1, value2, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberNotBetween(String value1, String value2) {
            addCriterion("engine_number not between", value1, value2, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineBrandIsNull() {
            addCriterion("engine_brand is null");
            return (Criteria) this;
        }

        public Criteria andEngineBrandIsNotNull() {
            addCriterion("engine_brand is not null");
            return (Criteria) this;
        }

        public Criteria andEngineBrandEqualTo(String value) {
            addCriterion("engine_brand =", value, "engineBrand");
            return (Criteria) this;
        }

        public Criteria andEngineBrandNotEqualTo(String value) {
            addCriterion("engine_brand <>", value, "engineBrand");
            return (Criteria) this;
        }

        public Criteria andEngineBrandGreaterThan(String value) {
            addCriterion("engine_brand >", value, "engineBrand");
            return (Criteria) this;
        }

        public Criteria andEngineBrandGreaterThanOrEqualTo(String value) {
            addCriterion("engine_brand >=", value, "engineBrand");
            return (Criteria) this;
        }

        public Criteria andEngineBrandLessThan(String value) {
            addCriterion("engine_brand <", value, "engineBrand");
            return (Criteria) this;
        }

        public Criteria andEngineBrandLessThanOrEqualTo(String value) {
            addCriterion("engine_brand <=", value, "engineBrand");
            return (Criteria) this;
        }

        public Criteria andEngineBrandLike(String value) {
            addCriterion("engine_brand like", value, "engineBrand");
            return (Criteria) this;
        }

        public Criteria andEngineBrandNotLike(String value) {
            addCriterion("engine_brand not like", value, "engineBrand");
            return (Criteria) this;
        }

        public Criteria andEngineBrandIn(List<String> values) {
            addCriterion("engine_brand in", values, "engineBrand");
            return (Criteria) this;
        }

        public Criteria andEngineBrandNotIn(List<String> values) {
            addCriterion("engine_brand not in", values, "engineBrand");
            return (Criteria) this;
        }

        public Criteria andEngineBrandBetween(String value1, String value2) {
            addCriterion("engine_brand between", value1, value2, "engineBrand");
            return (Criteria) this;
        }

        public Criteria andEngineBrandNotBetween(String value1, String value2) {
            addCriterion("engine_brand not between", value1, value2, "engineBrand");
            return (Criteria) this;
        }

        public Criteria andServiceConsultantIsNull() {
            addCriterion("service_consultant is null");
            return (Criteria) this;
        }

        public Criteria andServiceConsultantIsNotNull() {
            addCriterion("service_consultant is not null");
            return (Criteria) this;
        }

        public Criteria andServiceConsultantEqualTo(String value) {
            addCriterion("service_consultant =", value, "serviceConsultant");
            return (Criteria) this;
        }

        public Criteria andServiceConsultantNotEqualTo(String value) {
            addCriterion("service_consultant <>", value, "serviceConsultant");
            return (Criteria) this;
        }

        public Criteria andServiceConsultantGreaterThan(String value) {
            addCriterion("service_consultant >", value, "serviceConsultant");
            return (Criteria) this;
        }

        public Criteria andServiceConsultantGreaterThanOrEqualTo(String value) {
            addCriterion("service_consultant >=", value, "serviceConsultant");
            return (Criteria) this;
        }

        public Criteria andServiceConsultantLessThan(String value) {
            addCriterion("service_consultant <", value, "serviceConsultant");
            return (Criteria) this;
        }

        public Criteria andServiceConsultantLessThanOrEqualTo(String value) {
            addCriterion("service_consultant <=", value, "serviceConsultant");
            return (Criteria) this;
        }

        public Criteria andServiceConsultantLike(String value) {
            addCriterion("service_consultant like", value, "serviceConsultant");
            return (Criteria) this;
        }

        public Criteria andServiceConsultantNotLike(String value) {
            addCriterion("service_consultant not like", value, "serviceConsultant");
            return (Criteria) this;
        }

        public Criteria andServiceConsultantIn(List<String> values) {
            addCriterion("service_consultant in", values, "serviceConsultant");
            return (Criteria) this;
        }

        public Criteria andServiceConsultantNotIn(List<String> values) {
            addCriterion("service_consultant not in", values, "serviceConsultant");
            return (Criteria) this;
        }

        public Criteria andServiceConsultantBetween(String value1, String value2) {
            addCriterion("service_consultant between", value1, value2, "serviceConsultant");
            return (Criteria) this;
        }

        public Criteria andServiceConsultantNotBetween(String value1, String value2) {
            addCriterion("service_consultant not between", value1, value2, "serviceConsultant");
            return (Criteria) this;
        }

        public Criteria andDriverIsNull() {
            addCriterion("driver is null");
            return (Criteria) this;
        }

        public Criteria andDriverIsNotNull() {
            addCriterion("driver is not null");
            return (Criteria) this;
        }

        public Criteria andDriverEqualTo(String value) {
            addCriterion("driver =", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotEqualTo(String value) {
            addCriterion("driver <>", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverGreaterThan(String value) {
            addCriterion("driver >", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverGreaterThanOrEqualTo(String value) {
            addCriterion("driver >=", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLessThan(String value) {
            addCriterion("driver <", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLessThanOrEqualTo(String value) {
            addCriterion("driver <=", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLike(String value) {
            addCriterion("driver like", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotLike(String value) {
            addCriterion("driver not like", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverIn(List<String> values) {
            addCriterion("driver in", values, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotIn(List<String> values) {
            addCriterion("driver not in", values, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverBetween(String value1, String value2) {
            addCriterion("driver between", value1, value2, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotBetween(String value1, String value2) {
            addCriterion("driver not between", value1, value2, "driver");
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

        public Criteria andEntranceMileageIsNull() {
            addCriterion("entrance_mileage is null");
            return (Criteria) this;
        }

        public Criteria andEntranceMileageIsNotNull() {
            addCriterion("entrance_mileage is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceMileageEqualTo(Float value) {
            addCriterion("entrance_mileage =", value, "entranceMileage");
            return (Criteria) this;
        }

        public Criteria andEntranceMileageNotEqualTo(Float value) {
            addCriterion("entrance_mileage <>", value, "entranceMileage");
            return (Criteria) this;
        }

        public Criteria andEntranceMileageGreaterThan(Float value) {
            addCriterion("entrance_mileage >", value, "entranceMileage");
            return (Criteria) this;
        }

        public Criteria andEntranceMileageGreaterThanOrEqualTo(Float value) {
            addCriterion("entrance_mileage >=", value, "entranceMileage");
            return (Criteria) this;
        }

        public Criteria andEntranceMileageLessThan(Float value) {
            addCriterion("entrance_mileage <", value, "entranceMileage");
            return (Criteria) this;
        }

        public Criteria andEntranceMileageLessThanOrEqualTo(Float value) {
            addCriterion("entrance_mileage <=", value, "entranceMileage");
            return (Criteria) this;
        }

        public Criteria andEntranceMileageIn(List<Float> values) {
            addCriterion("entrance_mileage in", values, "entranceMileage");
            return (Criteria) this;
        }

        public Criteria andEntranceMileageNotIn(List<Float> values) {
            addCriterion("entrance_mileage not in", values, "entranceMileage");
            return (Criteria) this;
        }

        public Criteria andEntranceMileageBetween(Float value1, Float value2) {
            addCriterion("entrance_mileage between", value1, value2, "entranceMileage");
            return (Criteria) this;
        }

        public Criteria andEntranceMileageNotBetween(Float value1, Float value2) {
            addCriterion("entrance_mileage not between", value1, value2, "entranceMileage");
            return (Criteria) this;
        }

        public Criteria andEntranceOilIsNull() {
            addCriterion("entrance_oil is null");
            return (Criteria) this;
        }

        public Criteria andEntranceOilIsNotNull() {
            addCriterion("entrance_oil is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceOilEqualTo(String value) {
            addCriterion("entrance_oil =", value, "entranceOil");
            return (Criteria) this;
        }

        public Criteria andEntranceOilNotEqualTo(String value) {
            addCriterion("entrance_oil <>", value, "entranceOil");
            return (Criteria) this;
        }

        public Criteria andEntranceOilGreaterThan(String value) {
            addCriterion("entrance_oil >", value, "entranceOil");
            return (Criteria) this;
        }

        public Criteria andEntranceOilGreaterThanOrEqualTo(String value) {
            addCriterion("entrance_oil >=", value, "entranceOil");
            return (Criteria) this;
        }

        public Criteria andEntranceOilLessThan(String value) {
            addCriterion("entrance_oil <", value, "entranceOil");
            return (Criteria) this;
        }

        public Criteria andEntranceOilLessThanOrEqualTo(String value) {
            addCriterion("entrance_oil <=", value, "entranceOil");
            return (Criteria) this;
        }

        public Criteria andEntranceOilLike(String value) {
            addCriterion("entrance_oil like", value, "entranceOil");
            return (Criteria) this;
        }

        public Criteria andEntranceOilNotLike(String value) {
            addCriterion("entrance_oil not like", value, "entranceOil");
            return (Criteria) this;
        }

        public Criteria andEntranceOilIn(List<String> values) {
            addCriterion("entrance_oil in", values, "entranceOil");
            return (Criteria) this;
        }

        public Criteria andEntranceOilNotIn(List<String> values) {
            addCriterion("entrance_oil not in", values, "entranceOil");
            return (Criteria) this;
        }

        public Criteria andEntranceOilBetween(String value1, String value2) {
            addCriterion("entrance_oil between", value1, value2, "entranceOil");
            return (Criteria) this;
        }

        public Criteria andEntranceOilNotBetween(String value1, String value2) {
            addCriterion("entrance_oil not between", value1, value2, "entranceOil");
            return (Criteria) this;
        }

        public Criteria andLastMileageIsNull() {
            addCriterion("last_mileage is null");
            return (Criteria) this;
        }

        public Criteria andLastMileageIsNotNull() {
            addCriterion("last_mileage is not null");
            return (Criteria) this;
        }

        public Criteria andLastMileageEqualTo(Float value) {
            addCriterion("last_mileage =", value, "lastMileage");
            return (Criteria) this;
        }

        public Criteria andLastMileageNotEqualTo(Float value) {
            addCriterion("last_mileage <>", value, "lastMileage");
            return (Criteria) this;
        }

        public Criteria andLastMileageGreaterThan(Float value) {
            addCriterion("last_mileage >", value, "lastMileage");
            return (Criteria) this;
        }

        public Criteria andLastMileageGreaterThanOrEqualTo(Float value) {
            addCriterion("last_mileage >=", value, "lastMileage");
            return (Criteria) this;
        }

        public Criteria andLastMileageLessThan(Float value) {
            addCriterion("last_mileage <", value, "lastMileage");
            return (Criteria) this;
        }

        public Criteria andLastMileageLessThanOrEqualTo(Float value) {
            addCriterion("last_mileage <=", value, "lastMileage");
            return (Criteria) this;
        }

        public Criteria andLastMileageIn(List<Float> values) {
            addCriterion("last_mileage in", values, "lastMileage");
            return (Criteria) this;
        }

        public Criteria andLastMileageNotIn(List<Float> values) {
            addCriterion("last_mileage not in", values, "lastMileage");
            return (Criteria) this;
        }

        public Criteria andLastMileageBetween(Float value1, Float value2) {
            addCriterion("last_mileage between", value1, value2, "lastMileage");
            return (Criteria) this;
        }

        public Criteria andLastMileageNotBetween(Float value1, Float value2) {
            addCriterion("last_mileage not between", value1, value2, "lastMileage");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeIsNull() {
            addCriterion("entrance_time is null");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeIsNotNull() {
            addCriterion("entrance_time is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeEqualTo(Date value) {
            addCriterion("entrance_time =", value, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeNotEqualTo(Date value) {
            addCriterion("entrance_time <>", value, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeGreaterThan(Date value) {
            addCriterion("entrance_time >", value, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("entrance_time >=", value, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeLessThan(Date value) {
            addCriterion("entrance_time <", value, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeLessThanOrEqualTo(Date value) {
            addCriterion("entrance_time <=", value, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeIn(List<Date> values) {
            addCriterion("entrance_time in", values, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeNotIn(List<Date> values) {
            addCriterion("entrance_time not in", values, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeBetween(Date value1, Date value2) {
            addCriterion("entrance_time between", value1, value2, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeNotBetween(Date value1, Date value2) {
            addCriterion("entrance_time not between", value1, value2, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andClearingFormIsNull() {
            addCriterion("clearing_form is null");
            return (Criteria) this;
        }

        public Criteria andClearingFormIsNotNull() {
            addCriterion("clearing_form is not null");
            return (Criteria) this;
        }

        public Criteria andClearingFormEqualTo(String value) {
            addCriterion("clearing_form =", value, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormNotEqualTo(String value) {
            addCriterion("clearing_form <>", value, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormGreaterThan(String value) {
            addCriterion("clearing_form >", value, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormGreaterThanOrEqualTo(String value) {
            addCriterion("clearing_form >=", value, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormLessThan(String value) {
            addCriterion("clearing_form <", value, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormLessThanOrEqualTo(String value) {
            addCriterion("clearing_form <=", value, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormLike(String value) {
            addCriterion("clearing_form like", value, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormNotLike(String value) {
            addCriterion("clearing_form not like", value, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormIn(List<String> values) {
            addCriterion("clearing_form in", values, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormNotIn(List<String> values) {
            addCriterion("clearing_form not in", values, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormBetween(String value1, String value2) {
            addCriterion("clearing_form between", value1, value2, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormNotBetween(String value1, String value2) {
            addCriterion("clearing_form not between", value1, value2, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andCorporationIsNull() {
            addCriterion("corporation is null");
            return (Criteria) this;
        }

        public Criteria andCorporationIsNotNull() {
            addCriterion("corporation is not null");
            return (Criteria) this;
        }

        public Criteria andCorporationEqualTo(String value) {
            addCriterion("corporation =", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationNotEqualTo(String value) {
            addCriterion("corporation <>", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationGreaterThan(String value) {
            addCriterion("corporation >", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationGreaterThanOrEqualTo(String value) {
            addCriterion("corporation >=", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationLessThan(String value) {
            addCriterion("corporation <", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationLessThanOrEqualTo(String value) {
            addCriterion("corporation <=", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationLike(String value) {
            addCriterion("corporation like", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationNotLike(String value) {
            addCriterion("corporation not like", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationIn(List<String> values) {
            addCriterion("corporation in", values, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationNotIn(List<String> values) {
            addCriterion("corporation not in", values, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationBetween(String value1, String value2) {
            addCriterion("corporation between", value1, value2, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationNotBetween(String value1, String value2) {
            addCriterion("corporation not between", value1, value2, "corporation");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNull() {
            addCriterion("last_time is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNotNull() {
            addCriterion("last_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeEqualTo(Date value) {
            addCriterion("last_time =", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotEqualTo(Date value) {
            addCriterion("last_time <>", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThan(Date value) {
            addCriterion("last_time >", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_time >=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThan(Date value) {
            addCriterion("last_time <", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_time <=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIn(List<Date> values) {
            addCriterion("last_time in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotIn(List<Date> values) {
            addCriterion("last_time not in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeBetween(Date value1, Date value2) {
            addCriterion("last_time between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_time not between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountIsNull() {
            addCriterion("estimated_amount is null");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountIsNotNull() {
            addCriterion("estimated_amount is not null");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountEqualTo(Float value) {
            addCriterion("estimated_amount =", value, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountNotEqualTo(Float value) {
            addCriterion("estimated_amount <>", value, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountGreaterThan(Float value) {
            addCriterion("estimated_amount >", value, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("estimated_amount >=", value, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountLessThan(Float value) {
            addCriterion("estimated_amount <", value, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountLessThanOrEqualTo(Float value) {
            addCriterion("estimated_amount <=", value, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountIn(List<Float> values) {
            addCriterion("estimated_amount in", values, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountNotIn(List<Float> values) {
            addCriterion("estimated_amount not in", values, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountBetween(Float value1, Float value2) {
            addCriterion("estimated_amount between", value1, value2, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountNotBetween(Float value1, Float value2) {
            addCriterion("estimated_amount not between", value1, value2, "estimatedAmount");
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

        public Criteria andRepairsStatementIsNull() {
            addCriterion("repairs_statement is null");
            return (Criteria) this;
        }

        public Criteria andRepairsStatementIsNotNull() {
            addCriterion("repairs_statement is not null");
            return (Criteria) this;
        }

        public Criteria andRepairsStatementEqualTo(String value) {
            addCriterion("repairs_statement =", value, "repairsStatement");
            return (Criteria) this;
        }

        public Criteria andRepairsStatementNotEqualTo(String value) {
            addCriterion("repairs_statement <>", value, "repairsStatement");
            return (Criteria) this;
        }

        public Criteria andRepairsStatementGreaterThan(String value) {
            addCriterion("repairs_statement >", value, "repairsStatement");
            return (Criteria) this;
        }

        public Criteria andRepairsStatementGreaterThanOrEqualTo(String value) {
            addCriterion("repairs_statement >=", value, "repairsStatement");
            return (Criteria) this;
        }

        public Criteria andRepairsStatementLessThan(String value) {
            addCriterion("repairs_statement <", value, "repairsStatement");
            return (Criteria) this;
        }

        public Criteria andRepairsStatementLessThanOrEqualTo(String value) {
            addCriterion("repairs_statement <=", value, "repairsStatement");
            return (Criteria) this;
        }

        public Criteria andRepairsStatementLike(String value) {
            addCriterion("repairs_statement like", value, "repairsStatement");
            return (Criteria) this;
        }

        public Criteria andRepairsStatementNotLike(String value) {
            addCriterion("repairs_statement not like", value, "repairsStatement");
            return (Criteria) this;
        }

        public Criteria andRepairsStatementIn(List<String> values) {
            addCriterion("repairs_statement in", values, "repairsStatement");
            return (Criteria) this;
        }

        public Criteria andRepairsStatementNotIn(List<String> values) {
            addCriterion("repairs_statement not in", values, "repairsStatement");
            return (Criteria) this;
        }

        public Criteria andRepairsStatementBetween(String value1, String value2) {
            addCriterion("repairs_statement between", value1, value2, "repairsStatement");
            return (Criteria) this;
        }

        public Criteria andRepairsStatementNotBetween(String value1, String value2) {
            addCriterion("repairs_statement not between", value1, value2, "repairsStatement");
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