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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author AdamG
 */
public class Scan {
    private Scanner seatDetails = null;
    private Scanner concertDetails = null;
    BufferedWriter writer = null;    
    public Seat[] seatArray = new Seat[90];
    
    

    
    public Scan(){
        try{
        seatDetails = new Scanner(new File(System.getProperty("user.dir") + "/src/concertbooking/SeatDetails.txt"));
        seatDetails.useDelimiter(",");
        
        
        concertDetails = new Scanner(new File(System.getProperty("user.dir") + "/src/concertbooking/ConcertDetails.txt"));
        concertDetails.useDelimiter(",");
        
        
        }
        catch (Exception e){ System.out.println(e); }
        
        fillSeats();
    }
    
    public void onClose(){
        try{
        writer = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/src/concertbooking/SeatDetails.txt"));
        for(int i = 0; i < 90; i++){
            writer.append(seatArray[i].getSeatNumber()+","+seatArray[i].getSeatTier()+","+seatArray[i].getCustomerName()+","+seatArray[i].printExtra()+", \n");
        }
        writer.flush();
        writer.close();
        }
        catch(Exception e){
            
        }
    }
        
    private void fillSeats(){
        for(int i = 0; i < 90; i++){
            if(i>=0 && i<30){
                seatArray[i] = new GoldSeat();
                seatArray[i].setSeatNumber(seatDetails.next());
                seatArray[i].setSeatTier(seatDetails.next());
                seatArray[i].setCustomerName(seatDetails.next());
                seatArray[i].setExtra(seatDetails.next());
                seatDetails.nextLine();
            }
            if(i>=30 && i<60){
                seatArray[i] = new SilverSeat();
                seatArray[i].setSeatNumber(seatDetails.next());
                seatArray[i].setSeatTier(seatDetails.next());
                seatArray[i].setCustomerName(seatDetails.next());
                seatArray[i].setExtra(seatDetails.next());
                seatDetails.nextLine();
            }
            if(i>=60 && i<90){
                seatArray[i] = new BronzeSeat();
                seatArray[i].setSeatNumber(seatDetails.next());
                seatArray[i].setSeatTier(seatDetails.next());
                seatArray[i].setCustomerName(seatDetails.next());
                seatArray[i].setExtra(seatDetails.next());
                seatDetails.nextLine();
            }
        }
        
    
    }
}
