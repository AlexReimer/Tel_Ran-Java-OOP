public class Swan {
    String color;
    boolean migrant;
    int age = 0;
    boolean healthy;


    public void flyingSwan() {
        if (migrant == true && healthy == true) {
            System.out.println("Some of swan are migrants");
        }
    }

    public void swanGroupInfoOutput() {
        System.out.println("The bird ist " + color);
        System.out.println("This swan is a migrant: " + migrant);
        System.out.println("Swan is " + age + " years old");
        System.out.println("The bird" + (healthy ? " is healthy" : " is NOT healthy"));


    }

    public static void main(String[] args) {
        Swan groupOne = new Swan();
        Swan groupTwo = new Swan();
        Swan groupThree = new Swan();

        groupOne.color = "White swan";
        groupOne.migrant = true;
        groupOne.age = 10;
        groupOne.healthy = true;
        groupOne.swanGroupInfoOutput();

        System.out.println("---------");

        groupTwo.color = "Black swan";
        groupTwo.migrant = true;
        groupTwo.age = 15;
        groupTwo.healthy = false;
        groupTwo.swanGroupInfoOutput();

        System.out.println("---------");

        groupThree.color = "Black swan";
        groupThree.migrant = false;
        groupThree.age = 8;
        groupThree.healthy = true;
        groupThree.swanGroupInfoOutput();
    }

}
