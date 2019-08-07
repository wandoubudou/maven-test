package top.aiprogram.dao;

import top.aiprogram.entity.Teacher;
import top.aiprogram.entity.TeacherExample;
import top.aiprogram.entity.TeacherKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbggenerated Sat Jul 27 21:29:05 CST 2019
     */
    int countByExample(TeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbggenerated Sat Jul 27 21:29:05 CST 2019
     */
    int deleteByExample(TeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbggenerated Sat Jul 27 21:29:05 CST 2019
     */
    int deleteByPrimaryKey(TeacherKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbggenerated Sat Jul 27 21:29:05 CST 2019
     */
    int insert(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbggenerated Sat Jul 27 21:29:05 CST 2019
     */
    int insertSelective(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbggenerated Sat Jul 27 21:29:05 CST 2019
     */
    List<Teacher> selectByExample(TeacherExample example);


    List<Teacher> selectByTeacherIds(@Param("tids") List<Integer> tids);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbggenerated Sat Jul 27 21:29:05 CST 2019
     */
    Teacher selectByPrimaryKey(TeacherKey key);

    Teacher selectByPrimaryKeyWithStudent(Integer tid);

    List<Teacher> selectAllByPrimaryKeyWithStudent();
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbggenerated Sat Jul 27 21:29:05 CST 2019
     */
    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbggenerated Sat Jul 27 21:29:05 CST 2019
     */
    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbggenerated Sat Jul 27 21:29:05 CST 2019
     */
    int updateByPrimaryKeySelective(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbggenerated Sat Jul 27 21:29:05 CST 2019
     */
    int updateByPrimaryKey(Teacher record);
}