package com.juanpickselov.pragprog.persistence;

import com.juanpickselov.pragprog.model.Tip;

import java.util.List;

public interface TipMapper {

	/**
	 * @return all the tips
	 */
	public List<Tip> getAllTips();

	/**
	 * @param tip
	 * @return the number of rows affected
	 */
	public int insertTip(Tip tip);

	/**
	 * @param tip
	 * @return the number of rows affected
	 */
	public int updateTip(Tip tip);
}
