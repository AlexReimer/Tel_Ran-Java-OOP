import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class ArrayList_vs_LinkedList {

    //выносим кол.во итераций за пределы мейна, чтобы кол.во в циклах не обнулялось
    public static final int ITER = 100_000;
    public static final int MIN = 1;
    public static final int MAX = 9999;

    public static void main(String[] args) {
        List<Integer> arList = new ArrayList<Integer>();
        List<Integer> lList = new LinkedList<Integer>();

        long timeStamp = System.currentTimeMillis();
        //add to begin ArrayList
        addOrRemoveToIndex(arList, 0, true);
        System.out.println("Add to begin arreay list: " + (System.currentTimeMillis() - timeStamp));

        timeStamp = System.currentTimeMillis();
        //add to begin LinkedList
        addOrRemoveToIndex(lList, 0, true);
        System.out.println("Add to begin linked list: " + (System.currentTimeMillis() - timeStamp));

        System.out.println("------------------");
        timeStamp = System.currentTimeMillis();
        //add to middle ArrayList
        addOrRemoveToIndex(arList, arList.size() / 2, true);
        System.out.println("Add to middle array list: " + (System.currentTimeMillis() - timeStamp));

        timeStamp = System.currentTimeMillis();
        //add to middle LinkedList
        addOrRemoveToIndex(lList, lList.size() / 2, true);
        System.out.println("Add to middle linked list: " + (System.currentTimeMillis() - timeStamp));

        System.out.println("------------------");
        timeStamp = System.currentTimeMillis();
        //add to end ArrayList
        addOrRemoveToIndex(arList, arList.size() - 1, true);
        System.out.println("Add to and array list: " + (System.currentTimeMillis() - timeStamp));

        timeStamp = System.currentTimeMillis();
        //add to end LinkedList
        addOrRemoveToIndex(lList, lList.size() - 1, true);
        System.out.println("Add to and linked list: " + (System.currentTimeMillis() - timeStamp));

        //=====================================================================================
        System.out.println("------------------");

        timeStamp = System.currentTimeMillis();
        //remove to begin ArrayList
        addOrRemoveToIndex(arList, 0, false);
        System.out.println("remove to begin arreay list: " + (System.currentTimeMillis() - timeStamp));

        timeStamp = System.currentTimeMillis();
        //remove to begin LinkedList
        addOrRemoveToIndex(lList, 0, false);
        System.out.println("remove to begin linked list: " + (System.currentTimeMillis() - timeStamp));

        System.out.println("------------------");
        timeStamp = System.currentTimeMillis();
        //remove to middle ArrayList
        addOrRemoveToIndex(arList, arList.size() / 2, false);
        System.out.println("remove to middle array list: " + (System.currentTimeMillis() - timeStamp));

        timeStamp = System.currentTimeMillis();
        //remove to middle LinkedList
        addOrRemoveToIndex(lList, lList.size() / 2, false);
        System.out.println("remove to middle linked list: " + (System.currentTimeMillis() - timeStamp));

        System.out.println("------------------");
        timeStamp = System.currentTimeMillis();
        //remove to end ArrayList
        addOrRemoveToIndex(arList, arList.size() - 1, false);
        System.out.println("remove to and array list: " + (System.currentTimeMillis() - timeStamp));

        timeStamp = System.currentTimeMillis();
        //remove to end LinkedList
        addOrRemoveToIndex(lList, lList.size() - 1, false);
        System.out.println("remove to and linked list: " + (System.currentTimeMillis() - timeStamp));


    }

    /* метод addOrRemoveToIndex принимает:
     1) List (родительский интерфейс) как для ArrayList и для LinkedList
       чтобы метод addToBegin не нужн было писать отдельно для ArrayList и для LinkedList
      2) int index чтобы кол.во методов сократить еще больше и сделать метод addToIndex еще более универсальным
     3)boolean - если передается true, то выполняется add,  если false - remove
     */
    public static void addOrRemoveToIndex(List<Integer> list, int index, boolean add) {
        if (list == null || index < 0 || index > list.size()) {
            System.out.println("Wrong args. Add");
            return;
        }
        int count = 0;
        if (add) {
            while (count < ITER) {
                list.add(0, getRandomNumber(MIN, MAX));
                count++;
            }
        } else {
            while (count < ITER) {
                if(index== list.size()-1)
                    list.remove(index--);
                else
                list.remove(index);
                count++;
            }
        }
    }

//    public static void removeToIndex(List<Integer> list, int index){
//        if(list==null || index<0 || index >=list.size()){
//            System.out.println("Wrong args. Remove");
//            return;
//        }
//        int count =0;
//        while (count < ITER){
//            list.remove(index);
//            count++;
//        }
//    }

    private static int getRandomNumber(int min, int max) {

        return (int) (Math.random() * ((max - min) + min));
    }

}
