/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

package starbucks;

/** Settings Screen */
public class Settings extends Screen
{
   
    public Settings()
    {
       
    }
    public String name(){ 
        String val = "Settings" ;
        return val ;
    }
    public String display() {

        String result = "Add Card" + "\nDelete Card" + "\nBilling" + "\nPasscode" + "\n\nAbout|Terms" + "\nHelp";
        return result ;
    } 
}
