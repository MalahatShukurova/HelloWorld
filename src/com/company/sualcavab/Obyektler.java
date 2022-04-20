package com.company.sualcavab;

public class Obyektler {


    public static void main(String[] args) {
        User u = new User();
        Teacher t = new Teacher();
        t.user = u;

        u.a++;
        System.out.println(t.user.a);
    }
}
