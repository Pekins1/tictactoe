import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    Player play = new Player();
    GridView reset = new GridView();
    boolean newGame = false;
    do{
        play.playState();
        System.out.printf("\nNew Game: [%s],[%s]: ","Y","N");
        char KeepPlaying = Character.toUpperCase(sn.next().charAt(0));
        if (KeepPlaying == 'Y'){
            newGame = true;
            reset.resetGridBoard(GridView.board);
            System.out.println("I'm happy you enjoyed the game.\nLet's keep on playing.\n");
        }else if (KeepPlaying == 'N'){
            newGame = false;
            System.out.println("I'm happy you tried the game.\nHope you enjoyed it.\n");
        }
    }while(newGame);

    }
}