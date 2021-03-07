import javax.swing.*;
import java.awt.*;

public class Settings extends JFrame {

    private static final int WIN_WIDTH = 350; // задаем размеры
    private static final int WIN_HEIGHT = 250;

    public final int MIN_WIN_LENGTH = 3; // минимальный размер выигрышной линии

    private final String MAP_SIZE_PREFIX = "Map size is: ";
    private final String WIN_LEN_PREFIX = "WIN length is: ";

    private MainWindow mainWindow;

    private JRadioButton humanVHuman;
    private JRadioButton humanVAI;
    private JSlider sliderSetSizeMap; // создаем ползунок настройки
    private JSlider sliderSetWinLength;

    Settings(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        Rectangle mainWindowBounds = mainWindow.getBounds();

        int posX = (int) mainWindowBounds.getCenterX() - WIN_WIDTH / 2;
        int posY = (int) mainWindowBounds.getCenterY() - WIN_HEIGHT / 2;

        setLocation(posX, posY);
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setTitle("Settings");
        setResizable(false);
        setLayout(new GridLayout(10, 1));

        setGameModeControl();
        setSizeMapControl();
        finishSettings();

    }

    private void setGameModeControl() {
        add(new JLabel("Choose game mode"));
        humanVHuman = new JRadioButton("Human vs Human", true);
        humanVAI = new JRadioButton("Human vs AI");

        ButtonGroup gameModeGroup = new ButtonGroup(); // группировка кнопок
        gameModeGroup.add(humanVHuman);
        gameModeGroup.add(humanVAI);

        add(humanVHuman);
        add(humanVAI);
    }

    private void setSizeMapControl() { //метод собственно настройки поля и игры

        // варианты размера поля
        int MIN_MAP_SIZE = 3;
        JLabel lbMapSize = new JLabel(MAP_SIZE_PREFIX + MIN_MAP_SIZE);
        JLabel lbWinLen = new JLabel(WIN_LEN_PREFIX + MIN_WIN_LENGTH);

        int MAX_MAP_SIZE = 10;
        sliderSetSizeMap = new JSlider(MIN_MAP_SIZE, MAX_MAP_SIZE, MIN_MAP_SIZE);
        // настройка слайдера поля
        sliderSetSizeMap.addChangeListener(e -> {
            int currentMapSize = sliderSetSizeMap.getValue();
            lbMapSize.setText(MAP_SIZE_PREFIX + currentMapSize);
            sliderSetWinLength.setMaximum(currentMapSize); //сочетаем размер выигрышной линии с размером поля
        });
        sliderSetWinLength = new JSlider(MIN_WIN_LENGTH, MIN_MAP_SIZE, MIN_MAP_SIZE);
        //настройка ползунка выигрышной линии
        sliderSetWinLength.addChangeListener(e -> lbWinLen.setText(WIN_LEN_PREFIX + sliderSetWinLength.getValue()));

        add(new JLabel("Choose map size")); // добавляем слайдеры в окно опций
        add(lbMapSize);
        add(sliderSetSizeMap);
        add(lbWinLen);
        add(sliderSetWinLength);
    }

    private void finishSettings() {
        JButton btnStart = new JButton("Start Game");
        btnStart.addActionListener(e -> startNewGame());
        add(btnStart);
    }

    private void startNewGame() {
        int gameMode;

        if (humanVHuman.isSelected()) {
            gameMode = GameMap.GM_HVH;
        } else if (humanVAI.isSelected()) {
            gameMode = GameMap.GM_HVA;
        } else {
            throw new RuntimeException("Invalid choose game mode");
        }
        int mapSize = sliderSetSizeMap.getValue();
        int winLn = sliderSetWinLength.getValue();

        mainWindow.getParamsFromSettingsAndStartGame(mapSize, mapSize, winLn, gameMode);

        setVisible(false);
    }

}

