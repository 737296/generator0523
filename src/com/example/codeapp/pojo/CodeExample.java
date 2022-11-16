package com.example.codeapp.pojo;

import java.util.ArrayList;
import java.util.List;

public class CodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CodeExample() {
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

        public Criteria andCodeduseridIsNull() {
            addCriterion("codeduserid is null");
            return (Criteria) this;
        }

        public Criteria andCodeduseridIsNotNull() {
            addCriterion("codeduserid is not null");
            return (Criteria) this;
        }

        public Criteria andCodeduseridEqualTo(Integer value) {
            addCriterion("codeduserid =", value, "codeduserid");
            return (Criteria) this;
        }

        public Criteria andCodeduseridNotEqualTo(Integer value) {
            addCriterion("codeduserid <>", value, "codeduserid");
            return (Criteria) this;
        }

        public Criteria andCodeduseridGreaterThan(Integer value) {
            addCriterion("codeduserid >", value, "codeduserid");
            return (Criteria) this;
        }

        public Criteria andCodeduseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("codeduserid >=", value, "codeduserid");
            return (Criteria) this;
        }

        public Criteria andCodeduseridLessThan(Integer value) {
            addCriterion("codeduserid <", value, "codeduserid");
            return (Criteria) this;
        }

        public Criteria andCodeduseridLessThanOrEqualTo(Integer value) {
            addCriterion("codeduserid <=", value, "codeduserid");
            return (Criteria) this;
        }

        public Criteria andCodeduseridIn(List<Integer> values) {
            addCriterion("codeduserid in", values, "codeduserid");
            return (Criteria) this;
        }

        public Criteria andCodeduseridNotIn(List<Integer> values) {
            addCriterion("codeduserid not in", values, "codeduserid");
            return (Criteria) this;
        }

        public Criteria andCodeduseridBetween(Integer value1, Integer value2) {
            addCriterion("codeduserid between", value1, value2, "codeduserid");
            return (Criteria) this;
        }

        public Criteria andCodeduseridNotBetween(Integer value1, Integer value2) {
            addCriterion("codeduserid not between", value1, value2, "codeduserid");
            return (Criteria) this;
        }

        public Criteria andCodenameIsNull() {
            addCriterion("codename is null");
            return (Criteria) this;
        }

        public Criteria andCodenameIsNotNull() {
            addCriterion("codename is not null");
            return (Criteria) this;
        }

        public Criteria andCodenameEqualTo(String value) {
            addCriterion("codename =", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameNotEqualTo(String value) {
            addCriterion("codename <>", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameGreaterThan(String value) {
            addCriterion("codename >", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameGreaterThanOrEqualTo(String value) {
            addCriterion("codename >=", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameLessThan(String value) {
            addCriterion("codename <", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameLessThanOrEqualTo(String value) {
            addCriterion("codename <=", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameLike(String value) {
            addCriterion("codename like", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameNotLike(String value) {
            addCriterion("codename not like", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameIn(List<String> values) {
            addCriterion("codename in", values, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameNotIn(List<String> values) {
            addCriterion("codename not in", values, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameBetween(String value1, String value2) {
            addCriterion("codename between", value1, value2, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameNotBetween(String value1, String value2) {
            addCriterion("codename not between", value1, value2, "codename");
            return (Criteria) this;
        }

        public Criteria andCodetextIsNull() {
            addCriterion("codetext is null");
            return (Criteria) this;
        }

        public Criteria andCodetextIsNotNull() {
            addCriterion("codetext is not null");
            return (Criteria) this;
        }

        public Criteria andCodetextEqualTo(String value) {
            addCriterion("codetext =", value, "codetext");
            return (Criteria) this;
        }

        public Criteria andCodetextNotEqualTo(String value) {
            addCriterion("codetext <>", value, "codetext");
            return (Criteria) this;
        }

        public Criteria andCodetextGreaterThan(String value) {
            addCriterion("codetext >", value, "codetext");
            return (Criteria) this;
        }

        public Criteria andCodetextGreaterThanOrEqualTo(String value) {
            addCriterion("codetext >=", value, "codetext");
            return (Criteria) this;
        }

        public Criteria andCodetextLessThan(String value) {
            addCriterion("codetext <", value, "codetext");
            return (Criteria) this;
        }

        public Criteria andCodetextLessThanOrEqualTo(String value) {
            addCriterion("codetext <=", value, "codetext");
            return (Criteria) this;
        }

        public Criteria andCodetextLike(String value) {
            addCriterion("codetext like", value, "codetext");
            return (Criteria) this;
        }

        public Criteria andCodetextNotLike(String value) {
            addCriterion("codetext not like", value, "codetext");
            return (Criteria) this;
        }

        public Criteria andCodetextIn(List<String> values) {
            addCriterion("codetext in", values, "codetext");
            return (Criteria) this;
        }

        public Criteria andCodetextNotIn(List<String> values) {
            addCriterion("codetext not in", values, "codetext");
            return (Criteria) this;
        }

        public Criteria andCodetextBetween(String value1, String value2) {
            addCriterion("codetext between", value1, value2, "codetext");
            return (Criteria) this;
        }

        public Criteria andCodetextNotBetween(String value1, String value2) {
            addCriterion("codetext not between", value1, value2, "codetext");
            return (Criteria) this;
        }

        public Criteria andCodeversionIsNull() {
            addCriterion("codeversion is null");
            return (Criteria) this;
        }

        public Criteria andCodeversionIsNotNull() {
            addCriterion("codeversion is not null");
            return (Criteria) this;
        }

        public Criteria andCodeversionEqualTo(String value) {
            addCriterion("codeversion =", value, "codeversion");
            return (Criteria) this;
        }

        public Criteria andCodeversionNotEqualTo(String value) {
            addCriterion("codeversion <>", value, "codeversion");
            return (Criteria) this;
        }

        public Criteria andCodeversionGreaterThan(String value) {
            addCriterion("codeversion >", value, "codeversion");
            return (Criteria) this;
        }

        public Criteria andCodeversionGreaterThanOrEqualTo(String value) {
            addCriterion("codeversion >=", value, "codeversion");
            return (Criteria) this;
        }

        public Criteria andCodeversionLessThan(String value) {
            addCriterion("codeversion <", value, "codeversion");
            return (Criteria) this;
        }

        public Criteria andCodeversionLessThanOrEqualTo(String value) {
            addCriterion("codeversion <=", value, "codeversion");
            return (Criteria) this;
        }

        public Criteria andCodeversionLike(String value) {
            addCriterion("codeversion like", value, "codeversion");
            return (Criteria) this;
        }

        public Criteria andCodeversionNotLike(String value) {
            addCriterion("codeversion not like", value, "codeversion");
            return (Criteria) this;
        }

        public Criteria andCodeversionIn(List<String> values) {
            addCriterion("codeversion in", values, "codeversion");
            return (Criteria) this;
        }

        public Criteria andCodeversionNotIn(List<String> values) {
            addCriterion("codeversion not in", values, "codeversion");
            return (Criteria) this;
        }

        public Criteria andCodeversionBetween(String value1, String value2) {
            addCriterion("codeversion between", value1, value2, "codeversion");
            return (Criteria) this;
        }

        public Criteria andCodeversionNotBetween(String value1, String value2) {
            addCriterion("codeversion not between", value1, value2, "codeversion");
            return (Criteria) this;
        }

        public Criteria andCodetypeidIsNull() {
            addCriterion("codetypeid is null");
            return (Criteria) this;
        }

        public Criteria andCodetypeidIsNotNull() {
            addCriterion("codetypeid is not null");
            return (Criteria) this;
        }

        public Criteria andCodetypeidEqualTo(Integer value) {
            addCriterion("codetypeid =", value, "codetypeid");
            return (Criteria) this;
        }

        public Criteria andCodetypeidNotEqualTo(Integer value) {
            addCriterion("codetypeid <>", value, "codetypeid");
            return (Criteria) this;
        }

        public Criteria andCodetypeidGreaterThan(Integer value) {
            addCriterion("codetypeid >", value, "codetypeid");
            return (Criteria) this;
        }

        public Criteria andCodetypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("codetypeid >=", value, "codetypeid");
            return (Criteria) this;
        }

        public Criteria andCodetypeidLessThan(Integer value) {
            addCriterion("codetypeid <", value, "codetypeid");
            return (Criteria) this;
        }

        public Criteria andCodetypeidLessThanOrEqualTo(Integer value) {
            addCriterion("codetypeid <=", value, "codetypeid");
            return (Criteria) this;
        }

        public Criteria andCodetypeidIn(List<Integer> values) {
            addCriterion("codetypeid in", values, "codetypeid");
            return (Criteria) this;
        }

        public Criteria andCodetypeidNotIn(List<Integer> values) {
            addCriterion("codetypeid not in", values, "codetypeid");
            return (Criteria) this;
        }

        public Criteria andCodetypeidBetween(Integer value1, Integer value2) {
            addCriterion("codetypeid between", value1, value2, "codetypeid");
            return (Criteria) this;
        }

        public Criteria andCodetypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("codetypeid not between", value1, value2, "codetypeid");
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