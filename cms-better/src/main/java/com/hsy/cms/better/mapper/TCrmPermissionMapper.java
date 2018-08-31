package com.hsy.cms.better.mapper;

import com.hsy.cms.better.bean.entity.TCrmPermission;
import com.hsy.cms.better.bean.entity.TCrmPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCrmPermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_crm_permission
     *
     * @mbg.generated
     */
    long countByExample(TCrmPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_crm_permission
     *
     * @mbg.generated
     */
    int deleteByExample(TCrmPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_crm_permission
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_crm_permission
     *
     * @mbg.generated
     */
    int insert(TCrmPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_crm_permission
     *
     * @mbg.generated
     */
    int insertSelective(TCrmPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_crm_permission
     *
     * @mbg.generated
     */
    List<TCrmPermission> selectByExample(TCrmPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_crm_permission
     *
     * @mbg.generated
     */
    TCrmPermission selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_crm_permission
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCrmPermission record, @Param("example") TCrmPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_crm_permission
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCrmPermission record, @Param("example") TCrmPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_crm_permission
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCrmPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_crm_permission
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCrmPermission record);
}