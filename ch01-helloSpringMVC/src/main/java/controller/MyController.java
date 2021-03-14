package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Controller 创建控制器对象用的，对象放在springmvc容器中的
 * 位置在类的上面
 * MyController能处理请求叫做：后端控制器（back controller）
 */
@Controller
public class MyController {
    //处理请求 springmvc中使用方法处理 方法可以有多种返回值，多种参数，方法名称也是自定义的

    /**
     * 准备使用doSome处理some.do的请求
     * @RequestMapping 请求映射，作用是把一个请求地址和一个方法绑定在一起
     *      属性：
     *          value 一个string，表示请求url地址的 value值必须是唯一的.使用时推荐地址以"/"开头         some.do
     *      位置：
     *          在方法上面 在类上面
     *          使用@RequestMapping修饰的方法叫做处理器方法，或者控制器方法。使用@RequestMapping修饰的方法是可以修饰请求的，类似servlet的doGet
     * @return
     * ModelAndView: 表示本次请求处理的结果
     *      Model:请求处理完成后要显示给用户的数据
     *      View:试图，如jsp等
     */
    @RequestMapping(value ="/some.do" )
    public ModelAndView doSome(){
        //doSome处理some.do
        ModelAndView mv=new ModelAndView();
        //添加数据,框架在请求的最后把数据放到request作用域 即：request.setAttribute("msg","欢迎使用springmvc做web") 框架的工作，开发者只需要把数据放到里面就行了
        mv.addObject("msg","欢迎使用springmvc做web");
        mv.addObject("func","执行doSome方法");

        //指定视图,试图的完整路径 框架对视图执行forward转发操作
        //mv.setViewName("/WEB-INF/view/show.jsp");
        mv.setViewName("show");
        return mv;
    }
}
