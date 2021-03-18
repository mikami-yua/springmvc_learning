package service.impl;

import dao.StudentDao;
import domain.Student;
import org.springframework.stereotype.Service;
import service.StudentService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    //引用类型的自动注入 @Autowired @Resource
    @Resource//在spring框架中以注册service对象，通过自动注入标签使框架生成对象
    private StudentDao studentDao;

    @Override
    public int addStudent(Student student) {
        int nums=studentDao.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> findStudent() {
        return studentDao.selectStudents();
    }
}
