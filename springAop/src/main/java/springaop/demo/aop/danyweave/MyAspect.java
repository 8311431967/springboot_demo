package springaop.demo.aop.danyweave;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import springaop.demo.aopDemo.MonitorTime;

import java.io.PrintWriter;
import java.util.Date;

/**
 * @author kunrong
 * @date 2018/12/24 21:00
 */
@Aspect
public class MyAspect {
    /**
     * 前置通知
     */
    @Before("execution(* springaop.demo.aop.danyweave.UserDao.addUser(..))")
    public void before(){
        System.out.println("前置通知....");
    }

    /**
     * 后置通知
     * returnVal,切点方法执行后的返回值
     */
    @AfterReturning(value="execution(* springaop.demo.aop.danyweave.UserDao.addUser(..))",returning = "returnVal")
    public void AfterReturning(Object returnVal){
        System.out.println("后置通知...."+returnVal);
    }


    /**
     * 环绕通知
     * @param joinPoint 可用于执行切点的类
     * @return
     * @throws Throwable
     */
    @Around("execution(* springaop.demo.aop.danyweave.UserDao.addUser(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知前....");
        Object obj= (Object) joinPoint.proceed();
        System.out.println("环绕通知后....");
        return obj;
    }
    @Around("execution(* springaop.demo.aopDemo.DingController.forMap(..))")
    public Object aroundTimer(ProceedingJoinPoint joinPoint)throws Throwable{

        return "";
    }

    /**
     * 抛出通知
     * @param e
     */
    @AfterThrowing(value="execution(* springaop.demo.aop.danyweave.UserDao.addUser(..))",throwing = "e")
    public void afterThrowable(Throwable e){
        System.out.println("出现异常:msg="+e.getMessage());
    }

    /**
     * 无论什么情况下都会执行的方法
     */
    @After(value="execution(* springaop.demo.aop.danyweave.UserDao.addUser(..))")
    public void after(){
        System.out.println("最终通知....");
    }


    /**
     * 定义切点函数，过滤controller包下的名称以Controller结尾的类所有方法
     */
    @Pointcut("execution(* springaop.demo.aopDemo.*Controller.*(..)))")
    void timer() {
    }
    @Around("timer()")
    public Object logTimer(ProceedingJoinPoint thisJoinPoint) throws Throwable {

        MonitorTime monitorTime=new MonitorTime();
        //获取目标类名称
        String clazzName = thisJoinPoint.getTarget().getClass().getName();
        //获取目标类方法名称
        String methodName = thisJoinPoint.getSignature().getName();

        monitorTime.setClassName(clazzName);//记录类名称
        monitorTime.setMethodName(methodName);//记录对应方法名称
        monitorTime.setLogTime(new Date());//记录时间

        // 计时并调用目标函数
        long start = System.currentTimeMillis();
        Object result = thisJoinPoint.proceed();
        long time = System.currentTimeMillis() - start;

        //设置消耗时间
        monitorTime.setComsumeTime(time);
        //把monitorTime记录的信息上传给监控系统，并没有实现，需要自行实现即可
        //MonitoruUtils.report(monitorTime)
        System.err.println(monitorTime);

        PrintWriter pw = new PrintWriter("./data/testTimeData");
        pw.print(monitorTime.toString());
        pw.flush();
        pw.close();

        return result;
    }
}
