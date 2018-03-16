package login.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import login.db.Provider;
import login.db.Users;
public class UsersDao 
{
	public static int save(Users u) 
	{
		int status = 0;
		try 
		{
			Connection con = Provider.getConnection();
			String sql= "Insert into Users values (?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, u.getEmail());
			pst.setString(2, u.getPassword());
			pst.setString(3, u.getMobile());
			pst.setString(4, u.getCity());
			status = pst.executeUpdate();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return status;
	}

	public static boolean checkLogin(Users u) 
	{
		boolean result = false; 
		try 
		{
			Connection con = Provider.getConnection();
			String sql= "select * from Users where email=? and password=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, u.getEmail());
			pst.setString(2, u.getPassword());
			ResultSet rs = pst.executeQuery();
			if(rs.next())
				result = true;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}

	public static int checkPassword(Users u) 
	{
		int status = 0 ;
		try 
		{
			Connection con = Provider.getConnection();
			String sql= "select * from Users where email=? and password=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, u.getEmail());
			pst.setString(2, u.getPassword());
			ResultSet rs = pst.executeQuery();
			if(rs.next())
				status=1;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

		return status;
	}
	public static int doChangePassword(Users u) 
	{
		int status = 0 ;
		try 
		{
			Connection con = Provider.getConnection();
			String sql= "update Users set password=? where email=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, u.getPassword());
			pst.setString(2, u.getEmail());
			status = pst.executeUpdate();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

		return status;

		
	}

}








