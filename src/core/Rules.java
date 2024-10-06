package core;

public class Rules {
    private GameRepo data = new GameRepo();

    public Rules(GameRepo data) {
        this.data = data;
    }

    public boolean checkingWin() {
        for (int i = 0; i < 3; i++) {
            if (isEquals(data.getRow(i)) || isEquals(data.getColumn(i)) || isEquals(data.getTilt(i))) {
                return true;
            }
        }
        return false;
    }

    private boolean isEquals(char ...arr) {
        boolean check = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (isEmpty(arr[i]) || isEmpty(arr[i + 1])) {
                return false;
            }
            check = arr[i] == arr[i + 1];
        }
        return check;
    }

    private boolean isEmpty(char data) {
        return data == ' ';
    }
}
