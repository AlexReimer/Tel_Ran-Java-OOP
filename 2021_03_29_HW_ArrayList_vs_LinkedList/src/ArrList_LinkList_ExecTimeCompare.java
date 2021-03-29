import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArrList_LinkList_ExecTimeCompare {
    public static void main(String[] args) {
        ArrayList<Double> arrList = new ArrayList<>();
        LinkedList<Double> linList = new LinkedList<>();

        long timeNow = System.currentTimeMillis();
        int maxIterations = 100_000;
        long timeStamp = System.currentTimeMillis();


        //fill the collection
        while (maxIterations > 0) {
            arrList.add(Math.random());
            maxIterations--;
        }
        System.out.println(arrList);
        System.out.println("Time ArrayList: " + (System.currentTimeMillis() - timeStamp));


        while (maxIterations > 0) {
            linList.add(Math.random());
            maxIterations--;
        }
        System.out.println(linList);
        System.out.println("Time LinkedList: " + (System.currentTimeMillis() - timeStamp));

        System.out.println("------------------");
        //===============================================================


        //add to the beginning of the collection
        while (maxIterations > 0) {
            arrList.add(0, 8282.0);
            maxIterations--;
        }
        System.out.println(arrList);
        System.out.println("Time ArrayList add to the beginning : " + (System.currentTimeMillis() - timeStamp));


        while (maxIterations > 0) {
            linList.add(0, 8282.0);
            maxIterations--;
        }
        // System.out.println(linList);
        System.out.println("Time LinkedList add to the beginning: " + (System.currentTimeMillis() - timeStamp));

        System.out.println("------------------");
        //===============================================================



        //add to the middle of the collection
        while (maxIterations > 0) {
            arrList.add(arrList.size() / 2, 9.0);
            maxIterations--;
        }
        System.out.println("Time ArrayList add to the middle: " + (System.currentTimeMillis() - timeStamp));

        while (maxIterations > 0) {
            linList.add(linList.size() / 2, 9.0);
            maxIterations--;
        }
        System.out.println("Time LinkedList add to the middle: " + (System.currentTimeMillis() - timeStamp));

        System.out.println("------------------");
        //===============================================================



        //remove from the beginning of the collection
        while (maxIterations > 0) {
            arrList.remove(0);
            maxIterations--;
        }
        System.out.println("Time ArrayList remove from the beginning: " + (System.currentTimeMillis() - timeStamp));

        while (maxIterations > 0) {
            linList.remove(0);
            maxIterations--;
        }
        // System.out.println(linList);
        System.out.println("Time LinkedList remove from the beginning: " + (System.currentTimeMillis() - timeStamp));

        System.out.println("------------------");
        //===============================================================



        //remove from the middle of the collection
        while (maxIterations > 0) {
            arrList.remove(arrList.size()/2);
            maxIterations--;
        }
        System.out.println("Time ArrayList remove from the middle: " + (System.currentTimeMillis() - timeStamp));

        while (maxIterations > 0) {
            linList.remove(arrList.size()/2);
            maxIterations--;
        }
        // System.out.println(linList);
        System.out.println("Time LinkedList remove from the middle: " + (System.currentTimeMillis() - timeStamp));

        System.out.println("------------------");
        //===============================================================

        //remove from the end of the collection
        while (maxIterations > 0) {
            arrList.remove(arrList.size()-1);
            maxIterations--;
        }
        System.out.println("Time ArrayList remove from the end: " + (System.currentTimeMillis() - timeStamp));

        while (maxIterations > 0) {
            linList.remove(arrList.size()-1);
            maxIterations--;
        }
        // System.out.println(linList);
        System.out.println("Time LinkedList remove from the end: " + (System.currentTimeMillis() - timeStamp));

        System.out.println("------------------");
        //===============================================================
    }
}
