package loops;
import java.util.ArrayList;

public class ForEachLoops {

	public static void main(String[] args) {
		//for-each loop= Traverses through all the elements in an array/collection
		//Pros: More readable/easier to understand
		//Cons: Less flexible than standard for loop
		
		String[] animals = {"cat","dog","tiger","toucan"};
		for(String animal : animals) {
			System.out.println(animal);
		}
		
		ArrayList<String> colors = new ArrayList<String>();
		for(String color : colors) {
			System.out.println(color);
		}	
	}
}
 