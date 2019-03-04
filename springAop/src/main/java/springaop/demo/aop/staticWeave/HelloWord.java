package springaop.demo.aop.staticWeave;

/**
 * @author kunrong
 * @date 2018/12/24 20:27
 */
public class HelloWord {
    public void sayHello(){
        System.out.println("hello world !");
    }
    public static void main(String args[]){
        HelloWord helloWord =new HelloWord();
        helloWord.sayHello();
    }
}
