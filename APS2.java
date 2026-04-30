package com.mycompany.aps2;

import javax.swing.SwingUtilities;

public class APS2 {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new TELA_INICIAL().setVisible(true);
        });

    }
}