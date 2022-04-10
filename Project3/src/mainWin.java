import javax.swing.*;

public class mainWin extends JFrame {
    public mainWin() {
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(350,375);
        setLocation(400, 400);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        mainWin mw = new mainWin();
    }
}
