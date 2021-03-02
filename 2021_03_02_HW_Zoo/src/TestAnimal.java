public class TestAnimal {
    public static void main(String[] args) {
        Panda kung_fu = new Panda("bear", "Kung Fu", 10);
        Dragon blacky = new Dragon("pangolin", "Blacky", 1_500, "black");
        Lion king = new Lion("cats", "King", 12);


        System.out.println(kung_fu.toString());
        System.out.println(blacky.toString());
        System.out.println(king.toString());
    }
}
