package com.juanpickselov.pragprog.service;

import com.juanpickselov.pragprog.model.Tip;
import com.juanpickselov.pragprog.persistence.TipMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tomgou on 4/6/2017.
 */
@Service("tipService")
public class TipServiceImpl implements TipService {

    @Autowired
    private TipMapper tipMapper;

    public List<Tip> getAllTips() {return tipMapper.getAllTips(); }
}
