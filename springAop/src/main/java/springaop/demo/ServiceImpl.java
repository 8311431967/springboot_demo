package springaop.demo;

/**
 * @author kunrong
 * @date 2018/12/21 15:04
 */
public class ServiceImpl implements Service {
    @Override
    public void save(String info) {
        System.out.println("info " + info);
    }
}
