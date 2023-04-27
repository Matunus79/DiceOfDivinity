import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DiceOfDivinity {
    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Für welches Spiel möchten sie würfeln?");
        System.out.println("1.) Dungeons and Dragons");
        System.out.println("2.) Exalted");
        System.out.println("3.) Shadowrun");
        System.out.println("4.) Das Schwarze Auge");
        System.out.println("5.) Programm beenden");
        return sc.nextInt();

    }
    public int getModifier (int ability) {
        if (ability>10) {return (ability-10)/2;}
        else {return ((ability-11)/2);}

    }
    public static void main(String[] args) {
        Random r=new Random();
        int mainMenuNumber=0;
        int armorClass;
        int proficiency;
        int ability;
        int modifier;
        int weapon;
        int level;
        int attack;
        ArrayList<Integer>pool=new ArrayList<>();
//        System.out.println(getModifier(24));

    }
}
