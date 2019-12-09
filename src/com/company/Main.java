package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args)
    {
        /*try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("x")))
        {
            Double[] a = {-5.1234, -5.6789, -4.789, -4.123, -3.456, -3.456, -2.0, -2.0, 0.0, 0.3, 1.234, 1.234, 2.0, 2.3, 3.0, 3.0};
            for(int i = 0; i < a.length; i++)
            {
                dos.writeDouble(a[i]);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }*/

        MainFrame frame = new MainFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}