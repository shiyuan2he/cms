package com.hsy.cms.better.bean.entity;

/**
 * Database Table Remarks:
 *   图片表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_cms_picture
 */
public class TCmsPicture {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cms_picture.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   图片唯一标识
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cms_picture.picture_id
     *
     * @mbg.generated
     */
    private String pictureId;

    /**
     * Database Column Remarks:
     *   图片地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cms_picture.picture_url
     *
     * @mbg.generated
     */
    private String pictureUrl;

    /**
     * Database Column Remarks:
     *   来源
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cms_picture.source
     *
     * @mbg.generated
     */
    private String source;

    /**
     * Database Column Remarks:
     *   删除状态：0未删除 1：已删除
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cms_picture.del
     *
     * @mbg.generated
     */
    private byte[] del;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cms_picture.id
     *
     * @return the value of t_cms_picture.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cms_picture.id
     *
     * @param id the value for t_cms_picture.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cms_picture.picture_id
     *
     * @return the value of t_cms_picture.picture_id
     *
     * @mbg.generated
     */
    public String getPictureId() {
        return pictureId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cms_picture.picture_id
     *
     * @param pictureId the value for t_cms_picture.picture_id
     *
     * @mbg.generated
     */
    public void setPictureId(String pictureId) {
        this.pictureId = pictureId == null ? null : pictureId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cms_picture.picture_url
     *
     * @return the value of t_cms_picture.picture_url
     *
     * @mbg.generated
     */
    public String getPictureUrl() {
        return pictureUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cms_picture.picture_url
     *
     * @param pictureUrl the value for t_cms_picture.picture_url
     *
     * @mbg.generated
     */
    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl == null ? null : pictureUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cms_picture.source
     *
     * @return the value of t_cms_picture.source
     *
     * @mbg.generated
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cms_picture.source
     *
     * @param source the value for t_cms_picture.source
     *
     * @mbg.generated
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cms_picture.del
     *
     * @return the value of t_cms_picture.del
     *
     * @mbg.generated
     */
    public byte[] getDel() {
        return del;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cms_picture.del
     *
     * @param del the value for t_cms_picture.del
     *
     * @mbg.generated
     */
    public void setDel(byte[] del) {
        this.del = del;
    }
}