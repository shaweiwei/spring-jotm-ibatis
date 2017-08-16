package com.lavasoft.stu.jtom.test;

import org.springframework.context.ApplicationContext;

import com.lavasoft.stu.jtom.entity.TabA;
import com.lavasoft.stu.jtom.entity.TabB;
import com.lavasoft.stu.jtom.service.StuJotmService;
import com.lavasoft.stu.jtom.util.ApplicationContextUtil;

public class Test {
	private static ApplicationContext ctx = ApplicationContextUtil.getApplicationContext();
	private static StuJotmService ser = (StuJotmService) ctx.getBean("stuJotmService");

	public static void test_() {
		TabA a = new TabA();
		a.setId(8L);
		a.setName("aaa4");
		a.setAddress("address a4");

		TabB b = new TabB();
		b.setId(8L);
		b.setName("bbb3");
		b.setAddress("address b5");
		
		ser.saveAB(a, b);
	}

	public static void main(String[] args) {
		test_();
	}
}
