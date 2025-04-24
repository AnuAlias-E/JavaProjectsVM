package com.training.ui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.training.model.Loan;

public class Main01 {

	public static void insert() {
		Loan loan = new Loan();
		loan.setId(5007);
		loan.setCustomerName("Leah");
		loan.setLoanAmount(450000.00);
		loan.setTenure(33);

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");
		String INSERT_QRY = "insert into loans values(?,?,?,?)";
		int r = template.update(INSERT_QRY, loan.getId(), loan.getCustomerName(), loan.getLoanAmount(),
				loan.getTenure());
		System.out.println(r + " records inserted");
	}

	public static void read() {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");
		String SELECT_QRY = "select * from loans where id =?";
		List<Loan> products = template.query(SELECT_QRY, new LoanMapper(), new Object[] { 5002 });
		System.out.println(products);
	}

	public static class LoanMapper implements RowMapper<Loan> {

		@Override
		public Loan mapRow(ResultSet rs, int rowNum) throws SQLException {
			Loan loan = new Loan();
			loan.setId(rs.getInt(1));
			loan.setCustomerName(rs.getString(2));
			loan.setLoanAmount(rs.getDouble(3));
			loan.setTenure(rs.getInt(4));
			return loan;
		}

	}

	public static void readAll() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");
		String SELECT_QRY = "select * from loans ";
		List<Loan> loans = template.query(SELECT_QRY, new LoanMapper());
		System.out.println(loans);
	}

	public static void update() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");
		String UPDATE_QRY = "update loans set loanAmt=loanAmt+50000 where id =?";
		int r = template.update(UPDATE_QRY, new Object[] { 5002 });
		System.out.println(r + " rows updated");
	}

	public static void delete() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");
		String DELETE_QRY = "delete from loans where id =?";
		int r = template.update(DELETE_QRY, new Object[] { 5003 });
		System.out.println(r + " rows deleted");
	}

	public static void main(String[] args) {
		// insert();
		// read();
		readAll();
		// update();
		// read();
		delete();
		readAll();
	}

}
