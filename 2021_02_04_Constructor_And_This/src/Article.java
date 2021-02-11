public class Article {
    String title;
    String announce;
    String fullText;
    int id;

    public Article (){
        title = "unknown";
        announce = "Напиши здесь анонс";
        fullText = "unknown";
    }

    public Article (String articleTitle, String articleAnnounce){
        title = articleTitle;
        announce = articleAnnounce;
    }

    public Article (int articleID, String articleTitle, String articleAnnounce){
        title = articleTitle;
        announce = articleAnnounce;
        id = articleID;

    }
}
