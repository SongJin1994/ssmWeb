import org.junit.Test;

import java.util.Scanner;

/**
 * Created by sj124 on 2016/9/11.
 */
public class MyTest {
    @Test
    public void txTest(){
        int n = 998;
        int num = 0;
        for(int i=1;i<=n/2;i++){
            if(isZNum(i)){
                if(isZNum(n-i)){
                    System.out.println(i+"+"+(n-i)+"="+n);
                    num++;
                }
            }
        }
        System.out.println(num);
    }
    public static boolean isZNum(int n){
        boolean flag = true;
        for(int i=2;i<=n/2;i++){
            if(n%i == 0){flag = false;break;}
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int n = scanner.nextInt();
        int num = 0;
        for(int i=1;i<=n/2;i++){
            if(isZNum(i)){
                if(isZNum(n-i)){
                    System.out.println(i+"+"+(n-i)+"="+n);
                    num++;
                }
            }
        }
        System.out.println(num);
    }
}
