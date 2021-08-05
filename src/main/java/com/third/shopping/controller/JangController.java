package com.third.shopping.controller;

import com.third.shopping.model.vo.JangVO;
import com.third.shopping.service.JangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@CrossOrigin
@RestController
public class JangController {

    @Autowired
    JangService jangService;

    @PostMapping("/janginsert")
    public int jangInsertItem(@RequestBody JangVO jangVO, Principal principal){

        return jangService.jangInsertItem(jangVO, principal);
    }

}
