package top.aiprogram.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import top.aiprogram.entity.Student;
import top.aiprogram.entity.User;
import top.aiprogram.service.StudentService;

@Controller
@RequestMapping("student")
public class StudentController {

    @Autowired @Qualifier("studentServiceImpl")
    private StudentService studentService;


    @RequestMapping("test")
    public ModelAndView testStudent(@RequestBody Student student){
        ModelAndView view = new ModelAndView("test");
        studentService.createStudent(student);
        view.addObject(student);
        return view;
    }
}
