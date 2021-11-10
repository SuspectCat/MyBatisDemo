package com;

import com.mapper.DepartmentMapper;
import com.mapper.EmployeeMapper;
import com.pojo.Department;
import com.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TableTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void getSqlSessionFactory() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Test
    public void run() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
        List<Department> byDepartmentId = mapper.findByDepartmentId(1);

        for (Department department : byDepartmentId) {
            System.out.println(department);
        }

        System.out.println("=============================");

        EmployeeMapper mapper1 = sqlSession.getMapper(EmployeeMapper.class);
        Employee employeeByEmployeeId = mapper1.findEmployeeByEmployeeId(2);

        System.out.println(employeeByEmployeeId);

        sqlSession.close();
    }
}
