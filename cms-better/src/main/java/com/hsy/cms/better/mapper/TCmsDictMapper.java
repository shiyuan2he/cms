package com.hsy.cms.better.mapper;

import com.hsy.cms.better.bean.entity.TCmsDict;
import com.hsy.cms.better.bean.entity.TCmsDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCmsDictMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_dict
     *
     * @mbg.generated
     */
    long countByExample(TCmsDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_dict
     *
     * @mbg.generated
     */
    int deleteByExample(TCmsDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_dict
     *
     * @mbg.generated
     */
    int insert(TCmsDict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_dict
     *
     * @mbg.generated
     */
    int insertSelective(TCmsDict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_dict
     *
     * @mbg.generated
     */
    List<TCmsDict> selectByExample(TCmsDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_dict
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCmsDict record, @Param("example") TCmsDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_dict
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCmsDict record, @Param("example") TCmsDictExample example);
}