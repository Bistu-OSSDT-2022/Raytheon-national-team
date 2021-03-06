package UI;

import Game.SinglePlayerGame;
import Game.TwoPlayersGame;
import Observer.Obs;
import Observer.Subject;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Game2 extends JFrame implements Obs
{

    public Game2() throws HeadlessException, IOException, InterruptedException
    {
        this.initWindow();
        this.setLayout(new BorderLayout());

//        InfoPanel infoPanel = new InfoPanel();

        SinglePlayerGame chessboardPanel =new SinglePlayerGame("machine");
        ControlPanel controlPanel = new ControlPanel(chessboardPanel);


        ControlPanel.BackHome.attach(this);

        this.add(chessboardPanel, BorderLayout.CENTER);
        this.add(controlPanel, BorderLayout.NORTH);
//        this.add(infoPanel, BorderLayout.SOUTH);




        this.setVisible(true);
    }


    private void initWindow()
    {
        this.setTitle("海梦五子棋");
        int window_width = 1000;
        int window_height = 800;
        this.setSize(window_width, window_height);
        int screen_width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screen_height = Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setLocation((screen_width - window_width) / 2, (screen_height - window_height) / 2);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    @Override
    public void response() throws InterruptedException
    {
        System.out.println("----");
        this.dispose();
        new StartUI();
    }
}
