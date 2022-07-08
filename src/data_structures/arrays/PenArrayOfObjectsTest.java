package data_structures.arrays;

public class PenArrayOfObjectsTest {
    public static void main(String[] args) {
        //PenArrayOfObjects[] pouch = new PenArrayOfObjects[4];

        PenArrayOfObjects pen1 = new PenArrayOfObjects("blue");
        PenArrayOfObjects pen2 = new PenArrayOfObjects("red");
        PenArrayOfObjects pen3 = new PenArrayOfObjects("green");
        PenArrayOfObjects pen4 = new PenArrayOfObjects("black");

        PenArrayOfObjects[] pouch = {pen1,pen2,pen3,pen4};

        //pouch[0] = pen1;
        //pouch[1] = pen2;
        //pouch[2] = pen3;
        //pouch[3] = pen4;

        for(PenArrayOfObjects pen : pouch) {
            System.out.println(pen);
        }
    }
}
