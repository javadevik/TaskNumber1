package task;

import java.util.Scanner;

public class Main {

    static int width;
    static int height;

    public static void main(String[] args) {
        InputValues();
        UserChessBoard myChess = new UserChessBoard(width, height);
        printChessBoard(myChess);
    }

    private static void InputValues() {
        System.out.println("Введите парамерты доски Width , Height: ");
        for (; ; ) {
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

    static public void printChessBoard(UserChessBoard myChess) {
        for (int h = 1; h <= myChess.getHeight(); h++) {
            System.out.print("\n");
            for (int w = 1; w <= myChess.getWidth(); w++) {
                if (h % 2 != 0) {
                    if (w % 2 != 0)
                        System.out.print(" ⬛ ");
                    else System.out.print("   ");
                } else if (h % 2 == 0) {
                    if (w % 2 == 0) {
                        System.out.print(" ⬛ ");
                    } else System.out.print("   ");
                }
            }
        }
    }
    public int Run(){
        return 1;
    }



}
