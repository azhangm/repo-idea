package com.lagouu.Control;

import com.lagou.domain.TAccount;
import com.lagou.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/test")
public class TestControl {
    @Autowired
    private Impl impl;
    @RequestMapping("/findAll")
    public List<TAccount> findAll(){
        List<TAccount> tAccounts = impl.findAll();
        return tAccounts;
    }
}
