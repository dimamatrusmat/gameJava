import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow () {
        setTitle("Snake"); // Name title
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Close programm
        setSize(400, 400); // Size window
        setLocation(400, 400); // Where is start program cordination on monitor
        add(new GameField());
        setVisible(true); // Visible is window
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}
