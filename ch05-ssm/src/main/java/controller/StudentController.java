package controller;

import domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.StudentService;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/student")//这个类控制学生模块
public class StudentController {
    @Resource//自动注入的方式获得这个对象
    private StudentService studentService;

    //注册学生
    @RequestMapping("/addStudent.do")
    public ModelAndView addStudent(Student student){
        ModelAndView mv=new ModelAndView();
        String tips="注册失败";//给用户提示的字符串
        //调用service处理student对象
        int nums=studentService.addStudent(student);
        if(nums>0){
            //注册成功
            tips="学生["+student.getName()+"]注册成功";
        }
        //添加数据
        mv.addObject("tips",tips);
        //指定结果页面
        mv.setViewName("result");
        return mv;
    }

    //处理查询响应ajax
    @RequestMapping("/queryStudent.do")
    @ResponseBody//加这个标签才返回数据
    public List<Student> queryStudent(){
        //参数检查
        List<Student> students=studentService.findStudent();
        return students;
    }
}
