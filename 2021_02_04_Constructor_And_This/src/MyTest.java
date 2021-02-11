public class MyTest {
    public static void main(String[] args) {
        Article art1 = new Article (
                "Достопримечательности Берлина",
                "Текст статьи"
                );


        Article art2 = new Article(
                "Достопримечательности Потсдама",
                "Текст статьи"
        );
        System.out.println(art1.title);
        System.out.println(art2.announce);
        //создали конструктор с пареметрами

        Article art3 = new Article(13,
                " Best article of week",
                "Я памятник себе воздвиг нерукотворный"
        );
        System.out.println(art3.title);
    }
}
