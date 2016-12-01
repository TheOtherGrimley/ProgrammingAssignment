/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concertbooking;

/**
 *
 * @author AdamG
 */
public class Concert {
    private String _concertName;
    private String _scheduledDate;
    private double _bronzePrice;
    private double _silverPrice;
    private double _goldPrice;
    
    public String getConcertName(){
        return _concertName;
    }
    public String getDate(){
        return _scheduledDate;
    }
    public double getBronze(){
        return _bronzePrice;
    }
    public double getSilver(){
        return _silverPrice;
    }
    public double getGold(){
        return _goldPrice;
    }
    
    public void setName(String value){
        _concertName = value;
    }
    public void setDate(String value){
        _scheduledDate = value;
    }
    public void setBronze(double value){
            _bronzePrice = value;
    }
    public void setSilver(double value){
        _silverPrice = value;
    }
    public void setGold(double value){
        _goldPrice = value;
    }
}
