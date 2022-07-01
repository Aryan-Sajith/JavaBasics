package data_structures.array_lists;

public class TwoDArrays {
    public static void main(String[] args) {
        //2D-Array = An array of arrays.

        String[][] cars = { {"Camaro","Corvette","Silverado"},
                            {"Mustang","Ranger","F-150"},
                            {"Ferrari","Lamborghini","Tesla"}
                          };
        
        for(int i = 0; i < cars.length; i++) {
        	for(int j = 0; j < cars[i].length; j++) {
        		System.out.println(cars[i][j]);
        	}
        }
           
    }
}
