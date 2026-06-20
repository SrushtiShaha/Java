import java.sql.*;

public class InsertData{
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:8080/company";
		String username = "root";
		String password = "root";
		
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			
			Statement st = con.createStatement();
			
			String query = "Insert into employee Values(1, Srushti, 500000), (2, Shreya, 500000);
			
			int row = st.executeUpdate(query);
			
			System.out.println(row + " row inserted.");
			
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}