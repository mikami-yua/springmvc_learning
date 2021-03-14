package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

}
