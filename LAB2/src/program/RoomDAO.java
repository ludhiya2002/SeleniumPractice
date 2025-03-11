package program;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RoomDAO extends DatabaseConnection{
	public void addRoom(Room room) {
		String query = "INSERT INTO rooms(room_number,type,price_per_night,availability) VALUES(?,?,?,?)";
		try(Connection con = getConnection();
				PreparedStatement st = con.prepareStatement(query)){
			st.setInt(1, room.getRoomNumber());
			st.setString(2, room.getType());
			st.setDouble(3, room.getPricePerNight());
			st.setBoolean(4,  room.isAvailable());
			st.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void getRooms() {
        String query = "SELECT * FROM rooms";
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                System.out.println("Room ID: " + rs.getInt("id") +
                        ", Room Number: " + rs.getInt("room_number") +
                        ", Type: " + rs.getString("type") +
                        ", Price: " + rs.getDouble("price_per_night") +
                        ", Availability: " + rs.getBoolean("availability"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

