import org.junit.Test;

import static org.junit.Assert.*;

public class DiagonalTest {

    @Test
    public void matrixRandom() {
        Diagonal example = new Diagonal();
        int[][] actual = example.matrixRandom(5);
        for (int [] x:actual) {
            System.out.println(" ");
            for (int y: x ) {
                System.out.print(y);
            }
        }
    }

    @Test
    public void addDiagonalMain() {
        Diagonal example = new Diagonal();
        int[][] actual = example.matrixRandom(3);
        for (int [] x:actual) {
            System.out.println(" ");
            for (int y: x ) {
                System.out.print(y);
            }
        }
        System.out.println(" ");
        System.out.println(example.addDiagonalMain(actual));
    }
    @Test
    public void addDiagonalS() {
        Diagonal example = new Diagonal();
        int[][] actual = example.matrixRandom(3);
        for (int [] x:actual) {
            System.out.println(" ");
            for (int y: x ) {
                System.out.print(y);
            }
        }
        System.out.println(" ");
        System.out.println(example.addDiagonalSecondary(actual));
    }
    @Test
    public void Result() {
        Diagonal example = new Diagonal();
        int[][] actual = example.matrixRandom(3);
        for (int [] x:actual) {
            System.out.println(" ");
            for (int y: x ) {
                System.out.print(y);
            }
        }
        int resultMain = example.addDiagonalMain(actual);
        int resultSecondary = example.addDiagonalSecondary(actual);
        System.out.println(" ");
        System.out.println(example.addDiagonalSecondary(actual));
        System.out.println(" ");
        System.out.println(example.addDiagonalMain(actual));
        //System.out.println(example.messageWinner(resultMain,resultSecondary));
    }
}