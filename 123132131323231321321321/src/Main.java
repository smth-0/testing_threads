/**
 * Created in 11.02.18. package PACKAGE_NAME.
 * in project 123132131323231321321321.
 */

import java.util.Vector;

public class Main {
    public static Vector<Turtle> v= new Vector<>();
    public static void main(String args[]){
        Turtle one = new Turtle(20,10,1,"John",2);
        Turtle two = new Turtle(20,12,1,"Alex",2);
        Turtle three = new Turtle(20,9,1,"Dimash",4);
        Turtle four = new Turtle(20,15,1,"NoName",3);



        one.start();
        two.start();
        three.start();
        four.start();
//        for(int i=0;i<4;++i) {
//            System.out.println(i+"st is "+v.get(i).name);
//        }
   }
}
