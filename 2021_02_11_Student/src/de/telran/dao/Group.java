package de.telran.dao;

import de.telran.data.Student;

public class Group {
    public Student[] students;
    public int size;

    public Group(int capacity) {
        students = new Student[capacity];
        size = 0;
    }

    //добавление студента в группу
    public boolean addStundent(Student student) {
        if (size < students.length) {
            students[size] = student;
            size++;
            return true;
        }
        return false;
    }

    //удаление студента из группы (это массив)
    public boolean deleteStudentFromGroup(Student person) {
        //equals для сравнения объектов
        for (int i = 0; i < size; i++) {
            if (students[i].equals(person)) {
                //надо удалить итый
                //нода перетянуть последний элемент в образовавшуюся "дырку"
                //надо ус=меньшить размер
                //что делать с последним ненужным элетентом
                //1
                students[i] = students[size - 1];
               // students[size - 1] = null;//на наш выюор можно и не делать этого. будет работать тк это после сайз
                size--;
                return true;
            }
        }
        return false;
    }
}
