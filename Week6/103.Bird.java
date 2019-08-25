
import java.util.ArrayList;
import java.util.Scanner;

public class Bird {

    Scanner reader = new Scanner(System.in);
    private ArrayList<BirdObserved> list = new ArrayList<BirdObserved>();
    
    public String choice() {
        String x = reader.nextLine();
        return x;
    }

    public void add() {
        String name;
        String latinName;

        System.out.print("? Add");
        System.out.print("Name: ");
        name = reader.nextLine();

        System.out.print("Latin Name: ");
        latinName = reader.nextLine();

        BirdObserved burbo = new BirdObserved(name, latinName);

        list.add(burbo);
    }

    public void observation() {
        Boolean checker = false;
        
        System.out.print("What was observed: ");
        String burb = reader.nextLine();

        for (BirdObserved bird : list) {
            if (bird.getName().equals(burb)) {
                bird.Observation();
                checker = true;
            } 
        }
        
        if(!checker) {
            System.out.println("is not a bird!");
        }
    }

    public void statistics() {
        for (BirdObserved bird : list) {
            System.out.println(bird.toString());
        }
    }

    public void show() {
        System.out.print("What? ");
        String burb = reader.nextLine();

        for (BirdObserved bird : list) {
             if (bird.getName().equals(burb)) {
                 System.out.println(bird.toString());
            }
        }
    }

}
