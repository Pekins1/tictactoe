
import java.util.Scanner;
public class Player extends GridView implements Playable {
    Scanner sc = new Scanner(System.in);
    char piece;
    int scoreBoard;
    boolean turn = true; // this is used to determine the turn switching state

    // The index from this move method will determine the position a player is placing a piece on.
    public int move() {
        String[] position = {"T-Left", "T-Center", "T-Right", "M-Left", "M-Center", "M-Right", "B-Left", "B-Center", "B-Right"};
        System.out.println("Make your move by picking a number");
        for (int i = 0; i < position.length; i++) {
            System.out.printf("[%d] %-6s ", i + 1, position[i]);
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
        try{
            System.out.print("Your move: ");
            return sc.nextInt();
        }catch (Exception ex){
            System.out.println("Invalid input. You can only use the above numbers to make a move!. \nTry again.");
        }
        return 0;
    }
  //...........................................
  // SCOREBOARD CHECKER
  //...........................................
//    public void score(){
//        PlayerOne pOne = new PlayerOne();
//        PlayerTwo pTwo = new PlayerTwo();
//        if(turn){
//            pOne.scoreBoard++;
//            System.out.print("Player One Wins.\nScore: "+ pOne.scoreBoard);
//        }else{
//            pTwo.scoreBoard++;
//            System.out.print("Player Two Wins.\nScore: "+ pTwo.scoreBoard);
//        }
//
//    }

//............................................................
// The following lines of code represent playState of the game
//............................................................
    public void playState() {
        PlayerOne pOne = new PlayerOne();
        PlayerTwo pTwo = new PlayerTwo();
        WinLogic win = new WinLogic();

// This area of code determines the player piece.

        System.out.println("You can play as Player's [X] or [O]");
        System.out.print("What piece do you want to play as: ");
        char choice = Character.toUpperCase(sc.next().charAt(0));
        System.out.println();
        if (choice == 'X') {
            pOne.piece = 'X';
            pTwo.piece = 'O';
        }else if(choice == 'O'){
            pOne.piece = 'O';
            pTwo.piece = 'X';
        }else{
            System.out.println("Wrong/Invalid input switching to default PlayerOne is [X]");
            pOne.piece ='X';
            pTwo.piece = 'O';
        }
        System.out.println("PlayerOne is "+ "["+ pOne.piece+"]");
        System.out.println("PlayerTwo is "+ "[" +pTwo.piece+"]");

        System.out.println("Game Start......\n");
        gridBoard();
        do {
// This area of code defines whose turn it is.
            System.out.println();
            if (turn) {
                System.out.println("Turn:... PlayerOne " +"["+ pOne.piece+"]");
                pOne.play(pOne.piece);
            }
            else{
                System.out.println("Turn:... PlayerTwo " +"["+ pTwo.piece+"]");
                pTwo.play(pTwo.piece);
            }
            turn = !turn;

// This area of code ends the game based on the WinLogic algorithms.
            if (win.diagonalCheck(board)){
                System.out.println("Wins by Diagonal Line. Round end.");
                break;
            }else if(win.horizontalCheck(board)){
                System.out.println("Wins by Horizontal Line. Round end.");
                break;
            }else if (win.verticalCheck(board)) {
                System.out.println("WinS by Vertical Line. Round end");
                break;
            }else if(win.drawCheck(board)){
                System.out.print("There are no moves left.\n" + "Round Ends in a tie");
                break;
            }
        }
        while (!win.diagonalCheck(board) && !win.horizontalCheck(board) && !win.verticalCheck(board));
    }

    public void play(char piece) {
        Playable pl = new Player();

        switch (pl.move()) {
            case 1:
                if (board[0][0] == 'X'|| board[0][0] =='O'){
                    System.out.println("Cell already has value of " + board[0][0] + "\nTry again!\n");
                    pl.move();
                }else{
                    setGridBoard(0, 0, piece); // top.left
                    break;
                }
            case 2:
                if (board[0][1] == 'X'|| board[0][1] =='O'){
                    System.out.println("Cell already has value of " + board[0][1] + "\nTry again!\n");
                    pl.move();
                }else{
                    setGridBoard(0, 1, piece); // mid.left
                    break;
                }
            case 3:
                if (board[0][2] == 'X'|| board[0][2] =='O'){
                    System.out.println("Cell already has value of " + board[0][2] + "\nTry again!\n");
                    pl.move();
                }else{
                    setGridBoard(0, 2, piece); // bottom.left
                    break;
                }
            case 4:
                if (board[1][0] == 'X'|| board[1][0] =='O'){
                    System.out.println("Cell already has value of " + board[1][0] + "\nTry again!\n");
                    pl.move();
                }else{
                    setGridBoard(1, 0, piece); // top.center
                    break;
                }
            case 5:
                if (board[1][1] == 'X'|| board[1][1] =='O'){
                    System.out.println("Cell already has value of " + board[1][1] + "\nTry again!\n");
                    pl.move();
                }else{
                    setGridBoard(1, 1, piece); // mid.center
                    break;
                }
            case 6:
                if (board[1][2] == 'X'|| board[1][2] =='O'){
                    System.out.println("Cell already has value of " + board[1][2] + "\nTry again!\n");
                    pl.move();
                }else{
                    setGridBoard(1, 2, piece); // bottom.center
                    break;
                }
            case 7:
                if (board[2][0] == 'X'|| board[2][0] =='O'){
                    System.out.println("Cell already has value of " + board[2][0] + "\nTry again!\n");
                    pl.move();
                }else{
                    setGridBoard(2, 0, piece); // top.right
                    break;
                }
            case 8:
                if (board[2][1] == 'X'|| board[2][1] =='O'){
                    System.out.println("Cell already has value of " + board[2][1] + "\nTry again!\n");
                    pl.move();
                }else{
                    setGridBoard(2, 1, piece); // mid.right
                    break;
                }
            case 9:
                if (board[2][2] == 'X'|| board[2][2] =='O'){
                    System.out.println("Cell already has value of " + board[2][2] + "\nTry again!\n");
                    pl.move();
                }else{
                    setGridBoard(2, 2, piece); // bottom.right
                    break;
                }

            default:
                System.out.println("Invalid input. \nYour turn will be skipped.");
                break;
        }
    }

}
class PlayerOne extends Player{

}
class PlayerTwo extends Player{

}