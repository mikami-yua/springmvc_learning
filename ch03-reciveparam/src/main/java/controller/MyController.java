package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import vo.Student;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@Controller
public class MyController {

    /**
     * 实现逐个接收请求参数：
     *      要求：处理器方法（控制器方法）的形参名和请求中的参数名必须一致。
     *          同名的请求参数赋值给同名的形参
     *
     * @return
     */
    @RequestMapping(value ="/receiveparam.do")
    public ModelAndView doSome(String name,Integer age){
        ModelAndView mv=new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");
        return mv;
    }


    /**
     * 请求中参数名和处理器方法的形参名不一样
     * 使用@requsetParam：解决请求中参数民集合形参名不犹豫的问题
     *      属性：1.value 请求中的参数名
     *            2.required 是个boolean 默认是true （表示请求中必须包含此参数值）
     *      位置：在处理器方法的形参定义之前
     *      @RequestParam(value = "rname") String name 请求中rname的参数值赋值给name
     *
     *
     * @param name
     * @param age
     * @return
     */
    @RequestMapping(value ="/receiveparam2.do")
    public ModelAndView doSome2(@RequestParam(value = "rname",required = false) String name, @RequestParam(value = "rage",required = false)Integer age){
        ModelAndView mv=new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");
        return mv;
    }

    /**
     * 对象接收参数
     * 同时接收多个参数
     * 处理器方法的是形参对象，这个对象的属性名和请求中参数名是一致的
     * 框架会创建形参的java对象，给属性赋值（请求中的参数是name，框架会调用setName）
     * @return
     */
    @RequestMapping(value ="/receiveobject.do")
    public ModelAndView receiveobject(Student myStudent){
        ModelAndView mv=new ModelAndView();
        mv.addObject("myname",myStudent.getName());
        mv.addObject("myage",myStudent.getAge());
        mv.addObject("mystudent",myStudent);
        mv.setViewName("show");
        return mv;
    }
}
