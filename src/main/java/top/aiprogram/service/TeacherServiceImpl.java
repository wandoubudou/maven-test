package top.aiprogram.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.aiprogram.dao.TeacherMapper;
import top.aiprogram.entity.Teacher;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherMapper teacherMapper;

    @Override
    @Transactional
    public int createTeacher(Teacher teacher) {
        teacherMapper.insert(teacher);
        return 0;
    }
}
