import java.util.*;
import javax.swing.JOptionPane;

public class TicTacToe 
{

    public static void main(String[] args) 
    {
        String[] board = new String [9];
        String winner = null;
        String Player = "Player 1";
        
        for (int xBoard = 0; xBoard < board.length; xBoard++)
        {
            board[xBoard] = String.valueOf(xBoard+1);
        }
        
        String title = "TicTacToe";
        JOptionPane.showMessageDialog(null, "Welcome to the game of Tic Tac Toe!",title, JOptionPane.INFORMATION_MESSAGE);
        String turn = JOptionPane.showInputDialog(Player +" will start. Would you like to play as X or O?");
        String Player1 = turn;
        
        while (winner == null) 
        {
            if(XO(turn))
            {
                 if (turn.equals("x"))
                 {
                     turn = "X";
                 }
                 else if (turn.equals("o"))
                 {
                     turn = "O";
                 }
            String Board = Player + ", please enter a slot number." + "\n";
            String msg = "              " + Player + " Wins!" + "\n";
            msg += "\n";
            msg += "\n";
            msg += "        CONGRATULATIONS!";
            Board += "\n";
            Board += "                        " + board[0] + "   |   " + board[1] + "   |   "+board[2] + "\n";
            Board += "                        ---------------- " + "\n";
            Board += "                        " + board[3] + "   |   " + board[4] + "   |   "+board[5] + "\n";
            Board += "                        ---------------- " + "\n";
            Board += "                        " + board[6] + "   |   " + board[7] + "   |   " + board[8] + "\n";
            Board += "\n";
            Board += "\n";
            Board += "NOTE: INTEGER ONLY. THANK YOU!";
            try
            {
            String move = JOptionPane.showInputDialog(Board);
            int Move = Integer.parseInt(move);
            if (!(Move > 0 && Move <= 9)) 
                {
                    JOptionPane.showMessageDialog(null,"Enter number 1-9 only. Kindly re-enter slot number:");
                    continue;
                }
            if (board[Move - 1].equals(String.valueOf(Move))) 
            {
                board[Move - 1] = turn;
                if (Player.equals("Player 1"))
                {
                    Player = "Player 2";
                }
                else
                {
                    Player = "Player 1";
                }
                if (turn.equals("X")) 
                {
                    turn = "O";
                }
                else 
                {
                    turn = "X";
                }
                for (int possibilities = 1; possibilities < board.length; possibilities++) 
                {
                    String line = null;
 
                    switch (possibilities) 
                    {
                    case 1:
                        line = board[0] + board[1] + board[2];
                        break;
                    case 2:
                        line = board[3] + board[4] + board[5];
                        break;
                    case 3:
                        line = board[6] + board[7] + board[8];
                        break;
                    case 4:
                        line = board[0] + board[3] + board[6];
                        break;
                    case 5:
                        line = board[1] + board[4] + board[7];
                        break;
                    case 6:
                        line = board[2] + board[5] + board[8];
                        break;
                    case 7:
                        line = board[0] + board[4] + board[8];
                        break;
                    case 8:
                        line = board[2] + board[4] + board[6];
                        break;
                    }

                    if (line.equals("XXX")) 
                    {
                        winner = "X";
                        if ((Player1.equals("X"))||Player1.equals("x"))
                        {
                        JOptionPane.showMessageDialog(null,msg);
                        String[] options = {"Yes", "No"};
                        int selection = JOptionPane.showOptionDialog(null, "Do you want to play again?", "Confirmation", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, options, options[0]);
                        if(selection == 0) 
                        {
                            winner=null;
                            if(Player.equals("Player 1"))
                            {
                                Player = "Player 2";
                            }
                            else
                            {
                                Player = "Player 1";
                            }
                            turn = JOptionPane.showInputDialog(Player +" will start. Would you like to play as X or O?");
                            Player1 = turn;
                            for (int xBoard = 0; xBoard < board.length; xBoard++)
                            {
                                board[xBoard] = String.valueOf(xBoard + 1);
                            }
                        }
                        if(selection == 1)
                        {
                            System.exit(0);
                        }
                        }
                        
                        else
                        {
                        JOptionPane.showMessageDialog(null,msg); 
                        String[] options = {"Yes", "No"};
                        int selection = JOptionPane.showOptionDialog(null, "Do you want to play again?", "Confirmation", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, options, options[0]);
                        if(selection == 0) 
                        {
                            winner=null;
                            if(Player.equals("Player 2"))
                            {
                                Player = "Player 1";
                            }
                            else
                            {
                                Player = "Player 2";
                            }
                            turn = JOptionPane.showInputDialog(Player +" will start. Would you like to play as X or O?");
                            Player1 = turn;
                            for (int xBoard = 0; xBoard < board.length; xBoard++)
                            {
                                board[xBoard] = String.valueOf(xBoard + 1);
                            }
                        }
                        if(selection == 1)
                        {
                            System.exit(0);
                        }
                        }
                    }
             
                    else if (line.equals("OOO")) 
                    {
                        winner = "O";
                        if ((Player1.equals("O"))||Player1.equals("o"))
                        {
                        JOptionPane.showMessageDialog(null,msg);
                        String[] options = {"Yes", "No"};
                        int selection = JOptionPane.showOptionDialog(null, "Do you want to play again?", "Confirmation", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, options, options[0]);
                        if(selection == 0) 
                        {
                            winner=null;
                            if(Player.equals("Player 1"))
                            {
                                Player = "Player 2";
                            }
                            else
                            {
                                Player = "Player 1";
                            }
                            turn = JOptionPane.showInputDialog(Player +" will start. Would you like to play as X or O?");
                            Player1 = turn;
                            for (int xBoard = 0; xBoard < board.length; xBoard++)
                            {
                                board[xBoard] = String.valueOf(xBoard + 1);
                            }
                        }
                        if(selection == 1)
                        {
                            System.exit(0);
                        }
                        }
                        
                        else
                        {
                        JOptionPane.showMessageDialog(null,msg);
                        String[] options = {"Yes", "No"};
                        int selection = JOptionPane.showOptionDialog(null, "Do you want to play again?", "Confirmation", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, options, options[0]);
                        if(selection == 0) 
                        {
                            winner=null;
                            if(Player.equals("Player 2"))
                            {
                                Player = "Player 1";
                            }
                            else
                            {
                                Player = "Player 2";
                            }
                            turn = JOptionPane.showInputDialog(Player +" will start. Would you like to play as X or O?");
                            Player1 = turn;
                            for (int xBoard = 0; xBoard < board.length; xBoard++)
                            {
                                board[xBoard] = String.valueOf(xBoard + 1);
                            }
                        }
                        if(selection == 1)
                        {
                            System.exit(0);
                        }
                        }
                    }
                }
                for (int movecounter=0; movecounter < board.length; movecounter++) 
                {
                    if (Arrays.asList(board).contains(String.valueOf(movecounter + 1))) 
                    {
                        break;
                    }
                    else if (movecounter == 0 );
                    {
                        winner = "Draw";
                        JOptionPane.showMessageDialog(null,"Its a " + winner + "!");
                        String[] options = {"Yes", "No"};
                        int selection = JOptionPane.showOptionDialog(null, "Do you want to play again?", "Confirmation", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, options, options[0]);
                        if(selection == 0) 
                        {
                            winner=null;
                            turn = JOptionPane.showInputDialog(Player +" will start. Would you like to play as X or O?");
                            Player1 = turn;
                            for (int xBoard = 0; xBoard < board.length; xBoard++)
                            {
                                board[xBoard] = String.valueOf(xBoard + 1);
                            }
                        }
                        if(selection == 1)
                        {
                            System.exit(0);
                        }
                    }
                }
            }
                    else 
                    {
                        JOptionPane.showMessageDialog(null,"Slot has already been taken," + Player + ". Please enter a non taken slot number:");
                    }
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "ERROR! Input must be an integer between 1-9 only.");
                String[] options = {"Yes", "No"};
                var selection = JOptionPane.showOptionDialog(null, "Do you want to continue?", "Confirmation", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, options, options[0]);
                if(selection == 0) 
                {
                    continue;
                }
                if(selection == 1)
                {
                    System.exit(0);
                }
            }
            }
            else
                 turn = JOptionPane.showInputDialog("Please enter either X or O only. Thank you!");
        }
    }

    private static boolean XO(String turn) 
    {
       if (turn.equals("X")) return true;
       if (turn.equals("O")) return true;
       if (turn.equals("o")) return true;
       if (turn.equals("x")) return true;
       
       return false;
    }
}
