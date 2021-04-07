/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

package starbucks;

/** My Card Options Screen */
public class MyCardsOptions extends Screen
{
    Card card ;
    
    public MyCardsOptions() {

            card = Card.getInstance() ;
        }
        
    public String name() {
        return "My Cards";
    } 
    public String display() {

        String result = card.getCardId() + "\nReload" + "\nRefresh" + "\nMore Options" + "\nCancel" ;
        return result ;
    }
    public void touch(int x, int y) {
        AppController app = AppController.getInstance() ;
        if ( (x == 1 && y == 7) || (x == 2 && y == 7) || (x == 3 && y == 7)) {
            app.setScreen( AppController.SCREENS.MY_CARDS_MORE_OPTIONS ) ; 
            
        }
    }
    

   
}
