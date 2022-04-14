package com.lagou.service;

import com.lagou.dao.TestMapper;
import com.lagou.domain.TAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service  // 交 到 ioc 容器中
public class Impl implements TestService {
    @Autowired
    private TestMapper testMapper;
    @Override
    public List<TAccount> findAll() {
        List<TAccount> tAccounts = testMapper.selectAll();
        return tAccounts;
    }
}
