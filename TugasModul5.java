/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.modul.pkg5;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class TugasModul5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String email, password ;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Email : ");
        email = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();
        
        userService user = new userService( email, password );
        user.login();
    }
}

