public class Car implements Transport{

    @Override
    public void move() {
        System.out.println("Car is moving on the road");
    }

    @Override
    public void getFuelType() {
        System.out.println("Petrol");

    }
}
