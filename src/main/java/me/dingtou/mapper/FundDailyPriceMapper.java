package me.dingtou.mapper;

import me.dingtou.domain.FundDailyPrice;
import me.dingtou.domain.FundDailyPriceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface FundDailyPriceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_daily_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    long countByExample(FundDailyPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_daily_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    int deleteByExample(FundDailyPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_daily_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_daily_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    int insert(FundDailyPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_daily_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    int insertSelective(FundDailyPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_daily_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    List<FundDailyPrice> selectByExample(FundDailyPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_daily_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    FundDailyPrice selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_daily_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    int updateByExampleSelective(@Param("record") FundDailyPrice record, @Param("example") FundDailyPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_daily_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    int updateByExample(@Param("record") FundDailyPrice record, @Param("example") FundDailyPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_daily_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    int updateByPrimaryKeySelective(FundDailyPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_daily_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    int updateByPrimaryKey(FundDailyPrice record);
}