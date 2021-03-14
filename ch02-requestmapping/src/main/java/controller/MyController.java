package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *  @RequestMapping 放在类的上面
 *      value：表示所有请求地址的公共部分，称为模块名称
 *      优点：更改模块名方便
 *
 */
@Controller
@RequestMapping("/test")
public class MyController {

    /**
     * @RequestMapping:请求映射
     *      属性：method 表示请求的方式 值是requestMethod类的枚举值 (常用get post)
     *      例如：get方式 RequestMethod.GET
     *      指定some.do使用get的请求方式
     * @return
     */
    @RequestMapping(value ="/some.do",method = RequestMethod.GET)
    public ModelAndView doSome(){
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","欢迎使用springmvc做web");
        mv.addObject("func","执行doSome方法");
        mv.setViewName("show");
        return mv;
    }

    //other.do使用post请求方式
    @RequestMapping(value ="/other.do",method = RequestMethod.POST)
    public ModelAndView doOther(){
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","=====欢迎使用springmvc做web=====");
        mv.addObject("func","执行doOther方法");
        mv.setViewName("other");
        return mv;
    }

    //不指定请i去方式没有限制
    @RequestMapping(value ="/first.do")
    public ModelAndView doFirst(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","=====欢迎使用springmvc做web====="+request.getParameter("name"));
        mv.addObject("func","执行doFirst方法");
        mv.setViewName("other");
        return mv;
    }
}
