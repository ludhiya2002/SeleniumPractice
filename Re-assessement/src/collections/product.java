package collections;

public class product {
	private int id;
	private String name;
	private String category;
	private double price;
	private int quantity;
	
	public product(int id,String name,String category,double price,int quantity) {
		this.id=id;
		this.name=name;
		this.category=category;
		this.price=price;
		this.quantity=quantity;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}


	public String getCategory() {
		return category;
	}

	
	public double getPrice() {
		return price;
	}

	
	public int getQuantity() {
		return quantity;
	}
	
	@Override
	public String toString() {
		return id+"|"+name +"|"+category +"|"+price+"|"+quantity;
	}
	
	

}
