package com.juanpickselov.pragprog.service;

import com.juanpickselov.pragprog.model.Tip;

import java.util.List;

/**
 * Created by tomgou on 4/6/2017.
 */
public interface TipService {
    /**
     * @return a list of all (@link Tip)s
     */
    public List<Tip> getAllTips();

    /**
     * @param tip
     * @return success
     */
    //public boolean saveTip(Tip tip);
}
