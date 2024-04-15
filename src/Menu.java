import java.util.ArrayList;

public class Menu {
	
	private ArrayList<Dish> dishes;
	
	public Menu() {
		this.dishes = new ArrayList<Dish>();
	}

	public boolean add(Dish dishes) {
		return this.dishes.add(dishes);
	}

	public boolean remove(Object dishes) {
		return this.dishes.remove(dishes);
	}
	
	public void getMenu() {
		int counter = 1; 
		System.out.println("*************Speisekarte*************");
		for (Dish q : this.dishes) {
			System.out.println("Gericht " + counter + ": " + q.getName());
			counter++;
		}
		System.out.println("************ *************************");
	}
	
	
}
