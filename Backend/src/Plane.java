public class Plane implements Transport{
    @Override
    public void move() {
        System.out.println("Plane is moving in the sky");
    }

    @Override
    public void getFuelType() {
        System.out.println("Jet Fuel");

    }
}
