package com.entor.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entor.entity.Student;
import com.entor.mapper.IStudentMapper;
import com.entor.service.IStudentService;


@Service
public class StudentServiceImpl implements IStudentService{

	@Autowired
	private IStudentMapper studentMapper;

	@Override
	public Student queryById(int id) {
		// TODO Auto-generated method stub
		return studentMapper.queryById(id);
	}

	@Override
	public List<Student> queryByPage(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return studentMapper.queryByPage(currentPage, pageSize);
	}

	@Override
	public void add(Student student) {
		// TODO Auto-generated method stub
		studentMapper.add(student);
	}

	@Override
	public void deleteMore(Student ids) {
		studentMapper.deleteMore(ids);
		
	}

	@Override
	public void deleteById(int id) {
		studentMapper.deleteById(id);
		
	}

	@Override
	public void addMore(List<Student> list) {
		studentMapper.addMore(list);
		
	}

	@Override
	public List<Student> queryAll() {
		// TODO Auto-generated method stub
		return studentMapper.queryAll();
	}
}
