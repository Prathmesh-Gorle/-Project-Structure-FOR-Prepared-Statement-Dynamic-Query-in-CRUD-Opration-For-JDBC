package PSG.DAO1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class DetailsDAO1  {
	public void insert(int Id,String name) {
		try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root", "root");
	
	PreparedStatement s=c.prepareStatement("insert into details values(?,?)");
	s.setInt(1, Id);
	s.setString(2, name);
	s.executeUpdate();
	System.out.println("Record Inserted..");
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void update(int Id,String name) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
		
		PreparedStatement s= c.prepareStatement("update details set name=? where sid=?");
		s.setInt(2,Id);
		s.setString(1,name); //priority gives who is going to change
		s.executeUpdate();
		System.out.println("Record Updated..");
	}
	
	public void delete(int Id) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
		PreparedStatement s=c.prepareStatement("delete from details where sid=?");
		s.setInt(1, Id);
		s.executeUpdate();
		System.out.println("Record deleted..");
		
	}
	public void select(int Id) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
		PreparedStatement s= c.prepareStatement("select * from details where sid=?");
		s.setInt(1, Id);
		
		ResultSet rs =s.executeQuery();
		while(rs.next()) {
			System.out.print(rs.getInt(1)+"  ");
			System.out.print(rs.getString(2));
		}
		System.out.println("  Record Selected..");
		
	}

}
