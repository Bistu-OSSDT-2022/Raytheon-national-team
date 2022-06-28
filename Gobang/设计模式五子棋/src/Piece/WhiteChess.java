package Piece;

import javax.swing.*;
import java.awt.*;

public class WhiteChess implements ChessPool
{
    String type;

    public WhiteChess(String type)
    {
        this.type = type;
    }

    @Override
    public String getType()
    {
        return null;
    }

    @Override
    public Image getChess()
    {
        ImageIcon whiteChessIcon = new ImageIcon("Gobang/设计模式五子棋/img/白棋.png");
        return whiteChessIcon.getImage();
    }
}
