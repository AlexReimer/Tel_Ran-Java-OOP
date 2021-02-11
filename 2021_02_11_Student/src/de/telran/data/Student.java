package de.telran.data;

public class Student {
    public String firstName;
    public String lastName;
    public int age;
    public double middleRating;

    static int count = 1; //начало счета
    public int studentID;

    public Student() {
        studentID = count;
        count++;
    }

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        studentID = count;
        count++;
    }

    public String toDisplay() {
        return "Экземпляр кдасса Студент {" + "\n" +
                "Имя: " + firstName + "\n" +
                "Фамилия: " + lastName + "\n" +
                "Возраст: " + age + "\n" +
                "Средний бал: " + middleRating + "\n" +
                "Иматрикуляционный номер: " + studentID + "}";

    }
}
