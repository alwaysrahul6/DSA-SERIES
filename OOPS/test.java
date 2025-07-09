package OOPS;

public class test {
    public static void main(String[] args) {
        car car = new car();
        car.setColor("Blue");
        car.setSpeed(40);
        car.setBrand("tata");
        car.setYear(2024);
        car.setModel("safari");

        car.accelartae(1);
        System.out.println(car.getSpeed());



        car car2  = new car();
        car2.setColor("blue");
        car2.setSpeed(45);
        car2.setBrand("tata");
        car2.setModel("tourS");
        car2.setYear(2);

        car2.accelartae(5);
        System.out.println(car2.getSpeed());
        System.out.println(car2.getColor());
        System.out.println(car2.getYear());


    }
}
