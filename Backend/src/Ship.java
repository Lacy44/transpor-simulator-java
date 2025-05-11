public class Ship implements Transport{
    @Override
    public void move() {
        System.out.println("Ship is moving in the sea");
    }

    @Override
    public void getFuelType() {
        System.out.println("Diesel");
    }
}
