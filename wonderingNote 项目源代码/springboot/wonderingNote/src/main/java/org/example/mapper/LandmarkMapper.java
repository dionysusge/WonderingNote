package org.example.mapper;

import org.example.model.entity.Landmark;

public interface LandmarkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landmark
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landmark
     *
     * @mbg.generated
     */
    int insert(Landmark row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landmark
     *
     * @mbg.generated
     */
    int insertSelective(Landmark row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landmark
     *
     * @mbg.generated
     */
    Landmark selectByPrimaryKey(Long id);

    /**
     * 根据 location 查找地标记录
     * @param location 地理位置的二进制数据
     * @return 地标记录
     */
    Landmark selectByLocation(byte[] location);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landmark
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Landmark row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landmark
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(Landmark row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landmark
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Landmark row);
}