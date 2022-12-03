package com.example.model1;

import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CommentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private DataSource dataSource;
	
	public int commentWrite(CommentTO cto) {
		
		String sql = "insert into comment values (0,?,?,?,now())";
		
		int flag = jdbcTemplate.update(sql, cto.getSeq(),cto.getWriter(),cto.getPassword(),cto.getContent(),cto.getDatetime());
		
		return flag;
	}
	
	public ArrayList<CommentTO> commentView(String seq) {
		
		String sql = "select seq, writer, password, content from comment where seq = ?";
		
		ArrayList<CommentTO> commentLists = (ArrayList)jdbcTemplate.query(sql, new BeanPropertyRowMapper<CommentTO>(CommentTO.class),seq);
	
		return commentLists;
	}
}
