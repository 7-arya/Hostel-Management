/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hostel;
import javax.swing.*;

/**
 *
 * @author ANITTA
 */
public class Hostel {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        home h= new home();
        h.setVisible(true);
 
    }   
}
class home extends JFrame{
    public home(){
        setTitle("My Frame");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
