package springaop.demo.mySpringAOP;

import java.lang.reflect.Proxy;

/**
 * @author kunrong
 * @date 2019/3/4 15:37
 */
public class SimpleAOP {
    public static Object getProxy(Object bean, Advice advice) {
        return Proxy.newProxyInstance(SimpleAOP.class.getClassLoader(),
                bean.getClass().getInterfaces(), advice);
    }
}
