import java.util.Scanner;

public class RestaurantManager {
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		DishManager dishmanager = new DishManager();
		Menu menu = new Menu();
		
		Dish dish1 = new Dish("Spaghetti Carbonara", "Classic Italian pasta dish with bacon, eggs, and cheese", 12.99, true);
		Dish dish2 = new Dish("Grilled Salmon", "Fresh salmon fillet grilled to perfection", 16.99, true);
		
		
		menu.add(dish1);
		menu.add(dish2);
		menu.remove(dish2);
		menu.getMenu();
		
		//dish1.howMuch();
		
		dishmanager.writeDishesIntoTextfile();
		dishmanager.readQuestionsFromTextfile();
		
		
		
	}

}
