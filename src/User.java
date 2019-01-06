/**
 * 测试构造方法重载
 * Created by ChangChang on 2019/1/6.
 */
public class User {
    int id;
    String name;
    String pwd;

    public User(){

    }
    public User(int id,String name,String pwd){
        super();//构造方法的第一句总是super
        this.id=id;//this表示创建好的对象
        this.name=name;
        this.pwd=pwd;
    }

    public static void main(String[] args) {
        User u1=new User();
        User u2 =new User(2555,"畅丽瑶","123456");
    }
}
