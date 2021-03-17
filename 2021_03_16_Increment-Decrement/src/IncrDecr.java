public class IncrDecr {

    public static void main(String[] args) {
        int a = 5;
        //=================Postfix Incr=================
        System.out.println("a = " + (a++));
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);
        //=================Prefix Incr==================
        a = 5;
        System.out.println("a = " + (++a));
        System.out.println("a = " + a);
        //================Postfix Decr==================
        a = 5;
        System.out.println("a = " + (a--));
        System.out.println("a = " + a);
        //================Prefix Decr===================
        a = 5;
        System.out.println("a = " + (--a));
        System.out.println("a = " + a);
        //========================Sintax Sugar==========
        a = 5;
        a += 10; //a = a + 10;
        System.out.println(a);

        a /= 3; //a = a/3;
        System.out.println(a);

    }
}
