package com.juanpickselov.pragprog.service;

import com.juanpickselov.pragprog.config.DataConfig;
import com.juanpickselov.pragprog.model.Tip;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader=AnnotationConfigContextLoader.class, classes={DataConfig.class, TipServiceImpl.class})
public class TipServiceTest {

	@Autowired
	private TipService tipService;

	@Test
	public void testGetAllUsers() {
		List<Tip> tips = tipService.getAllTips();
		assertNotNull("tips should not be null", tips);
	}

	@Test
	public void testSaveUser() {
		assertEquals("should have 70 tips in the db", 70, tipService.getAllTips().size());
		Tip tip = new Tip();
		tip = tipService.getAllTips().get(1);
	}
}
