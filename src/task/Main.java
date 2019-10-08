package task;

import java.util.Scanner;

public class Main {

    static int width;
    static int height;

    public static void main(String[] args) {
        InputValues();
        UserChessBoard myChess = new UserChessBoard(width,height);
        myChess.printChessBoard();
    }

    private static void InputValues(){
        System.out.println("Введите парамерты доски Width , Height: ");
        for (;;) {
            try {
                Scanner s = new Scanner(System.in);
                System.out.print("Width: ");
                width = s.nextInt();
                System.out.print("Height: ");
                height = s.nextInt();
                break;
            } catch (Exception ex) {
                System.out.println(ex + "\nTry again: ");
            }
        }
        System.out.print("Поздравляю, данные введены!!");
    }
}
