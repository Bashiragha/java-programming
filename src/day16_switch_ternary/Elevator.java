package day16_switch_ternary;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 4;
        if (floorNum == 1) {
            System.out.println("floor 1 selected. companies: verizon, starbucks");
        } else if (floorNum == 2) {
            System.out.println("floor 2 selected. companies: verizon, starbucks");
        } else if (floorNum == 3) {
            System.out.println("floor 3 selected. companies: verizon, starbucks ");
        } else if (floorNum == 4) {
            System.out.println("*******Switch statements started******* ");
        }else {
            System.out.println("invalid floor selected ");
        }

            floorNum = 5;
            switch (floorNum) {
                case 1:
                    System.out.println("floor 1 selected. companies: Lobby, verizon");
                    break;
                case 2:
                    System.out.println("floor 2 selected. companies: cyber tek, Nasa");
                    break;
                case 3:
                    System.out.println("floor 3 selected. companies: jazz, telenor");
                    break;
                default:
                    System.out.println("Invalid floor selected " + floorNum);
                    break;


            }


        }
    }

