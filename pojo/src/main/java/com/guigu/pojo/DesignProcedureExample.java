package com.guigu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DesignProcedureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DesignProcedureExample() {
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

        public Criteria andDesignIdIsNull() {
            addCriterion("design_id is null");
            return (Criteria) this;
        }

        public Criteria andDesignIdIsNotNull() {
            addCriterion("design_id is not null");
            return (Criteria) this;
        }

        public Criteria andDesignIdEqualTo(String value) {
            addCriterion("design_id =", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdNotEqualTo(String value) {
            addCriterion("design_id <>", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdGreaterThan(String value) {
            addCriterion("design_id >", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdGreaterThanOrEqualTo(String value) {
            addCriterion("design_id >=", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdLessThan(String value) {
            addCriterion("design_id <", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdLessThanOrEqualTo(String value) {
            addCriterion("design_id <=", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdLike(String value) {
            addCriterion("design_id like", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdNotLike(String value) {
            addCriterion("design_id not like", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdIn(List<String> values) {
            addCriterion("design_id in", values, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdNotIn(List<String> values) {
            addCriterion("design_id not in", values, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdBetween(String value1, String value2) {
            addCriterion("design_id between", value1, value2, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdNotBetween(String value1, String value2) {
            addCriterion("design_id not between", value1, value2, "designId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdIsNull() {
            addCriterion("first_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdIsNotNull() {
            addCriterion("first_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdEqualTo(String value) {
            addCriterion("first_kind_id =", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdNotEqualTo(String value) {
            addCriterion("first_kind_id <>", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdGreaterThan(String value) {
            addCriterion("first_kind_id >", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("first_kind_id >=", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdLessThan(String value) {
            addCriterion("first_kind_id <", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdLessThanOrEqualTo(String value) {
            addCriterion("first_kind_id <=", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdLike(String value) {
            addCriterion("first_kind_id like", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdNotLike(String value) {
            addCriterion("first_kind_id not like", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdIn(List<String> values) {
            addCriterion("first_kind_id in", values, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdNotIn(List<String> values) {
            addCriterion("first_kind_id not in", values, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdBetween(String value1, String value2) {
            addCriterion("first_kind_id between", value1, value2, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdNotBetween(String value1, String value2) {
            addCriterion("first_kind_id not between", value1, value2, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameIsNull() {
            addCriterion("first_kind_name is null");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameIsNotNull() {
            addCriterion("first_kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameEqualTo(String value) {
            addCriterion("first_kind_name =", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameNotEqualTo(String value) {
            addCriterion("first_kind_name <>", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameGreaterThan(String value) {
            addCriterion("first_kind_name >", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("first_kind_name >=", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameLessThan(String value) {
            addCriterion("first_kind_name <", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameLessThanOrEqualTo(String value) {
            addCriterion("first_kind_name <=", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameLike(String value) {
            addCriterion("first_kind_name like", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameNotLike(String value) {
            addCriterion("first_kind_name not like", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameIn(List<String> values) {
            addCriterion("first_kind_name in", values, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameNotIn(List<String> values) {
            addCriterion("first_kind_name not in", values, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameBetween(String value1, String value2) {
            addCriterion("first_kind_name between", value1, value2, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameNotBetween(String value1, String value2) {
            addCriterion("first_kind_name not between", value1, value2, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdIsNull() {
            addCriterion("second_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdIsNotNull() {
            addCriterion("second_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdEqualTo(String value) {
            addCriterion("second_kind_id =", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotEqualTo(String value) {
            addCriterion("second_kind_id <>", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdGreaterThan(String value) {
            addCriterion("second_kind_id >", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("second_kind_id >=", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdLessThan(String value) {
            addCriterion("second_kind_id <", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdLessThanOrEqualTo(String value) {
            addCriterion("second_kind_id <=", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdLike(String value) {
            addCriterion("second_kind_id like", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotLike(String value) {
            addCriterion("second_kind_id not like", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdIn(List<String> values) {
            addCriterion("second_kind_id in", values, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotIn(List<String> values) {
            addCriterion("second_kind_id not in", values, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdBetween(String value1, String value2) {
            addCriterion("second_kind_id between", value1, value2, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotBetween(String value1, String value2) {
            addCriterion("second_kind_id not between", value1, value2, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameIsNull() {
            addCriterion("second_kind_name is null");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameIsNotNull() {
            addCriterion("second_kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameEqualTo(String value) {
            addCriterion("second_kind_name =", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameNotEqualTo(String value) {
            addCriterion("second_kind_name <>", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameGreaterThan(String value) {
            addCriterion("second_kind_name >", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("second_kind_name >=", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameLessThan(String value) {
            addCriterion("second_kind_name <", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameLessThanOrEqualTo(String value) {
            addCriterion("second_kind_name <=", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameLike(String value) {
            addCriterion("second_kind_name like", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameNotLike(String value) {
            addCriterion("second_kind_name not like", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameIn(List<String> values) {
            addCriterion("second_kind_name in", values, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameNotIn(List<String> values) {
            addCriterion("second_kind_name not in", values, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameBetween(String value1, String value2) {
            addCriterion("second_kind_name between", value1, value2, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameNotBetween(String value1, String value2) {
            addCriterion("second_kind_name not between", value1, value2, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdIsNull() {
            addCriterion("third_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdIsNotNull() {
            addCriterion("third_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdEqualTo(String value) {
            addCriterion("third_kind_id =", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdNotEqualTo(String value) {
            addCriterion("third_kind_id <>", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdGreaterThan(String value) {
            addCriterion("third_kind_id >", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("third_kind_id >=", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdLessThan(String value) {
            addCriterion("third_kind_id <", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdLessThanOrEqualTo(String value) {
            addCriterion("third_kind_id <=", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdLike(String value) {
            addCriterion("third_kind_id like", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdNotLike(String value) {
            addCriterion("third_kind_id not like", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdIn(List<String> values) {
            addCriterion("third_kind_id in", values, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdNotIn(List<String> values) {
            addCriterion("third_kind_id not in", values, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdBetween(String value1, String value2) {
            addCriterion("third_kind_id between", value1, value2, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdNotBetween(String value1, String value2) {
            addCriterion("third_kind_id not between", value1, value2, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameIsNull() {
            addCriterion("third_kind_name is null");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameIsNotNull() {
            addCriterion("third_kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameEqualTo(String value) {
            addCriterion("third_kind_name =", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameNotEqualTo(String value) {
            addCriterion("third_kind_name <>", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameGreaterThan(String value) {
            addCriterion("third_kind_name >", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("third_kind_name >=", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameLessThan(String value) {
            addCriterion("third_kind_name <", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameLessThanOrEqualTo(String value) {
            addCriterion("third_kind_name <=", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameLike(String value) {
            addCriterion("third_kind_name like", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameNotLike(String value) {
            addCriterion("third_kind_name not like", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameIn(List<String> values) {
            addCriterion("third_kind_name in", values, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameNotIn(List<String> values) {
            addCriterion("third_kind_name not in", values, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameBetween(String value1, String value2) {
            addCriterion("third_kind_name between", value1, value2, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameNotBetween(String value1, String value2) {
            addCriterion("third_kind_name not between", value1, value2, "thirdKindName");
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

        public Criteria andCheckSuggestionIsNull() {
            addCriterion("check_suggestion is null");
            return (Criteria) this;
        }

        public Criteria andCheckSuggestionIsNotNull() {
            addCriterion("check_suggestion is not null");
            return (Criteria) this;
        }

        public Criteria andCheckSuggestionEqualTo(String value) {
            addCriterion("check_suggestion =", value, "checkSuggestion");
            return (Criteria) this;
        }

        public Criteria andCheckSuggestionNotEqualTo(String value) {
            addCriterion("check_suggestion <>", value, "checkSuggestion");
            return (Criteria) this;
        }

        public Criteria andCheckSuggestionGreaterThan(String value) {
            addCriterion("check_suggestion >", value, "checkSuggestion");
            return (Criteria) this;
        }

        public Criteria andCheckSuggestionGreaterThanOrEqualTo(String value) {
            addCriterion("check_suggestion >=", value, "checkSuggestion");
            return (Criteria) this;
        }

        public Criteria andCheckSuggestionLessThan(String value) {
            addCriterion("check_suggestion <", value, "checkSuggestion");
            return (Criteria) this;
        }

        public Criteria andCheckSuggestionLessThanOrEqualTo(String value) {
            addCriterion("check_suggestion <=", value, "checkSuggestion");
            return (Criteria) this;
        }

        public Criteria andCheckSuggestionLike(String value) {
            addCriterion("check_suggestion like", value, "checkSuggestion");
            return (Criteria) this;
        }

        public Criteria andCheckSuggestionNotLike(String value) {
            addCriterion("check_suggestion not like", value, "checkSuggestion");
            return (Criteria) this;
        }

        public Criteria andCheckSuggestionIn(List<String> values) {
            addCriterion("check_suggestion in", values, "checkSuggestion");
            return (Criteria) this;
        }

        public Criteria andCheckSuggestionNotIn(List<String> values) {
            addCriterion("check_suggestion not in", values, "checkSuggestion");
            return (Criteria) this;
        }

        public Criteria andCheckSuggestionBetween(String value1, String value2) {
            addCriterion("check_suggestion between", value1, value2, "checkSuggestion");
            return (Criteria) this;
        }

        public Criteria andCheckSuggestionNotBetween(String value1, String value2) {
            addCriterion("check_suggestion not between", value1, value2, "checkSuggestion");
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

        public Criteria andChangerIsNull() {
            addCriterion("changer is null");
            return (Criteria) this;
        }

        public Criteria andChangerIsNotNull() {
            addCriterion("changer is not null");
            return (Criteria) this;
        }

        public Criteria andChangerEqualTo(String value) {
            addCriterion("changer =", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerNotEqualTo(String value) {
            addCriterion("changer <>", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerGreaterThan(String value) {
            addCriterion("changer >", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerGreaterThanOrEqualTo(String value) {
            addCriterion("changer >=", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerLessThan(String value) {
            addCriterion("changer <", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerLessThanOrEqualTo(String value) {
            addCriterion("changer <=", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerLike(String value) {
            addCriterion("changer like", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerNotLike(String value) {
            addCriterion("changer not like", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerIn(List<String> values) {
            addCriterion("changer in", values, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerNotIn(List<String> values) {
            addCriterion("changer not in", values, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerBetween(String value1, String value2) {
            addCriterion("changer between", value1, value2, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerNotBetween(String value1, String value2) {
            addCriterion("changer not between", value1, value2, "changer");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIsNull() {
            addCriterion("change_time is null");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIsNotNull() {
            addCriterion("change_time is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTimeEqualTo(Date value) {
            addCriterion("change_time =", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotEqualTo(Date value) {
            addCriterion("change_time <>", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeGreaterThan(Date value) {
            addCriterion("change_time >", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("change_time >=", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLessThan(Date value) {
            addCriterion("change_time <", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLessThanOrEqualTo(Date value) {
            addCriterion("change_time <=", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIn(List<Date> values) {
            addCriterion("change_time in", values, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotIn(List<Date> values) {
            addCriterion("change_time not in", values, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeBetween(Date value1, Date value2) {
            addCriterion("change_time between", value1, value2, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotBetween(Date value1, Date value2) {
            addCriterion("change_time not between", value1, value2, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTagIsNull() {
            addCriterion("change_tag is null");
            return (Criteria) this;
        }

        public Criteria andChangeTagIsNotNull() {
            addCriterion("change_tag is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTagEqualTo(String value) {
            addCriterion("change_tag =", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagNotEqualTo(String value) {
            addCriterion("change_tag <>", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagGreaterThan(String value) {
            addCriterion("change_tag >", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagGreaterThanOrEqualTo(String value) {
            addCriterion("change_tag >=", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagLessThan(String value) {
            addCriterion("change_tag <", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagLessThanOrEqualTo(String value) {
            addCriterion("change_tag <=", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagLike(String value) {
            addCriterion("change_tag like", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagNotLike(String value) {
            addCriterion("change_tag not like", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagIn(List<String> values) {
            addCriterion("change_tag in", values, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagNotIn(List<String> values) {
            addCriterion("change_tag not in", values, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagBetween(String value1, String value2) {
            addCriterion("change_tag between", value1, value2, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagNotBetween(String value1, String value2) {
            addCriterion("change_tag not between", value1, value2, "changeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagIsNull() {
            addCriterion("design_module_tag is null");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagIsNotNull() {
            addCriterion("design_module_tag is not null");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagEqualTo(String value) {
            addCriterion("design_module_tag =", value, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagNotEqualTo(String value) {
            addCriterion("design_module_tag <>", value, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagGreaterThan(String value) {
            addCriterion("design_module_tag >", value, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagGreaterThanOrEqualTo(String value) {
            addCriterion("design_module_tag >=", value, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagLessThan(String value) {
            addCriterion("design_module_tag <", value, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagLessThanOrEqualTo(String value) {
            addCriterion("design_module_tag <=", value, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagLike(String value) {
            addCriterion("design_module_tag like", value, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagNotLike(String value) {
            addCriterion("design_module_tag not like", value, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagIn(List<String> values) {
            addCriterion("design_module_tag in", values, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagNotIn(List<String> values) {
            addCriterion("design_module_tag not in", values, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagBetween(String value1, String value2) {
            addCriterion("design_module_tag between", value1, value2, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagNotBetween(String value1, String value2) {
            addCriterion("design_module_tag not between", value1, value2, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagIsNull() {
            addCriterion("design_module_change_tag is null");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagIsNotNull() {
            addCriterion("design_module_change_tag is not null");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagEqualTo(String value) {
            addCriterion("design_module_change_tag =", value, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagNotEqualTo(String value) {
            addCriterion("design_module_change_tag <>", value, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagGreaterThan(String value) {
            addCriterion("design_module_change_tag >", value, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagGreaterThanOrEqualTo(String value) {
            addCriterion("design_module_change_tag >=", value, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagLessThan(String value) {
            addCriterion("design_module_change_tag <", value, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagLessThanOrEqualTo(String value) {
            addCriterion("design_module_change_tag <=", value, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagLike(String value) {
            addCriterion("design_module_change_tag like", value, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagNotLike(String value) {
            addCriterion("design_module_change_tag not like", value, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagIn(List<String> values) {
            addCriterion("design_module_change_tag in", values, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagNotIn(List<String> values) {
            addCriterion("design_module_change_tag not in", values, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagBetween(String value1, String value2) {
            addCriterion("design_module_change_tag between", value1, value2, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagNotBetween(String value1, String value2) {
            addCriterion("design_module_change_tag not between", value1, value2, "designModuleChangeTag");
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
