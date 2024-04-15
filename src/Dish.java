
public class Dish {
	private String name;
    private String description;
    private double price;
    private boolean available;
    
    Dish(String name, String description, double price, boolean available) {
    	this.name = name;
    	this.description = description;
    	this.price = price;
    	this.available = available;
    }

       
    
    //Getter and Setter
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public String getName() {
		return name;
	}



	public void howMuch() {
		System.out.println("Das Gericht " + this.getName() + " kostet " + this.getPrice() + "€!");
		
	}
    
	
    
}
