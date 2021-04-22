import java.util.*;
import java.util.Map.Entry;

public class StringCountAppl {
    public static void main(String[] args) {
        String text = "lmn vf lmn b lmn aaaa Aaa b aaaa";
        displayWordsCount(text);
        System.out.println("===================");
        displayWorsSortedBydCount(text);
    }

    private static void displayWorsSortedBydCount(String text) {
        String[] words = getWords(text);
        Map<String, Integer> map = getMapOccurances(words);
        List<Entry<String, Integer>> listOccurances = getListOccurances(map);
        sortListOccurances(listOccurances);
        printList(listOccurances);
    }

    private static void printList(List<Entry<String, Integer>> listOccurances) {
        for(Entry<String, Integer> e : listOccurances){
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    private static void sortListOccurances(List<Entry<String, Integer>> listOccurances) {
        //собственный компаратор с нашими пораметрами для сортировки
        //анаонимный инеркласс
        listOccurances.sort(new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                int res = o2.getValue() - o1.getValue();
                return res == 0 ? o1.getKey().compareTo(o2.getKey()) : res;
            }
        });
    }

    private static List<Entry<String, Integer>> getListOccurances(Map<String, Integer> map) {

        return new ArrayList<Entry<String, Integer>>(map.entrySet());
    }

    private static void displayWordsCount(String text) {
        String[] words = getWords(text);
        Map<String, Integer> map = getMapOccurances(words);
        printMap(map);
    }

    private static void printMap(Map<String, Integer> map) {
        for (Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    private static Map<String, Integer> getMapOccurances(String[] words) {
        TreeMap<String, Integer> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

        for (String s : words) {
            int count = map.getOrDefault(s, 0);
            //есди найдено искомое слово, то ключ это слово, а значение count_ увеличеный на единицу
            map.put(s, count + 1);
        }
        return map;
    }

    private static String[] getWords(String text) {
        return text.split(" ");
    }
}
