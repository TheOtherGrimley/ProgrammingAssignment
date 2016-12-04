/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concertbooking;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

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
        }
        catch (Exception e){ System.out.println(e);}
        fillSeats();
    }
    
    public String[] readConcert(){
        try{
            concertDetails = new Scanner(new File(System.getProperty("user.dir") + "/src/concertbooking/ConcertDetails.txt"));
            concertDetails.useDelimiter(",");
            String[] cDetails = new String[5];
            while(concertDetails.hasNextLine()){
                cDetails[0] = concertDetails.next();
                cDetails[1] = concertDetails.next();
                cDetails[2] = concertDetails.next();
                cDetails[3] = concertDetails.next();
                cDetails[4] = concertDetails.next();
                concertDetails.nextLine();
            }
            
            concertDetails.close();
            return cDetails;
        }
        catch(Exception e){}
            return null;
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
        try {
            for (int i = 0; i < 90; i++) {
                if (i >= 0 && i < 30) {
                    seatArray[i] = new GoldSeat();
                    seatArray[i].setSeatNumber(seatDetails.next());
                    seatArray[i].setSeatTier(seatDetails.next());
                    seatArray[i].setCustomerName(seatDetails.next());
                    seatArray[i].setExtra(seatDetails.next());
                    seatDetails.nextLine();
                }
                if (i >= 30 && i < 60) {
                    seatArray[i] = new SilverSeat();
                    seatArray[i].setSeatNumber(seatDetails.next());
                    seatArray[i].setSeatTier(seatDetails.next());
                    seatArray[i].setCustomerName(seatDetails.next());
                    seatArray[i].setExtra(seatDetails.next());
                    seatDetails.nextLine();
                }
                if (i >= 60 && i < 90) {
                    seatArray[i] = new BronzeSeat();
                    seatArray[i].setSeatNumber(seatDetails.next());
                    seatArray[i].setSeatTier(seatDetails.next());
                    seatArray[i].setCustomerName(seatDetails.next());
                    seatArray[i].setExtra(seatDetails.next());
                    seatDetails.nextLine();
                }
            }
        } catch (Exception e) {
            int dialogueResult = JOptionPane.showConfirmDialog(null, "Error, please check data file is in the correct format."
                    + "Would you like to load a blank seat plan file? if no the program will exit", "File read error", 2);
            if (dialogueResult == 0) {
                FileInputStream instream = null;
                FileOutputStream outstream = null;

                try {
                    File in = new File(System.getProperty("user.dir") + "/src/concertbooking/DefaultSeats.txt");
                    File out = new File(System.getProperty("user.dir") + "/src/concertbooking/SeatDetails.txt");

                    instream = new FileInputStream(in);
                    outstream = new FileOutputStream(out);

                    byte[] buffer = new byte[1024];
                    int length;

                    while ((length = instream.read(buffer)) > 0) {
                        outstream.write(buffer, 0, length);
                    }

                    instream.close();
                    outstream.close();
                    
                    seatDetails = new Scanner(new File(System.getProperty("user.dir") + "/src/concertbooking/SeatDetails.txt"));
                    seatDetails.useDelimiter(",");
                    
                    fillSeats();
                    
                    
                } catch (Exception j) {
                }
            }
            
            else {System.exit(0);
        }

    }
}
}
