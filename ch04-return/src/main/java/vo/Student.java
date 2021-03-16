package vo;

/**
 * 保存请求参数值的类
 * 属性名需要和请求中的参数名一致
 */
public class Student {
    private String name;
    private Integer age;

    public Student() {
        System.out.println("student 无参数构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
