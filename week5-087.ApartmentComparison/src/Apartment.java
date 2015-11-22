
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    
    private static int price(Apartment apartment) {
        return apartment.pricePerSquareMeter * apartment.squareMeters;
    }

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment) {
        return this.squareMeters > otherApartment.squareMeters;
    }
    
    public int priceDifference(Apartment otherApartment) {
        int thisPrice = price(this);
        int otherPrice = price(otherApartment);
        return Math.abs(thisPrice - otherPrice);
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        return price(this) > price(otherApartment);
    }
    
}
