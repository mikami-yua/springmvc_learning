package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import vo.Student;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;


@Controller
public class MyController {

    /**
     * 方法返回string表示逻辑视图名称，需要配置视图解析器（使用逻辑名称）
     * @param name
     * @param age
     * @return
     */
    @RequestMapping(value ="/returnstring.do")
    public String doView(String name,Integer age){
        //show是逻辑视图名称，项目中配置了视图解析器
        return "show";
    }

    /**
     * 处理器方法返回一个student，通过框架转为json
     * @ResrponseBody：
     *      作用：把处理器方法返回对象转为json后没通过httpservletResponse输出给浏览器
     *      位置在方法定义的上面，和其他注解没有顺序关系
     * @param name
     * @param age
     * @return
     */
    @ResponseBody
    @RequestMapping(value ="/returnstudentjson.do")
    public Student doStudentJsonObject(String name,Integer age){
        //调用service
        Student student=new Student();
        student.setName("李四同学");
        student.setAge(20);
        return student;//对象会被框架转为json
    }

    /**
     * 处理器方法返回一个list集合
     * @param name
     * @param age
     * @return
     */
    @ResponseBody
    @RequestMapping(value ="/returnstudentjsonarray.do")
    public List<Student> doStudentJsonObjectArray(String name, Integer age){
        List<Student> list=new ArrayList<>();
        Student student=new Student();
        student.setName("李四同学");
        student.setAge(20);
        list.add(student);
        student=new Student();
        student.setName("张三");
        student.setAge(21);
        list.add(student);
        return list;
    }

    /**
     * 处理器方法呢返回一个string，是个数据，不是视图
     * 区分是数据还是视图看有没有ResponseBody
     * 有的话返回的是文本数据
     * 否则返回的是视图
     */
    @ResponseBody
    @RequestMapping(value ="/returnstring.do")
    public String doStringData(String name, Integer age){
        return "hello springmvc";
    }
}