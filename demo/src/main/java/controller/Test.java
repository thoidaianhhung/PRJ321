package controller;

import bean.User;

public class Test {
    public static void main(String[] args) {
        User user = new User("1danhvaythoi@gmail.com", "nguyenvanhung");
        if (user.validate()) {
            System.out.println("Bean validates");
        } else {
            System.out.println("Error");
        }
    }
}
