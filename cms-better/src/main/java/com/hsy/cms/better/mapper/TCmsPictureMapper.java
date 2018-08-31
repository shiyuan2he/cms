package com.hsy.cms.better.mapper;

import com.hsy.cms.better.bean.entity.TCmsPicture;
import com.hsy.cms.better.bean.entity.TCmsPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCmsPictureMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_picture
     *
     * @mbg.generated
     */
    long countByExample(TCmsPictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_picture
     *
     * @mbg.generated
     */
    int deleteByExample(TCmsPictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_picture
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_picture
     *
     * @mbg.generated
     */
    int insert(TCmsPicture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_picture
     *
     * @mbg.generated
     */
    int insertSelective(TCmsPicture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_picture
     *
     * @mbg.generated
     */
    List<TCmsPicture> selectByExample(TCmsPictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_picture
     *
     * @mbg.generated
     */
    TCmsPicture selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_picture
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCmsPicture record, @Param("example") TCmsPictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_picture
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCmsPicture record, @Param("example") TCmsPictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_picture
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCmsPicture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_picture
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCmsPicture record);
}