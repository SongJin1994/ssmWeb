import com.song.web.config.RootConfig;
import com.song.web.config.WebConfig;
import com.song.web.mapper.UserMapper;
import com.song.web.service.ClassService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sj124 on 2016/9/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
public class mybatisTest {
    @Resource
    UserMapper user;
    @Resource
    ClassService classService;
    @Test
    public void test1(){
        List list =user.selectAll();
        list.forEach(s -> System.out.println(s));

    }
    @Test
    public void test2(){
        List list = classService.showAll();
        list.forEach(s -> System.out.println(s));
    }
}
