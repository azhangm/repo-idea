package com.lagou.service;

import com.lagou.domain.TAccount;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface TestService {

    public List<TAccount> findAll();
}
