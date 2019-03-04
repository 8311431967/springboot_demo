package springaop.demo.mySpringAOP;

/**
 * @author kunrong
 * @date 2019/3/4 15:38
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHelloWorld() {
        System.out.println("hello world.");
    }
}
