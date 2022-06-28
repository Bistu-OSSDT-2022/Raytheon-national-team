package Piece;

import javax.swing.*;
import java.awt.*;

public class BlackChess implements ChessPool
{
    private String type;

    public BlackChess(String type)
    {
        this.type = type;
    }

    @Override
    public String getType()
    {
        return type;
    }

    @Override
    public Image getChess()
    {
        ImageIcon blackChessIcon = new ImageIcon("Gobang/设计模式五子棋/img/黑棋.png");
        return blackChessIcon.getImage();
    }
}
