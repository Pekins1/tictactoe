import java.util.Arrays;
import java.util.Objects;

public class LogicTest {

    static void horizontalCheckTest(){

        String[][] test = {{"w", "x", "w"},{"x","x","x"},{"o","o","o"}};
//        String check = test[0][0]; // this sets check to first index value in first subArray, this way when we
        // start our loop we already have our first value to compare to.

        // The purpose of a counter is to count every time a matching string is found
        int matchPair = 0; // this only counts the amount of matching strings in a given subArray

        for(int i=0;i < test.length; i++) {
            //update check value
            String check = test[i][0]; // this ensures that every time the loop switches to a different subArray,
            // it sets the current check to the new subArray value at index 0,
            // that way we don't start a new subArray with the value of the previous subArray.
            for (int j = 0; j < test[i].length; j++) {
                if (test[i][j].equals(check)) {// this test if current value matches what we have shored in check

                    matchPair+=1; // here the counter increases every time a matching string is found
                    check = test[i][j]; // here check is updated to the current index value
                    System.out.println("Same value");
                } else {
                    System.out.println("Different value");
                }
            }
            if (matchPair == test[i].length){ // here if matchPair == length of subArray it means all values in
                //  subArray are the same.
                System.out.println("Horizontal Check Passed");
                break; // this stops the loop is
            }else {
                System.out.println("Horizontal check Failed");
            }
            matchPair = 0; // this resets matchPair to 0 every time we switch to a new subArray

        }
    }

    static void verticalCheckTest(){
        String[][] test = {
                {"x","2","3"},
                {"x","2","3"},
                {"x","8","3"}};
        String check = test[0][0];
//        int counter = 0;
        int rows=0;
        for(int cols=0; cols< test.length;cols++){
            int counter = 0;
            check = test[0][cols]; // this resets check to the current index value of cols on the first subArray
            System.out.println("Check =" + check);
            for(rows=0;rows <test[cols].length;rows++){
//                check = test[rows][cols];
                if( test[rows][cols].equals(check)){
                    check = test[rows][cols]; // the reverses the cols and rows index's to make the loops
                    System.out.print(check);
                    counter++;
                    System.out.println("Same value");
                }else {
                    System.out.print(test[rows][cols]);
                    System.out.println("Different Value");
                }
//
            }
            System.out.println(counter);
//            if(counter == test[cols].length){
//                System.out.println("Winner");
//                System.out.println(test[cols].length);
//                break;
//            }
        }
    }

    static void diagonalCheckTest(){
        String[][] test = {
                {"1","2","1"},
                {"4","1","6"},
                {"1","8","1"}
        };

        int counter1 = 0;
        int counter2 = 0;
        for (int cols = 0; cols < test.length; cols++) {
            String check = test[0][0];
            String check1 = test[0][test.length - 1];
            for (int rows = 0; rows < test[cols].length; rows++) {
                if (cols == rows) {
                    if (test[cols][rows].equals(check)) {
                        System.out.println(test[cols][rows] + " Same value");
                        counter1++;
                        if(counter1 == test.length){
                            System.out.println("Passed");
                            break;
                        }
                    }
                }
                if ((cols + rows) == (test[cols].length - 1)) {
                    if (test[cols][rows].equals(check1)) {
                        System.out.println(test[cols][rows] + "Same value1");
                        counter2++;
                        if(counter2 == test.length){
                            System.out.println("Passed1");
                            break;
                        }
                    }
                }

            }
//            System.out.println();
//            String check1 = test[0][test.length - 1];
//            for (int rows = 0; rows < test[cols].length; rows++) {
//                if ((cols + rows) == (test[cols].length - 1)) {
//                    System.out.print(test[cols][rows]);
////                    if (test[cols][rows].equals(check1)) {
//                        System.out.println(test[cols][rows] + "Same value");
//                        counter++;
//                    } else
//                        System.out.println(test[cols][rows] + "Different values");
//                }
//            }
//            if (counter == test.length) {
//                System.out.print("Diagonal check Passed");
//                break;
//            }
        }
        //        System.out.print("Diagonal check " +(counter==test.length?"Passed":"Failed"));
        System.out.println();

//        for (int cols = 0; cols < test.length; cols++) {
//            String check = test[0][test.length - 1];
//            for (int rows = 0; rows < test[cols].length; rows++) {
//                if ((cols + rows) == (test[cols].length - 1)) {
//                    if (test[cols][rows].equals(check)) {
//                        System.out.println(test[cols][rows] + "Same value");
//                        counter++;
//                    } else
//                        System.out.println(test[cols][rows] + "Different values");
//                }
//            }
////                if (counter == test.length) {
////                    System.out.print("Diagonal check Passed");
////                    break;
////                }
//            //            System.out.println(check);
//        }

//        System.out.print("Diagonal check "+(counter == test.length?"Passed":"Failed") );
//        String check2 = diagonalCheck[0];
//        for(int i=0; i < diagonalCheck.length; i++){
//            if ( diagonalCheck[i].equals(check2)){
//                check2 = diagonalCheck[i];
//                System.out.println(diagonalCheck[i]+ " same");
//            }
//                System.out.println(diagonalCheck[i]+ " different");
//        }
//        System.out.println(Arrays.deepToString(diagonalCheck));
    }
    public static void main(String []args){
//        diagonalCheckTest();
    }
}
