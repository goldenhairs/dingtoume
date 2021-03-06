package me.dingtou.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FundDailyPriceExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fund_daily_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fund_daily_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fund_daily_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_daily_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public FundDailyPriceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_daily_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_daily_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_daily_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_daily_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_daily_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_daily_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_daily_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_daily_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_daily_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_daily_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fund_daily_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andFundCodeIsNull() {
            addCriterion("fund_code is null");
            return (Criteria) this;
        }

        public Criteria andFundCodeIsNotNull() {
            addCriterion("fund_code is not null");
            return (Criteria) this;
        }

        public Criteria andFundCodeEqualTo(String value) {
            addCriterion("fund_code =", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeNotEqualTo(String value) {
            addCriterion("fund_code <>", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeGreaterThan(String value) {
            addCriterion("fund_code >", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fund_code >=", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeLessThan(String value) {
            addCriterion("fund_code <", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeLessThanOrEqualTo(String value) {
            addCriterion("fund_code <=", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeLike(String value) {
            addCriterion("fund_code like", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeNotLike(String value) {
            addCriterion("fund_code not like", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeIn(List<String> values) {
            addCriterion("fund_code in", values, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeNotIn(List<String> values) {
            addCriterion("fund_code not in", values, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeBetween(String value1, String value2) {
            addCriterion("fund_code between", value1, value2, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeNotBetween(String value1, String value2) {
            addCriterion("fund_code not between", value1, value2, "fundCode");
            return (Criteria) this;
        }

        public Criteria andPriceDateIsNull() {
            addCriterion("price_date is null");
            return (Criteria) this;
        }

        public Criteria andPriceDateIsNotNull() {
            addCriterion("price_date is not null");
            return (Criteria) this;
        }

        public Criteria andPriceDateEqualTo(Date value) {
            addCriterionForJDBCDate("price_date =", value, "priceDate");
            return (Criteria) this;
        }

        public Criteria andPriceDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("price_date <>", value, "priceDate");
            return (Criteria) this;
        }

        public Criteria andPriceDateGreaterThan(Date value) {
            addCriterionForJDBCDate("price_date >", value, "priceDate");
            return (Criteria) this;
        }

        public Criteria andPriceDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("price_date >=", value, "priceDate");
            return (Criteria) this;
        }

        public Criteria andPriceDateLessThan(Date value) {
            addCriterionForJDBCDate("price_date <", value, "priceDate");
            return (Criteria) this;
        }

        public Criteria andPriceDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("price_date <=", value, "priceDate");
            return (Criteria) this;
        }

        public Criteria andPriceDateIn(List<Date> values) {
            addCriterionForJDBCDate("price_date in", values, "priceDate");
            return (Criteria) this;
        }

        public Criteria andPriceDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("price_date not in", values, "priceDate");
            return (Criteria) this;
        }

        public Criteria andPriceDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("price_date between", value1, value2, "priceDate");
            return (Criteria) this;
        }

        public Criteria andPriceDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("price_date not between", value1, value2, "priceDate");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(String value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(String value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(String value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(String value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(String value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(String value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLike(String value) {
            addCriterion("unit_price like", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotLike(String value) {
            addCriterion("unit_price not like", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<String> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<String> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(String value1, String value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(String value1, String value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(String value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(String value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(String value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(String value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(String value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(String value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLike(String value) {
            addCriterion("total_price like", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotLike(String value) {
            addCriterion("total_price not like", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<String> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<String> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(String value1, String value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(String value1, String value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andIncreaseIsNull() {
            addCriterion("increase is null");
            return (Criteria) this;
        }

        public Criteria andIncreaseIsNotNull() {
            addCriterion("increase is not null");
            return (Criteria) this;
        }

        public Criteria andIncreaseEqualTo(String value) {
            addCriterion("increase =", value, "increase");
            return (Criteria) this;
        }

        public Criteria andIncreaseNotEqualTo(String value) {
            addCriterion("increase <>", value, "increase");
            return (Criteria) this;
        }

        public Criteria andIncreaseGreaterThan(String value) {
            addCriterion("increase >", value, "increase");
            return (Criteria) this;
        }

        public Criteria andIncreaseGreaterThanOrEqualTo(String value) {
            addCriterion("increase >=", value, "increase");
            return (Criteria) this;
        }

        public Criteria andIncreaseLessThan(String value) {
            addCriterion("increase <", value, "increase");
            return (Criteria) this;
        }

        public Criteria andIncreaseLessThanOrEqualTo(String value) {
            addCriterion("increase <=", value, "increase");
            return (Criteria) this;
        }

        public Criteria andIncreaseLike(String value) {
            addCriterion("increase like", value, "increase");
            return (Criteria) this;
        }

        public Criteria andIncreaseNotLike(String value) {
            addCriterion("increase not like", value, "increase");
            return (Criteria) this;
        }

        public Criteria andIncreaseIn(List<String> values) {
            addCriterion("increase in", values, "increase");
            return (Criteria) this;
        }

        public Criteria andIncreaseNotIn(List<String> values) {
            addCriterion("increase not in", values, "increase");
            return (Criteria) this;
        }

        public Criteria andIncreaseBetween(String value1, String value2) {
            addCriterion("increase between", value1, value2, "increase");
            return (Criteria) this;
        }

        public Criteria andIncreaseNotBetween(String value1, String value2) {
            addCriterion("increase not between", value1, value2, "increase");
            return (Criteria) this;
        }

        public Criteria andBuyStatusIsNull() {
            addCriterion("buy_status is null");
            return (Criteria) this;
        }

        public Criteria andBuyStatusIsNotNull() {
            addCriterion("buy_status is not null");
            return (Criteria) this;
        }

        public Criteria andBuyStatusEqualTo(String value) {
            addCriterion("buy_status =", value, "buyStatus");
            return (Criteria) this;
        }

        public Criteria andBuyStatusNotEqualTo(String value) {
            addCriterion("buy_status <>", value, "buyStatus");
            return (Criteria) this;
        }

        public Criteria andBuyStatusGreaterThan(String value) {
            addCriterion("buy_status >", value, "buyStatus");
            return (Criteria) this;
        }

        public Criteria andBuyStatusGreaterThanOrEqualTo(String value) {
            addCriterion("buy_status >=", value, "buyStatus");
            return (Criteria) this;
        }

        public Criteria andBuyStatusLessThan(String value) {
            addCriterion("buy_status <", value, "buyStatus");
            return (Criteria) this;
        }

        public Criteria andBuyStatusLessThanOrEqualTo(String value) {
            addCriterion("buy_status <=", value, "buyStatus");
            return (Criteria) this;
        }

        public Criteria andBuyStatusLike(String value) {
            addCriterion("buy_status like", value, "buyStatus");
            return (Criteria) this;
        }

        public Criteria andBuyStatusNotLike(String value) {
            addCriterion("buy_status not like", value, "buyStatus");
            return (Criteria) this;
        }

        public Criteria andBuyStatusIn(List<String> values) {
            addCriterion("buy_status in", values, "buyStatus");
            return (Criteria) this;
        }

        public Criteria andBuyStatusNotIn(List<String> values) {
            addCriterion("buy_status not in", values, "buyStatus");
            return (Criteria) this;
        }

        public Criteria andBuyStatusBetween(String value1, String value2) {
            addCriterion("buy_status between", value1, value2, "buyStatus");
            return (Criteria) this;
        }

        public Criteria andBuyStatusNotBetween(String value1, String value2) {
            addCriterion("buy_status not between", value1, value2, "buyStatus");
            return (Criteria) this;
        }

        public Criteria andSellStatusIsNull() {
            addCriterion("sell_status is null");
            return (Criteria) this;
        }

        public Criteria andSellStatusIsNotNull() {
            addCriterion("sell_status is not null");
            return (Criteria) this;
        }

        public Criteria andSellStatusEqualTo(String value) {
            addCriterion("sell_status =", value, "sellStatus");
            return (Criteria) this;
        }

        public Criteria andSellStatusNotEqualTo(String value) {
            addCriterion("sell_status <>", value, "sellStatus");
            return (Criteria) this;
        }

        public Criteria andSellStatusGreaterThan(String value) {
            addCriterion("sell_status >", value, "sellStatus");
            return (Criteria) this;
        }

        public Criteria andSellStatusGreaterThanOrEqualTo(String value) {
            addCriterion("sell_status >=", value, "sellStatus");
            return (Criteria) this;
        }

        public Criteria andSellStatusLessThan(String value) {
            addCriterion("sell_status <", value, "sellStatus");
            return (Criteria) this;
        }

        public Criteria andSellStatusLessThanOrEqualTo(String value) {
            addCriterion("sell_status <=", value, "sellStatus");
            return (Criteria) this;
        }

        public Criteria andSellStatusLike(String value) {
            addCriterion("sell_status like", value, "sellStatus");
            return (Criteria) this;
        }

        public Criteria andSellStatusNotLike(String value) {
            addCriterion("sell_status not like", value, "sellStatus");
            return (Criteria) this;
        }

        public Criteria andSellStatusIn(List<String> values) {
            addCriterion("sell_status in", values, "sellStatus");
            return (Criteria) this;
        }

        public Criteria andSellStatusNotIn(List<String> values) {
            addCriterion("sell_status not in", values, "sellStatus");
            return (Criteria) this;
        }

        public Criteria andSellStatusBetween(String value1, String value2) {
            addCriterion("sell_status between", value1, value2, "sellStatus");
            return (Criteria) this;
        }

        public Criteria andSellStatusNotBetween(String value1, String value2) {
            addCriterion("sell_status not between", value1, value2, "sellStatus");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fund_daily_price
     *
     * @mbg.generated do_not_delete_during_merge Sun Jun 18 17:09:13 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fund_daily_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
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