package com.hsy.cms.better.mapper;

import com.hsy.cms.better.bean.entity.TCrmUserRole;
import com.hsy.cms.better.bean.entity.TCrmUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCrmUserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_crm_user_role
     *
     * @mbg.generated
     */
    long countByExample(TCrmUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_crm_user_role
     *
     * @mbg.generated
     */
    int deleteByExample(TCrmUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_crm_user_role
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_crm_user_role
     *
     * @mbg.generated
     */
    int insert(TCrmUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_crm_user_role
     *
     * @mbg.generated
     */
    int insertSelective(TCrmUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_crm_user_role
     *
     * @mbg.generated
     */
    List<TCrmUserRole> selectByExample(TCrmUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_crm_user_role
     *
     * @mbg.generated
     */
    TCrmUserRole selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_crm_user_role
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCrmUserRole record, @Param("example") TCrmUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_crm_user_role
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCrmUserRole record, @Param("example") TCrmUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_crm_user_role
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCrmUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_crm_user_role
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCrmUserRole record);
}