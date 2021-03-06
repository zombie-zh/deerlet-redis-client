/**
 * 
 */
package com.zuoxiaolong.deerlet.redis.client.command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 游标默认的实现类
 *
 * @author zuoxiaolong
 * @since 2015 2015年3月6日 下午11:36:42
 *
 */
public class DefaultCursor implements Cursor {
	
	public static final Cursor EMPTY_CURSOR;
	
	private List<Integer> cursorList;
	
	private List<String> resultList;
	
	static {
		EMPTY_CURSOR = new DefaultCursor(new ArrayList<Integer>(),new ArrayList<String>());
	}
	
	public DefaultCursor() {
		super();
	}
	
	/**
	 * @param cursorList the cursorList
	 * @param resultList the resultList
	 */
	public DefaultCursor(List<Integer> cursorList, List<String> resultList) {
		super();
		this.cursorList = cursorList;
		this.resultList = resultList;
	}

	/**
	 * @return the cursorList
	 */
	public List<Integer> getCursorList() {
		return cursorList;
	}

	/**
	 * @param cursorList the cursorList to set
	 */
	public void setCursorList(List<Integer> cursorList) {
		this.cursorList = cursorList;
	}

	/**
	 * @return the resultlist
	 */
	public List<String> getResultList() {
		return resultList;
	}

	/**
	 * @param resultList the resultlist to set
	 */
	public void setResultList(List<String> resultList) {
		this.resultList = resultList;
	}

}
