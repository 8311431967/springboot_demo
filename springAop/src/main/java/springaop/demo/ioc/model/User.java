package springaop.demo.ioc.model;

/**
 * @author kunrong
 * @date 2018/12/21 17:07
 */
public class User {

    private String name;
    private int age;

    //第一个构造函数
    public User(String name , int age){
        this.name=name;
        this.age=age;
    }
    //第二个构造函数
    public User(int age,String name){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
