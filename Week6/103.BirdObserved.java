
public class BirdObserved {

    private String name;
    private String latinName;
    private int statistics;

    public BirdObserved(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.statistics = 0;
    }

    public String getName() {
        return this.name;
    }

    public void Observation() {
        this.statistics++;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.statistics + " observations";
    }

}
