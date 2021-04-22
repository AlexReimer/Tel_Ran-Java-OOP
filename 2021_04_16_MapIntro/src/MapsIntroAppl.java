import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapsIntroAppl {
    public static void main(String[] args) {
        //пара:ключ, значение
    //    HashMap<String,Integer> des = new HashMap<>();
        LinkedHashMap<String,Integer> des = new LinkedHashMap<>();
        String roomer1 = "Vasya Pupkin";
        int room = 10;
        String roomer2 = "Petya Pupkin";
        String roomer3 = "Mariya Fleisher";
        int room2 = 11;

        System.out.println(des.put(roomer1, room));
        des.put(roomer2,room);
        des.put(roomer3,room2);
        System.out.println(des);

//        for(Map.Entry<String,Integer> e : des){
//
//        }
        System.out.println(des.size());
        //чтобы проитерировать всех жтльцов, использую метод keySet
        for(String roomer : des.keySet()){
            System.out.println(roomer);
        }
        for(Integer r : des.values()){
            System.out.println(r);
        }
        System.out.println(des. containsValue(room2));
        des.put(roomer3, 10);
        getRoomers(des,room);
        System.out.println(des.containsKey(roomer1));
        System.out.println(des. containsValue(room2));
        System.out.println(des.remove(roomer2));
        System.out.println(des);
        System.out.println(des.remove(roomer1, room));
        System.out.println(des);
        System.out.println(des.putIfAbsent(roomer3, 100));
        System.out.println(des);
        System.out.println(des.putIfAbsent("Murzik", 10));
        System.out.println(des);
        System.out.println(des.putIfAbsent("Murzik", 11));
        System.out.println(des);
        System.out.println(des.put("Murzik", 11));
        System.out.println(des);
    }

    private static void getRoomers(Map<String, Integer> des, int room) {
        for(Entry<String, Integer> e : des.entrySet()){
            if(e.getValue()==room) System.out.println(e.getKey());
        }
    }
}
