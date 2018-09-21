
package Task4;

import becker.robots.*;

public class Gardener extends Robot

{
 public Gardener(City aCity,int aStreet,int anAvenue,
                 Direction aDirection,int numThings)
 {
     super(aCity,aStreet,anAvenue,aDirection,numThings);
 }
 
 public void plantFlowers()
 {
     
 }
 
 public void RelayBot()
 {
     this.pickThing();
     this.move();
     this.move();
     this.move();
     this.move();
     this.turnLeft();
     this.turnAround();
     this.putThing();
     
     
     
     
     
 }
 
 public void turnAround()
 {
     
     
     this.turnLeft();
     this.turnLeft();
     
     
     
 }
 
  public void firstBaton()
 {
     
     
     this.move();
     this.move();
     this.move();
     this.move();
     this.turnLeft();
     this.turnAround();
     
     this.putThing();
     
     
     
 }

    private void pickupThing() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


