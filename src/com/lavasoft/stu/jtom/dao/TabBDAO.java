package com.lavasoft.stu.jtom.dao;

import com.lavasoft.stu.jtom.entity.TabB;

/**
* TabADAO
*
* @author leizhimin 2009-6-25 12:39:19
*/
public interface TabBDAO {

        /**
         * 保存一个TabA对象
         *
         * @param tabA TabA对象
         * @return 返回保存后的对象
         */
	TabB saveTabB(TabB tabB);

        /**
         * 更新一个TabA
         *
         * @param tabA TabA对象
         * @return 返回更新后的对象
         */
	TabB updateTabB(TabB tabB);

        /**
         * 删除指定标识的一个TabA
         *
         * @param id TabA标识
         */
        void deleteTabBById(Long id);

        /**
         * 获取指定标识的TabA
         *
         * @param id TabA标识
         * @return 所查询到的TabA
         */
        TabB findTabBById(Long id);
}