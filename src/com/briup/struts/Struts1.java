package com.briup.struts;

import com.briup.bean.Student;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 注入对象中，需要提供类的get，set方法
 * @author alan
 * @date Oct 25, 2016 12:08:33 AM
 */
public class Struts1 extends ActionSupport{
	private String name;
	private int age;
	
	private Student stu;
	public Struts1(){
		System.out.println("new ============struts ");
	}

	@Override
	public String execute() throws Exception {
		
		System.out.println("i am struts1===========");
		return SUCCESS;
	}
	
	/*
	 * login action
	 */
	public String login() throws Exception{
		System.out.println("==========login======");
		System.out.println(stu.toString());
		return SUCCESS;
	}

	/*
	 * register action
	 */
	public String register() throws Exception{
		System.out.println("===========register====");
		return SUCCESS;
	}
	
	public Student getStu() {
		return stu;
	}
	public void setStu(Student stu) {
		this.stu = stu;
	}

}
