package com.vanier.spring.learnspringframework.game;

import com.vanier.spring.learnspringframework.GamingConsole;

public class SuperContraGame implements GamingConsole {
    public void up(){
        System.out.println("SuperContraGame up");
    }

    public void down(){
        System.out.println("SuperContraGame down");
    }

    public void left(){
        System.out.println("SuperContraGame left");
    }

    public void right(){
        System.out.println("SuperContraGame right");
    }

}
