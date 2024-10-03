package utils;

import core.GameRepo;

public class Display extends CharDisplay{
    private String THREE_LINER = String.format("%s%s%s",LINE, LINE, LINE);
    private GameRepo data = new GameRepo();

    public Display(GameRepo data) {
        this.data = data;
    }

    private void middle_section() {
        for (int i = 0; i < 3; i++) {
            core_section(data.getRow(i));
            if (i == 2) {
                continue;
            }
            System.out.printf("%s%s%s%s%s%s%s\n",
            MIDDLELEFT_LINE, THREE_LINER, MIDDLEMIDDLE_LINE, THREE_LINER, MIDDLEMIDDLE_LINE, THREE_LINER, MIDDLERIGHT_LINE);
        }
    }

    private void core_section(char[] data) {
        System.out.printf("%s %s %s %s %s %s %s\n",
            STRAIGHT_LINE, data[0], STRAIGHT_LINE, data[1], STRAIGHT_LINE, data[2], STRAIGHT_LINE);
    }

    public void show() {
        System.out.printf("%s%s%s%s%s%s%s\n",
            UPLEFT_LINE, THREE_LINER, UPMIDDLE_LINE, THREE_LINER, UPMIDDLE_LINE, THREE_LINER, UPRIGHT_LINE);
        middle_section();
        System.out.printf("%s%s%s%s%s%s%s\n",
            BOTTOMLEFT_LINE, THREE_LINER, BOTTOMMIDDLE_LINE, THREE_LINER, BOTTOMMIDDLE_LINE, THREE_LINER, BOTTOMRIGHT_LINE);
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
