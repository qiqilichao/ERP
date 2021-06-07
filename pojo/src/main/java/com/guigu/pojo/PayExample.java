package com.guigu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayExample() {
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

        public Criteria andPayIdIsNull() {
            addCriterion("pay_id is null");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNotNull() {
            addCriterion("pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdEqualTo(String value) {
            addCriterion("pay_id =", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotEqualTo(String value) {
            addCriterion("pay_id <>", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThan(String value) {
            addCriterion("pay_id >", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThanOrEqualTo(String value) {
            addCriterion("pay_id >=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThan(String value) {
            addCriterion("pay_id <", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThanOrEqualTo(String value) {
            addCriterion("pay_id <=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLike(String value) {
            addCriterion("pay_id like", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotLike(String value) {
            addCriterion("pay_id not like", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdIn(List<String> values) {
            addCriterion("pay_id in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotIn(List<String> values) {
            addCriterion("pay_id not in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdBetween(String value1, String value2) {
            addCriterion("pay_id between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotBetween(String value1, String value2) {
            addCriterion("pay_id not between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andStorerIsNull() {
            addCriterion("storer is null");
            return (Criteria) this;
        }

        public Criteria andStorerIsNotNull() {
            addCriterion("storer is not null");
            return (Criteria) this;
        }

        public Criteria andStorerEqualTo(String value) {
            addCriterion("storer =", value, "storer");
            return (Criteria) this;
        }

        public Criteria andStorerNotEqualTo(String value) {
            addCriterion("storer <>", value, "storer");
            return (Criteria) this;
        }

        public Criteria andStorerGreaterThan(String value) {
            addCriterion("storer >", value, "storer");
            return (Criteria) this;
        }

        public Criteria andStorerGreaterThanOrEqualTo(String value) {
            addCriterion("storer >=", value, "storer");
            return (Criteria) this;
        }

        public Criteria andStorerLessThan(String value) {
            addCriterion("storer <", value, "storer");
            return (Criteria) this;
        }

        public Criteria andStorerLessThanOrEqualTo(String value) {
            addCriterion("storer <=", value, "storer");
            return (Criteria) this;
        }

        public Criteria andStorerLike(String value) {
            addCriterion("storer like", value, "storer");
            return (Criteria) this;
        }

        public Criteria andStorerNotLike(String value) {
            addCriterion("storer not like", value, "storer");
            return (Criteria) this;
        }

        public Criteria andStorerIn(List<String> values) {
            addCriterion("storer in", values, "storer");
            return (Criteria) this;
        }

        public Criteria andStorerNotIn(List<String> values) {
            addCriterion("storer not in", values, "storer");
            return (Criteria) this;
        }

        public Criteria andStorerBetween(String value1, String value2) {
            addCriterion("storer between", value1, value2, "storer");
            return (Criteria) this;
        }

        public Criteria andStorerNotBetween(String value1, String value2) {
            addCriterion("storer not between", value1, value2, "storer");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonexactIsNull() {
            addCriterion("reasonexact is null");
            return (Criteria) this;
        }

        public Criteria andReasonexactIsNotNull() {
            addCriterion("reasonexact is not null");
            return (Criteria) this;
        }

        public Criteria andReasonexactEqualTo(String value) {
            addCriterion("reasonexact =", value, "reasonexact");
            return (Criteria) this;
        }

        public Criteria andReasonexactNotEqualTo(String value) {
            addCriterion("reasonexact <>", value, "reasonexact");
            return (Criteria) this;
        }

        public Criteria andReasonexactGreaterThan(String value) {
            addCriterion("reasonexact >", value, "reasonexact");
            return (Criteria) this;
        }

        public Criteria andReasonexactGreaterThanOrEqualTo(String value) {
            addCriterion("reasonexact >=", value, "reasonexact");
            return (Criteria) this;
        }

        public Criteria andReasonexactLessThan(String value) {
            addCriterion("reasonexact <", value, "reasonexact");
            return (Criteria) this;
        }

        public Criteria andReasonexactLessThanOrEqualTo(String value) {
            addCriterion("reasonexact <=", value, "reasonexact");
            return (Criteria) this;
        }

        public Criteria andReasonexactLike(String value) {
            addCriterion("reasonexact like", value, "reasonexact");
            return (Criteria) this;
        }

        public Criteria andReasonexactNotLike(String value) {
            addCriterion("reasonexact not like", value, "reasonexact");
            return (Criteria) this;
        }

        public Criteria andReasonexactIn(List<String> values) {
            addCriterion("reasonexact in", values, "reasonexact");
            return (Criteria) this;
        }

        public Criteria andReasonexactNotIn(List<String> values) {
            addCriterion("reasonexact not in", values, "reasonexact");
            return (Criteria) this;
        }

        public Criteria andReasonexactBetween(String value1, String value2) {
            addCriterion("reasonexact between", value1, value2, "reasonexact");
            return (Criteria) this;
        }

        public Criteria andReasonexactNotBetween(String value1, String value2) {
            addCriterion("reasonexact not between", value1, value2, "reasonexact");
            return (Criteria) this;
        }

        public Criteria andAmountSumIsNull() {
            addCriterion("amount_sum is null");
            return (Criteria) this;
        }

        public Criteria andAmountSumIsNotNull() {
            addCriterion("amount_sum is not null");
            return (Criteria) this;
        }

        public Criteria andAmountSumEqualTo(BigDecimal value) {
            addCriterion("amount_sum =", value, "amountSum");
            return (Criteria) this;
        }

        public Criteria andAmountSumNotEqualTo(BigDecimal value) {
            addCriterion("amount_sum <>", value, "amountSum");
            return (Criteria) this;
        }

        public Criteria andAmountSumGreaterThan(BigDecimal value) {
            addCriterion("amount_sum >", value, "amountSum");
            return (Criteria) this;
        }

        public Criteria andAmountSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount_sum >=", value, "amountSum");
            return (Criteria) this;
        }

        public Criteria andAmountSumLessThan(BigDecimal value) {
            addCriterion("amount_sum <", value, "amountSum");
            return (Criteria) this;
        }

        public Criteria andAmountSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount_sum <=", value, "amountSum");
            return (Criteria) this;
        }

        public Criteria andAmountSumIn(List<BigDecimal> values) {
            addCriterion("amount_sum in", values, "amountSum");
            return (Criteria) this;
        }

        public Criteria andAmountSumNotIn(List<BigDecimal> values) {
            addCriterion("amount_sum not in", values, "amountSum");
            return (Criteria) this;
        }

        public Criteria andAmountSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount_sum between", value1, value2, "amountSum");
            return (Criteria) this;
        }

        public Criteria andAmountSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount_sum not between", value1, value2, "amountSum");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumIsNull() {
            addCriterion("cost_price_sum is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumIsNotNull() {
            addCriterion("cost_price_sum is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumEqualTo(BigDecimal value) {
            addCriterion("cost_price_sum =", value, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumNotEqualTo(BigDecimal value) {
            addCriterion("cost_price_sum <>", value, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumGreaterThan(BigDecimal value) {
            addCriterion("cost_price_sum >", value, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_price_sum >=", value, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumLessThan(BigDecimal value) {
            addCriterion("cost_price_sum <", value, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_price_sum <=", value, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumIn(List<BigDecimal> values) {
            addCriterion("cost_price_sum in", values, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumNotIn(List<BigDecimal> values) {
            addCriterion("cost_price_sum not in", values, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_price_sum between", value1, value2, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_price_sum not between", value1, value2, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andPaidAmountSumIsNull() {
            addCriterion("paid_amount_sum is null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountSumIsNotNull() {
            addCriterion("paid_amount_sum is not null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountSumEqualTo(BigDecimal value) {
            addCriterion("paid_amount_sum =", value, "paidAmountSum");
            return (Criteria) this;
        }

        public Criteria andPaidAmountSumNotEqualTo(BigDecimal value) {
            addCriterion("paid_amount_sum <>", value, "paidAmountSum");
            return (Criteria) this;
        }

        public Criteria andPaidAmountSumGreaterThan(BigDecimal value) {
            addCriterion("paid_amount_sum >", value, "paidAmountSum");
            return (Criteria) this;
        }

        public Criteria andPaidAmountSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("paid_amount_sum >=", value, "paidAmountSum");
            return (Criteria) this;
        }

        public Criteria andPaidAmountSumLessThan(BigDecimal value) {
            addCriterion("paid_amount_sum <", value, "paidAmountSum");
            return (Criteria) this;
        }

        public Criteria andPaidAmountSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("paid_amount_sum <=", value, "paidAmountSum");
            return (Criteria) this;
        }

        public Criteria andPaidAmountSumIn(List<BigDecimal> values) {
            addCriterion("paid_amount_sum in", values, "paidAmountSum");
            return (Criteria) this;
        }

        public Criteria andPaidAmountSumNotIn(List<BigDecimal> values) {
            addCriterion("paid_amount_sum not in", values, "paidAmountSum");
            return (Criteria) this;
        }

        public Criteria andPaidAmountSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paid_amount_sum between", value1, value2, "paidAmountSum");
            return (Criteria) this;
        }

        public Criteria andPaidAmountSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paid_amount_sum not between", value1, value2, "paidAmountSum");
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

        public Criteria andAttemperIsNull() {
            addCriterion("attemper is null");
            return (Criteria) this;
        }

        public Criteria andAttemperIsNotNull() {
            addCriterion("attemper is not null");
            return (Criteria) this;
        }

        public Criteria andAttemperEqualTo(String value) {
            addCriterion("attemper =", value, "attemper");
            return (Criteria) this;
        }

        public Criteria andAttemperNotEqualTo(String value) {
            addCriterion("attemper <>", value, "attemper");
            return (Criteria) this;
        }

        public Criteria andAttemperGreaterThan(String value) {
            addCriterion("attemper >", value, "attemper");
            return (Criteria) this;
        }

        public Criteria andAttemperGreaterThanOrEqualTo(String value) {
            addCriterion("attemper >=", value, "attemper");
            return (Criteria) this;
        }

        public Criteria andAttemperLessThan(String value) {
            addCriterion("attemper <", value, "attemper");
            return (Criteria) this;
        }

        public Criteria andAttemperLessThanOrEqualTo(String value) {
            addCriterion("attemper <=", value, "attemper");
            return (Criteria) this;
        }

        public Criteria andAttemperLike(String value) {
            addCriterion("attemper like", value, "attemper");
            return (Criteria) this;
        }

        public Criteria andAttemperNotLike(String value) {
            addCriterion("attemper not like", value, "attemper");
            return (Criteria) this;
        }

        public Criteria andAttemperIn(List<String> values) {
            addCriterion("attemper in", values, "attemper");
            return (Criteria) this;
        }

        public Criteria andAttemperNotIn(List<String> values) {
            addCriterion("attemper not in", values, "attemper");
            return (Criteria) this;
        }

        public Criteria andAttemperBetween(String value1, String value2) {
            addCriterion("attemper between", value1, value2, "attemper");
            return (Criteria) this;
        }

        public Criteria andAttemperNotBetween(String value1, String value2) {
            addCriterion("attemper not between", value1, value2, "attemper");
            return (Criteria) this;
        }

        public Criteria andAttemperTimeIsNull() {
            addCriterion("attemper_time is null");
            return (Criteria) this;
        }

        public Criteria andAttemperTimeIsNotNull() {
            addCriterion("attemper_time is not null");
            return (Criteria) this;
        }

        public Criteria andAttemperTimeEqualTo(Date value) {
            addCriterion("attemper_time =", value, "attemperTime");
            return (Criteria) this;
        }

        public Criteria andAttemperTimeNotEqualTo(Date value) {
            addCriterion("attemper_time <>", value, "attemperTime");
            return (Criteria) this;
        }

        public Criteria andAttemperTimeGreaterThan(Date value) {
            addCriterion("attemper_time >", value, "attemperTime");
            return (Criteria) this;
        }

        public Criteria andAttemperTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("attemper_time >=", value, "attemperTime");
            return (Criteria) this;
        }

        public Criteria andAttemperTimeLessThan(Date value) {
            addCriterion("attemper_time <", value, "attemperTime");
            return (Criteria) this;
        }

        public Criteria andAttemperTimeLessThanOrEqualTo(Date value) {
            addCriterion("attemper_time <=", value, "attemperTime");
            return (Criteria) this;
        }

        public Criteria andAttemperTimeIn(List<Date> values) {
            addCriterion("attemper_time in", values, "attemperTime");
            return (Criteria) this;
        }

        public Criteria andAttemperTimeNotIn(List<Date> values) {
            addCriterion("attemper_time not in", values, "attemperTime");
            return (Criteria) this;
        }

        public Criteria andAttemperTimeBetween(Date value1, Date value2) {
            addCriterion("attemper_time between", value1, value2, "attemperTime");
            return (Criteria) this;
        }

        public Criteria andAttemperTimeNotBetween(Date value1, Date value2) {
            addCriterion("attemper_time not between", value1, value2, "attemperTime");
            return (Criteria) this;
        }

        public Criteria andPayTagIsNull() {
            addCriterion("pay_tag is null");
            return (Criteria) this;
        }

        public Criteria andPayTagIsNotNull() {
            addCriterion("pay_tag is not null");
            return (Criteria) this;
        }

        public Criteria andPayTagEqualTo(String value) {
            addCriterion("pay_tag =", value, "payTag");
            return (Criteria) this;
        }

        public Criteria andPayTagNotEqualTo(String value) {
            addCriterion("pay_tag <>", value, "payTag");
            return (Criteria) this;
        }

        public Criteria andPayTagGreaterThan(String value) {
            addCriterion("pay_tag >", value, "payTag");
            return (Criteria) this;
        }

        public Criteria andPayTagGreaterThanOrEqualTo(String value) {
            addCriterion("pay_tag >=", value, "payTag");
            return (Criteria) this;
        }

        public Criteria andPayTagLessThan(String value) {
            addCriterion("pay_tag <", value, "payTag");
            return (Criteria) this;
        }

        public Criteria andPayTagLessThanOrEqualTo(String value) {
            addCriterion("pay_tag <=", value, "payTag");
            return (Criteria) this;
        }

        public Criteria andPayTagLike(String value) {
            addCriterion("pay_tag like", value, "payTag");
            return (Criteria) this;
        }

        public Criteria andPayTagNotLike(String value) {
            addCriterion("pay_tag not like", value, "payTag");
            return (Criteria) this;
        }

        public Criteria andPayTagIn(List<String> values) {
            addCriterion("pay_tag in", values, "payTag");
            return (Criteria) this;
        }

        public Criteria andPayTagNotIn(List<String> values) {
            addCriterion("pay_tag not in", values, "payTag");
            return (Criteria) this;
        }

        public Criteria andPayTagBetween(String value1, String value2) {
            addCriterion("pay_tag between", value1, value2, "payTag");
            return (Criteria) this;
        }

        public Criteria andPayTagNotBetween(String value1, String value2) {
            addCriterion("pay_tag not between", value1, value2, "payTag");
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
