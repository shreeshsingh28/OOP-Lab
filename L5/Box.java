/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class Box {
    
double width;
double height;
double depth;

Box(double w,double h,double d){
width =w;
height =h;
depth =d;
}

double vol(){
return width*height*depth;
}

public static void main(String args[]){

Box ob = new Box(2,2,3);
System.out.print("volume is- "+ob.vol());

    
}
}
