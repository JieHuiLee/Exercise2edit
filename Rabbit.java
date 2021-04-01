package OOPExercise; //edition

public class Rabbit {
	String breed[] = {"American Fuzzy Lop", "Belgian Hare", "Giant Angora"};
	String skinColor[] = {"White combine with chestnut", "Black", "White"};
	String size[] = {"Small", "Medium", "Large"};
	double weight[] = {1.65, 3.4, 4.55};
	
	//Behaviour of Rabbit
	String hop = "Its movement by hop";
    String dig = "It likes to dig holes to put carrots";
    
    void printHop() { //behaviour of rabbit
    	System.out.println(hop);    	
    }
    
    void printDig() { 
    	System.out.println(dig);    	
    }
	
	
}
