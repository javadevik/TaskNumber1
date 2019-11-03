package task.service;

public class Service {

    public String[] getSplitContent(String str) {
        String[] strings = str.split(" ");
        return strings;
    }

    public int[] getSizeChessBoard(String[] str) throws Exception {
       int[] size = new int[2];
       size[0] = Integer.parseInt(str[0]);
       size[1] = Integer.parseInt(str[1]);
       return size;
    }
}
