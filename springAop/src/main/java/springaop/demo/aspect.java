package springaop.demo;

import org.aspectj.lang.JoinPoint;

/**
 * @author kunrong
 * @date 2018/12/21 15:05
 */
public class aspect {
    public void before(JoinPoint call) {
        String className = call.getTarget().getClass().getName();
        String methodName = call.getSignature().getName();
        Object[] args = call.getArgs();
        for (Object obj:args) {
            if (obj instanceof String) {
                System.out.println(methodName + "的参数为：" + obj);
            }
        }
        System.out.println("前置通知：" + className + "类的" + methodName+"开始执行了...");

    }

    public void after() {
        System.out.println("最终通知:不管方法有没有正常执行完成，一定会返回的");
    }

}
