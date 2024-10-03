package core;

public class Assigner {
    private char x = 'X';
    private char o = 'O';

    public char getAssigner(boolean isX) {
        return isX ? x : o;
    }
}
