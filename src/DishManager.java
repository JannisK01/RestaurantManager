import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DishManager {

	private List<Dish> dishes;
	
	public DishManager() {
		this.dishes = new ArrayList<Dish>();
		generateDishes();
	}

	public boolean addDishes(Dish dishes) {
		return this.dishes.add(dishes);
	}
	
	public List<Dish> getDishes() {
		Collections.shuffle(dishes);
		return dishes;
	}
	
	private void generateDishes() {
		
		addDishes(new Dish("Spaghetti Carbonara", "Classic Italian pasta dish with bacon, eggs, and cheese", 12.99, true));
		addDishes(new Dish("Grilled Salmon", "Fresh salmon fillet grilled to perfection", 16.99, true));
	}
	
	public void writeDishesIntoTextfile() {
		
		PrintWriter writer = null;
		
		try {
			writer = new PrintWriter("dishes.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//Schreibe Dishes in Datei
		for (Dish q : this.dishes) {
			writer.write(q.getName() + ";" + q.getPrice() + ";" + q.getDescription() +";\n");
		}
		writer.close();
	}
	
	public void readQuestionsFromTextfile() {
		
		FileReader reader = null;
		try {
			reader = new FileReader("dishes.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scanner scanner = new Scanner(reader);
		
		while (scanner.hasNext()) {
			System.out.println(scanner.next());
		}
		
		scanner.close();
		
		try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		
}
