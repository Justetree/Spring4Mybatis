package com.mybatis.dao;


import com.mybatis.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Description. 类似于DAO，主要是负责操纵数据库增删改查
 * Created on  2015-06-13 下午1:15
 * -------------------------------------------------------------------------
 * 版本          修改时间              作者               修改内容 
 * 1.0.0              下午1:15              Darlen                        create
 * -------------------------------------------------------------------------
 *
 * @author Darlen liu
 */
public interface UserMapper {
    /**
     * 根据主键id获取用户对象
     *
     * @param id
     * @return
     */
    User getUserByID(Integer id);

    /**
     * 根据用户名获取用户对象
     *
     * @param name
     * @return 用户对象
     */
    User getUserByName(String name);

    /**
     * 获取所有用户对象
     *
     * @return 用户对象
     */
    List<User> getAllUser();

    /**
     * 根据用户对象插入*所有字段*到db
     *
     * @param record
     * @return 插入结果（数量）
     */
    int insertUser(User record);

    /**
     * 根据用户对象有选择性的只插入*字段不为空*到db
     *
     * @param record
     * @return 插入结果（数量）
     */
    int insertUserSelective(User record);

    /**
     * 根据主键ID查询并有选择性的只更新*字段不为空*到db
     *
     * @param user
     * @return 更新结果（数量）
     */
    int updUserByIDSelective(User user);

    /**
     * 根据主键ID查询并*更新所有字段*到db
     *
     * @param user
     * @return 更新结果（数量）
     */
    int updUserByID(User user);

    /**
     * 根据主键ID查询并删除用户对象
     *
     * @param id
     * @return 删除结果（数量）
     */
    int delUserByID(Integer id);

    /**
     * 根据主键ID查询并删除用户对象
     * 批量删除用户ID
     *
     * @param ids
     * @return 删除结果（数量）
     */
    int batchDelUserByIDs(List<String> ids);

}