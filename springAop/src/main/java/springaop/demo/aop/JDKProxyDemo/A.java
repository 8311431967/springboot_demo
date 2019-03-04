package springaop.demo.aop.JDKProxyDemo;

/**
 * @author kunrong
 * @date 2018/12/25 10:29
 */
public class A  implements ExInterface{
    public void execute(){
        System.out.println("执行A的execute方法...");
    }
}
