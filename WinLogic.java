public class WinLogic implements WinnableLogic {

    public boolean drawCheck(char [][]board){
        int count =9;
        for (char[] chars : board) {
            for (char aChar : chars) {
                if (aChar != ' ') {
                    count--;
                }
            }
        }
        if (count == 0) {
            System.out.println("Draw");
            return true;
        }

        return false;
    }
    public boolean diagonalCheck(char[][]board){
        int matchPair1 = 0;
        int matchPair2 = 0;
        for (int cols = 0; cols < board.length; cols++) {
            char check = board[0][0];
            char check1 =board[0][board.length - 1];
            for (int rows = 0; rows < board[cols].length; rows++) {
                if (cols == rows) {
                    if (board[cols][rows] == check) {
                        if(check == 'X'|| check=='O'){
                            matchPair1++;
                            if(matchPair1 == board.length){
                                System.out.println("Diagonal Win.");
                                return true;
                            }
                        }
                    }
                }
                if ((cols + rows) == (board[cols].length - 1)) {
                    if (board[cols][rows]==check1) {
                        if(check1=='X'||check1=='O'){
                            matchPair2++;
                            if(matchPair2 == board.length){
                                System.out.println("Diagonal Win.");
                                return true;
                            }
                        }
                    }
                }

            }
        }
        return false;
    }

    public boolean horizontalCheck(char[][]board){
        for(int cols=0;cols < board.length; cols++) {
        // The purpose of a counter is to count every time a matching string is found
            int matchPair = 0; // this only counts the amount of matching strings in a given subArray
        //update check value
        // start our loop we already have our first value to compare to.
            char check = board[cols][0]; // this ensures that every time the loop switches to a different subArray,
        // it sets the current check to the new subArray value at index 0,
        // that way we don't start a new subArray with the value of the previous subArray.
            for (int rows = 0; rows < board[cols].length; rows++) {
                if (board[cols][rows] == check) {// this test if current value matches what we have shored in check
                    if(check=='X' || check=='O'){
                        matchPair+=1; // here the counter increases every time a matching string is found
                        check = board[cols][rows]; // here check is updated to the current index value
                    }
                }
            }
            if (matchPair == board[cols].length){ // here if matchPair == length of subArray it means all values in
            //  subArray are the same.
                System.out.println("Horizontal Win.");
                return true; // this stops the loop is
            }

        }
        return false;
    }

    public boolean verticalCheck(char[][]board){
        for(int cols=0; cols< board.length;cols++){
            int matchPair = 0;// counter
            char check = board[0][cols]; // this resets check to the current index value of cols on the first subArray
            for(int rows=0;rows < board[cols].length;rows++){
                if( board[rows][cols]==check){
                    if (check== 'X'||check=='O'){ // this makes sure only gets x o as values
                        check = board[rows][cols]; // the reverses the cols and rows index's to make the loop vertically
                        matchPair++;
                    }
                }
            }
            if(matchPair == board[cols].length){
                System.out.println("Vertical Win.");
    //                System.out.println(matchPair);
                return true;
            }
        }
        return false;
    }

}
