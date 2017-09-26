package rms;

import java.util.*;

public class Orderfood {
	
	public static void main(String[] args) {
		Menu menu=new Menu();
		
		Item myItem=menu.getStarters(1);
		System.out.println(myItem);
		
		Item myItem1=menu.getMaincourse(4);
		System.out.println(myItem1);
		
		Item myItem2=menu.getDesserts(6);
		System.out.println(myItem2);

		
		
     Orderfood of = new Orderfood();
       
	}

}
