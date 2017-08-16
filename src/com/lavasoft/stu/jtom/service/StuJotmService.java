package com.lavasoft.stu.jtom.service;

import com.lavasoft.stu.jtom.entity.TabA;
import com.lavasoft.stu.jtom.entity.TabB;

/**
 * 测试JOTM的Service
 *
 * @author leizhimin 2009-6-25 12:53:55
 */
public interface StuJotmService {
	/**
	 * 同时保存TabA、TabB
	 *
	 * @param a
	 *            TabA对象
	 * @param b
	 *            TabB对象
	 */
	void saveAB(TabA a, TabB b);

	/**
	 * 同时更新TabA、TabB
	 *
	 * @param a
	 *            TabA对象
	 * @param b
	 *            TabB对象
	 */
	void updateAB(TabA a, TabB b);

	/**
	 * 删除指定id的TabA、TabB记录
	 *
	 * @param id
	 *            指定id
	 */
	void deleteABif(Long id);
}
