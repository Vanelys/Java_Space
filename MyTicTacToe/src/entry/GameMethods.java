package entry;

import java.util.Scanner;
import java.util.*;

class GameMethods
{
    private static char spaces[] = {'_', '_', '_', '_', '_', '_', '_', '_', '_'};
    private static int winPossibilities[][] ={
            {0, 1, 2},
            {3, 4, 5},
            {6, 7, 8},
            {0, 3, 6},
            {1, 4, 7},
            {2, 5, 8},
            {0, 4, 8},
            {2, 4, 6}
    };
    private static boolean win = false;
    private static int mode = 0;
    private static int rand = (int) Math.ceil(Math.random() * 2);
    private static char player1 = ' ';
    private static String player1Name = " ";
    private static char player2 = ' ';
    private static String player2Name = " ";
    private static String usrStr = " ";

    public static void game()
    {
        //null
    }

    public static void setup()
    {
        board();
        gameMode();
    }

    public static void board()
    {
        System.out.println("    A    B    C");
        System.out.println("----------------");
        System.out.println("1   "+GameMethods.spaces[0]+"    "+GameMethods.spaces[1]+"    "+GameMethods.spaces[2]+"\n");
        System.out.println("2   "+GameMethods.spaces[3]+"    "+GameMethods.spaces[4]+"    "+GameMethods.spaces[5]+"\n");
        System.out.println("3   "+GameMethods.spaces[6]+"    "+GameMethods.spaces[7]+"    "+GameMethods.spaces[8]+"\n");
        System.out.println("----------------");
    }

    public static void gameMode()
    {
        try
        {
            System.out.print("Enter 1 or 2 for single, or multi-player respectively : ");
            Scanner input = new Scanner(System.in);
            GameMethods.mode = input.nextInt();

            if(GameMethods.mode == 1)
            {
                singlePlayer();
            }
            else if(GameMethods.mode == 2)
            {
                multiPlayer();
            }
            else
            {
                System.out.println("Game mode can be either 1, or 2");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public static void singlePlayer()
    {
        System.out.println("Choose your symbol 'X', or 'O'");
        System.out.println("or 'random'. Symbol will be chosen for you");
        System.out.print("So what will it be? : ");
        Scanner input = new Scanner(System.in);
        GameMethods.usrStr = input.next();

        if(GameMethods.usrStr.equalsIgnoreCase("X"))
        {
            System.out.println("You have chosen 'X'");
            GameMethods.player1 = 'X';
            GameMethods.player2 = 'O';
        }
        else if(GameMethods.usrStr.equalsIgnoreCase("O"))
        {
            System.out.println("You have chosen 'O'");
            GameMethods.player1 = 'O';
            GameMethods.player2 = 'X';
        }
        else if(GameMethods.usrStr.equalsIgnoreCase("random"))
        {
            if(GameMethods.rand == 1)
            {
                System.out.println("You will be 'X'");
                GameMethods.player1 = 'X';
                GameMethods.player2 = 'O';
            }
            else
            {
                System.out.println("You will be 'O'");
                GameMethods.player1 = 'O';
                GameMethods.player2 = 'X';
            }
        }
        else
        {
            System.out.println("Invalid Entry, enter either 'X', or 'O'");
        }
    }

    public static void multiPlayer()
    {
            System.out.print("May I have the first player's name? : ");
            Scanner input = new Scanner(System.in);
            GameMethods.player1Name = input.nextLine();

            System.out.print("Now may I have the second player's name? : ");
            GameMethods.player2Name = input.nextLine();

            System.out.println("Let's decide your symbols with a coin toss");
            System.out.println("if heads, "+GameMethods.player1Name+" will be 'O'");
            System.out.println("else if tails, "+GameMethods.player2Name+" will be 'O'");

            if(GameMethods.rand == 1)
            {
                System.out.println("HEADS!");
                System.out.println(GameMethods.player1Name+" will be 'O' and "+GameMethods.player2Name+" will be 'X'");
                GameMethods.player1 = 'O';
                GameMethods.player2 = 'X';
            }
            else
            {
                System.out.println("TAILS!");
                System.out.println(GameMethods.player2Name+" will be 'O' and "+GameMethods.player1Name+" will be 'X'");
                GameMethods.player1 = 'X';
                GameMethods.player2 = 'O';
            }
    }

    public static void move()
    {
        System.out.println("Enter your move with coordinates such as 'A1' or 'C6'");
        Scanner input = new Scanner(System.in);
        GameMethods.usrStr = input.next();
    }

    public static void checkWin()
    {
        boolean hashSpaces = Arrays.asList(GameMethods.spaces).contains('X');

        if(hashSpaces)
        {

        }
    }
}

//Building checkWin() method, and move() method