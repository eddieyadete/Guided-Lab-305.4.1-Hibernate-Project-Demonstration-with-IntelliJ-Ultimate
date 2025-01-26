package com.eddie;

import com.eddie.Controller.UserController;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        addUser(factory,session);
//    findUser(factory, session,3);
//    updateUser(session,3);
//    deleteUser(session,4);
//        UserController.addUser();
//        UserController.findUser(3);
//        UserController.updateUser(3);
        UserController.deleteUser(4);
        }
    }
