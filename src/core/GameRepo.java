package core;

public class GameRepo {
    private char[][] gameData = new char[3][3];

    public GameRepo() {
        for (int i = 0; i < gameData.length; i++) {
            for (int j = 0; j < gameData[i].length; j++) {
                gameData[i][j] = ' ';
            }
        }
    }

    public char getData(int row, int column) {
        return gameData[row][column];
    }

    public char[] getRow(int row) {
        return gameData[row];
    }

    public char[] getColumn(int column) {
        char[] result = new char[3];
        for (int i = 0; i < result.length; i++) {
            result[i] = gameData[i][column];
        }
        return result;
    }

    public char[] getTilt(int column) {
        char[] result = new char[3];
        int index = column;
        for (int i = 0; i < result.length; i++) {
            result[i] = column == 1 ? ' ' : gameData[i][index];
            index = index == 3 ? --index : ++index;
        }
        return result;
    }

    public boolean setPieces(int row, int column, char assigner) {
        if (!itsError(row, column)) {
            this.gameData[row][column] = assigner;
            return true;
        }
        return false;
    }

    private boolean isAssigned(int row, int column) {
        return gameData[row][column] != ' ';
    }

    private boolean itsError(int row, int column) {
        if (row > 2 || column > 2) {
            System.out.println("Your number is too big!");
            return true;
        } else if (isAssigned(row, column)) { 
            System.out.println("Place is already assigned!");
            return true;
        }
        return false;
    }
}
