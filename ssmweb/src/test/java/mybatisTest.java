import com.song.web.config.RootConfig;
import com.song.web.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by sj124 on 2016/9/10.
 */
public class mybatisTest {
    ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
    @Test
    public void test1(){
        SqlSessionFactory sqlSessionFactory= (SqlSessionFactory) context.getBean("sqlSessionFactory");
        SqlSession sqlSession= sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.selectAll();
    }
}
