package com.third.shopping.service;

import com.third.shopping.dao.JangDAO;
import com.third.shopping.model.entity.MemberEntity;
import com.third.shopping.model.vo.JangVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Principal;

@Service
public class JangService {
    @Autowired
    MemberService memberService;
    @Autowired
    JangDAO jangDAO;

    public int jangInsertItem(JangVO jangVO, Principal principal) {

        MemberEntity memberEntity = memberService.findPrincipal(principal);
        jangVO.setMem_idx(memberEntity.getMem_idx());
        return jangDAO.jangInsertItem(jangVO);
    }
}
