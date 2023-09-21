/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package car.hire;

import car.hire.view.LoginView;

/**
 *
 * @author DELL i5
 */
public class CarHire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        LoginView l1 = new LoginView(args);
        l1.setLocationRelativeTo(null);
        l1.setVisible(true);

        //new LayoutView().setVisible(true);
    }

}
