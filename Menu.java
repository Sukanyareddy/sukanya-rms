package rms;

import java.util.ArrayList;

public class Menu {
	//fields
	private ArrayList<Item>starters=new ArrayList<Item>();
	private ArrayList<Item> maincourse=new ArrayList<Item>();
	private ArrayList<Item> desserts=new ArrayList<Item>();
	
	
	//constructors
	public Menu() {
		populateMenu();
	}
	
	
	
	//setter and getter
     //return a specific starters
	public Item getStarters(int index) {
	return starters.get(index);	
	}
	public Item getMaincourse(int index ) {
		return maincourse.get(index);
	}
	public Item getDesserts(int index) {
		return desserts.get(index);
	}
	//return the size of  category starters
	public int getStarterSize() {
		return starters.size();
	}
	
	public String getAllStarters() {
	String sMenu =" " ;
	sMenu += "Starters : \n";
	for(int i=0 ; i < starters.size(); i++ ) {
		Item s= starters.get(i);
		sMenu += "S" + (i+1) + " " + s.toString() + "\n ";
	}
		return sMenu;
	}
	//return the size of category maincourse
	public int getMaincourseSize() {
		return maincourse.size();
	}
	
	public String getAllMaincourse() {
		String mMenu=" " ;
		mMenu += "Maincourse :  \n";
		for(int i=0 ; i< maincourse.size() ; i++) {
			Item m= maincourse.get(i);
			mMenu += "M" + (i+1) + " " + m.toString() + "\n" ;
			}
		return mMenu;
	}
	
	// return the size of category of desserts
	public int getDessertsSize() {
		return desserts.size();
	}
	
	public String getAllDesserts() {
		String dMenu=" " ;
        dMenu += "Desserts :   \n";
        for(int i=0 ; i < desserts.size(); i++) {
        	Item d=desserts.get(i);
        	dMenu += "D" + (i+1) + " " + d.toString() + " \n" ;     
        	}
        return dMenu;
	}
	
	
	
	//methods
	public void populateMenu() {
		//starters
		starters.add(new Item("veg manchuria", "starters",150));
		starters.add(new Item(" gobi manchuria", "starters",180));
		starters.add(new Item("baby corn manchuria", "starters",190));
		starters.add(new Item("chicken 65", "starters",180));
		starters.add(new Item("chilli chicken", "starters",200));
		starters.add(new Item("chicken drumsticks", "starters",220));
		
		
		//maincourse
		maincourse.add(new Item("veg biryani","maincourse",140));
		maincourse.add(new Item("paneer veg biryani","maincourse",1750));
		maincourse.add(new Item("paneer tikka biryani","maincourse",160));
		maincourse.add(new Item("egg biryani","maincourse",150));
		maincourse.add(new Item("chicken biryani","maincourse",180));
		maincourse.add(new Item("mutton biryani","maincourse",220));
		maincourse.add(new Item("dum biryani","maincourse",210));
		maincourse.add(new Item("keema biryani","maincourse",200));
		
		
		//desserts
		desserts.add(new Item("frozen bananaa","desserts",120));
		desserts.add(new Item("fresh straberry grantia","desserts",130));
		desserts.add(new Item("yummy blueberry clobber","desserts",140));
		desserts.add(new Item("cottage pudding","desserts",150));
		desserts.add(new Item("grilled peaches and cream","desserts",160));
		desserts.add(new Item("very berry cheesecake","desserts",170));
		desserts.add(new Item("apple pie with chocolate","desserts",110));
	}
	
	
	

   	
	}

