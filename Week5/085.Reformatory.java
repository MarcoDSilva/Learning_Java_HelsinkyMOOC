
public class Reformatory {

    private int totalWeight = 0;

    public Reformatory() {

    }

    public int weight(Person person) {
        // return the weight of the person
        this.totalWeight++;
        return person.getWeight();
    }

    public void feed(Person person) {
        int x = person.getWeight();
        x++;
        person.setWeight(x);
    }

    public int totalWeightsMeasured() {
        return this.totalWeight;
    }

}
