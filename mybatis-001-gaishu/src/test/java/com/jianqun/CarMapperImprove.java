package com.jianqun;

import com.jianqun.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class CarMapperImprove {
    @Test
    public void testInsertCarByUtil(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        int count = sqlSession.insert("insertCar");
        System.out.println(count);
        sqlSession.commit();
        sqlSession.close();
    }
}
