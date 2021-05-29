package day41_arraylist;
import java.util.ArrayList;
import java.util.List;
import java.util.List;

public class UpdatingArrayList {

    public static void main(String[] args) {

        // cars list
        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("benz");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("tesla");
        myCars.add(0,"jeep");
        myCars.add(1,"lada");
        myCars.add(2,"yugo");
        myCars.add("lamborghini");
        // 1- jeep 2nd -lada 3rd- yugo and so on
        System.out.println(myCars.toString()); // print all cars
        String allCarsIn1St = myCars.toString(); // saves all cars in one string variable
        System.out.println("allCarsIn1St = " + allCarsIn1St);

        myCars.set(0,"VW"); // it will change jeep in index 0 to VW
        System.out.println(myCars);

        myCars.set(3,"Honda");
        System.out.println("After set Honda = " +myCars); // it will change toyota in index 3 to Honda

        // indexOf , finds the index number of "ford"
       // String str = "java";
       // str.indexOf("v");
        System.out.println("index of ford = " + myCars.indexOf("ford")); // it will find the index of ford in arraylist
        int teslaIndex = myCars.indexOf("tesla");
        System.out.println("teslaIndex = " + teslaIndex);
        myCars.set(7,"suzuki");
        System.out.println("After set suzuki = " +myCars); // it will change tesla in index 7 to suzuki in cars arraylist

        // replace ford with trabant using single statement:
        // indexOf("ford"), "trabant"

        myCars.set(myCars.indexOf("ford"), "trabant");
        System.out.println("after set to trabant = " + myCars);

        if (myCars.contains("lada")) {
            myCars.set(myCars.indexOf("lada"), "bugatti");
        }else{
            System.out.println("lada is not found");
        }
        System.out.println("after set bugatti = " + myCars);

        for (int i = 0; i < myCars.size(); i++){
            if (myCars.get(i).equals("lamborghini")) {
                myCars.set(i, "prius");
            }else if (myCars.get(i).equals("toyota")) {
                myCars.set(i, "lexus");
            }else if (myCars.get(i).equals("trabant")){
                myCars.set(i, "audi");

            }
        }
        System.out.println("after loop = " + myCars);
    }

}
