package com.entor.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.entor.entity.Student;

public interface IStudentService {

	public Student queryById(int id);
	
	public List<Student> queryByPage(int currentPage,int pageSize);
	
	public void add(Student student);
	
	public void deleteById(int id);
	
	public void deleteMore(Student ids);
	
	public void addMore(List<Student> list);
	
	public List<Student> queryAll();
}
