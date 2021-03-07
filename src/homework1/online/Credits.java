import javax.swing.*;
import java.awt.*;
public class Credits extends JFrame {
    private static final int WIN_WIDTH = 350;
    private static final int WIN_HEIGHT = 250;
    private MainWindow mainWindow;

    Credits(MainWindow mainWindow){
        this.mainWindow = mainWindow;
        Rectangle mainWindowBounds = mainWindow.getBounds();

        int posX = (int) mainWindowBounds.getCenterX() - WIN_WIDTH / 2;
        int posY = (int) mainWindowBounds.getCenterY() - WIN_HEIGHT / 2;

        setLocation(posX, posY);
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setTitle("About");
        setResizable(false);
        setLayout(new GridLayout(10, 1));


        setAbout();
    }
    private void setAbout() {

        add(new JLabel("Версия от 06.03.2021"));
        add(new JLabel("GeekBrains.ru"));
        add(new JLabel("by Seitz O."));

    }
}
