package com.juanpickselov.pragprog.controller;

import com.juanpickselov.pragprog.config.DataConfig;
import com.juanpickselov.pragprog.config.ViewResolver;
import com.juanpickselov.pragprog.config.WebConfig;
import com.juanpickselov.pragprog.service.ExceptionServiceImpl;
import com.juanpickselov.pragprog.service.TipServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author juanpickselov
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(loader=AnnotationConfigWebContextLoader.class, classes={DataConfig.class, ExceptionServiceImpl.class, TipServiceImpl.class, ViewResolver.class, WebConfig.class})
public class HomeControllerTest {

	@Autowired
	private WebApplicationContext wac;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	@Test
	public void testIndex() throws Exception {
		this.mockMvc.perform(get("/")).andExpect(status().isOk())
				.andExpect(model().attribute("example", "Hello World!"));
	}

	@Test
	public void testTips() throws Exception {
		this.mockMvc.perform(get("/tips")).andExpect(status().isOk())
				.andExpect(model().attributeExists("pragtips"));
	}

	@Test
	public void testExceptions() throws Exception {
		this.mockMvc.perform(get("/exceptions")).andExpect(status().isOk())
				.andExpect(model().attribute("exceptionsState", false));
	}

	@Test
	public void testToggleExceptions() throws Exception {
		MockHttpSession session = new MockHttpSession();
		session.setAttribute("exceptionsToggle", false);
		this.mockMvc.perform(post("/exceptions").session(session)).andExpect(status().isOk())
				.andExpect(model().attribute("exceptionsState", true));
		this.mockMvc.perform(post("/exceptions").session(session)).andExpect(status().isOk())
				.andExpect(model().attribute("exceptionsState", false));
		this.mockMvc.perform(post("/exceptions").session(session)).andExpect(status().isOk())
				.andExpect(model().attribute("exceptionsState", true));
		this.mockMvc.perform(post("/exceptions").session(session)).andExpect(status().isOk())
				.andExpect(model().attribute("exceptionsState", false));
	}
}
