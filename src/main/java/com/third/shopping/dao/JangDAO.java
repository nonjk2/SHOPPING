package com.third.shopping.dao;

import com.third.shopping.model.vo.JangVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("jangDao")
public class JangDAO {

    @Autowired
    SqlSession sqlsession;

    public int jangInsertItem(JangVO jangVO1) {
        System.out.println(jangVO1.getMem_idx());
        System.out.println(jangVO1.getItemcount());
        System.out.println(jangVO1.getItem_idx());
        return sqlsession.insert("j.jangInsertItem",jangVO1);
    }
}
