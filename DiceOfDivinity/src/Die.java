import java.util.LinkedList;
import java.util.Random;

public class Die {
    Random r = new Random();
    public int max;

    public Die(int max) {
        this.max = max;
    }

    public int roll() {
        return r.nextInt(1, max+1);
    }

    public LinkedList<Integer> rollMany(int number) {
        LinkedList<Integer> outcome = new LinkedList<>();
        for (int i = 0; i < number; i++) {
            outcome.add(roll());

        }
        return outcome;
    }
    public int damageMany(int number) {
        int output = 0;
        LinkedList<Integer>rolls = rollMany(number);
        for (int i = 0; i < number-1; i++) {
            output=output+rolls.get(i);
        }
        return output;
        }
    }


