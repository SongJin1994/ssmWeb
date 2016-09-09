import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sj124 on 2016/9/9.
 */
public class LambdaTest {
    @Test
    public void Test1(){
        String[] str = {"one","two","three","four"};
        List<String> strList = new ArrayList<String>();
        strList.add("one");
        strList.add("two");
        strList.add("three");
        strList.add("four");
        strList.forEach(s -> System.out.println(s));
    }
}
