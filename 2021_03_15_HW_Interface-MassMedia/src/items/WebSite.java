package items;

public class WebSite extends MassMedia{

    String url = "undefined";
    String author = "undefined";

    public WebSite(String name, String url, String author) {
        super(name);
        this.url = url;
        this.author = author;
    }

    public WebSite(String url, String author) {
        this.url = url;
        this.author = author;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

