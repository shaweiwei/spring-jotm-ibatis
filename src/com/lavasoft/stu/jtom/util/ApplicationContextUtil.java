package com.lavasoft.stu.jtom.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring上下文工具
 *
 * @author leizhimin 2008-8-13 14:42:58
 */

public class ApplicationContextUtil {
	private static ApplicationContext applicationContext;

	static {
		if (applicationContext == null)
			applicationContext = rebuildApplicationContext();
	}

	/**
	 * 重新构建Spring应用上下文环境
	 *
	 * @return ApplicationContext
	 */
	public static ApplicationContext rebuildApplicationContext() {
		return new ClassPathXmlApplicationContext("/applicationContext.xml");
	}

	/**
	 * 获取Spring应用上下文环境
	 *
	 * @return
	 */
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	/**
	 * 简单的上下文环境测试
	 */
	public static void main(String[] args) {
		rebuildApplicationContext();
		if (applicationContext == null) {
			System.out.println("ApplicationContext is null");
		} else {
			System.out.println("ApplicationContext is not null!");
		}
	}
}
