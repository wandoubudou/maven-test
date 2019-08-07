package top.aiprogram.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import top.aiprogram.dao.StudentMapper;
import top.aiprogram.entity.Student;
import top.aiprogram.entity.Teacher;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentMapper studentMapper;

    @Autowired @Qualifier("teacherServiceImpl")
    private TeacherService teacherService;


    @Override
    @Transactional(propagation = Propagation.REQUIRED)      //默认传播方法---->如果已经开启事务，则添加到其中，如果没开启，则新开一个事务
    public int createStudent(Student student) {
        studentMapper.insert(student);
        Teacher teacher = new Teacher("hahaha","man");
        teacher.setTid(1);
        teacherService.createTeacher(teacher);
        return 0;
    }
}
