package com.guigu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProcedureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProcedureExample() {
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

        public Criteria andRealLabourHourAmountIsNull() {
            addCriterion("real_labour_hour_amount is null");
            return (Criteria) this;
        }

        public Criteria andRealLabourHourAmountIsNotNull() {
            addCriterion("real_labour_hour_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRealLabourHourAmountEqualTo(BigDecimal value) {
            addCriterion("real_labour_hour_amount =", value, "realLabourHourAmount");
            return (Criteria) this;
        }

        public Criteria andRealLabourHourAmountNotEqualTo(BigDecimal value) {
            addCriterion("real_labour_hour_amount <>", value, "realLabourHourAmount");
            return (Criteria) this;
        }

        public Criteria andRealLabourHourAmountGreaterThan(BigDecimal value) {
            addCriterion("real_labour_hour_amount >", value, "realLabourHourAmount");
            return (Criteria) this;
        }

        public Criteria andRealLabourHourAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_labour_hour_amount >=", value, "realLabourHourAmount");
            return (Criteria) this;
        }

        public Criteria andRealLabourHourAmountLessThan(BigDecimal value) {
            addCriterion("real_labour_hour_amount <", value, "realLabourHourAmount");
            return (Criteria) this;
        }

        public Criteria andRealLabourHourAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_labour_hour_amount <=", value, "realLabourHourAmount");
            return (Criteria) this;
        }

        public Criteria andRealLabourHourAmountIn(List<BigDecimal> values) {
            addCriterion("real_labour_hour_amount in", values, "realLabourHourAmount");
            return (Criteria) this;
        }

        public Criteria andRealLabourHourAmountNotIn(List<BigDecimal> values) {
            addCriterion("real_labour_hour_amount not in", values, "realLabourHourAmount");
            return (Criteria) this;
        }

        public Criteria andRealLabourHourAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_labour_hour_amount between", value1, value2, "realLabourHourAmount");
            return (Criteria) this;
        }

        public Criteria andRealLabourHourAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_labour_hour_amount not between", value1, value2, "realLabourHourAmount");
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

        public Criteria andRealSubtotalIsNull() {
            addCriterion("real_subtotal is null");
            return (Criteria) this;
        }

        public Criteria andRealSubtotalIsNotNull() {
            addCriterion("real_subtotal is not null");
            return (Criteria) this;
        }

        public Criteria andRealSubtotalEqualTo(BigDecimal value) {
            addCriterion("real_subtotal =", value, "realSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealSubtotalNotEqualTo(BigDecimal value) {
            addCriterion("real_subtotal <>", value, "realSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealSubtotalGreaterThan(BigDecimal value) {
            addCriterion("real_subtotal >", value, "realSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealSubtotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_subtotal >=", value, "realSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealSubtotalLessThan(BigDecimal value) {
            addCriterion("real_subtotal <", value, "realSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealSubtotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_subtotal <=", value, "realSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealSubtotalIn(List<BigDecimal> values) {
            addCriterion("real_subtotal in", values, "realSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealSubtotalNotIn(List<BigDecimal> values) {
            addCriterion("real_subtotal not in", values, "realSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealSubtotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_subtotal between", value1, value2, "realSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealSubtotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_subtotal not between", value1, value2, "realSubtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalIsNull() {
            addCriterion("module_subtotal is null");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalIsNotNull() {
            addCriterion("module_subtotal is not null");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalEqualTo(BigDecimal value) {
            addCriterion("module_subtotal =", value, "moduleSubtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalNotEqualTo(BigDecimal value) {
            addCriterion("module_subtotal <>", value, "moduleSubtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalGreaterThan(BigDecimal value) {
            addCriterion("module_subtotal >", value, "moduleSubtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("module_subtotal >=", value, "moduleSubtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalLessThan(BigDecimal value) {
            addCriterion("module_subtotal <", value, "moduleSubtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("module_subtotal <=", value, "moduleSubtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalIn(List<BigDecimal> values) {
            addCriterion("module_subtotal in", values, "moduleSubtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalNotIn(List<BigDecimal> values) {
            addCriterion("module_subtotal not in", values, "moduleSubtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("module_subtotal between", value1, value2, "moduleSubtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("module_subtotal not between", value1, value2, "moduleSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealModuleSubtotalIsNull() {
            addCriterion("real_module_subtotal is null");
            return (Criteria) this;
        }

        public Criteria andRealModuleSubtotalIsNotNull() {
            addCriterion("real_module_subtotal is not null");
            return (Criteria) this;
        }

        public Criteria andRealModuleSubtotalEqualTo(BigDecimal value) {
            addCriterion("real_module_subtotal =", value, "realModuleSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealModuleSubtotalNotEqualTo(BigDecimal value) {
            addCriterion("real_module_subtotal <>", value, "realModuleSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealModuleSubtotalGreaterThan(BigDecimal value) {
            addCriterion("real_module_subtotal >", value, "realModuleSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealModuleSubtotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_module_subtotal >=", value, "realModuleSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealModuleSubtotalLessThan(BigDecimal value) {
            addCriterion("real_module_subtotal <", value, "realModuleSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealModuleSubtotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_module_subtotal <=", value, "realModuleSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealModuleSubtotalIn(List<BigDecimal> values) {
            addCriterion("real_module_subtotal in", values, "realModuleSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealModuleSubtotalNotIn(List<BigDecimal> values) {
            addCriterion("real_module_subtotal not in", values, "realModuleSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealModuleSubtotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_module_subtotal between", value1, value2, "realModuleSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealModuleSubtotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_module_subtotal not between", value1, value2, "realModuleSubtotal");
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

        public Criteria andDemandAmountIsNull() {
            addCriterion("demand_amount is null");
            return (Criteria) this;
        }

        public Criteria andDemandAmountIsNotNull() {
            addCriterion("demand_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDemandAmountEqualTo(BigDecimal value) {
            addCriterion("demand_amount =", value, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountNotEqualTo(BigDecimal value) {
            addCriterion("demand_amount <>", value, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountGreaterThan(BigDecimal value) {
            addCriterion("demand_amount >", value, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("demand_amount >=", value, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountLessThan(BigDecimal value) {
            addCriterion("demand_amount <", value, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("demand_amount <=", value, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountIn(List<BigDecimal> values) {
            addCriterion("demand_amount in", values, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountNotIn(List<BigDecimal> values) {
            addCriterion("demand_amount not in", values, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("demand_amount between", value1, value2, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("demand_amount not between", value1, value2, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountIsNull() {
            addCriterion("real_amount is null");
            return (Criteria) this;
        }

        public Criteria andRealAmountIsNotNull() {
            addCriterion("real_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRealAmountEqualTo(BigDecimal value) {
            addCriterion("real_amount =", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotEqualTo(BigDecimal value) {
            addCriterion("real_amount <>", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountGreaterThan(BigDecimal value) {
            addCriterion("real_amount >", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_amount >=", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountLessThan(BigDecimal value) {
            addCriterion("real_amount <", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_amount <=", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountIn(List<BigDecimal> values) {
            addCriterion("real_amount in", values, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotIn(List<BigDecimal> values) {
            addCriterion("real_amount not in", values, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_amount between", value1, value2, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_amount not between", value1, value2, "realAmount");
            return (Criteria) this;
        }

        public Criteria andProcedureFinishTagIsNull() {
            addCriterion("procedure_finish_tag is null");
            return (Criteria) this;
        }

        public Criteria andProcedureFinishTagIsNotNull() {
            addCriterion("procedure_finish_tag is not null");
            return (Criteria) this;
        }

        public Criteria andProcedureFinishTagEqualTo(String value) {
            addCriterion("procedure_finish_tag =", value, "procedureFinishTag");
            return (Criteria) this;
        }

        public Criteria andProcedureFinishTagNotEqualTo(String value) {
            addCriterion("procedure_finish_tag <>", value, "procedureFinishTag");
            return (Criteria) this;
        }

        public Criteria andProcedureFinishTagGreaterThan(String value) {
            addCriterion("procedure_finish_tag >", value, "procedureFinishTag");
            return (Criteria) this;
        }

        public Criteria andProcedureFinishTagGreaterThanOrEqualTo(String value) {
            addCriterion("procedure_finish_tag >=", value, "procedureFinishTag");
            return (Criteria) this;
        }

        public Criteria andProcedureFinishTagLessThan(String value) {
            addCriterion("procedure_finish_tag <", value, "procedureFinishTag");
            return (Criteria) this;
        }

        public Criteria andProcedureFinishTagLessThanOrEqualTo(String value) {
            addCriterion("procedure_finish_tag <=", value, "procedureFinishTag");
            return (Criteria) this;
        }

        public Criteria andProcedureFinishTagLike(String value) {
            addCriterion("procedure_finish_tag like", value, "procedureFinishTag");
            return (Criteria) this;
        }

        public Criteria andProcedureFinishTagNotLike(String value) {
            addCriterion("procedure_finish_tag not like", value, "procedureFinishTag");
            return (Criteria) this;
        }

        public Criteria andProcedureFinishTagIn(List<String> values) {
            addCriterion("procedure_finish_tag in", values, "procedureFinishTag");
            return (Criteria) this;
        }

        public Criteria andProcedureFinishTagNotIn(List<String> values) {
            addCriterion("procedure_finish_tag not in", values, "procedureFinishTag");
            return (Criteria) this;
        }

        public Criteria andProcedureFinishTagBetween(String value1, String value2) {
            addCriterion("procedure_finish_tag between", value1, value2, "procedureFinishTag");
            return (Criteria) this;
        }

        public Criteria andProcedureFinishTagNotBetween(String value1, String value2) {
            addCriterion("procedure_finish_tag not between", value1, value2, "procedureFinishTag");
            return (Criteria) this;
        }

        public Criteria andProcedureTransferTagIsNull() {
            addCriterion("procedure_transfer_tag is null");
            return (Criteria) this;
        }

        public Criteria andProcedureTransferTagIsNotNull() {
            addCriterion("procedure_transfer_tag is not null");
            return (Criteria) this;
        }

        public Criteria andProcedureTransferTagEqualTo(String value) {
            addCriterion("procedure_transfer_tag =", value, "procedureTransferTag");
            return (Criteria) this;
        }

        public Criteria andProcedureTransferTagNotEqualTo(String value) {
            addCriterion("procedure_transfer_tag <>", value, "procedureTransferTag");
            return (Criteria) this;
        }

        public Criteria andProcedureTransferTagGreaterThan(String value) {
            addCriterion("procedure_transfer_tag >", value, "procedureTransferTag");
            return (Criteria) this;
        }

        public Criteria andProcedureTransferTagGreaterThanOrEqualTo(String value) {
            addCriterion("procedure_transfer_tag >=", value, "procedureTransferTag");
            return (Criteria) this;
        }

        public Criteria andProcedureTransferTagLessThan(String value) {
            addCriterion("procedure_transfer_tag <", value, "procedureTransferTag");
            return (Criteria) this;
        }

        public Criteria andProcedureTransferTagLessThanOrEqualTo(String value) {
            addCriterion("procedure_transfer_tag <=", value, "procedureTransferTag");
            return (Criteria) this;
        }

        public Criteria andProcedureTransferTagLike(String value) {
            addCriterion("procedure_transfer_tag like", value, "procedureTransferTag");
            return (Criteria) this;
        }

        public Criteria andProcedureTransferTagNotLike(String value) {
            addCriterion("procedure_transfer_tag not like", value, "procedureTransferTag");
            return (Criteria) this;
        }

        public Criteria andProcedureTransferTagIn(List<String> values) {
            addCriterion("procedure_transfer_tag in", values, "procedureTransferTag");
            return (Criteria) this;
        }

        public Criteria andProcedureTransferTagNotIn(List<String> values) {
            addCriterion("procedure_transfer_tag not in", values, "procedureTransferTag");
            return (Criteria) this;
        }

        public Criteria andProcedureTransferTagBetween(String value1, String value2) {
            addCriterion("procedure_transfer_tag between", value1, value2, "procedureTransferTag");
            return (Criteria) this;
        }

        public Criteria andProcedureTransferTagNotBetween(String value1, String value2) {
            addCriterion("procedure_transfer_tag not between", value1, value2, "procedureTransferTag");
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
