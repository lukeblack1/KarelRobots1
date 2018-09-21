
package Task4;

import becker.robots.*;

public class Garden extends City
{
 public Garden()
 {
     super();
 }
 
 public void buildWalls()
 {
    
     
     //Wall 2
   
     
     
     Wall abWall = new Wall(this,3,3,Direction.NORTH);
     Wall acWall = new Wall(this,3,4,Direction.NORTH);
     Wall adWall = new Wall(this,3,5,Direction.NORTH);
     
     Wall eaWall = new Wall(this,3,5,Direction.EAST);
     Wall ebWall = new Wall(this,4,5,Direction.EAST);
     Wall ecWall = new Wall(this,5,5,Direction.EAST);
     
     Wall saWall = new Wall(this,5,3,Direction.SOUTH);
     Wall sbWall = new Wall(this,5,4,Direction.SOUTH);
     Wall scWall = new Wall(this,5,5,Direction.SOUTH);
     
     Wall waWall = new Wall(this,3,3,Direction.WEST);
     Wall wbWall = new Wall(this,4,3,Direction.WEST);
     Wall wcWall = new Wall(this,5,3,Direction.WEST);
     
     
    
     
     
 }
}
