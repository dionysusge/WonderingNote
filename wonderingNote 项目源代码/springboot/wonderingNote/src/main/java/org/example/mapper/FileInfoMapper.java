package org.example.mapper;

import org.example.model.entity.FileInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface FileInfoMapper {

    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_info
     *
     * @mbg.generated
     */
    int insert(FileInfo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_info
     *
     * @mbg.generated
     */
    int insertSelective(FileInfo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_info
     *
     * @mbg.generated
     */
    FileInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FileInfo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FileInfo row);
}