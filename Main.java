import java.util.ArrayList;
import java.util.Random;

import Unit.CrossbowMan;
import Unit.Default;
import Unit.Farmer;
import Unit.Mage;
import Unit.Monk;
import Unit.Rogue;
import Unit.Sniper;
import Unit.SpearMan;
public class Main {

    public static void main(String[] args) {
        ArrayList<Default> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int rand = new Random().nextInt(1,8);
            if (rand == 1){list.add(new CrossbowMan(getName()) {});}
            else if (rand == 2){list.add(new Farmer(getName()) {});}
            else if (rand == 3){list.add(new Mage(getName()) {});}
            else if (rand == 4){list.add(new Monk(getName()) {});}
            else if (rand == 5){list.add(new Rogue(getName()) {});}
            else if (rand == 6){list.add(new Sniper(getName()) {});}
            else {list.add(new SpearMan(getName()) {});}
            System.out.println(list.get(i).getInfo());
        }
    }
    private static String getName(){
        String name= String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }
}