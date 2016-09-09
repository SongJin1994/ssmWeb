import org.junit.Test;

/**
 * Created by sj124 on 2016/9/8.
 */
public class Fbtest {
    public int useFor(int n){
        int [] fb = new int[1000];
        fb[0] = 0;
        fb[1] = 1;
        for (int i = 1;i <=n-2;i++){
            fb[i+1] = fb[i] + fb[i-1];
        }
        return fb[n-1];

    }
    public int useD(int n){
        if (n == 1) return 0;
        if (n == 2) return 1;
        if (n>2) {
            return useD(n - 1) + useD(n - 2);
        }else {
            return Integer.parseInt(null);
        }
    }
    @Test
    public void useForTest(){
        int n = 1000;
        System.out.println(useFor(n));
    }
    @Test
    public void useDTest(){
        int n = 100;
        System.out.println(useD(n));
    }
}
