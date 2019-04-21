package com.java.springboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.java.springboard.dto.BoardDto;

public class BoardDao {

	DataSource dataSource;

	// 생성자
	// 생성 시점에 데이터 소스 구하기. 컨텍스트 -> 데이터소스
	public BoardDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/sqlite");

		} catch (NamingException ne) {
			ne.printStackTrace();
		}
	}

	public void write(String bName, String bTitle, String bContent) {
		System.out.println("@@@@@@@   here is write method calling~~~~~~~~");
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		// insert into mvc_board ( bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent ) 
		// values (1, 'hwang', 'first title','first content', datetime('now'), 0,1,0,0);insert into mvc_board ( bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent ) 
		
		String query = "insert into mvc_board ( bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent ) " +
			    " values ( 1, ?, ?, ?, datetime('now'), 0, 1, 0, 0 ) ";
//				" values ( mvc_board_seq.nextval, ?, ?, ?, 0, mvc_board_seq.currentVal, 0, 0 ) ";
		
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(query);
			
			ps.setString(1, bName);
			ps.setString(2, bTitle);
			ps.setString(3,  bContent);
			
			int i = ps.executeUpdate();
			System.out.println("### record count = " + i );
		} catch (Exception e) {
					e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (ps != null)
					ps.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}	
	}

	public ArrayList<BoardDto> list() {
		ArrayList<BoardDto> dtos = new ArrayList<BoardDto>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		//String query = "select bId, bName, bTitle, bContent, bDate, bHit, bGroup, bIndent, bStep "
		String query = "select bId, bName, bTitle, bContent, date(bDate, 'yyyy-mm-dd'), bHit, bGroup, bIndent, bStep "
				+ " from mvc_board order by bGroup desc, bStep asc";

		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				int bId = rs.getInt("bId");
				String bName = rs.getString("bName");
				String bTitle = rs.getString("bTitle");
				String bContent = rs.getString("bContent");
				System.out.println("############" + rs.getDate("bDate"));
			
				String bDate = rs.getString("bDate");
				//Timestamp bDate = rs.getTimestamp("bDate");
				int bHit = rs.getInt("bHit");
				int bGroup = rs.getInt("bGroup");
				int bStep = rs.getInt("bStep");
				int bIndent = rs.getInt("bIndent");

				BoardDto dto = new BoardDto(bId, bName, bTitle, bContent, bDate , bHit, bGroup, bStep, bIndent);
				dtos.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (ps != null)
					ps.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dtos;
	}
}
