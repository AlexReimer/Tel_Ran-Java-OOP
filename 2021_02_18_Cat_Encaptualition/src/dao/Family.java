package dao;


import data.Cat;
import data.User;


public class Family {
    User papa;
    User mama;
    Cat cat;
    String bankAccount;


    public Family(User user, Cat cat, User mama) {
        this.papa = user;
        this.cat = cat;
        this.mama = mama;
    }
}

