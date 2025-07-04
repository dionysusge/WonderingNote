package org.example.model.entity;

import java.util.Date;

/**
 * Database Table Remarks:
 *   人脸特征表：存储用户人脸特征数据
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table face_features
 */
public class FaceFeatures {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column face_features.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   绑定的是哪个用户
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column face_features.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     * Database Column Remarks:
     *   照片存储的文件名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column face_features.face_image
     *
     * @mbg.generated
     */
    private String faceImage;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column face_features.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   识别获得的特征向量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column face_features.face_vector
     *
     * @mbg.generated
     */
    private String faceVector;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column face_features.id
     *
     * @return the value of face_features.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column face_features.id
     *
     * @param id the value for face_features.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column face_features.user_id
     *
     * @return the value of face_features.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column face_features.user_id
     *
     * @param userId the value for face_features.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column face_features.face_image
     *
     * @return the value of face_features.face_image
     *
     * @mbg.generated
     */
    public String getFaceImage() {
        return faceImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column face_features.face_image
     *
     * @param faceImage the value for face_features.face_image
     *
     * @mbg.generated
     */
    public void setFaceImage(String faceImage) {
        this.faceImage = faceImage == null ? null : faceImage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column face_features.create_time
     *
     * @return the value of face_features.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column face_features.create_time
     *
     * @param createTime the value for face_features.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column face_features.face_vector
     *
     * @return the value of face_features.face_vector
     *
     * @mbg.generated
     */
    public String getFaceVector() {
        return faceVector;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column face_features.face_vector
     *
     * @param faceVector the value for face_features.face_vector
     *
     * @mbg.generated
     */
    public void setFaceVector(String faceVector) {
        this.faceVector = faceVector == null ? null : faceVector.trim();
    }
}