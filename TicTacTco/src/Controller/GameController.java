package Controller;

import Model.Game;
import Model.User;
import Service.GameService;
import Service.UserService;

import java.util.Random;
import java.util.Scanner;

public class GameController {


    UserService userService;
    GameService gameService;
    Scanner scn;



    public GameController(){
        this.userService = new UserService();
        this.gameService = new GameService();
    }

    public int toss(){
        Random random = new Random();
        int randomNum = Math.abs(random.nextInt())%2;
        return randomNum;
    }


    public User inputPlayerDetails(int playerNumber){
        System.out.println(String.format("Player%d: Are you a new user ?(Yes/No)", playerNumber));
        String userResp1 = scn.next();
        if(userResp1.equals("No")){
            while(true){
                System.out.println(String.format("Player%d: Tell us your userId", playerNumber));
                int id = scn.nextInt();
                User user = userService.validateUserId(id);
                if(user != null){
                    System.out.println("Correct id entered");
                    return user;
                }
                System.out.println(String.format("Player%d: Wrong Id entered !!", playerNumber));
            }
        } else {
            System.out.println(String.format("Player%d: Enter your name", playerNumber));
            String name = scn.next();
            return userService.createNewUser(name);
        }
    }

    public void startProgram(){
        scn = new Scanner(System.in);
        System.out.println("Welcome to TicToe Game !!");
        System.out.println("Let's start game and complete your registration !!");
        User player1 = this.inputPlayerDetails(1);
        User player2 = this.inputPlayerDetails(2);
        System.out.println("Starting toss");
        int val = this.toss();
        Game game;
        if(val == 0){
            System.out.println(String.format("Congratulations %s you won the toss", player1.getName()));
            game = this.gameService.createGame(player1, player2);
        }else{
            System.out.println(String.format("Congratulations %s you won the toss", player2.getName()));
            game = this.gameService.createGame(player2, player1);
        }

        this.gameService.startGame(game);


    }
}