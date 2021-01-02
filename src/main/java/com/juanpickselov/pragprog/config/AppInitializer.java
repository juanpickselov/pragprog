package com.juanpickselov.pragprog.config;

import com.juanpickselov.pragprog.service.ExceptionServiceImpl;
import com.juanpickselov.pragprog.service.TipServiceImpl;
import org.sitemesh.config.ConfigurableSiteMeshFilter;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * Java Config for this application.  Using Java instead of XML.
 *
 * @author juanpickselov
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{DataConfig.class, ExceptionServiceImpl.class, TipServiceImpl.class, ViewResolver.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{WebConfig.class};
	}

	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		return new Filter[]{ characterEncodingFilter, new ConfigurableSiteMeshFilter()};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
}
