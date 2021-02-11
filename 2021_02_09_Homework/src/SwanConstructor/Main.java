package SwanConstructor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Swan one = new Swan("white", 15, true);
        Swan two = new Swan("black", 8, false);
        Swan three = new Swan("white", 20, true);
        Swan four = new Swan("white", 4, true);
        Swan five = new Swan(25, false);
        Swan six = new Swan("black", 3, true, false, 36.6);

        System.out.println("This " + one.color + " is " + one.age
                + " years old and don't stay here for winter");
        System.out.println("This " + two.color + " is " + two.age
                + " years old and stay here for winter");
        System.out.println("This " + three.color + " is " + three.age
                + " years old and don't stay here for winter");
        System.out.println("This " + four.color + " is " + four.age
                + " years old and stay here for winter");
        System.out.println("This " + five.color + " is " + five.age
                + " years old and is sick");
        System.out.println("This " + six.color + " is " + six.age
                + " years old and is healthy." + "His body temperatur: " + six.temperatur);

        Swan[] swanZoo = new Swan[]{one, two, three, four, five, six};
        swanZooSort(swanZoo);
     //   System.out.println(Arrays.toString (swanZooSort(swanZoo)));;
    }

    public static void swanZooSort(Swan[] swanZoo) {
        for (int i = 0; i < swanZoo.length - 1; i++) {
            for (int j = swanZoo.length - 1; j > i; j--) {
                if (swanZoo[j].age < swanZoo[j - 1].age) {
                    int tmp = swanZoo[i].age;
                    swanZoo[j].age = swanZoo[j - 1].age;
                    swanZoo[j - 1].age = tmp;
                }
            }
        }
        for (Swan sorted : swanZoo) {
            System.out.println(sorted);
        }
    }
}


