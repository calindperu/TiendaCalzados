/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.gamarra.tiendacalzados.main;

import com.gamarra.tiendacalzados.ui.LoginUI;

/**
 *
 * @author Sistema
 */
public class Main {

    public static void main(String[] args) {
        try {

            // agregamos estilo nativo de interface
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            // aqui termina el codigo del estilo

            new LoginUI().setVisible(true);    // CREAMOS UN NUEVO OBJETO DE LA CLASE: LoginUI Y LO MUESTRA .setVisible(true);
        } catch (Exception e) {
            System.out.println("e");  // PASAMOS COMO PARAMETRO ("e") DEL EXCEPTION
        }
    }
}
