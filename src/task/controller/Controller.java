package task.controller;

import task.model.ChessModel;
import task.service.Service;
import task.util.Input;
import task.util.OutPut;
import task.util.Validator;

public class Controller {

    Input input = new Input();
    OutPut outPut = new OutPut();
    Validator validator = new Validator();
    Service service = new Service();

    public void run() {
        while (true) {
            outPut.getStartInfo();
            try {
                int[] size = service.getSizeChessBoard(service.getSplitContent(input.gerString()));
                outPut.printChessBoard(new ChessModel(size[0], size[1]));
                outPut.getInfoOperation();
            } catch (Exception e) {
                e.printStackTrace();
            }
            outPut.getRequestInfo();
            if (!validator.continuedRequests(input.gerString().toUpperCase())) {
                break;
            }
        }

    }

}
