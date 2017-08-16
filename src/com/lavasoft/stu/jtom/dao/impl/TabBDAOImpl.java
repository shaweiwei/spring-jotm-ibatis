package com.lavasoft.stu.jtom.dao.impl;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.lavasoft.stu.jtom.dao.TabBDAO;
import com.lavasoft.stu.jtom.entity.TabB;

/**
* TabBDAO
*
* @author leizhimin 2009-6-25 12:43:55
*/
public class TabBDAOImpl extends SqlMapClientDaoSupport implements TabBDAO {

        /**
         * 保存一个TabB对象
         *
         * @param tabB TabB对象
         * @return 返回保存后的对象
         */
        public TabB saveTabB(TabB tabB) {
                Long id = (Long) getSqlMapClientTemplate().insert("tab_b.insert", tabB);
                tabB.setId(id);
                return tabB;
        }

        /**
         * 更新一个TabA
         *
         * @param tabA TabA对象
         * @return 返回更新后的对象
         */
        public TabB updateTabB(TabB tabB) {
                getSqlMapClientTemplate().update("tab_b.update", tabB);
                return tabB;
        }

        /**
         * 删除指定标识的一个TabA
         *
         * @param id TabA标识
         */
        public void deleteTabBById(Long id) {
                getSqlMapClientTemplate().delete("tab_b.deleteById",id);
        }

        /**
         * 获取指定标识的TabA
         *
         * @param id TabA标识
         * @return 所查询到的TabA
         */
        public TabB findTabBById(Long id) {
                return (TabB) getSqlMapClientTemplate().queryForObject("tab_b.findById",id);
        }

}
