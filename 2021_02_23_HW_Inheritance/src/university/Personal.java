package university;

public class Personal {
    public Person[] persons;
    public int staff;

    public Personal(int capacity) {
        persons = new Person[capacity];
        staff = 0;
    }

    public boolean addPerson(Person psn) {
        if (staff < persons.length) {
            persons[staff] = psn;
            staff++;
            return true;
        }
        return false;
    }

    public boolean deletePerson(Person psn) {
        for (int i = 0; i < staff; i++) {
            if (persons[i].equals(psn)) {
                persons[i] = persons[staff - 1];
                staff--;
                return true;
            }
        }
        return false;
    }

    public boolean updatePerson(Person psn) {
        for (int i = 0; i < staff + 1; i++) {
            if (persons[i].equals(psn)) {
                persons[i] = persons[staff + 1];
                staff++;
                return true;
            }
        }
        return false;
    }

    //sort by birthday
    public int sortByBirthday(int[] bday) {
        int count = 1;
        while (count > 0) {
            count = 0;
            for (int i = 0; i < bday.length - 1; i++) {
                if (bday[i] > bday[i + 1]) {
                    int temp = bday[i];
                    bday[i] = bday[i + 1];
                    bday[i + 1] = temp;
                    count++;
                }
            }
        }
        return count;
    }
}
