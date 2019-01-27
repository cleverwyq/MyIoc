package myproxy;

public class Car implements IVehical{
    @Override
    public void run(String time) {
        System.out.println("Car is running..." + time);
    }
}
