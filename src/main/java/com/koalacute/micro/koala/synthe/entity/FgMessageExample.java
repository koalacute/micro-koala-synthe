package com.koalacute.micro.koala.synthe.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FgMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FgMessageExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andSendGroupIsNull() {
            addCriterion("send_group is null");
            return (Criteria) this;
        }

        public Criteria andSendGroupIsNotNull() {
            addCriterion("send_group is not null");
            return (Criteria) this;
        }

        public Criteria andSendGroupEqualTo(String value) {
            addCriterion("send_group =", value, "sendGroup");
            return (Criteria) this;
        }

        public Criteria andSendGroupNotEqualTo(String value) {
            addCriterion("send_group <>", value, "sendGroup");
            return (Criteria) this;
        }

        public Criteria andSendGroupGreaterThan(String value) {
            addCriterion("send_group >", value, "sendGroup");
            return (Criteria) this;
        }

        public Criteria andSendGroupGreaterThanOrEqualTo(String value) {
            addCriterion("send_group >=", value, "sendGroup");
            return (Criteria) this;
        }

        public Criteria andSendGroupLessThan(String value) {
            addCriterion("send_group <", value, "sendGroup");
            return (Criteria) this;
        }

        public Criteria andSendGroupLessThanOrEqualTo(String value) {
            addCriterion("send_group <=", value, "sendGroup");
            return (Criteria) this;
        }

        public Criteria andSendGroupLike(String value) {
            addCriterion("send_group like", value, "sendGroup");
            return (Criteria) this;
        }

        public Criteria andSendGroupNotLike(String value) {
            addCriterion("send_group not like", value, "sendGroup");
            return (Criteria) this;
        }

        public Criteria andSendGroupIn(List<String> values) {
            addCriterion("send_group in", values, "sendGroup");
            return (Criteria) this;
        }

        public Criteria andSendGroupNotIn(List<String> values) {
            addCriterion("send_group not in", values, "sendGroup");
            return (Criteria) this;
        }

        public Criteria andSendGroupBetween(String value1, String value2) {
            addCriterion("send_group between", value1, value2, "sendGroup");
            return (Criteria) this;
        }

        public Criteria andSendGroupNotBetween(String value1, String value2) {
            addCriterion("send_group not between", value1, value2, "sendGroup");
            return (Criteria) this;
        }

        public Criteria andSendTitleIsNull() {
            addCriterion("send_title is null");
            return (Criteria) this;
        }

        public Criteria andSendTitleIsNotNull() {
            addCriterion("send_title is not null");
            return (Criteria) this;
        }

        public Criteria andSendTitleEqualTo(String value) {
            addCriterion("send_title =", value, "sendTitle");
            return (Criteria) this;
        }

        public Criteria andSendTitleNotEqualTo(String value) {
            addCriterion("send_title <>", value, "sendTitle");
            return (Criteria) this;
        }

        public Criteria andSendTitleGreaterThan(String value) {
            addCriterion("send_title >", value, "sendTitle");
            return (Criteria) this;
        }

        public Criteria andSendTitleGreaterThanOrEqualTo(String value) {
            addCriterion("send_title >=", value, "sendTitle");
            return (Criteria) this;
        }

        public Criteria andSendTitleLessThan(String value) {
            addCriterion("send_title <", value, "sendTitle");
            return (Criteria) this;
        }

        public Criteria andSendTitleLessThanOrEqualTo(String value) {
            addCriterion("send_title <=", value, "sendTitle");
            return (Criteria) this;
        }

        public Criteria andSendTitleLike(String value) {
            addCriterion("send_title like", value, "sendTitle");
            return (Criteria) this;
        }

        public Criteria andSendTitleNotLike(String value) {
            addCriterion("send_title not like", value, "sendTitle");
            return (Criteria) this;
        }

        public Criteria andSendTitleIn(List<String> values) {
            addCriterion("send_title in", values, "sendTitle");
            return (Criteria) this;
        }

        public Criteria andSendTitleNotIn(List<String> values) {
            addCriterion("send_title not in", values, "sendTitle");
            return (Criteria) this;
        }

        public Criteria andSendTitleBetween(String value1, String value2) {
            addCriterion("send_title between", value1, value2, "sendTitle");
            return (Criteria) this;
        }

        public Criteria andSendTitleNotBetween(String value1, String value2) {
            addCriterion("send_title not between", value1, value2, "sendTitle");
            return (Criteria) this;
        }

        public Criteria andSendContentIsNull() {
            addCriterion("send_content is null");
            return (Criteria) this;
        }

        public Criteria andSendContentIsNotNull() {
            addCriterion("send_content is not null");
            return (Criteria) this;
        }

        public Criteria andSendContentEqualTo(String value) {
            addCriterion("send_content =", value, "sendContent");
            return (Criteria) this;
        }

        public Criteria andSendContentNotEqualTo(String value) {
            addCriterion("send_content <>", value, "sendContent");
            return (Criteria) this;
        }

        public Criteria andSendContentGreaterThan(String value) {
            addCriterion("send_content >", value, "sendContent");
            return (Criteria) this;
        }

        public Criteria andSendContentGreaterThanOrEqualTo(String value) {
            addCriterion("send_content >=", value, "sendContent");
            return (Criteria) this;
        }

        public Criteria andSendContentLessThan(String value) {
            addCriterion("send_content <", value, "sendContent");
            return (Criteria) this;
        }

        public Criteria andSendContentLessThanOrEqualTo(String value) {
            addCriterion("send_content <=", value, "sendContent");
            return (Criteria) this;
        }

        public Criteria andSendContentLike(String value) {
            addCriterion("send_content like", value, "sendContent");
            return (Criteria) this;
        }

        public Criteria andSendContentNotLike(String value) {
            addCriterion("send_content not like", value, "sendContent");
            return (Criteria) this;
        }

        public Criteria andSendContentIn(List<String> values) {
            addCriterion("send_content in", values, "sendContent");
            return (Criteria) this;
        }

        public Criteria andSendContentNotIn(List<String> values) {
            addCriterion("send_content not in", values, "sendContent");
            return (Criteria) this;
        }

        public Criteria andSendContentBetween(String value1, String value2) {
            addCriterion("send_content between", value1, value2, "sendContent");
            return (Criteria) this;
        }

        public Criteria andSendContentNotBetween(String value1, String value2) {
            addCriterion("send_content not between", value1, value2, "sendContent");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Date value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Date value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Date value) {
            addCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Date value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Date> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Date> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Date value1, Date value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendAuthorIsNull() {
            addCriterion("send_author is null");
            return (Criteria) this;
        }

        public Criteria andSendAuthorIsNotNull() {
            addCriterion("send_author is not null");
            return (Criteria) this;
        }

        public Criteria andSendAuthorEqualTo(String value) {
            addCriterion("send_author =", value, "sendAuthor");
            return (Criteria) this;
        }

        public Criteria andSendAuthorNotEqualTo(String value) {
            addCriterion("send_author <>", value, "sendAuthor");
            return (Criteria) this;
        }

        public Criteria andSendAuthorGreaterThan(String value) {
            addCriterion("send_author >", value, "sendAuthor");
            return (Criteria) this;
        }

        public Criteria andSendAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("send_author >=", value, "sendAuthor");
            return (Criteria) this;
        }

        public Criteria andSendAuthorLessThan(String value) {
            addCriterion("send_author <", value, "sendAuthor");
            return (Criteria) this;
        }

        public Criteria andSendAuthorLessThanOrEqualTo(String value) {
            addCriterion("send_author <=", value, "sendAuthor");
            return (Criteria) this;
        }

        public Criteria andSendAuthorLike(String value) {
            addCriterion("send_author like", value, "sendAuthor");
            return (Criteria) this;
        }

        public Criteria andSendAuthorNotLike(String value) {
            addCriterion("send_author not like", value, "sendAuthor");
            return (Criteria) this;
        }

        public Criteria andSendAuthorIn(List<String> values) {
            addCriterion("send_author in", values, "sendAuthor");
            return (Criteria) this;
        }

        public Criteria andSendAuthorNotIn(List<String> values) {
            addCriterion("send_author not in", values, "sendAuthor");
            return (Criteria) this;
        }

        public Criteria andSendAuthorBetween(String value1, String value2) {
            addCriterion("send_author between", value1, value2, "sendAuthor");
            return (Criteria) this;
        }

        public Criteria andSendAuthorNotBetween(String value1, String value2) {
            addCriterion("send_author not between", value1, value2, "sendAuthor");
            return (Criteria) this;
        }

        public Criteria andSendRemarkIsNull() {
            addCriterion("send_remark is null");
            return (Criteria) this;
        }

        public Criteria andSendRemarkIsNotNull() {
            addCriterion("send_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSendRemarkEqualTo(String value) {
            addCriterion("send_remark =", value, "sendRemark");
            return (Criteria) this;
        }

        public Criteria andSendRemarkNotEqualTo(String value) {
            addCriterion("send_remark <>", value, "sendRemark");
            return (Criteria) this;
        }

        public Criteria andSendRemarkGreaterThan(String value) {
            addCriterion("send_remark >", value, "sendRemark");
            return (Criteria) this;
        }

        public Criteria andSendRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("send_remark >=", value, "sendRemark");
            return (Criteria) this;
        }

        public Criteria andSendRemarkLessThan(String value) {
            addCriterion("send_remark <", value, "sendRemark");
            return (Criteria) this;
        }

        public Criteria andSendRemarkLessThanOrEqualTo(String value) {
            addCriterion("send_remark <=", value, "sendRemark");
            return (Criteria) this;
        }

        public Criteria andSendRemarkLike(String value) {
            addCriterion("send_remark like", value, "sendRemark");
            return (Criteria) this;
        }

        public Criteria andSendRemarkNotLike(String value) {
            addCriterion("send_remark not like", value, "sendRemark");
            return (Criteria) this;
        }

        public Criteria andSendRemarkIn(List<String> values) {
            addCriterion("send_remark in", values, "sendRemark");
            return (Criteria) this;
        }

        public Criteria andSendRemarkNotIn(List<String> values) {
            addCriterion("send_remark not in", values, "sendRemark");
            return (Criteria) this;
        }

        public Criteria andSendRemarkBetween(String value1, String value2) {
            addCriterion("send_remark between", value1, value2, "sendRemark");
            return (Criteria) this;
        }

        public Criteria andSendRemarkNotBetween(String value1, String value2) {
            addCriterion("send_remark not between", value1, value2, "sendRemark");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andSendStatusIsNull() {
            addCriterion("send_status is null");
            return (Criteria) this;
        }

        public Criteria andSendStatusIsNotNull() {
            addCriterion("send_status is not null");
            return (Criteria) this;
        }

        public Criteria andSendStatusEqualTo(String value) {
            addCriterion("send_status =", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotEqualTo(String value) {
            addCriterion("send_status <>", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusGreaterThan(String value) {
            addCriterion("send_status >", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusGreaterThanOrEqualTo(String value) {
            addCriterion("send_status >=", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLessThan(String value) {
            addCriterion("send_status <", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLessThanOrEqualTo(String value) {
            addCriterion("send_status <=", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLike(String value) {
            addCriterion("send_status like", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotLike(String value) {
            addCriterion("send_status not like", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusIn(List<String> values) {
            addCriterion("send_status in", values, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotIn(List<String> values) {
            addCriterion("send_status not in", values, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusBetween(String value1, String value2) {
            addCriterion("send_status between", value1, value2, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotBetween(String value1, String value2) {
            addCriterion("send_status not between", value1, value2, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendNumberIsNull() {
            addCriterion("send_number is null");
            return (Criteria) this;
        }

        public Criteria andSendNumberIsNotNull() {
            addCriterion("send_number is not null");
            return (Criteria) this;
        }

        public Criteria andSendNumberEqualTo(String value) {
            addCriterion("send_number =", value, "sendNumber");
            return (Criteria) this;
        }

        public Criteria andSendNumberNotEqualTo(String value) {
            addCriterion("send_number <>", value, "sendNumber");
            return (Criteria) this;
        }

        public Criteria andSendNumberGreaterThan(String value) {
            addCriterion("send_number >", value, "sendNumber");
            return (Criteria) this;
        }

        public Criteria andSendNumberGreaterThanOrEqualTo(String value) {
            addCriterion("send_number >=", value, "sendNumber");
            return (Criteria) this;
        }

        public Criteria andSendNumberLessThan(String value) {
            addCriterion("send_number <", value, "sendNumber");
            return (Criteria) this;
        }

        public Criteria andSendNumberLessThanOrEqualTo(String value) {
            addCriterion("send_number <=", value, "sendNumber");
            return (Criteria) this;
        }

        public Criteria andSendNumberLike(String value) {
            addCriterion("send_number like", value, "sendNumber");
            return (Criteria) this;
        }

        public Criteria andSendNumberNotLike(String value) {
            addCriterion("send_number not like", value, "sendNumber");
            return (Criteria) this;
        }

        public Criteria andSendNumberIn(List<String> values) {
            addCriterion("send_number in", values, "sendNumber");
            return (Criteria) this;
        }

        public Criteria andSendNumberNotIn(List<String> values) {
            addCriterion("send_number not in", values, "sendNumber");
            return (Criteria) this;
        }

        public Criteria andSendNumberBetween(String value1, String value2) {
            addCriterion("send_number between", value1, value2, "sendNumber");
            return (Criteria) this;
        }

        public Criteria andSendNumberNotBetween(String value1, String value2) {
            addCriterion("send_number not between", value1, value2, "sendNumber");
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