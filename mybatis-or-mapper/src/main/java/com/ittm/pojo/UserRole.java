package com.ittm.pojo;

public class UserRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.id
     *
     * @mbggenerated Tue Apr 07 18:15:28 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.userName
     *
     * @mbggenerated Tue Apr 07 18:15:28 CST 2020
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.role
     *
     * @mbggenerated Tue Apr 07 18:15:28 CST 2020
     */
    private String role;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.phone
     *
     * @mbggenerated Tue Apr 07 18:15:28 CST 2020
     */
    private String phone;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.id
     *
     * @return the value of user_role.id
     *
     * @mbggenerated Tue Apr 07 18:15:28 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.id
     *
     * @param id the value for user_role.id
     *
     * @mbggenerated Tue Apr 07 18:15:28 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.userName
     *
     * @return the value of user_role.userName
     *
     * @mbggenerated Tue Apr 07 18:15:28 CST 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.userName
     *
     * @param username the value for user_role.userName
     *
     * @mbggenerated Tue Apr 07 18:15:28 CST 2020
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.role
     *
     * @return the value of user_role.role
     *
     * @mbggenerated Tue Apr 07 18:15:28 CST 2020
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.role
     *
     * @param role the value for user_role.role
     *
     * @mbggenerated Tue Apr 07 18:15:28 CST 2020
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.phone
     *
     * @return the value of user_role.phone
     *
     * @mbggenerated Tue Apr 07 18:15:28 CST 2020
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.phone
     *
     * @param phone the value for user_role.phone
     *
     * @mbggenerated Tue Apr 07 18:15:28 CST 2020
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}