package com.lavasoft.stu.jtom.dao.impl;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.lavasoft.stu.jtom.dao.TabADAO;
import com.lavasoft.stu.jtom.entity.TabA;

/**
 * TabADAO
 *
 * @author leizhimin 2009-6-25 12:43:55
 */
public class TabADAOImpl extends SqlMapClientDaoSupport implements TabADAO {

	/**
	 * 保存一个TabA对象
	 *
	 * @param tabA
	 *            TabA对象
	 * @return 返回保存后的对象
	 */
	public TabA saveTabA(TabA tabA) {
		Long id = (Long) getSqlMapClientTemplate().insert("tab_a.insert", tabA);
		tabA.setId(id);
		return tabA;
	}

	/**
	 * 更新一个TabA
	 *
	 * @param tabA
	 *            TabA对象
	 * @return 返回更新后的对象
	 */
	public TabA updateTabA(TabA tabA) {
		getSqlMapClientTemplate().update("tab_a.update", tabA);
		return tabA;
	}

	/**
	 * 删除指定标识的一个TabA
	 *
	 * @param id
	 *            TabA标识
	 */
	public void deleteTabAById(Long id) {
		getSqlMapClientTemplate().delete("tab_a.deleteById", id);
	}

	/**
	 * 获取指定标识的TabA
	 *
	 * @param id
	 *            TabA标识
	 * @return 所查询到的TabA
	 */
	public TabA findTabAById(Long id) {
		return (TabA) getSqlMapClientTemplate().queryForObject("tab_a.findById", id);
	}
}
