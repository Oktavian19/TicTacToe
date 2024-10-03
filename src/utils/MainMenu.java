package utils;

import core.GameRepo;
import core.Game;
import core.Rules;

public class MainMenu {

    GameRepo repo = new GameRepo();

    Display dis = new Display(repo);
    Rules rules = new Rules(repo);
    Game gamecore = new Game(repo);

    UserInput input = new UserInput();

    public void run() {
        dis.clearScreen();
        System.out.println("== Selamat Datang di TicTacToe ==\n");
        System.out.println("Petunjuk dan Peraturan :");
        System.out.println("- Game ini hanya dapat dimainkan oleh dua pemain dengan satu pemain sebagai pemilik bidak O dan satu pemain pemilik bidak X");
        System.out.println("- Bidang papan yang telah diisi oleh bidak, tidak dapat diisi kembali dengan bidak yang sama maupun berbeda");
        System.out.println("- Seperti pada game TicTacToe pada umumnya, pemenang pada game ini adalah pemain yang berhasil menyamakan bidaknya pada papan baik secara horizontal, vertikal maupun miring\n");
        System.out.println("Selamat bermain :)");
        System.out.println("-- Tekan tombol apa saja untuk mulai bermain --");
        input.pressEnter();
        dis.clearScreen();

        while (!rules.checkingWin()) {
            dis.show();
            gamecore.gameCore();
        }
        dis.show();
        System.out.printf("Selamat!! Pemain dengan bidak %s menang!", gamecore.getWinner());
    }
}
