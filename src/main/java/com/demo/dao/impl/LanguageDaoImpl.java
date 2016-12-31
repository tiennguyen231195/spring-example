package com.demo.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.dao.LanguageDao;
import com.demo.domain.Language;

@Repository("languageDao")
public class LanguageDaoImpl implements LanguageDao {

	@Autowired
	private DataSource dataSource;

	public List<Language> list() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate.query("SELECT * FROM language", new BeanPropertyRowMapper<>(Language.class));
	}

}
