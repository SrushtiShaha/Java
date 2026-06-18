import java.sql.*;

public class FetchData {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:8080/company";
		String username = "root";
		String password = "root";
		
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			
			Statement st = con.createStatement();
			
			String query = "Select * from company";
			
			ResultSet res = st.executeQuery(query);
			
			while(res.next()) {
				System.out.println(
				res.getInt("id") + " " 
				res.getString("name") + " " 
				res.getDouble("salary")
				);
			}
			
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}