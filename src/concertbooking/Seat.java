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
public class Seat {
    private String _seatNumber;
    private String _seatTier;
    private boolean _extra;
    private String _customerName;
    
    public String getSeatNumber(){
        return _seatNumber;
    }
    public String getSeatTier(){
        return _seatTier;
    }
    public boolean getExtra(){
        return _extra;
    }
    public String getCustomerName(){
        return _customerName;
    }
    
    public void setSeatNumber(String value){
        _seatNumber = value;
    }
    public void setSeatTier(String value){
        _seatTier = value;
    }
    public void setExtra(String value){
        if(value == "1"){
            _extra = true;
        }
        if(value == "0"){
            _extra = false;
        }
    }
    public void setCustomerName(String value){
        _customerName = value;
    }
    
    public String printExtra(){
        if(_extra == true){
            return "1";
        }
        if(_extra == false){
            return "0";
        }
        else{return null;}
    }
}
