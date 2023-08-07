package com.vanier.spring.learnspringframework.game;

import com.vanier.spring.learnspringframework.GamingConsole;
import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole {
    public void up(){
        System.out.println("PacMan up");
    }

    public void down(){
        System.out.println("PacMan down");
    }

    public void left(){
        System.out.println("PacMan left");
    }

    public void right(){
        System.out.println("PacMan right");
    }

}
