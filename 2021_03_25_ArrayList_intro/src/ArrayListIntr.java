import java.util.ArrayList;

public class ArrayListIntr {

    public static void main(String[] args) {
        //<String> - указаение на тип данных. мжет быть любой. в том числе и нами созданый класс Cat/Book usw
        ArrayList<String> list = new ArrayList<>();//create ArrayList
        System.out.println(list.isEmpty());//провека коллекции на "пустоту" . boolean
        System.out.println(list.size());//провека

        list.add("Borka"); //добавление в колл. т сдвинь вправо boolean
        System.out.println(list.isEmpty());//провека коллекции на "пустоту" : boolean
        System.out.println(list.size());//
        list.add(0,"Ryzhik"); //добавление в колл. т сдвинь вправо : НО void
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        list.set(0,"Botja");//добавление эл.с удалением того, что было на этом мсете
        System.out.println(list);
        for (String c : list){
            System.out.println(c);
            //вставить скнин шот с футпринт
        }
        list.add("Borka");
        System.out.println(list.indexOf("Borka"));
        System.out.println(list.lastIndexOf("Borka"));
        System.out.println(list.contains("Borka"));
        ArrayList<String> temp = new ArrayList<String>();
        temp.add("1");
        temp.add("2");
        temp.add("3");
        list.addAll(temp);//добавление в колл. несколькких элеинтов вконец
        System.out.println(list);
        list.addAll(1,temp); //добавление в колл. несколькких элеинтов начиная с Индекса со сздвином вправо
        System.out.println(list);
        list.remove(1);//удаление по индексу со сздвином влево
        System.out.println(list);
        list.removeAll(temp);//удаление : boolean
        System.out.println(list);
        list.clear();//удаление всего из коллекции : void
        System.out.println(list.isEmpty());

        ArrayList<Integer> list2 = new ArrayList<>();//create ArrayList
       // list2.add("abc"); строку не доьавит ибо инт

    }
}
