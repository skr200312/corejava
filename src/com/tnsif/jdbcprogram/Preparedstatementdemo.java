package com.tnsif.jdbcprogram;
//step 1
import java.sql.*;
import javax.sql.*;

import com.mysql.cj.protocol.Resultset;

public class Preparedstatementdemo {

	public static void main(String[] args) {
		
		// step 2
		// step 3 establish connection
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sri_indu","root","password");
			
		// step 4 create statement
			
			Statement st=conn.createStatement();
			
			// insert values
			String sqlinsert="insert into table1 values(10,'javascript',760,4)";
			System.out.println("the sql statement is"+sqlinsert);
			
			int countinsert=st.executeUpdate(sqlinsert);
			System.out.println(countinsert +"record inserted");
			// update query
			
			String updateqry="update table1 set book='react' where book='javascript'";
			int rowupdate=st.executeUpdate(updateqry);
			System.out.println(rowupdate);
			
			// delete record from database
			
			String sqldelete="delete from table1 where bookid=1";
			System.out.println("the sql stamenet is"+sqldelete);
			int countdeleted=st.executeUpdate(sqldelete);
			System.out.println(countdeleted+"record deleted");
			
			String strselect="select book,price,qty from table1";
			
			System.out.println("the sql stament is"+strselect);
			
			// to display
			ResultSet rst=st.executeQuery(strselect);
			System.out.println("the records are");
			
			int rowcout=0;
			while(rst.next()) {
				String booktitle=rst.getString("book");
				int price=rst.getInt("price");
				int qty=rst.getInt("qty");
				
				System.out.println(booktitle+" "+price+" "+qty);
				++rowcout;
			}
			}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
