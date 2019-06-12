import java.util.Scanner;
public class Runner {
    public static boolean Gamewon = false;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Gameboard OppBoard = new Gameboard();
        Gameboard playerBoard = new Gameboard();
        Opponent Opp = new Opponent("Opponent");
        OppBoard.randomShips();
        playerBoard.randomShips();
        Player boop = new Player();
        String[][] board = playerBoard.getBoard();
        printBoard(board);
        while(Gamewon == false) {
            System.out.println("Enter the X coordinate you would like to target");
            int where1 = input.nextInt();
            System.out.println("Enter the Y coordinate you would like to target");
            int where2 = input.nextInt();
            printBoard(board);
            String[][] ReturnedBoard = boop.guessedSpot(where1, where2, OppBoard.getBoard());
            OppBoard.setBoard(ReturnedBoard);
            Opp.guessRandom();
            int which = Opp.getWhich();
            int[] placeholder1 = Opp.getX();
            int[] placeholder2 = Opp.getY();
            String[][] returnedboard2 = Opp.HasRandom(placeholder1[which], placeholder2[which], playerBoard.getBoard());
            playerBoard.setBoard(returnedboard2);
            CheckWin(OppBoard.getBoard(), "Player 1");
            CheckWin(playerBoard.getBoard(), "Computer");
        }

    }
    public static void printBoard(String[][] array){
        for(int i = 0; i<10; i++)
        {
            for(int j = 0; j<10; j++)
            {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
    private static void CheckWin(String[][] x, String y){
        int ships = 0;
        for(int i = 0; i<10; i++)
        {
            for(int j = 0; j<10; j++)
            {
                if(x[i][j].equals("🛥️")){
                    ships = ships + 1;
                }
            }

        }
        if(ships == 0){
            System.out.println(y + " has won!");
        }
    }
}
