package com.lagou.dao;




import com.lagou.domain.TAccount;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TestMapper {
 public List<TAccount> selectAll();
}
