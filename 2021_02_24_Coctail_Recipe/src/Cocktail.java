import java.util.Arrays;

public class Cocktail {
    private String title;
    private Ingridient[] ingredients;
    private int liquid; // в миллилитрах
    private int perCent; //

//    public Cocktail(String title, Ingredient... ingredients) {
//        this.title = title;
//        this.ingredients = ingredients;
//        setLiquid();
//        setPerCent();
//    }

    public int getLiquid() {
        return liquid;
    }

    public void setPerCent() {
        // итоговые проценты = мл*алкоголь
        // (100*0 + 100*40) / все милилилитры = итоговая крепость

    }
//
//    private <Ingredient> void setLiquid() {
//        int result = 0;
//        for (Ingredient ing : ingredients) {
//            result += ing.();
//        }
//        liquid = result;
//    }

    @Override
    public String toString() {
        return "Cocktail{" +
                "title='" + title + '\'' +
                ", ingredients=" + Arrays.toString(ingredients) +
                ", liquid=" + liquid +
                ", perCent=" + perCent +
                '}';
    }
}
