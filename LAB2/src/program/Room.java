package program;

public class Room {
	private int id;
    private int roomNumber;
    private String type;
    private double pricePerNight;
    private boolean availability;

    // Constructor
    public Room(int id, int roomNumber, String type, double pricePerNight, boolean availability) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.type = type;
        this.pricePerNight = pricePerNight;
        this.availability = availability;
    }

    // Getters and Setters
    public int getId() { 
    	return id; 
    }
    public int getRoomNumber() { 
    	return roomNumber; 
    }
    public String getType() { 
    	return type; 
    }
    public double getPricePerNight() { 
    	return pricePerNight; 
    }
    public boolean isAvailable() { 
    	return availability; 
    }

    public void setAvailability(boolean availability) { 
    	this.availability = availability; 
    }

    // Methods
    public static void addRoom() {
    }

    public void getRooms() {
    }
}

   

