/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import data.Player;

/**
 *
 * @author dorian
 */
class GameOverDialog {
    
    public static int show(JFrame frame, Player player) {
        String message = "[Result]\n";
        message += "Name: " + player.name + "\n";
        message += "Age: " + player.age + "\n";
        message += "Rank: " + player.rank + "\n";
        Object[] options = { "Exit", "Full Rank", "Restart" };
        int code = JOptionPane.showOptionDialog(frame, message,
                Config.END_TITLE, JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
        return code;
    }
}