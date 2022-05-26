package student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import student.dto.Student_deatials;


public class StudentDao {
	public static Connection getConnect() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_prc", "root", "root");
		return con;
	}

	public void insertEmployee(Student_deatials s) throws Exception {
		    Connection con = getConnect();
		    PreparedStatement ps = con.prepareStatement("insert into student1 values(?,?,?,?,?,?)");
		    ps.setInt(2, s.getId());
		    ps.setString(1,s.getName());
		    ps.setString(3, s.getGrade());
		    ps.setInt(4, s.getEnglish());
		    ps.setInt(5, s.getMaths());
		    ps.setInt(6, s.getScience());
		    ps.executeUpdate();
		    System.out.println("===Inserted============");
	}
	public void deleteEmployee(int id) throws Exception {
		Connection con = getConnect();
		PreparedStatement ps = con.prepareStatement("delete from student1 where id = ?");
		ps.setInt(1, id);
		ps.executeUpdate();
		System.out.println("====deleted====");
	}
	public void updateStudent(Student_deatials s) throws Exception {
		Connection con = getConnect();
		PreparedStatement ps = con.prepareStatement("update student1 set name=?,Graade=?,EnglishMarks=?,MathsMarks=?,ScienceMarks=? where id=? ");
		ps.setInt(6, s.getId());
	    ps.setString(1,s.getName());
	    ps.setString(2, s.getGrade());
	    ps.setInt(3, s.getEnglish());
	    ps.setInt(4, s.getMaths());
	    ps.setInt(5, s.getScience());
	    ps.executeUpdate();
		System.out.println("===Updated===");
	}
	public void showStudent(int id) throws Exception {
		Connection con = getConnect();
		PreparedStatement ps = con.prepareStatement("select * from student1 where id= ?");
		ps.setInt(1, id);
		ResultSet rs =ps.executeQuery();
		while(rs.next())
		{
			System.out.println("Student name is : "+rs.getString(1)+"  ");
			System.out.println("Student id is   : "+rs.getInt(2)+"  ");
			System.out.println("Student grade   : "+rs.getString(3)+"  ");
			System.out.println("Student id is   : "+rs.getInt(4)+"  ");
			System.out.println("Student id is   : "+rs.getInt(5)+"  ");
			System.out.println("Student id is   : "+rs.getInt(6)+"  ");
			System.out.println("=================================");
		}
		System.out.println("=================================");
	}
	
	


}
