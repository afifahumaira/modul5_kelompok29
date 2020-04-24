/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.modul.pkg5;

/**
 *
 * @author LENOVO
 */
public class userService {
    private String[][] data = new String[2][3];
    private String[][] histories = new String[2][5];
    private String email, password, roles = "";
    private String nama, matkul1, matkul2, tanggal ="";
    
    //ini namanya constructor yang akan dijalankan setiap class diinisialisasikan
    public userService(String emails, String passwords)
    {
        email = emails;
        password = passwords;
        String[][] data = 
        { 
            {"afifahumaira@gmail.com", "09876", "superAdmin"},
            {"dheyanrifai@gmail.com", "54321", "user"} 
        };
        String[][] histories = 
        { 
            {"afifahumaira@gmail.com", "Afifa Humaira", "Kalkulus", "Fisika Dasar", "23-04-20"},
            {"dheyanrifai@gmail.com", "Dheyan Rifai", "Elektronika Dasar", "Sistem Digital", "23-04-20"} 
        };
        this.data = data;
        this.histories = histories;
    }
    
    private boolean checkCredential()
    {
        for(int i = 0; i < data.length; i++ )
        {
            if(data[i][0].equals(email))
            {
                if(data[i][1].equals(password))
                {
                    roles = data[i][2];
                    nama = histories [i][1];
                    matkul1 = histories [i][2];
                    matkul2 = histories [i][3];
                    tanggal = histories [i][4];
                    return true;
                }
            }
        }
        return false;
    }
    
    public void login()
    {
        boolean status = checkCredential();
        if(status == true)
        {
            System.out.println("\nWelcome " + roles);
            System.out.println("Logged it as user email " + email);
            System.out.println("nama : " + nama);
            System.out.println("matkul1 : " + matkul1);
            System.out.println("matkul2 : " + matkul2);
            System.out.println("tanggal : " + tanggal);
        }
        else
        {
            System.out.println("\nInvalid Login ");
        }
    }

}


