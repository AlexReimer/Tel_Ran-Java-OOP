import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SetsTest {


    Set<Integer> set; // = new HashSet<>();
    Integer[] test = {3, 1, 8, 0, 9, 7, 4, 2, 11};

    @Before
    public void setUp() throws Exception {
        //заполнение коллекции
//        for(int i = 0; i<test.length; i++){
//            set.add(test[i]);
//        }
        //второй, короткий вариант заполнения коллекции
        //      set = new HashSet<Integer>(Arrays.asList(test));
        set = new TreeSet<Integer>(Arrays.asList(test));
        //      set = new TreeSet<Integer>(Arrays.asList(test));
    }


    @Test
    public void testAdd() {
        // проверяем заполнилась равна ли длинна массива нашей коллекции
        assertEquals(test.length, set.size());
        // проверяем заполнилась ли колллекция нужными эдементами через contains
//        for(Integer i : test){
//            assertTrue(set.contains(i));
//        }
        assertTrue(set.containsAll(Arrays.asList(test)));
//        Integer[] test2 = {3, 1, 8, 0, 9, 7, 4, 2, 11, 12};
//        assertTrue(set.containsAll(Arrays.asList(test2)));//false
//        assertEquals(test2.length, set.size());//false

        assertTrue(set.add(12));
        assertEquals(test.length + 1, set.size());
        assertTrue(set.contains(12));

        assertFalse(set.add(0));
        assertEquals(test.length + 1, set.size());

        List<Integer> list = new LinkedList<>(Arrays.asList(22, 23, 24));
        assertTrue(set.addAll(list));
        assertEquals(test.length + 4, set.size());
        assertTrue(set.containsAll(list));

    }

    @Test
    public void testRemove() {
        assertTrue(set.remove(0));
        assertEquals(test.length - 1, set.size());
        assertFalse(set.contains(0));

        assertFalse(set.remove(0));
        assertEquals(test.length - 1, set.size());

        assertTrue(set.removeAll(Arrays.asList(3, 1, 33, 44, 55)));//2 elements deleted (3,1) дргих там не было поэтому не могут быть удалены
        assertEquals(test.length - 3, set.size());
        assertTrue(set.containsAll(Arrays.asList(8, 9, 7, 4, 2, 11)));

        //пытаемся удалить то,чего там нет
        assertFalse(set.removeAll(Arrays.asList(99, 77, 88, 14)));
        assertEquals(test.length - 3, set.size());

        //удаляем оставшиеся элем и проверяем все ли удалилось
        assertTrue(set.removeAll(Arrays.asList(8, 9, 7, 4, 2, 11)));
        assertTrue(set.isEmpty());
    }

    @Test
    public void testLinkedHashSet() {
        int count = 0;
        for(Integer num : set) {
            assertEquals(test[count++], num);
        }
        assertArrayEquals(test, set.toArray(new Integer[0]));
    }

}