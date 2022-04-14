//import com.lagou.dao.TestMapper;
//import com.lagou.domain.TAccount;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.junit.Test;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.List;
//
//public class Tesst {
//    @Test
//    public void test() throws IOException {
//        InputStream stream = Resources.getResourceAsStream("sqlConfig.xml");
////        构建工厂
//        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
//        SqlSession sqlSession = build.openSession();
//        System.out.println(sqlSession);
//        TestMapper mapper = sqlSession.getMapper(TestMapper.class);
//        System.out.println(mapper);
//        List<TAccount> accountList = mapper.selectAll();
//        for (TAccount account : accountList) {
//            System.out.println(account);
//        }
//    }
//}
