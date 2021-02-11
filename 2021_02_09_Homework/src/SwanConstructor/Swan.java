package SwanConstructor;

public class Swan {
    //Attribute
    String color;
    int age;
    boolean healthy, migrant;
    double temperatur;



    //Constructor 1
    public Swan(String color, int age, boolean migrant) {
        this.color = color;
        this.age = age;
        this.migrant = migrant;

    }

    //Constructor 2
    public Swan(int age, boolean healthy) {
        this.age = age;
        this.healthy = healthy;
    }

    //Constructor 3
    public Swan(String color, int age, double temperatur) {
        this.color = color;
        this.age = age;
        this.temperatur = temperatur;
    }

    //Constructor 4
    public Swan (String color, int age,boolean healthy,
                 boolean migrant, double temperatur) {
        this.color = color;
        this.age = age;
        this.healthy = healthy;
        this.migrant = migrant;
        this.temperatur = temperatur;
    }

}

