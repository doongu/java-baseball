package baseball;

import baseball.controller.GameController;

public class Application {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        gameController.startGame();

        while (true) {

            if(!gameController.runningGame()){

            }

        }
    }

}
