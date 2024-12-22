import java.util.*;
public class GridView extends WinLogic{
    static Scanner sc = new Scanner(System.in);
    protected static char[][] board = {
            {' ',' ',' '},
            {' ',' ',' '},
            {' ',' ',' '}
    } ;
    public GridView(){
    }
    public void resetGridBoard(char [][]board){
        for(int cols=0;cols < board.length;cols++){
            for (int rows=0; rows<board[cols].length;rows++){
                if(rows != ' ') {
                   board[cols][rows] = ' ';
                }
            }
        }
    }
    public static void setGridBoard(int rNum, int cNum,char move){
        board[rNum][cNum]= move;
        gridBoard();
    }
    public static void gridBoard(){

        for (int i = 0; i <= 3-1;i++){
            for (int j = 0; j < 3; j++) {
                System.out.print("+-----");
            }
            System.out.println("+");
            for (int j = 0;j<3; j++){
                System.out.printf("|  %s  ", board[i][j]);
            }
            System.out.println("|" + " Row "+ (i+1));

        }

        for(int i = 0; i < 3;i++){
            System.out.print("+-----");
        }
        System.out.println("+");
        for(int colJ = 0;colJ < 3;colJ++){
            System.out.printf(" Col%2d", colJ+1);
        }
        System.out.println(" ");
    }


}
