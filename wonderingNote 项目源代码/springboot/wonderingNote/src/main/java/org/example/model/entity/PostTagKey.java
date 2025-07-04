package org.example.model.entity;

/**
 * Database Table Remarks:
 *   博文标签关联表：记录博文与标签的多对多关系
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table post_tag
 */
public class PostTagKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post_tag.post_id
     *
     * @mbg.generated
     */
    private Long postId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post_tag.tag_id
     *
     * @mbg.generated
     */
    private Long tagId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post_tag.post_id
     *
     * @return the value of post_tag.post_id
     *
     * @mbg.generated
     */
    public Long getPostId() {
        return postId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post_tag.post_id
     *
     * @param postId the value for post_tag.post_id
     *
     * @mbg.generated
     */
    public void setPostId(Long postId) {
        this.postId = postId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post_tag.tag_id
     *
     * @return the value of post_tag.tag_id
     *
     * @mbg.generated
     */
    public Long getTagId() {
        return tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post_tag.tag_id
     *
     * @param tagId the value for post_tag.tag_id
     *
     * @mbg.generated
     */
    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }
}