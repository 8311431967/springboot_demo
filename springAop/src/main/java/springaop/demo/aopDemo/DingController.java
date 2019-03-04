package springaop.demo.aopDemo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kunrong
 * @date 2018/12/25 9:55
 */
public class DingController {
    private Map<Integer,Integer> map = new HashMap();

    public void forTest() {
        for (int i = 0; i < 100000; i++) {
            map.put(i,i+100);
        }
        System.out.println("初始完毕");
    }

    public void forMap() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (Integer i: map.keySet()){
            System.out.println(i);
        }
        System.out.println("输出完毕" );
    }

    public void forhaha() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(i++);
        }
        System.out.println("forhaha");
    }
}
