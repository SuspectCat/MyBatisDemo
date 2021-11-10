package com.mapper;

import com.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> findUserALL();

    User findUserById(Integer id);

    List<User> findUserByCondition(User user);

    int updateUserById(User user);

    List<User> selectByArray(int[] array);

    List<User> selectByList(List<Integer> list);

    int updateUserPasswordById(@Param("userId") int userId, @Param("password") String password);
}
