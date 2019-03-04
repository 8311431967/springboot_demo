package springaop.demo.ioc;

import org.junit.Test;
import springaop.demo.mySpringIOC.Car;
import springaop.demo.mySpringIOC.SimpleIOC;
import springaop.demo.mySpringIOC.Wheel;

/**
 * @author kunrong
 * @date 2019/3/4 14:20
 */
public class SimpleIOCTest {
    @Test
    public void getBean() throws Exception {
        String location = SimpleIOC.class.getClassLoader().getResource("mySpring-test.xml").getFile();
        SimpleIOC bf = new SimpleIOC(location);
        Wheel wheel = (Wheel) bf.getBean("wheel");
        System.out.println(wheel);
        Car car = (Car) bf.getBean("car");
        System.out.println(car);
    }
}
