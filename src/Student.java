/**
 * 类通常有属性field或成员变量+方法
 * Created by ChangChang on 2019/1/5.
 */
public class Student {
    //属性
    int id;
    String name;
    int age;
    Computer comp;

    //方法
     void study(){
        System.out.println("学习，使用电脑："+comp.brand);
    }
    void play(){
        System.out.println(name+"在打游戏");
    }
    //构造方法，用于创造这个类的对象，无参的构造方法可以由系统自动创建
    Student(){

    }
    //javac Student.java       java Student内存分析从这开始
    public static void main(String[] args) {
        Student stu1=new Student();//创建一个对象
        stu1.id=2555;
        stu1.name="畅丽瑶";

        Computer c1=new Computer();
        c1.brand="联想";

        stu1.comp=c1;
        stu1.study();
        stu1.play();
    }

}

//Computer类
class Computer{
    String brand;
}

