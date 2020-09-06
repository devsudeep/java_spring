package com.spring.springpropertysource;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	@Qualifier("jdbcTemplateMariadb")
	private JdbcTemplate jdbcTemplateMariadb;

	@Autowired
	@Qualifier("jdbcTemplateDerby")
	private JdbcTemplate jdbcTemplateDerby;
	@Autowired
	@Qualifier("mariadb")
	DataSource dataSource;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String sql = "CREATE TABLE Persons (\n" + "    PersonID int,\n" + "    LastName varchar(255),\n"
				+ "    FirstName varchar(255),\n" + "    Address varchar(255),\n" + "    City varchar(255)\n" + ");";
		String derbysql = "CREATE TABLE FIRSTTABLE\n" + "    (ID INT PRIMARY KEY,\n" + "    NAME VARCHAR(12))";

		try {
			jdbcTemplateMariadb.execute(derbysql);
			System.out.println("running creating taeble");

			jdbcTemplateMariadb.execute(sql);
			System.out.println("running creating taeble");

		} catch (DataAccessException dae) {
			// TODO: handle exception
			System.out.println(dae.getMessage());
		}

		try {

			jdbcTemplateDerby.execute(derbysql);
			System.out.println("running creating taeble on in memory derby database");

			DatabaseSetup dbsetup = new DatabaseSetup();

		} catch (DataAccessException dae) {
			// TODO: handle exception
			System.out.println(dae.getMessage());
		}

		try {

			DatabaseSetup dbsetup = new DatabaseSetup();

			dbsetup.createDefaultDB(dataSource);

		} catch (DataAccessException dae) {
			// TODO: handle exception
			System.out.println(dae.getMessage());
		}

		try {
			sql = "INSERT INTO FIRSTTABLE VALUES \n" + "    (10,'TEN'),(20,'TWENTY'),(30,'THIRTY')";
			jdbcTemplateMariadb.execute(sql);
		} catch (DataAccessException dae) {
			System.out.println(dae.getMessage());
		}
	}

}
