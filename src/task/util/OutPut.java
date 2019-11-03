package task.util;

import task.model.ChessModel;

public class OutPut {

    public void getStartInfo() {
        System.out.println("Введите ширину и высоту в формате <width> <height>: ");
    }

    public void getInfoOperation() {
        System.out.println("\n Операция успешна!!");
    }

    public void getRequestInfo() {
        System.out.println("Продолжаем? Yes(y) or No(n) : ");
    }

    public void printChessBoard(ChessModel chessModel) {
        for (int h = 1; h <= chessModel.getHeight(); h++) {
            System.out.print("\n");
            for (int w = 1; w <= chessModel.getWidth(); w++) {
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
}
