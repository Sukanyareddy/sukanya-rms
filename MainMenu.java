package rms;

public class MainMenu {

		public static void main(String[] args) {
		Menu menu=new Menu();
		
		//get the starters
		int s = menu.getStarterSize();
		System.out.println("Staters:  " + s);
		
		
		System.out.println(menu.getAllStarters());
		
		Item myItem=menu.getStarters(1);
		System.out.println(myItem);
		
		//get the maincourse
		int m = menu.getMaincourseSize();
		System.out.println("Maincourse:  " + m);
		
		System.out.println(menu.getAllMaincourse());
		
		Item myItem1=menu.getMaincourse(1);
		System.out.println(myItem1);
		
		//get the dessert
		int d = menu.getDessertsSize();
		System.out.println("Desserts:  " + d);
		
		System.out.println(menu.getAllDesserts());
		
		Item myItem2=menu.getDesserts(1);
		System.out.println(myItem2);


		}

	}


