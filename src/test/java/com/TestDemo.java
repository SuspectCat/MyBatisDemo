package com;

import com.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestDemo {

    @Test
    public void run() throws IOException {

        /*InputStream resourceAsStream1 = Thread.currentThread().getContextClassLoader().getResourceAsStream("");*/
//        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.xml");
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
//
//        SqlSession sqlSession = sqlSessionFactory.openSession();
        /*List<User> users = sqlSession.selectList("UserMapper.selectUser");

        System.out.println(users);*/

        /*int o = sqlSession.selectOne("UserMapper.selectCount");
        System.out.println(o);*/

        /*User o = sqlSession.selectOne("UserMapper.selectUserById", 1);
        System.out.println(o);*/

        /*User insertUser = new User();

        insertUser.setId(10);
        insertUser.setUsername("MAGA");
        insertUser.setPassword("root");
        insertUser.setSex("0");

        int insert = sqlSession.insert("UserMapper.insertUser", insertUser);
        sqlSession.commit();
        System.out.println(insert);*/

        /*User updateUser = new User();

        updateUser.setId(1);
        updateUser.setUsername("neko");

        int update = sqlSession.update("UserMapper.modifyUserNameById", updateUser);

        sqlSession.commit();

        System.out.println(update);*/

        /*int delete = sqlSession.delete("UserMapper.deleteUser", 10);

        sqlSession.commit();

        System.out.println(delete);*/

//        List<User> users = sqlSession.selectList("UserMapper.selectByLimit", "n");

//        System.out.println(users);
    }

    @Test
    public void run2() throws IOException {
//        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.xml");
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
//
//        SqlSession sqlSession = sqlSessionFactory.openSession();

        /* 开启分页 */
       /* PageHelper.startPage(1, 2);
        List<User> objects = sqlSession.selectList("UserMapper.selectUser");

        PageInfo<User> info = new PageInfo<>(objects);

        System.out.println(info.getTotal());

        *//* 获取当前这一页数据 *//*
        List<User> list = info.getList();
        for (User us : list) {
            System.out.println(us);*/
//        }
    }

    @Test
    public void run3() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = new User();
        user.setUsername("gaga");
        user.setSex("1");
        user.setPassword("hello");

        int insert = sqlSession.insert("UserMapper.insertUserDemo", user);

        sqlSession.commit();

        System.out.println(insert);
        System.out.println(user);
    }
}
