package com.java.springboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.java.springboard.dto.BoardDto;
import com.java.springboard.util.Constant;

public class BoardDao {

	DataSource dataSource;

	JdbcTemplate template = null; 
	
	// 생성자
	// 생성 시점에 데이터 소스 구하기. 컨텍스트 -> 데이터소스
	public BoardDao() {
		// try ~ catch 는 필요없으므로 삭제해야 함. 
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/sqlite");

		} catch (NamingException ne) {
			ne.printStackTrace();
		}
		
		template = Constant.template;
		
	}

/*	
 	public void write(String bName, String bTitle, String bContent) {
		System.out.println("@@@@@@@   here is write method calling~~~~~~~~");
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		// insert into mvc_board ( bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent ) 
		// values (1, 'hwang', 'first title','first content', datetime('now'), 0,1,0,0);insert into mvc_board ( bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent ) 
		String query = "insert into mvc_board2 (  bName, bTitle, bContent, bHit, bGroup, bStep, bIndent ) " +
			    " values (  ?, ?, ?, 0, 1, 0, 0 ) ";
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
*/
	
	public void write(final String bName, final String bTitle, final String bContent) {
		template.update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				String query = "insert into mvc_board2 (  bName, bTitle, bContent, bHit, bGroup, bStep, bIndent ) " +
					    " values (  ?, ?, ?, 0, 1, 0, 0 ) ";
//						" values ( mvc_board_seq.nextval, ?, ?, ?, 0, mvc_board_seq.currentVal, 0, 0 ) ";
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setString(1, bName);
				pstmt.setString(2, bTitle);
				pstmt.setString(3, bContent);
				return null;
			}
			
		});
				
	}
/*
	public ArrayList<BoardDto> list() {
		ArrayList<BoardDto> dtos = new ArrayList<BoardDto>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		//String query = "select bId, bName, bTitle, bContent, bDate, bHit, bGroup, bIndent, bStep "
		// String query = "select bId, bName, bTitle, bContent, strftime(bDate, 'yyyy-mm-dd'), bHit, bGroup, bIndent, bStep "
		String query = "select bId, bName, bTitle, bContent, bHit, bGroup, bIndent, bStep "
				+ " from mvc_board2 order by bGroup desc, bStep asc";

		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				int bId = rs.getInt("bId");
				String bName = rs.getString("bName");
				String bTitle = rs.getString("bTitle");
				String bContent = rs.getString("bContent");
			//	System.out.println("############" + rs.getDate("bDate"));
//				Timestamp bDate = rs.getTimestamp("bDate");
				int bHit = rs.getInt("bHit");
				int bGroup = rs.getInt("bGroup");
				int bStep = rs.getInt("bStep");
				int bIndent = rs.getInt("bIndent");

//				BoardDto dto = new BoardDto(bId, bName, bTitle, bContent, bDate , bHit, bGroup, bStep, bIndent);
				BoardDto dto = new BoardDto(bId, bName, bTitle, bContent, bHit, bGroup, bStep, bIndent);
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
*/
	// using the Jdbctemplate 
	public ArrayList<BoardDto> list() {
		ArrayList<BoardDto> dtos = null;
		System.out.println( "boardDao called ######## "  );
		
		String query =  "select bId, bName, bTitle, bContent, bHit, bGroup, bIndent, bStep "
				+ " from mvc_board2 order by bGroup desc, bStep asc";
		
		// test
        System.out.println( "boardDao called template :: " + template );
		System.out.println( "boardDao called template.getDataSource() :: " + template.getDataSource() );
        int count = template.queryForInt( "select bId from mvc_board2 where bId=2" );         
        System.out.println( "boardDao called template.queryForInt() : "  + count);
        count = template.update( "insert into mvc_board2(bName, bTitle, bContent) values('test','title','contents');" );
        System.out.println( "boardDao called template.update() : "  + count);         
        
//		dtos = (ArrayList<BoardDto>) template.query(query,  new BeanPropertyRowMapper<BoardDto>(BoardDto.class));
//		System.out.println( "boardDao called ######## size :: " + dtos.size() );
//		return dtos;
        return (ArrayList<BoardDto>) template.query(query,  new BeanPropertyRowMapper<BoardDto>(BoardDto.class));
        
	}
	
/*	
	public BoardDto contentView(String strId) {
		BoardDto dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		String sql = "select * from mvc_board2 where bid=?";
		
		try {
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,  Integer.parseInt(strId));
			rs = preparedStatement.executeQuery();
			if(rs.next()) {
				int bId = rs.getInt("bId");
				String bName = rs.getString("bName");
				String bTitle = rs.getString("bTitle");
				String bContent = rs.getString("bContent");
				int bHit = rs.getInt("bHit");
				int bGroup = rs.getInt("bGroup");
				int bStep = rs.getInt("bStep");
				int bIndent = rs.getInt("bIndent");
				
//				Timestamp bDate = rs.getTimestamp("bDate");
				
				dto = new BoardDto(bId, bName, bTitle, bContent, bHit, bGroup, bStep, bIndent);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}
	*/
	
	public BoardDto contentView(String strID) {
		upHit(strID);
		String query = "select * from mvc_board2 where bid=?";
		return template.queryForObject(query, new BeanPropertyRowMapper<BoardDto>(BoardDto.class));	
	}
	
/*	
	private void upHit(String bId) {
		Connection connection = null;
		PreparedStatement ps = null;
		String query = "update mvc_board2 set bHit = bHit + 1 where  bId = ? ";
		
		try {
			ps = connection.prepareStatement(query);
			ps.setString(1, bId);
			int cnt = ps.executeUpdate();
			System.out.println("upHit " + cnt);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) ps.close();
				if(connection!=null) connection.close();
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}
*/
	private void upHit(final String bId) {
		String query = "update mvc_board2 set bHit = bHit + 1 where  bId = ? ";
		template.update(query, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1,  Integer.parseInt(bId));
			}
		});
	}
	
/*	
	public void modify(String bId, String bName, String bTitle, String bContent) {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = dataSource.getConnection();
			String query = "update mvc_board2 set bName = ? , bTitle = ?, bContent = ? where bId = ? ";
			stmt = conn.prepareStatement(query);
			
			stmt.setString(1, bName);
			stmt.setString(2, bTitle);
			stmt.setString(3, bContent);
			stmt.setInt(4,  Integer.parseInt(bId));
			
			int rtn = stmt.executeUpdate();
			System.out.println("BoardDao.modify method called return value : " + rtn);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
*/
	
	public void modify(final String bId, final String bName, final String bTitle, final String bContent) {
		String query = "update mvc_board2 set bName = ? , bTitle = ?, bContent = ? where bId = ? ";
		template.update(query, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bName);
				ps.setString(2, bTitle);
				ps.setString(3, bContent);
				ps.setInt(4,  Integer.parseInt(bId));
			}
		});
	}
	
/*
	public void delete(String strID) {
		Connection conn =null;
		PreparedStatement stmt = null;
		
		try {
			conn = dataSource.getConnection();
			System.out.println("delete method called ###### " + strID);
			String query = "delete from mvc_board2 where bId = ?";
			stmt = conn.prepareStatement(query);
			stmt.setInt(1, Integer.parseInt(strID));
			int rtn = stmt.executeUpdate();
			System.out.print("delete method called return value ######  " + rtn);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
*/
	public void delete(final String strID) {
		String query = "delete from mvc_board2 where bId = ?";
		template.update(query, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, strID);
			}
		});
	}
/*	
	public void reply(String bId, String bName, String bTitle, String bContent, String bGroup, String bStep,
			String bIndent) {
		Connection conn =null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		replyShape(bGroup, bStep);	
		try {
			conn = dataSource.getConnection();
			System.out.println("reply method called ###### " + bId);
			String query = "insert into mvc_board2 (bName, bTitle, bContent, bGroup, bStep, bIndent) values (?,?,?,?,?,?)";		
			stmt = conn.prepareStatement(query);
			stmt.setString(1, bName);
			stmt.setString(2, bTitle);
			stmt.setString(3, bContent);
			stmt.setInt(4,Integer.parseInt(bGroup));
			stmt.setInt(5,Integer.parseInt(bStep)+1);
			stmt.setInt(6,Integer.parseInt(bIndent)+1);		
			int rtn = stmt.executeUpdate();
			System.out.println("BoardDao.reply method called : " + rtn);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
	}
*/	
	
	public void reply(final String bId, final String bName, final String bTitle, final String bContent, 
			final String bGroup, final String bStep, final String bIndent) {
		String query = "insert into mvc_board2 (bName, bTitle, bContent, bGroup, bStep, bIndent) values (?,?,?,?,?,?)";
		template.update(query, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bName);
				ps.setString(2, bTitle);
				ps.setString(3, bContent);
				ps.setInt(4,Integer.parseInt(bGroup));
				ps.setInt(5,Integer.parseInt(bStep)+1);
			}
		});
	}
	
/*	
	private void replyShape(String strGroup, String strStep) {
		Connection conn = null; 
		PreparedStatement stmt = null;
		
		try {
			conn = dataSource.getConnection();
			System.out.println("reply shape method called ###### " + strGroup);
			String query = "update mvc_board2 set bStep = bStep + 1 where bGroup = ? and bStep > ? ";
			stmt = conn.prepareStatement(query);		
			stmt.setInt(1,Integer.parseInt(strGroup));
			stmt.setInt(2,Integer.parseInt(strStep));
			int rtn = stmt.executeUpdate();
			System.out.println("BoardDao.reply method called : " + rtn);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
*/
	
	private void replyShape(final String strGroup, final String strStep) {
		String query = "update mvc_board2 set bStep = bStep + 1 where bGroup = ? and bStep > ? ";
		template.update(query, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, Integer.parseInt(strGroup));
				ps.setInt(2, Integer.parseInt(strStep));	
			}
		});
	}
	
/*
	public BoardDto reply_view(String strID) {
		BoardDto dto = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null; 
		try {
			conn = dataSource.getConnection();
			String query = "select * from mvc_board2 where bId = ?";
			stmt = conn.prepareStatement(query);
			stmt.setInt(1, Integer.parseInt(strID));
			rs = stmt.executeQuery();		
			if(rs.next()) {
				int bId = rs.getInt("bId");
				String bName = rs.getString("bName");
				String bTitle = rs.getString("bTitle");
				String bContent = rs.getString("bContent");
//				Timestamp bDate = rs.getTimestamp("bDate");
				int bHit = rs.getInt("bHit");
				int bGroup = rs.getInt("bGroup");
				int bStep = rs.getInt("bStep");
				int bIndent = rs.getInt("bIndent");
//				dto = new BoardDto(bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
				dto = new BoardDto(bId, bName, bTitle, bContent, bHit, bGroup, bStep, bIndent);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();	
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}
*/
	public BoardDto reply_view(String strID) {
		String query = "select * from mvc_board2 where bId = ?";
		return template.queryForObject(query,  new BeanPropertyRowMapper<BoardDto>(BoardDto.class));
	}
}
