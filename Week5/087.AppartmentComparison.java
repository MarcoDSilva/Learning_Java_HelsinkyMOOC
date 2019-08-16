
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {

        return this.squareMeters > otherApartment.squareMeters;
    }

    public int priceDifference(Apartment otherApartment) {
        int appartment1 = this.pricePerSquareMeter * this.squareMeters;
        int appartment2 = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;

        if (appartment1 > appartment2) {
            return appartment1 - appartment2;
        } else {
            return appartment2 - appartment1;
        }
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
         int appartment1 = this.pricePerSquareMeter * this.squareMeters;
         int appartment2 = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;
         
         return appartment1 - appartment2 > 0;
    }

}
