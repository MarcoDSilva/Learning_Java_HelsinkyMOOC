
import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> yellowPages = new ArrayList<Person>();

    public void add(String name, String number) {
        
        this.yellowPages.add(new Person(name, number));

    }

    public void printAll() {
        
        for(Person ppl : yellowPages) {
            System.out.println(ppl);
        }
    }
    
    public String searchNumber(String name) {
        for(Person ppl : yellowPages) {
            if(ppl.getName().equals(name)) {
                return ppl.getNumber();
            }
        }
        return "number not known";
    }
}
