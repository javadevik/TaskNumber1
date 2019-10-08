package task;

import java.util.Scanner;

public class UserChessBoard implements ChessBoard {

    int width;
    int height;

    public UserChessBoard(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public void printChessBoard() {
        for(int h = 1; h <= height; h++){
            System.out.print("\n");
            for (int w = 1; w <= width; w++){
                if(h%2 != 0){
                    if(w%2!=0)
                    System.out.print(" ⬛ ");
                    else System.out.print("   ");
                }
                else if(h%2 == 0){
                    if(w%2 == 0){
                        System.out.print(" ⬛ ");
                    }
                    else System.out.print("   ");
                }
            }
        }
    }
}
