package springaop.demo.ioc.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author kunrong
 * @date 2018/12/21 16:43
 */
public class Account {
    private String name;
    private String pwd;
    private List<String> citys;
    private Set<String> friends;
    private Map<Integer,String> books;

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setCitys(List<String> citys) {
        this.citys = citys;
    }

    public void setFriends(Set<String> friends) {
        this.friends = friends;
    }

    public void setBooks(Map<Integer, String> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", citys=" + citys +
                ", friends=" + friends +
                ", books=" + books +
                '}';
    }
}