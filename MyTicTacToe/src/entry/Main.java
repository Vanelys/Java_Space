package entry;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("=====================");
        System.out.println("WELCOME TO TICTACTOE!");
        System.out.println("=====================\n");

//        int rand  = (int) Math.ceil(Math.random() * 2);
//        System.out.println(rand);

        GameMethods game = new GameMethods();
        game.setup();

    }
}
