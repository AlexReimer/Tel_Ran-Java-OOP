package de.telran.application;

import de.telran.dao.Group;
import de.telran.data.Student;

public class MyStartApplicationForGroup {
    public static void main(String[] args) {
        Group group17 = new Group(20); //создаем массив для гпуппы студентов

        //добавление студентов в группу
        Student sascha = new Student ("Sascha", "Ivanov", 30);
        group17.addStundent(sascha);
        System.out.println(group17.size);
        Student dascha = new Student("Dascha", "Wolf", 25);
        System.out.println(group17.size);
        Student glascha = new Student("Glascha", "Meier", 35);
        System.out.println(group17.size);
        Student mascha = new Student("Mascha", "Popova", 28);
        System.out.println("Добавление студента: " + group17.addStundent(mascha));

        //удаление студентов
        System.out.println("Удаление студента: " + group17.deleteStudentFromGroup(sascha));
        System.out.println(group17.size);
        System.out.println(group17.students[0].firstName);

    }

}
