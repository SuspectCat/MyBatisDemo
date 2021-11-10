package com;

import com.mapper.UserMapper;
import com.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MapperTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void getFactory() throws IOException {
        SqlSessionFactoryBuilder sqlSessionFactory = new SqlSessionFactoryBuilder();
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory build = sqlSessionFactory.build(resourceAsStream);
        this.sqlSessionFactory = build;
    }

    @Test
    public void run() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        /*List<User> userALL = mapper.findUserALL();

        for (User user : userALL) {
            System.out.println(user);
        }*/

//        System.out.println(userALL);
        User user = new User();
//        user.setId(1);
        user.setUsername("n");
        user.setPassword("password");

//        int i = mapper.updateUserById(user);
//        sqlSession.commit();
//        System.out.println(i);
//        System.out.println(user);

        List<User> userByCondition = mapper.findUserByCondition(user);
        System.out.println(userByCondition);
    }

    @Test
    public void run2() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int[] arr = {1, 3};

        List<User> users = mapper.selectByArray(arr);

        for (User user : users) {
            System.out.println(user);
        }

//        int hello = mapper.updateUserPasswordById(1, "hello");
//
//        sqlSession.commit();
//
//        System.out.println(hello);
    }
}
