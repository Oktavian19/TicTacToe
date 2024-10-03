package core;

import utils.Display;
import utils.UserInput;

public class Game {

    private GameRepo repo = new GameRepo();
    private Assigner assigner = new Assigner();
    private UserInput input = new UserInput();
    private Display dis = new Display(repo);

    private boolean isX = true;

    public Game(GameRepo repo) {
        this.repo = repo;
    }

    public void gameCore() {
        char bidak = assigner.getAssigner(isX);
        System.out.printf("Masukkan baris dan kolom untuk bidak %s : \n", bidak);
        int baris = input.getInt("Baris : ") - 1;
        int kolom = input.getInt("Kolom : ") - 1;

        dis.clearScreen();
        if (repo.setPieces(baris, kolom, bidak)) {
            System.out.println("Bidak berhasil ditambahkan!");
            isX = !isX;
        }
    }

    public char getWinner() {
        return assigner.getAssigner(!isX);
    }
}
