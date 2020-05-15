package com.cjc.service;

import java.util.List;

import com.cjc.model.Student;

public interface StudentSer {
void saveData(Student stu);
Student loginCheck(String user,String pass);
List<Student> getAllData();
void delete(int roll);
Student update(int roll);

//void saveData(Student s);

}
