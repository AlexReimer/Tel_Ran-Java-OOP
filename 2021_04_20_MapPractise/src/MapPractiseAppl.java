import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPractiseAppl {
    public static void main(String[] args) {

        int min = 0, max = 11;
//        int number = random (min, max);
//        System.out.println(number);
        int count = 1000;
        //задача - сгенерировать рандомные числа в диапазоне от 0 до 11 и посчитать сколько раз было каждое из этих чисел
        // сгенерировано
        printNumberMapOccurances(min, max, count);
        //=================================================
        //задача - посчитать сколько раз тот или иной чар встречается в строке
        String str = "ssadaeeads";
        printCharOccurances(str);
    }

    public static void printCharOccurances(String str) {
        //  Map<Character, Integer> chars = new HashMap<>();
        Map<Character, Integer> chars = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //varaint 3
            //getOrDefault метод - если пара ключ/значение было, то value(count)+1_ если пары не было, то верни 0
            Integer value = chars.getOrDefault(c, 0);
            chars.put(c, value + 1);


            //varaint 2
//            if(chars.containsKey(c)){
//                int value =chars.get(c);
//                value++;
//                chars.replace(c,value);
//            }else {
//                chars.put(c,1);
//            }
            //variant 1
//            Integer value = chars.get(c);
//            chars.put(c, value == null ? 1 : value + 1);
        }
        System.out.println(chars);
    }

    private static void printNumberMapOccurances(int min, int max, int count) {
        Map<Integer, Integer> mapOccu = new HashMap<>();
        for (int i = 0; i < count; i++) {
            int number = random(min, max);
            Integer value = mapOccu.get(number);
            //тернарный - если null (первый раз встретилось число), то count 1, если не null (уже есть коаунт),
            // то count (value) +1
            mapOccu.put(number, value == null ? 1 : value + 1);
        }
        System.out.println(mapOccu);

    }

    public static int random(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
