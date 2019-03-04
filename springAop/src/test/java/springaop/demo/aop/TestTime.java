package springaop.demo.aop;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springaop.demo.aopDemo.DingController;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kunrong
 * @date 2018/12/25 10:05
 */
public class TestTime {
    @Test
    public void testTime() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("dnayWeave.xml");
        DingController controller = (DingController)ac.getBean("dingController");
        //controller.forTest();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        controller.forMap();
        controller.forhaha();

    }
    @Test
    public void hashMapTest() {
        long start = System.currentTimeMillis();
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 100000000; i++) {
            hashSet.add(i);
        }
        Assert.assertTrue(hashSet.contains(67));
        Assert.assertTrue(hashSet.contains(670));
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

}
