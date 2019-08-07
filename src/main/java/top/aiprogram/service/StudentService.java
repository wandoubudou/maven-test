package top.aiprogram.service;

import top.aiprogram.entity.Student;

public interface StudentService {

    //service 命名规范一般是create
    //insert 一般再dao层
    int createStudent(Student student);


}
