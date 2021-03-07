import javax.swing.*;
import java.awt.*;

public class GameMap extends JPanel {

    public static final int GM_HVH = 0; //задаем 2 типа игр
    public static final int GM_HVA = 1;

    
    GameMap(){
        setBackground(new Color(255, 235,205));
    }

        void startGameWithParams(int mapSizeX, int mapSizeY, int winLength, int modeGame){
            System.out.println("Map size " + mapSizeX + "x" + mapSizeY + ". WinLength = " + winLength + ". You play with mode = " + modeGame);
        }





}
