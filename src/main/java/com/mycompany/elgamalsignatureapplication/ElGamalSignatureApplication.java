/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.elgamalsignatureapplication;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ElGamalSignatureApplication {

    public static void main(String[] args) {
     
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("ElGamal Signature Application");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new NewJPanel());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

}
