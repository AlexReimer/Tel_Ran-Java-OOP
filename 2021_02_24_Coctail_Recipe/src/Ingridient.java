public class Ingridient {
    //кровавая мери: томатный сок и водка
    private String title;
    private int liquid; //milliliter
    private int perCent;
    private boolean alcohol;


    public Ingridient(String title, int liquid, int pereCent) {
        this.title = title;
        this.liquid = liquid;
        this.perCent = pereCent;
        setAlcohol ();
    }

    private void setAlcohol() {
        if (perCent > 2) {
            alcohol = true;
        }
    }

    @Override
    public String toString() {
        return "Ingridients{" +
                "title='" + title + '\'' +
                ", liquid=" + liquid +
                ", perCent=" + perCent +
                ", alcohol=" + alcohol +
                '}';
    }
}
