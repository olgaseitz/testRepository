import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private static final int WIN_WIDTH = 500; // задаем размеры
    private static final int WIN_HEIGHT = 550;
    public static final int WIN_POS_X = 650; // задаем расположение
    public static final int WIN_POS_Y = 250;


    private Settings settings;
    private GameMap gameMap;

    MainWindow(){
        setTitle("Игра <Крестики-Нолики> "); // название окна
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setLocation(WIN_POS_X, WIN_POS_Y); // положение на экране
        setResizable(false); //запретить изменение размера окна
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // функция закрытия окна
        settings = new Settings(this);
        gameMap = new GameMap();

        JButton btnStartGame = new JButton("Start new Game");// создаем кнопки
        btnStartGame.setBackground(new Color(205, 133, 63));
        btnStartGame.addActionListener(e -> settings.setVisible(true));

        JButton btnExitGame = new JButton("Exit Game");
        btnExitGame.setBackground(new Color(205, 133, 63));
        //считываем воздействие на кнопку
        btnExitGame.addActionListener(e -> System.exit(0));

        JPanel panelForButton = new JPanel(new GridLayout(2, 1)); // создание панели
       // panelForButton.setLayout(new GridLayout(2, 1));
        panelForButton.add(btnStartGame);
        panelForButton.add(btnExitGame);

        add(panelForButton, BorderLayout.NORTH);
        add(gameMap, BorderLayout.SOUTH);


        setVisible(true); // сделать окно видимым
    }
    void getParamsFromSettingsAndStartGame(int mapSizeX, int mapSizeY, int winLength, int modeGame){
        gameMap.startGameWithParams(mapSizeX, mapSizeY, winLength, modeGame);
    }
}
