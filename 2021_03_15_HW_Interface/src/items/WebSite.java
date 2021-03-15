package items;

public class WebSite extends MassMedia{

    String url;

    public WebSite(String name, String url) {
        super(name);
        this.url = url;
    }

    public WebSite(String url) {
        this.url = url;
    }

    public WebSite() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
