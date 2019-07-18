package com.fsl.springbootsingledruid.mapper;


import com.fsl.springbootsingledruid.dto.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @author 2019年5月9日16:31:09
 */
@Mapper
public interface StudentMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    int getCount();

    void batchInsert(List<Student> students);

    List<Student> selectAll();
}
