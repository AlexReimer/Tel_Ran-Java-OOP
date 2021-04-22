import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArrList_LinkList_ExecTimeCompare {
    public static void main(String[] args) {
        ArrayList<Double> arrList = new ArrayList<>();
        LinkedList<Double> linList = new LinkedList<>();

        int maxIterationsAL = 100_000;
        int maxIterationsLL = 100_000;
        long timeNow = System.currentTimeMillis();
        long timeStamp = System.currentTimeMillis();


        //fill the collection
        while (maxIterationsAL > 0) {
            arrList.add(Math.random());
            maxIterationsAL--;
        }
      //  System.out.println(arrList);
     //   System.out.println("Time ArrayList: " + (System.currentTimeMillis() - timeStamp));


        while (maxIterationsLL > 0) {
            linList.add(Math.random());
            maxIterationsLL--;
        }
      //  System.out.println(linList);
      //  System.out.println("Time LinkedList: " + (System.currentTimeMillis() - timeStamp));

        System.out.println("------------------");

        //===============================================================


        //add to the beginning of the collection
        int maxIterationsAL1 = 100_000;
        while (maxIterationsAL1 > 0) {
            arrList.add(0, 8282.0);
            maxIterationsAL1--;
        }
       // System.out.println(arrList);
        System.out.println("Time ArrayList add to the beginning : " + (System.currentTimeMillis() - timeStamp));

        int maxIterationsLL1 = 100_000;
        while (maxIterationsLL1 > 0) {
            linList.add(0, 8282.0);
            maxIterationsLL1--;
        }
        // System.out.println(linList);
        System.out.println("Time LinkedList add to the beginning: " + (System.currentTimeMillis() - timeStamp));

        System.out.println("------------------");
        //===============================================================



        //add to the middle of the collection
        int maxIterationsAL2 = 100_000;
        while (maxIterationsAL2 > 0) {
            arrList.add(arrList.size() / 2, 9.0);
            maxIterationsAL2--;
        }
        System.out.println("Time ArrayList add to the middle: " + (System.currentTimeMillis() - timeStamp));

        int maxIterationsLL2 = 100_000;
        while (maxIterationsLL2 > 0) {
            linList.add(linList.size() / 2, 9.0);
            maxIterationsLL2--;
        }
        System.out.println("Time LinkedList add to the middle: " + (System.currentTimeMillis() - timeStamp));

        System.out.println("------------------");
        //===============================================================



        //remove from the beginning of the collection
        int maxIterationsAL3 = 100_000;
        while (maxIterationsAL3 > 0) {
            arrList.remove(0);
            maxIterationsAL3--;
        }
        System.out.println("Time ArrayList remove from the beginning: " + (System.currentTimeMillis() - timeStamp));

        int maxIterationsLL3 = 100_000;
        while (maxIterationsLL3 > 0) {
            linList.remove(0);
            maxIterationsLL3--;
        }
        // System.out.println(linList);
        System.out.println("Time LinkedList remove from the beginning: " + (System.currentTimeMillis() - timeStamp));

        System.out.println("------------------");
        //===============================================================



        //remove from the middle of the collection
        int maxIterationsAL4 = 100_000;
        while (maxIterationsAL4 > 0) {
            arrList.remove(arrList.size()/2);
            maxIterationsAL4--;
        }
        System.out.println("Time ArrayList remove from the middle: " + (System.currentTimeMillis() - timeStamp));

        int maxIterationsLL4 = 100_000;
        while (maxIterationsLL4 > 0) {
            linList.remove(arrList.size()/2);
            maxIterationsLL4--;
        }
        // System.out.println(linList);
        System.out.println("Time LinkedList remove from the middle: " + (System.currentTimeMillis() - timeStamp));

        System.out.println("------------------");
        //===============================================================

        //remove from the end of the collection
        int maxIterationsAL5 = 100_000;
        while (maxIterationsAL5 > 0) {
            arrList.remove(arrList.size()-1);
            maxIterationsAL5--;
        }
        System.out.println("Time ArrayList remove from the end: " + (System.currentTimeMillis() - timeStamp));

        int maxIterationsLL5 = 100_000;
        while (maxIterationsLL5 > 0) {
            linList.remove(arrList.size()-1);
            maxIterationsLL5--;
        }
        // System.out.println(linList);
        System.out.println("Time LinkedList remove from the end: " + (System.currentTimeMillis() - timeStamp));

        System.out.println("------------------");
        //===============================================================
    }
}
