
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.PublicKey;
import java.util.Scanner;

/*
 * Author: Bradley Young 12110283
 * Date: 04/05/2020
 * Purpose: To act as a user input for the project.
 */
public class TCPClient {

    static int portNumber = 1808;
    static final String SERVERNAME = "Admin";
    static PublicKey pubKey;
    public static void main(String[] args) 
    {
       ObjectInputStream objectIn;
       ObjectOutputStream objectOut;
       
       String adminID = "";
       String Password = "";
       
       Socket CSocket = null;
       
       Scanner input = new Scanner(System.in);
       int answer = 0;
       
       try
       {
           CSocket = new Socket(SERVERNAME, portNumber);
           objectOut = new ObjectOutputStream(CSocket.getOutputStream());
           objectIn = new ObjectInputStream(CSocket.getInputStream());
           
           while(answer != 3)//loop for user entry
           {
               System.out.println("Please enter your selection");
               System.out.println("******************************************");
               System.out.println("1. Current Admin");
               System.out.println("2. New Admin");
               System.out.println("3. Exit");
               System.out.println("******************************************");
               System.out.println("Enter your Option");
               answer = Integer.parseInt(input.nextLine());
               String Option = Integer.toString(answer);
               objectOut.writeObject(Option);
               objectOut.flush();
               if(answer == 1)//existing users
               {
                   try
                   {
                        System.out.println("Welcome, please enter your credentials");
                        System.out.println("Enter Administrator ID: ");
                        adminID = input.nextLine();
                        objectOut.writeObject(adminID);
                        objectOut.flush();
                        System.out.println("Enter Password: ");
                        Password = input.nextLine();
                        objectOut.writeObject(Password);
                        objectOut.flush();
                   }
                   catch(UnknownHostException e)
                   {
                       System.out.println("Sock: " + e.getMessage());
                   }
                   catch(EOFException e)
                   {
                       System.out.println("End of File: " + e.getMessage());
                   }
                   catch(IOException e)
                   {
                       System.out.println("IO: " + e.getMessage());
                   }
               }
           }//end Loop
           CSocket.close();
       }
       catch(IOException e)
       {
           System.out.println("Error cannot connect");
       }
    }//end main

}//end class
