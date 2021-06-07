package com.guigu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManufactureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManufactureExample() {
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

        public Criteria andManufactureIdIsNull() {
            addCriterion("manufacture_id is null");
            return (Criteria) this;
        }

        public Criteria andManufactureIdIsNotNull() {
            addCriterion("manufacture_id is not null");
            return (Criteria) this;
        }

        public Criteria andManufactureIdEqualTo(String value) {
            addCriterion("manufacture_id =", value, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdNotEqualTo(String value) {
            addCriterion("manufacture_id <>", value, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdGreaterThan(String value) {
            addCriterion("manufacture_id >", value, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdGreaterThanOrEqualTo(String value) {
            addCriterion("manufacture_id >=", value, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdLessThan(String value) {
            addCriterion("manufacture_id <", value, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdLessThanOrEqualTo(String value) {
            addCriterion("manufacture_id <=", value, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdLike(String value) {
            addCriterion("manufacture_id like", value, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdNotLike(String value) {
            addCriterion("manufacture_id not like", value, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdIn(List<String> values) {
            addCriterion("manufacture_id in", values, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdNotIn(List<String> values) {
            addCriterion("manufacture_id not in", values, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdBetween(String value1, String value2) {
            addCriterion("manufacture_id between", value1, value2, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdNotBetween(String value1, String value2) {
            addCriterion("manufacture_id not between", value1, value2, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("product_id like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("product_id not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andTestedAmountIsNull() {
            addCriterion("tested_amount is null");
            return (Criteria) this;
        }

        public Criteria andTestedAmountIsNotNull() {
            addCriterion("tested_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTestedAmountEqualTo(BigDecimal value) {
            addCriterion("tested_amount =", value, "testedAmount");
            return (Criteria) this;
        }

        public Criteria andTestedAmountNotEqualTo(BigDecimal value) {
            addCriterion("tested_amount <>", value, "testedAmount");
            return (Criteria) this;
        }

        public Criteria andTestedAmountGreaterThan(BigDecimal value) {
            addCriterion("tested_amount >", value, "testedAmount");
            return (Criteria) this;
        }

        public Criteria andTestedAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tested_amount >=", value, "testedAmount");
            return (Criteria) this;
        }

        public Criteria andTestedAmountLessThan(BigDecimal value) {
            addCriterion("tested_amount <", value, "testedAmount");
            return (Criteria) this;
        }

        public Criteria andTestedAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tested_amount <=", value, "testedAmount");
            return (Criteria) this;
        }

        public Criteria andTestedAmountIn(List<BigDecimal> values) {
            addCriterion("tested_amount in", values, "testedAmount");
            return (Criteria) this;
        }

        public Criteria andTestedAmountNotIn(List<BigDecimal> values) {
            addCriterion("tested_amount not in", values, "testedAmount");
            return (Criteria) this;
        }

        public Criteria andTestedAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tested_amount between", value1, value2, "testedAmount");
            return (Criteria) this;
        }

        public Criteria andTestedAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tested_amount not between", value1, value2, "testedAmount");
            return (Criteria) this;
        }

        public Criteria andApplyIdGroupIsNull() {
            addCriterion("apply_id_group is null");
            return (Criteria) this;
        }

        public Criteria andApplyIdGroupIsNotNull() {
            addCriterion("apply_id_group is not null");
            return (Criteria) this;
        }

        public Criteria andApplyIdGroupEqualTo(String value) {
            addCriterion("apply_id_group =", value, "applyIdGroup");
            return (Criteria) this;
        }

        public Criteria andApplyIdGroupNotEqualTo(String value) {
            addCriterion("apply_id_group <>", value, "applyIdGroup");
            return (Criteria) this;
        }

        public Criteria andApplyIdGroupGreaterThan(String value) {
            addCriterion("apply_id_group >", value, "applyIdGroup");
            return (Criteria) this;
        }

        public Criteria andApplyIdGroupGreaterThanOrEqualTo(String value) {
            addCriterion("apply_id_group >=", value, "applyIdGroup");
            return (Criteria) this;
        }

        public Criteria andApplyIdGroupLessThan(String value) {
            addCriterion("apply_id_group <", value, "applyIdGroup");
            return (Criteria) this;
        }

        public Criteria andApplyIdGroupLessThanOrEqualTo(String value) {
            addCriterion("apply_id_group <=", value, "applyIdGroup");
            return (Criteria) this;
        }

        public Criteria andApplyIdGroupLike(String value) {
            addCriterion("apply_id_group like", value, "applyIdGroup");
            return (Criteria) this;
        }

        public Criteria andApplyIdGroupNotLike(String value) {
            addCriterion("apply_id_group not like", value, "applyIdGroup");
            return (Criteria) this;
        }

        public Criteria andApplyIdGroupIn(List<String> values) {
            addCriterion("apply_id_group in", values, "applyIdGroup");
            return (Criteria) this;
        }

        public Criteria andApplyIdGroupNotIn(List<String> values) {
            addCriterion("apply_id_group not in", values, "applyIdGroup");
            return (Criteria) this;
        }

        public Criteria andApplyIdGroupBetween(String value1, String value2) {
            addCriterion("apply_id_group between", value1, value2, "applyIdGroup");
            return (Criteria) this;
        }

        public Criteria andApplyIdGroupNotBetween(String value1, String value2) {
            addCriterion("apply_id_group not between", value1, value2, "applyIdGroup");
            return (Criteria) this;
        }

        public Criteria andProductDescribeIsNull() {
            addCriterion("product_describe is null");
            return (Criteria) this;
        }

        public Criteria andProductDescribeIsNotNull() {
            addCriterion("product_describe is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescribeEqualTo(String value) {
            addCriterion("product_describe =", value, "productDescribe");
            return (Criteria) this;
        }

        public Criteria andProductDescribeNotEqualTo(String value) {
            addCriterion("product_describe <>", value, "productDescribe");
            return (Criteria) this;
        }

        public Criteria andProductDescribeGreaterThan(String value) {
            addCriterion("product_describe >", value, "productDescribe");
            return (Criteria) this;
        }

        public Criteria andProductDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("product_describe >=", value, "productDescribe");
            return (Criteria) this;
        }

        public Criteria andProductDescribeLessThan(String value) {
            addCriterion("product_describe <", value, "productDescribe");
            return (Criteria) this;
        }

        public Criteria andProductDescribeLessThanOrEqualTo(String value) {
            addCriterion("product_describe <=", value, "productDescribe");
            return (Criteria) this;
        }

        public Criteria andProductDescribeLike(String value) {
            addCriterion("product_describe like", value, "productDescribe");
            return (Criteria) this;
        }

        public Criteria andProductDescribeNotLike(String value) {
            addCriterion("product_describe not like", value, "productDescribe");
            return (Criteria) this;
        }

        public Criteria andProductDescribeIn(List<String> values) {
            addCriterion("product_describe in", values, "productDescribe");
            return (Criteria) this;
        }

        public Criteria andProductDescribeNotIn(List<String> values) {
            addCriterion("product_describe not in", values, "productDescribe");
            return (Criteria) this;
        }

        public Criteria andProductDescribeBetween(String value1, String value2) {
            addCriterion("product_describe between", value1, value2, "productDescribe");
            return (Criteria) this;
        }

        public Criteria andProductDescribeNotBetween(String value1, String value2) {
            addCriterion("product_describe not between", value1, value2, "productDescribe");
            return (Criteria) this;
        }

        public Criteria andModuleCostPriceSumIsNull() {
            addCriterion("module_cost_price_sum is null");
            return (Criteria) this;
        }

        public Criteria andModuleCostPriceSumIsNotNull() {
            addCriterion("module_cost_price_sum is not null");
            return (Criteria) this;
        }

        public Criteria andModuleCostPriceSumEqualTo(BigDecimal value) {
            addCriterion("module_cost_price_sum =", value, "moduleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andModuleCostPriceSumNotEqualTo(BigDecimal value) {
            addCriterion("module_cost_price_sum <>", value, "moduleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andModuleCostPriceSumGreaterThan(BigDecimal value) {
            addCriterion("module_cost_price_sum >", value, "moduleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andModuleCostPriceSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("module_cost_price_sum >=", value, "moduleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andModuleCostPriceSumLessThan(BigDecimal value) {
            addCriterion("module_cost_price_sum <", value, "moduleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andModuleCostPriceSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("module_cost_price_sum <=", value, "moduleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andModuleCostPriceSumIn(List<BigDecimal> values) {
            addCriterion("module_cost_price_sum in", values, "moduleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andModuleCostPriceSumNotIn(List<BigDecimal> values) {
            addCriterion("module_cost_price_sum not in", values, "moduleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andModuleCostPriceSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("module_cost_price_sum between", value1, value2, "moduleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andModuleCostPriceSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("module_cost_price_sum not between", value1, value2, "moduleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andRealModuleCostPriceSumIsNull() {
            addCriterion("real_module_cost_price_sum is null");
            return (Criteria) this;
        }

        public Criteria andRealModuleCostPriceSumIsNotNull() {
            addCriterion("real_module_cost_price_sum is not null");
            return (Criteria) this;
        }

        public Criteria andRealModuleCostPriceSumEqualTo(BigDecimal value) {
            addCriterion("real_module_cost_price_sum =", value, "realModuleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andRealModuleCostPriceSumNotEqualTo(BigDecimal value) {
            addCriterion("real_module_cost_price_sum <>", value, "realModuleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andRealModuleCostPriceSumGreaterThan(BigDecimal value) {
            addCriterion("real_module_cost_price_sum >", value, "realModuleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andRealModuleCostPriceSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_module_cost_price_sum >=", value, "realModuleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andRealModuleCostPriceSumLessThan(BigDecimal value) {
            addCriterion("real_module_cost_price_sum <", value, "realModuleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andRealModuleCostPriceSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_module_cost_price_sum <=", value, "realModuleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andRealModuleCostPriceSumIn(List<BigDecimal> values) {
            addCriterion("real_module_cost_price_sum in", values, "realModuleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andRealModuleCostPriceSumNotIn(List<BigDecimal> values) {
            addCriterion("real_module_cost_price_sum not in", values, "realModuleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andRealModuleCostPriceSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_module_cost_price_sum between", value1, value2, "realModuleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andRealModuleCostPriceSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_module_cost_price_sum not between", value1, value2, "realModuleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andLabourCostPriceSumIsNull() {
            addCriterion("labour_cost_price_sum is null");
            return (Criteria) this;
        }

        public Criteria andLabourCostPriceSumIsNotNull() {
            addCriterion("labour_cost_price_sum is not null");
            return (Criteria) this;
        }

        public Criteria andLabourCostPriceSumEqualTo(BigDecimal value) {
            addCriterion("labour_cost_price_sum =", value, "labourCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andLabourCostPriceSumNotEqualTo(BigDecimal value) {
            addCriterion("labour_cost_price_sum <>", value, "labourCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andLabourCostPriceSumGreaterThan(BigDecimal value) {
            addCriterion("labour_cost_price_sum >", value, "labourCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andLabourCostPriceSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("labour_cost_price_sum >=", value, "labourCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andLabourCostPriceSumLessThan(BigDecimal value) {
            addCriterion("labour_cost_price_sum <", value, "labourCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andLabourCostPriceSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("labour_cost_price_sum <=", value, "labourCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andLabourCostPriceSumIn(List<BigDecimal> values) {
            addCriterion("labour_cost_price_sum in", values, "labourCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andLabourCostPriceSumNotIn(List<BigDecimal> values) {
            addCriterion("labour_cost_price_sum not in", values, "labourCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andLabourCostPriceSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("labour_cost_price_sum between", value1, value2, "labourCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andLabourCostPriceSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("labour_cost_price_sum not between", value1, value2, "labourCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andRealLabourCostPriceSumIsNull() {
            addCriterion("real_labour_cost_price_sum is null");
            return (Criteria) this;
        }

        public Criteria andRealLabourCostPriceSumIsNotNull() {
            addCriterion("real_labour_cost_price_sum is not null");
            return (Criteria) this;
        }

        public Criteria andRealLabourCostPriceSumEqualTo(BigDecimal value) {
            addCriterion("real_labour_cost_price_sum =", value, "realLabourCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andRealLabourCostPriceSumNotEqualTo(BigDecimal value) {
            addCriterion("real_labour_cost_price_sum <>", value, "realLabourCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andRealLabourCostPriceSumGreaterThan(BigDecimal value) {
            addCriterion("real_labour_cost_price_sum >", value, "realLabourCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andRealLabourCostPriceSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_labour_cost_price_sum >=", value, "realLabourCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andRealLabourCostPriceSumLessThan(BigDecimal value) {
            addCriterion("real_labour_cost_price_sum <", value, "realLabourCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andRealLabourCostPriceSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_labour_cost_price_sum <=", value, "realLabourCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andRealLabourCostPriceSumIn(List<BigDecimal> values) {
            addCriterion("real_labour_cost_price_sum in", values, "realLabourCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andRealLabourCostPriceSumNotIn(List<BigDecimal> values) {
            addCriterion("real_labour_cost_price_sum not in", values, "realLabourCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andRealLabourCostPriceSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_labour_cost_price_sum between", value1, value2, "realLabourCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andRealLabourCostPriceSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_labour_cost_price_sum not between", value1, value2, "realLabourCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andDesignerIsNull() {
            addCriterion("designer is null");
            return (Criteria) this;
        }

        public Criteria andDesignerIsNotNull() {
            addCriterion("designer is not null");
            return (Criteria) this;
        }

        public Criteria andDesignerEqualTo(String value) {
            addCriterion("designer =", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerNotEqualTo(String value) {
            addCriterion("designer <>", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerGreaterThan(String value) {
            addCriterion("designer >", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerGreaterThanOrEqualTo(String value) {
            addCriterion("designer >=", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerLessThan(String value) {
            addCriterion("designer <", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerLessThanOrEqualTo(String value) {
            addCriterion("designer <=", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerLike(String value) {
            addCriterion("designer like", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerNotLike(String value) {
            addCriterion("designer not like", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerIn(List<String> values) {
            addCriterion("designer in", values, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerNotIn(List<String> values) {
            addCriterion("designer not in", values, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerBetween(String value1, String value2) {
            addCriterion("designer between", value1, value2, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerNotBetween(String value1, String value2) {
            addCriterion("designer not between", value1, value2, "designer");
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

        public Criteria andCheckTagIsNull() {
            addCriterion("check_tag is null");
            return (Criteria) this;
        }

        public Criteria andCheckTagIsNotNull() {
            addCriterion("check_tag is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTagEqualTo(String value) {
            addCriterion("check_tag =", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagNotEqualTo(String value) {
            addCriterion("check_tag <>", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagGreaterThan(String value) {
            addCriterion("check_tag >", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagGreaterThanOrEqualTo(String value) {
            addCriterion("check_tag >=", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagLessThan(String value) {
            addCriterion("check_tag <", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagLessThanOrEqualTo(String value) {
            addCriterion("check_tag <=", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagLike(String value) {
            addCriterion("check_tag like", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagNotLike(String value) {
            addCriterion("check_tag not like", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagIn(List<String> values) {
            addCriterion("check_tag in", values, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagNotIn(List<String> values) {
            addCriterion("check_tag not in", values, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagBetween(String value1, String value2) {
            addCriterion("check_tag between", value1, value2, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagNotBetween(String value1, String value2) {
            addCriterion("check_tag not between", value1, value2, "checkTag");
            return (Criteria) this;
        }

        public Criteria andManufactureProcedureTagIsNull() {
            addCriterion("manufacture_procedure_tag is null");
            return (Criteria) this;
        }

        public Criteria andManufactureProcedureTagIsNotNull() {
            addCriterion("manufacture_procedure_tag is not null");
            return (Criteria) this;
        }

        public Criteria andManufactureProcedureTagEqualTo(String value) {
            addCriterion("manufacture_procedure_tag =", value, "manufactureProcedureTag");
            return (Criteria) this;
        }

        public Criteria andManufactureProcedureTagNotEqualTo(String value) {
            addCriterion("manufacture_procedure_tag <>", value, "manufactureProcedureTag");
            return (Criteria) this;
        }

        public Criteria andManufactureProcedureTagGreaterThan(String value) {
            addCriterion("manufacture_procedure_tag >", value, "manufactureProcedureTag");
            return (Criteria) this;
        }

        public Criteria andManufactureProcedureTagGreaterThanOrEqualTo(String value) {
            addCriterion("manufacture_procedure_tag >=", value, "manufactureProcedureTag");
            return (Criteria) this;
        }

        public Criteria andManufactureProcedureTagLessThan(String value) {
            addCriterion("manufacture_procedure_tag <", value, "manufactureProcedureTag");
            return (Criteria) this;
        }

        public Criteria andManufactureProcedureTagLessThanOrEqualTo(String value) {
            addCriterion("manufacture_procedure_tag <=", value, "manufactureProcedureTag");
            return (Criteria) this;
        }

        public Criteria andManufactureProcedureTagLike(String value) {
            addCriterion("manufacture_procedure_tag like", value, "manufactureProcedureTag");
            return (Criteria) this;
        }

        public Criteria andManufactureProcedureTagNotLike(String value) {
            addCriterion("manufacture_procedure_tag not like", value, "manufactureProcedureTag");
            return (Criteria) this;
        }

        public Criteria andManufactureProcedureTagIn(List<String> values) {
            addCriterion("manufacture_procedure_tag in", values, "manufactureProcedureTag");
            return (Criteria) this;
        }

        public Criteria andManufactureProcedureTagNotIn(List<String> values) {
            addCriterion("manufacture_procedure_tag not in", values, "manufactureProcedureTag");
            return (Criteria) this;
        }

        public Criteria andManufactureProcedureTagBetween(String value1, String value2) {
            addCriterion("manufacture_procedure_tag between", value1, value2, "manufactureProcedureTag");
            return (Criteria) this;
        }

        public Criteria andManufactureProcedureTagNotBetween(String value1, String value2) {
            addCriterion("manufacture_procedure_tag not between", value1, value2, "manufactureProcedureTag");
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
