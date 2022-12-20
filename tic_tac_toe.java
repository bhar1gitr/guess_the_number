import java.sql.Statement;
import java.util.Scanner;
public class GFG_tic_tac_toe {
    public static void main(String[] args) {
//        Scanner input
        Scanner in = new Scanner(System.in);

//        Weclome message
        System.out.println("Welcome to tic tac toe!!!");

//        Taking name of first and second player
        String player1 , player2;
        System.out.println("Enter your name player1: ");
        player1 = in.next();

        System.out.println("Enter your name player2: ");
        player2 = in.next();

//       Declaration of board
        char[][] board
                = {
                {'-','-','-'},
                {'-','-','-'},
                {'-','-','-'}
        };

//        Printing the board
        print_board(board);

        while(true){
//            Declaring positions
            boolean win = false;
            int x,y;
            System.out.println(player1 + "'s turn (X)");
            System.out.println(player1 + " Enter the row number ");
            x = in.nextInt();
            System.out.println(player1 + " Enter the column number ");
            y = in.nextInt();
            player_1_insert(board,--x,--y);
            print_board(board);
            int val = check(board,player1,player2);
            if(val == 0){
                System.out.println(player1 + " Won!!!");
                break;
            }

            System.out.println(player2 + "'s turn (O)");
            System.out.println(player2 + " Enter the row number ");
            x = in.nextInt();
            System.out.println(player2 + " Enter the column number ");
            y = in.nextInt();
            player_2_insert(board,--x,--y);
            print_board(board);
            val = check(board,player1,player2);
            if(val == 1){
                System.out.println(player2 + " Won!!!");
                break;
            }
        }
    }

//   Method for printing board
    static void print_board(char[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
    }

//  Player1 inserting element
    static void player_1_insert(char[][] board,int x,int y){
        board[x][y] = 'X';
    }

//    Player2 inserting element
    static void player_2_insert(char[][] board,int x,int y){
        board[x][y] = 'O';
    }

//    Checking conditions
    static int check(char[][] board,String player1,String player2){
//        Checking for digonals
       if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X' || board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X'){
           return 0;
       } else if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O' || board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
           return 1;
       }

//       Checking for rows
       if(board[0][0] == 'X' && board[0][1] == 'X'  && board[0][2] == 'X' || board[1][0] == 'X' && board[1][1] == 'X'  && board[1][2] == 'X' || board[2][0] == 'X' && board[2][1] == 'X'  && board[2][2] == 'X'){
           return 0;
       }else if(board[0][0] == 'O' && board[0][1] == 'O'  && board[0][2] == 'O' || board[1][0] == 'O' && board[1][1] == 'O'  && board[1][2] == 'X' || board[2][0] == 'O' && board[2][1] == 'O'  && board[2][2] == 'O'){
           return 1;
       }

//       Checking for cols
       if(board[0][0] == 'X' && board[1][0] == 'X'  && board[2][0] == 'X' || board[0][1] == 'X' && board[1][1] == 'X'  && board[2][1] == 'X' || board[0][2] == 'X' && board[1][2] == 'X'  && board[2][2] == 'X'){
           return 0;
       }else if(board[0][0] == 'O' && board[1][0] == 'O'  && board[2][0] == 'O' || board[0][1] == 'O' && board[1][1] == 'O'  && board[2][1] == 'O' || board[0][2] == 'O' && board[1][2] == 'O'  && board[2][2] == 'O'){
           return 1;
       }

       return -1;
    }

}

