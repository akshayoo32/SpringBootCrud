package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.model.Student;
import com.cjc.service.StudentSer;

@Controller
public class StudentContr {

	@Autowired
	StudentSer ser;

	@RequestMapping("/")
	public String log() {
		return "login";
	}

	@RequestMapping("/log")
	public String login(@RequestParam String user, @RequestParam String pass, Model m) {

		Student s = ser.loginCheck(user, pass);

		if (s.equals(null)) {
			return "login";
		} else {
			List<Student> slist = ser.getAllData();
			m.addAttribute("data", slist);
			return "success";
		}
	}

	@RequestMapping("/reg")
	public String reg() {
		return "register";
	}

	@RequestMapping("/register")
	public String regi(@ModelAttribute Student stu) {
		ser.saveData(stu);
		return "login";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam int roll, Model m) {
		ser.delete(roll);
		List<Student> slist = ser.getAllData();
		m.addAttribute("data", slist);
		return "success";
	}

	@RequestMapping("/update")
	public String update(@RequestParam int roll, Model m) {

		Student s = ser.update(roll);
		m.addAttribute("data", s);
		return "update";
	}

	@RequestMapping("/fupdate")
	public String fupdate(@ModelAttribute Student s, Model m) {
		ser.saveData(s);
		List<Student> slist = ser.getAllData();
		m.addAttribute("data", slist);
		return "success";
	}

}
