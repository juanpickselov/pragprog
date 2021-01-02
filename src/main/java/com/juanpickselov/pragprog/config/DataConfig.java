package com.juanpickselov.pragprog.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

/**
 * @author juanpickselov
 */
@Configuration
@MapperScan("com.juanpickselov.pragprog.persistence")
public class DataConfig {

	@Bean
	public DataSource dataSource() {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriverClass(org.h2.Driver.class);
		dataSource.setUsername("SA");
		dataSource.setUrl("jdbc:h2:C:/zDta/pragprog/tips");
		//dataSource.setPassword("pr@gprogTypz");

		return dataSource;
	}

	@Bean
	public DataSourceTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}

	@Bean
	public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setTypeAliasesPackage("com.juanpickselov.pragprog.model");
		return sessionFactory;
	}
}
