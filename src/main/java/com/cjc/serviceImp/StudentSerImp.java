 package com.cjc.serviceImp;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.dao.StudentDao;
import com.cjc.model.Student;
import com.cjc.service.StudentSer;

@Service
public class StudentSerImp implements StudentSer {

	@Autowired
	StudentDao dao;

	@Override
	public void saveData(Student stu) {
		// TODO Auto-generated method stub
		dao.save(stu);
	}

	@Override
	public Student loginCheck(String user, String pass) {
		// TODO Auto-generated method stub
		return dao.findAllByUserAndPass(user, pass);
	}

	@Override
	public List<Student> getAllData() {
		List<Student> slist = (List<Student>) dao.findAll();
		return slist;

	}

	@Override
	public void delete(int roll) {

		// TODO Auto-generated method stub
		dao.deleteById(roll);

	}

	@Override
	public Student update(int roll) {
		// TODO Auto-generated method stub
		Student s = dao.findById(roll).get();
		return s;
	}

}
