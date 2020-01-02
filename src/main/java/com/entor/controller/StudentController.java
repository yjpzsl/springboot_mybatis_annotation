package com.entor.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entor.entity.Student;
import com.entor.service.IStudentService;
import com.entor.service.impl.StudentServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
public class StudentController {

	@Autowired
	private IStudentService studentService;
	
	@RequestMapping("/queryById")
	public Student queryById(int id) {
		return studentService.queryById(id);		
	}
	
	@RequestMapping("/queryByPage")
	public List<Student> queryByPage(int currentPage, int pageSize){
		return studentService.queryByPage(currentPage, pageSize);
	}
	
	@RequestMapping("/queryByPage2")
	public PageInfo<Student> queryByPage2(int currentPage, int pageSize){
		PageHelper.startPage(currentPage, pageSize);
		List<Student> list = studentService.queryAll();
		PageInfo<Student> pi=new PageInfo<>(list);
		return pi;
	}
	
	@RequestMapping("/add")
	public void add() {
		Student student =new Student();
		student.setName("张三");
		student.setUsername("zhangsan");
		student.setPassword("123456");
		student.setSex(1);
		student.setAge(20);
		student.setBirthday(new Date());
		studentService.add(student);
	}
	
	@RequestMapping("/deleteById")
	public void deleteById(int id) {
		studentService.deleteById(id);
	}
	
	@RequestMapping("/deleteMore")
	public void deleteMore(Student ids) {
		studentService.deleteMore(ids);
	}
	
	@RequestMapping("/addMore")
	public void addMore() {
		List<Student> list = new ArrayList<>();
		for (int i = 1500; i <=100; i++) {
			Student s = new Student();
			s.setName("沃德发"+i);
		}
	}
}
