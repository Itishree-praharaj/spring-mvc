package com.jsp.springmvc.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.springmvc.dao.student;
import com.jsp.springmvc.dao.studentDao;

@Controller
public class HomeController {
	@Autowired
	studentDao studentdao;
	
	@RequestMapping("/hello")
	public ModelAndView m1 (@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
	 ModelAndView mav= new ModelAndView("displayresult");
	int c= num1+num2;
	mav.addObject("output",c);
		return mav;
	}
	
	@RequestMapping("/hlo")
	public String m1(@RequestParam("id") int id, @RequestParam("String") String name, @RequestParam("age") int age, @RequestParam("mobilenumber") long mobilenumber) {
        System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(mobilenumber);
		return "index";
	}
		
	@RequestMapping("/hi")
	public ModelAndView m2 () {
	ModelAndView mav= new ModelAndView("index");
	return mav;
	}
	
	//@RequestMapping("/savestudent")
	//public ModelAndView saveStudent(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("age") int age) {
		// Student s=new Student();
		// s.setId(id);
		// s.setName(name);
		// s.setAge(age);
		// studentdao. saveStudent(s);
		//ModelAndView mav= new ModelAndView("StudentForm");
		//mav.addObject("msg","student saved successfully");
		//return mav;
		
	//}
	@RequestMapping("/addstudent")
	public ModelAndView addStudent() {
		ModelAndView mav= new ModelAndView("StudentForm1");
		student s= new student();
		mav.addObject("student",s);
		return mav;
	}
	@RequestMapping("/saveStudent")
	public ModelAndView saveStudent(@ModelAttribute("student") student s) {
		ModelAndView mav= new ModelAndView("Home");
		studentdao.saveStudent(s);
		return mav;
	}
	
	@RequestMapping("/viewallstudents")
	public ModelAndView viewAllStudents() {
		ModelAndView mav= new ModelAndView("allstudents");
		List<student> students = studentdao. fetchAllstudents();
		 mav.addObject("allstudents",students);
		 return mav;
	}
	
}
