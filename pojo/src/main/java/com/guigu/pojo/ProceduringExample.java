package com.guigu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProceduringExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProceduringExample() {
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

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andDetailsNumberIsNull() {
            addCriterion("details_number is null");
            return (Criteria) this;
        }

        public Criteria andDetailsNumberIsNotNull() {
            addCriterion("details_number is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsNumberEqualTo(Integer value) {
            addCriterion("details_number =", value, "detailsNumber");
            return (Criteria) this;
        }

        public Criteria andDetailsNumberNotEqualTo(Integer value) {
            addCriterion("details_number <>", value, "detailsNumber");
            return (Criteria) this;
        }

        public Criteria andDetailsNumberGreaterThan(Integer value) {
            addCriterion("details_number >", value, "detailsNumber");
            return (Criteria) this;
        }

        public Criteria andDetailsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("details_number >=", value, "detailsNumber");
            return (Criteria) this;
        }

        public Criteria andDetailsNumberLessThan(Integer value) {
            addCriterion("details_number <", value, "detailsNumber");
            return (Criteria) this;
        }

        public Criteria andDetailsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("details_number <=", value, "detailsNumber");
            return (Criteria) this;
        }

        public Criteria andDetailsNumberIn(List<Integer> values) {
            addCriterion("details_number in", values, "detailsNumber");
            return (Criteria) this;
        }

        public Criteria andDetailsNumberNotIn(List<Integer> values) {
            addCriterion("details_number not in", values, "detailsNumber");
            return (Criteria) this;
        }

        public Criteria andDetailsNumberBetween(Integer value1, Integer value2) {
            addCriterion("details_number between", value1, value2, "detailsNumber");
            return (Criteria) this;
        }

        public Criteria andDetailsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("details_number not between", value1, value2, "detailsNumber");
            return (Criteria) this;
        }

        public Criteria andProcedureIdIsNull() {
            addCriterion("procedure_id is null");
            return (Criteria) this;
        }

        public Criteria andProcedureIdIsNotNull() {
            addCriterion("procedure_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcedureIdEqualTo(String value) {
            addCriterion("procedure_id =", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdNotEqualTo(String value) {
            addCriterion("procedure_id <>", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdGreaterThan(String value) {
            addCriterion("procedure_id >", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdGreaterThanOrEqualTo(String value) {
            addCriterion("procedure_id >=", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdLessThan(String value) {
            addCriterion("procedure_id <", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdLessThanOrEqualTo(String value) {
            addCriterion("procedure_id <=", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdLike(String value) {
            addCriterion("procedure_id like", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdNotLike(String value) {
            addCriterion("procedure_id not like", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdIn(List<String> values) {
            addCriterion("procedure_id in", values, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdNotIn(List<String> values) {
            addCriterion("procedure_id not in", values, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdBetween(String value1, String value2) {
            addCriterion("procedure_id between", value1, value2, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdNotBetween(String value1, String value2) {
            addCriterion("procedure_id not between", value1, value2, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureNameIsNull() {
            addCriterion("procedure_name is null");
            return (Criteria) this;
        }

        public Criteria andProcedureNameIsNotNull() {
            addCriterion("procedure_name is not null");
            return (Criteria) this;
        }

        public Criteria andProcedureNameEqualTo(String value) {
            addCriterion("procedure_name =", value, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameNotEqualTo(String value) {
            addCriterion("procedure_name <>", value, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameGreaterThan(String value) {
            addCriterion("procedure_name >", value, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameGreaterThanOrEqualTo(String value) {
            addCriterion("procedure_name >=", value, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameLessThan(String value) {
            addCriterion("procedure_name <", value, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameLessThanOrEqualTo(String value) {
            addCriterion("procedure_name <=", value, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameLike(String value) {
            addCriterion("procedure_name like", value, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameNotLike(String value) {
            addCriterion("procedure_name not like", value, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameIn(List<String> values) {
            addCriterion("procedure_name in", values, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameNotIn(List<String> values) {
            addCriterion("procedure_name not in", values, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameBetween(String value1, String value2) {
            addCriterion("procedure_name between", value1, value2, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameNotBetween(String value1, String value2) {
            addCriterion("procedure_name not between", value1, value2, "procedureName");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountIsNull() {
            addCriterion("labour_hour_amount is null");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountIsNotNull() {
            addCriterion("labour_hour_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountEqualTo(BigDecimal value) {
            addCriterion("labour_hour_amount =", value, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountNotEqualTo(BigDecimal value) {
            addCriterion("labour_hour_amount <>", value, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountGreaterThan(BigDecimal value) {
            addCriterion("labour_hour_amount >", value, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("labour_hour_amount >=", value, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountLessThan(BigDecimal value) {
            addCriterion("labour_hour_amount <", value, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("labour_hour_amount <=", value, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountIn(List<BigDecimal> values) {
            addCriterion("labour_hour_amount in", values, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountNotIn(List<BigDecimal> values) {
            addCriterion("labour_hour_amount not in", values, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("labour_hour_amount between", value1, value2, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("labour_hour_amount not between", value1, value2, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("cost_price is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(BigDecimal value) {
            addCriterion("cost_price =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(BigDecimal value) {
            addCriterion("cost_price <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(BigDecimal value) {
            addCriterion("cost_price >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_price >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(BigDecimal value) {
            addCriterion("cost_price <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_price <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<BigDecimal> values) {
            addCriterion("cost_price in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<BigDecimal> values) {
            addCriterion("cost_price not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_price between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_price not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andSubtotalIsNull() {
            addCriterion("subtotal is null");
            return (Criteria) this;
        }

        public Criteria andSubtotalIsNotNull() {
            addCriterion("subtotal is not null");
            return (Criteria) this;
        }

        public Criteria andSubtotalEqualTo(BigDecimal value) {
            addCriterion("subtotal =", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotEqualTo(BigDecimal value) {
            addCriterion("subtotal <>", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalGreaterThan(BigDecimal value) {
            addCriterion("subtotal >", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("subtotal >=", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalLessThan(BigDecimal value) {
            addCriterion("subtotal <", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("subtotal <=", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalIn(List<BigDecimal> values) {
            addCriterion("subtotal in", values, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotIn(List<BigDecimal> values) {
            addCriterion("subtotal not in", values, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("subtotal between", value1, value2, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("subtotal not between", value1, value2, "subtotal");
            return (Criteria) this;
        }

        public Criteria andProcedureDescribeIsNull() {
            addCriterion("procedure_describe is null");
            return (Criteria) this;
        }

        public Criteria andProcedureDescribeIsNotNull() {
            addCriterion("procedure_describe is not null");
            return (Criteria) this;
        }

        public Criteria andProcedureDescribeEqualTo(String value) {
            addCriterion("procedure_describe =", value, "procedureDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedureDescribeNotEqualTo(String value) {
            addCriterion("procedure_describe <>", value, "procedureDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedureDescribeGreaterThan(String value) {
            addCriterion("procedure_describe >", value, "procedureDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedureDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("procedure_describe >=", value, "procedureDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedureDescribeLessThan(String value) {
            addCriterion("procedure_describe <", value, "procedureDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedureDescribeLessThanOrEqualTo(String value) {
            addCriterion("procedure_describe <=", value, "procedureDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedureDescribeLike(String value) {
            addCriterion("procedure_describe like", value, "procedureDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedureDescribeNotLike(String value) {
            addCriterion("procedure_describe not like", value, "procedureDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedureDescribeIn(List<String> values) {
            addCriterion("procedure_describe in", values, "procedureDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedureDescribeNotIn(List<String> values) {
            addCriterion("procedure_describe not in", values, "procedureDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedureDescribeBetween(String value1, String value2) {
            addCriterion("procedure_describe between", value1, value2, "procedureDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedureDescribeNotBetween(String value1, String value2) {
            addCriterion("procedure_describe not between", value1, value2, "procedureDescribe");
            return (Criteria) this;
        }

        public Criteria andRegCountIsNull() {
            addCriterion("reg_count is null");
            return (Criteria) this;
        }

        public Criteria andRegCountIsNotNull() {
            addCriterion("reg_count is not null");
            return (Criteria) this;
        }

        public Criteria andRegCountEqualTo(BigDecimal value) {
            addCriterion("reg_count =", value, "regCount");
            return (Criteria) this;
        }

        public Criteria andRegCountNotEqualTo(BigDecimal value) {
            addCriterion("reg_count <>", value, "regCount");
            return (Criteria) this;
        }

        public Criteria andRegCountGreaterThan(BigDecimal value) {
            addCriterion("reg_count >", value, "regCount");
            return (Criteria) this;
        }

        public Criteria andRegCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reg_count >=", value, "regCount");
            return (Criteria) this;
        }

        public Criteria andRegCountLessThan(BigDecimal value) {
            addCriterion("reg_count <", value, "regCount");
            return (Criteria) this;
        }

        public Criteria andRegCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reg_count <=", value, "regCount");
            return (Criteria) this;
        }

        public Criteria andRegCountIn(List<BigDecimal> values) {
            addCriterion("reg_count in", values, "regCount");
            return (Criteria) this;
        }

        public Criteria andRegCountNotIn(List<BigDecimal> values) {
            addCriterion("reg_count not in", values, "regCount");
            return (Criteria) this;
        }

        public Criteria andRegCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reg_count between", value1, value2, "regCount");
            return (Criteria) this;
        }

        public Criteria andRegCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reg_count not between", value1, value2, "regCount");
            return (Criteria) this;
        }

        public Criteria andProcedureResponsiblePersonIsNull() {
            addCriterion("procedure_responsible_person is null");
            return (Criteria) this;
        }

        public Criteria andProcedureResponsiblePersonIsNotNull() {
            addCriterion("procedure_responsible_person is not null");
            return (Criteria) this;
        }

        public Criteria andProcedureResponsiblePersonEqualTo(String value) {
            addCriterion("procedure_responsible_person =", value, "procedureResponsiblePerson");
            return (Criteria) this;
        }

        public Criteria andProcedureResponsiblePersonNotEqualTo(String value) {
            addCriterion("procedure_responsible_person <>", value, "procedureResponsiblePerson");
            return (Criteria) this;
        }

        public Criteria andProcedureResponsiblePersonGreaterThan(String value) {
            addCriterion("procedure_responsible_person >", value, "procedureResponsiblePerson");
            return (Criteria) this;
        }

        public Criteria andProcedureResponsiblePersonGreaterThanOrEqualTo(String value) {
            addCriterion("procedure_responsible_person >=", value, "procedureResponsiblePerson");
            return (Criteria) this;
        }

        public Criteria andProcedureResponsiblePersonLessThan(String value) {
            addCriterion("procedure_responsible_person <", value, "procedureResponsiblePerson");
            return (Criteria) this;
        }

        public Criteria andProcedureResponsiblePersonLessThanOrEqualTo(String value) {
            addCriterion("procedure_responsible_person <=", value, "procedureResponsiblePerson");
            return (Criteria) this;
        }

        public Criteria andProcedureResponsiblePersonLike(String value) {
            addCriterion("procedure_responsible_person like", value, "procedureResponsiblePerson");
            return (Criteria) this;
        }

        public Criteria andProcedureResponsiblePersonNotLike(String value) {
            addCriterion("procedure_responsible_person not like", value, "procedureResponsiblePerson");
            return (Criteria) this;
        }

        public Criteria andProcedureResponsiblePersonIn(List<String> values) {
            addCriterion("procedure_responsible_person in", values, "procedureResponsiblePerson");
            return (Criteria) this;
        }

        public Criteria andProcedureResponsiblePersonNotIn(List<String> values) {
            addCriterion("procedure_responsible_person not in", values, "procedureResponsiblePerson");
            return (Criteria) this;
        }

        public Criteria andProcedureResponsiblePersonBetween(String value1, String value2) {
            addCriterion("procedure_responsible_person between", value1, value2, "procedureResponsiblePerson");
            return (Criteria) this;
        }

        public Criteria andProcedureResponsiblePersonNotBetween(String value1, String value2) {
            addCriterion("procedure_responsible_person not between", value1, value2, "procedureResponsiblePerson");
            return (Criteria) this;
        }

        public Criteria andRegisterIsNull() {
            addCriterion("register is null");
            return (Criteria) this;
        }

        public Criteria andRegisterIsNotNull() {
            addCriterion("register is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterEqualTo(String value) {
            addCriterion("register =", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotEqualTo(String value) {
            addCriterion("register <>", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterGreaterThan(String value) {
            addCriterion("register >", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterGreaterThanOrEqualTo(String value) {
            addCriterion("register >=", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLessThan(String value) {
            addCriterion("register <", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLessThanOrEqualTo(String value) {
            addCriterion("register <=", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLike(String value) {
            addCriterion("register like", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotLike(String value) {
            addCriterion("register not like", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterIn(List<String> values) {
            addCriterion("register in", values, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotIn(List<String> values) {
            addCriterion("register not in", values, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterBetween(String value1, String value2) {
            addCriterion("register between", value1, value2, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotBetween(String value1, String value2) {
            addCriterion("register not between", value1, value2, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("register_time is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("register_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(Date value) {
            addCriterion("register_time =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(Date value) {
            addCriterion("register_time <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(Date value) {
            addCriterion("register_time >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("register_time >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(Date value) {
            addCriterion("register_time <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterion("register_time <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<Date> values) {
            addCriterion("register_time in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<Date> values) {
            addCriterion("register_time not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(Date value1, Date value2) {
            addCriterion("register_time between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterion("register_time not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andCheckerIsNull() {
            addCriterion("checker is null");
            return (Criteria) this;
        }

        public Criteria andCheckerIsNotNull() {
            addCriterion("checker is not null");
            return (Criteria) this;
        }

        public Criteria andCheckerEqualTo(String value) {
            addCriterion("checker =", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotEqualTo(String value) {
            addCriterion("checker <>", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThan(String value) {
            addCriterion("checker >", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThanOrEqualTo(String value) {
            addCriterion("checker >=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThan(String value) {
            addCriterion("checker <", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThanOrEqualTo(String value) {
            addCriterion("checker <=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLike(String value) {
            addCriterion("checker like", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotLike(String value) {
            addCriterion("checker not like", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerIn(List<String> values) {
            addCriterion("checker in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotIn(List<String> values) {
            addCriterion("checker not in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerBetween(String value1, String value2) {
            addCriterion("checker between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotBetween(String value1, String value2) {
            addCriterion("checker not between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("check_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(Date value) {
            addCriterion("check_time =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(Date value) {
            addCriterion("check_time <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(Date value) {
            addCriterion("check_time >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("check_time >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(Date value) {
            addCriterion("check_time <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("check_time <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<Date> values) {
            addCriterion("check_time in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<Date> values) {
            addCriterion("check_time not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(Date value1, Date value2) {
            addCriterion("check_time between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("check_time not between", value1, value2, "checkTime");
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
