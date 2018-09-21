//Ch02 page 15 - page 20
//Karel Robot Workbook

//Luke Black
//06 09 2018
//EC1405935

package Task4;

import Task4.Garden;
import Task4.Gardener;
import becker.robots.*;
import java.awt.Color;


public class PlantFlowers 

{

    
    public static void main(String[] args) 
    {
    /*
        City berlin = new City();
        Wall eWall = new Wall(berlin, 1,2, Direction.EAST);
        Wall nWall = new Wall(berlin, 1,2, Direction.NORTH);
        Wall wWall = new Wall(berlin, 1,2, Direction.WEST);
        Wall sWall = new Wall(berlin, 1,2, Direction.SOUTH);
      */
        Garden berlin = new Garden();
        berlin.buildWalls();
        
        Gardener karel = new Gardener(berlin,2,2,Direction.EAST,8);
        karel.setColor(Color.yellow); 
        Gardener rob = new Gardener(berlin,6,2,Direction.NORTH,8);
        rob.setColor(Color.blue);
        Gardener james = new Gardener(berlin,2,6,Direction.SOUTH,8);
        james.setColor(Color.green);
        Gardener smith = new Gardener(berlin,6,6,Direction.WEST,8);
        smith.setColor(Color.black);
     
      
     karel.firstBaton();
     james.RelayBot();
     smith.RelayBot();
     rob.RelayBot();
     
     
     
     
     
     
     
     
     
        //karel.plantFlowers();
        
    }
}

        
        
        
    
    

