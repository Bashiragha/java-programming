package day34_voidMethods;

public class StartCar {
    public static void main(String[] args) {
        seatInCar();
        startTheCar();
        shiftToDrive();
        pressGasPedal();

    }

    public static void seatInCar(){
        System.out.println("1, open the door and seat in the driver seat");

    }

    public static void startTheCar(){
        System.out.println("2, inter key to ignition clockwise and Start the car");
    }
    public static void shiftToDrive(){
        System.out.println("3, Press break and bring gear to D and press gas");
    }
    public static void pressGasPedal(){
        System.out.println("4, press Gas Pedal to move forward");
    }



}
