package com.package1.College;

import java.nio.file.FileSystem;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.package1.Univ.Courses;
import com.package1.Univ.EducDept;

public class Dmv {
	private EducDept educDept =null ;	

	public EducDept getEducDept() {
		return educDept;
	}

	public void setEducDept(EducDept educDept) {
		this.educDept = educDept;
	}

	public static void main(String[] args) {
		Dmv dmv = (Dmv)getBeanFactory().getBean("dmv");
		dmv.callCourses();

	}

	public void callCourses() {

		educDept.getCommerce();
		educDept.getEnglish();
		educDept.getMath();
	}

	public static BeanFactory getBeanFactory() {
		Resource resource = new FileSystemResource("beans.xml");
		XmlBeanFactory beanFactory = new XmlBeanFactory(resource);
		return beanFactory;
	}

}
