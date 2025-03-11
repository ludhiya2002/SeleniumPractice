package program;

import java.io.Serializable;

public class customer implements Serializable{
	    private int id;
	    private String name;
	    private String email;
	    private String phone;

	    // Constructor
	    public customer(int id, String name, String email, String phone) {
	        this.id = id;
	        this.name = name;
	        this.email = email;
	        this.phone = phone;
	    }

	    // Getters and Setters
	    public int getId() { 
	    	return id; 
	    }
	    public String getName() { 
	    	return name; 
	    }
	    public String getEmail() { 
	    	return email; 
	    }
	    public String getPhone() { 
	    	return phone; 
	    }

	    // Methods
	    public void addCustomer() {
	    }

	    public void getCustomers() {
	    }
	}


