/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concertbooking;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author AdamG
 */
public class Scan {
    private Scanner seatDetails = null;
    private Scanner concertDetails = null;
    PrintWriter writer = null;    
    public Seat[] seatArray = new Seat[90];
    

    
    public Scan(){
        try{
        seatDetails = new Scanner(new File(System.getProperty("user.dir") + "/src/concertbooking/SeatDetails.txt"));
        seatDetails.useDelimiter(",");
        
        
        concertDetails = new Scanner(new File(System.getProperty("user.dir") + "/src/concertbooking/ConcertDetails.txt"));
        concertDetails.useDelimiter(",");
        
        writer = new PrintWriter(new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/src/concertbooking/SeatDetails.temp")));
        }
        catch (Exception e){ System.out.println(e); }
        
        fillArray();
    }
    
    private void fillArray(){
        for(int i = 0; i < 90; i++){
            //while(seatDetails.hasNext()){
                seatArray[i] = new Seat();
                seatArray[i].setSeatNumber(seatDetails.next());
                seatArray[i].setSeatTier(seatDetails.next());
                seatArray[i].setCustomerName(seatDetails.next());
                seatArray[i].setExtra(seatDetails.next());
                seatDetails.nextLine();
            //}
        }
    }
}
