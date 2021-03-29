import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayListTest {

    List<Integer> listInt;
    List<String> listStr;
    Integer[] intAr = {5, 3, 7, 2, 9, 0, 1, 2, 3};
    String[] strAr = {"Igor", "Asya", "Galina", "Bibigul", "Feofan", "Fecla"};


    @Before
    public void setUp() throws Exception {
        listInt = new ArrayList<>();
        listStr = new ArrayList<>();
        //заполняем коллекции через for each
        //заполнить как массив прописать с фиг.скобках элеменьы НЕЛЬЗЯ . поэтому цикл
        for (Integer num : intAr) {
            listInt.add(num);
        }
        for (String str : strAr) {
            listStr.add(str);
        }

        //более простое заполнение через Array.asList - wrapped Array класс Обертка
        //НО это не List (динамичный массив) - не может менять размер
        // то есть становится НЕ динимическим List
        listInt.addAll(Arrays.asList(intAr));
        listStr.addAll(Arrays.asList(strAr));
    }

   //тестируем метод add
    @Test
    public void testAdd() {
        //тест заполнился ли коллекция через мпетод size
        assertEquals(intAr.length, listInt.size());
        //тест - элемнеты на своих местах?
        for (int i = 0; i < intAr.length; i++) {
            assertEquals(intAr[i], listInt.get(i));
        }
        //тест - на добавление эл. и проверка прошло ли
        assertTrue(listInt.add(100500));
        assertEquals(intAr.length + 1, listInt.size());
        assertEquals((Integer) 100500, listInt.get(listInt.size() - 1));
        assertEquals(listInt.size() - 1, listInt.indexOf(100500));

        //тест - если зайдет null и проверка прошло ли
        //коллеция МОЖЕТ принимать NULL
        assertTrue(listInt.add(null));
        assertEquals(intAr.length + 2, listInt.size());
        assertEquals((Integer) null, listInt.get(listInt.size() - 1));
        assertEquals(listInt.size() - 1, listInt.indexOf(null));

        //тест - на добавление эл. и проверка встало ли число 200000 на индексе 0
        listInt.add(0, 200000);
        assertEquals(intAr.length + 3, listInt.size());
        assertEquals((Integer) 200000, listInt.get(listInt.get(0)));
        //тест - сдвинулся ли 1.й эл. с индекса 0 на 1 после добавления 200000 на 0
        assertEquals((Integer) 5, listInt.get(listInt.get(1)));
     // после верхних операций массив выгялдит так
        // Integer[] intAr = {200000, 5, 3, 7, 2, 9, 0, 1, 2, 3, 100500, null};

        //addAll (10, 20, 30)
        listInt.addAll(4, Arrays.asList(10, 20, 30));
        Integer[] test = {200000, 5, 3, 7, 10, 20, 30, 2, 9, 0, 1, 2, 3, 100500, null};
        for (int i = 0; i <listInt.size(); i++) {
            assertEquals(test[i],listInt.get(i));
        }
    }

    //тестируем метод get
    @Test
    public void testGet(){
        assertEquals((Integer) 3,listInt.get(1));//cast to Integer
    }



}