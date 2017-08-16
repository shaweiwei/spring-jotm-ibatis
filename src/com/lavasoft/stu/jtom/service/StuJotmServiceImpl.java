package com.lavasoft.stu.jtom.service;

import org.springframework.transaction.annotation.Transactional;

import com.lavasoft.stu.jtom.dao.TabADAO;
import com.lavasoft.stu.jtom.dao.TabBDAO;
import com.lavasoft.stu.jtom.entity.TabA;
import com.lavasoft.stu.jtom.entity.TabB;

/**
 * Created by IntelliJ IDEA.
 *
 * @author leizhimin 2009-6-25 12:58:48
 */
//@Transactional
public class StuJotmServiceImpl implements StuJotmService {
	private TabADAO tabADAO;
	private TabBDAO tabBDAO;

	/**
	 * 同时保存TabA、TabB
	 *
	 * @param a
	 *            TabA对象
	 * @param b
	 *            TabB对象
	 */
//	@Transactional(readOnly=false)
	public void saveAB(TabA a, TabB b) {
		tabADAO.saveTabA(a);
		tabBDAO.saveTabB(b);
	}

	/**
	 * 同时更新TabA、TabB
	 *
	 * @param a
	 *            TabA对象
	 * @param b
	 *            TabB对象
	 */
	// @Transactional(readOnly=false)
	public void updateAB(TabA a, TabB b) {
		tabADAO.updateTabA(a);
		tabBDAO.updateTabB(b);
	}

	/**
	 * 删除指定id的TabA、TabB记录
	 *
	 * @param id
	 *            指定id
	 */
	// @Transactional(readOnly=false)
	public void deleteABif(Long id) {
		tabADAO.deleteTabAById(id);
		tabBDAO.deleteTabBById(id);
	}

	public void setTabADAO(TabADAO tabADAO) {
		this.tabADAO = tabADAO;
	}

	public void setTabBDAO(TabBDAO tabBDAO) {
		this.tabBDAO = tabBDAO;
	}
}
