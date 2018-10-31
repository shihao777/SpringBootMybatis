package com.shihao.service;

import java.util.List;

import com.shihao.model.User;

public interface UserService {
	 /**
     * 添加用户
     */
	User addUsers(User user);
	
	/**
     * 根据id获取用户
     */
	User getNameById(User user);

    /**
     * 全部用户列表
     */
    List<User> getNewsList(int page, int pageSize);

    /**
     * 删除用户
     */
    Boolean deleteUsers(User user);

    /**
     * 更新文章内容
     * @return
     */
    User updateUsers(User user);

}
