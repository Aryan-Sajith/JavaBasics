package simple_basics.variable_scope;
import java.util.Random;
public class DiceRoller {
    //variables defined on a global scope... can be seen by toRoll
    Random dice = new Random();
    int diceRoll = 0;

    public DiceRoller(){
        toRoll();
    }

    public void toRoll() {
       diceRoll = dice.nextInt(6) + 1;
       System.out.println(diceRoll);
    }
}
