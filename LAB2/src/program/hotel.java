package program;

public class hotel {
	public static void main(String[] args) {
        Room room = new Room(1, 101, "Deluxe", 150.0, true);
        customer customer = new customer(1, "Ludhiya", "ludhiya2002@gmail.com", "1234567890");

        Room.addRoom();
        customer.addCustomer();
    }
}
