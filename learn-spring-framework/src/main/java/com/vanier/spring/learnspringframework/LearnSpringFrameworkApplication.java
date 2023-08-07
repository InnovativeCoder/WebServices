package com.vanier.spring.learnspringframework;

import com.vanier.spring.learnspringframework.game.GameRunner;
import com.vanier.spring.learnspringframework.game.MarioGame;
import com.vanier.spring.learnspringframework.game.PacManGame;
import com.vanier.spring.learnspringframework.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {

//		SpringApplication.run(LearnSpringFrameworkApplication.class, args;

//		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();
		PacManGame game = new PacManGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
}
}
