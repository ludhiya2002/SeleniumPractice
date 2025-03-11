package collections;

import java.io.Serializable;

public class Customer implements Serializable{
	private int id;
	private String name;
	private String email;
	private String phone;
	
	public Customer(int id,String name,String email,String phone) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.phone=phone;
	}

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

	@Override
	public String toString() {
		return id+"|"+name+"|"+email+"|"+phone;
	}
	

}
