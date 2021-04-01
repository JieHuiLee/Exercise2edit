package OOPExercise; //edition

public class Main {

	public static void main(String[] args) {
		
		Rabbit AmericanFuzzyLop= new Rabbit(); 
		Rabbit BelgianHare= new Rabbit();
		Rabbit GiantAngora= new Rabbit();
		
		System.out.println("\tWelcome to Pets Shop");
		System.out.println("==================================");//Info of rabbit
		System.out.println("Pet  \t  : Rabbit");
		System.out.println("----------------------------------");
		System.out.println("Breed  \t  : "+  AmericanFuzzyLop.breed[0]);
		System.out.println("Skin Color: "+  AmericanFuzzyLop.skinColor[0]);
		System.out.println("Size  \t  : "+  AmericanFuzzyLop.size[0]);
		System.out.println("Weight(kg): "+  AmericanFuzzyLop.weight[0]);
		AmericanFuzzyLop.printHop();
		AmericanFuzzyLop.printDig();
		System.out.println("----------------------------------");
		
		System.out.println("Breed  \t  : "+  BelgianHare.breed[1]);
		System.out.println("Skin Color: "+  BelgianHare.skinColor[1]);
		System.out.println("Size  \t  : "+  BelgianHare.size[1]);
		System.out.println("Weight(kg): "+  BelgianHare.weight[1]);
		BelgianHare.printHop();
		BelgianHare.printDig();
		System.out.println("----------------------------------");
		
		System.out.println("Breed  \t  : "+  GiantAngora.breed[2]);
		System.out.println("Skin Color: "+  GiantAngora.skinColor[2]);
		System.out.println("Size  \t  : "+  GiantAngora.size[2]);
		System.out.println("Weight(kg): "+  GiantAngora.weight[2]);
		GiantAngora.printHop();
		GiantAngora.printDig();
		System.out.println("----------------------------------");
		
		Smartwatch Fitbit= new Smartwatch();
		Smartwatch Garmin= new Smartwatch();
		Smartwatch Suunto= new Smartwatch();
	    
		System.out.println("\n\tWelcome to Gadget Shop");
		System.out.println("==================================");//Info of Smartwatch
		System.out.println("Gadget : Smarwatch");
		System.out.println("----------------------------------");
		System.out.println("Model : "+ Fitbit.model[0]);
		System.out.println("Color : "+ Fitbit.color[0]);
		System.out.println("Brand : "+ Fitbit.brand[0]);
		Fitbit.printMethod();
		System.out.println(Fitbit.brand[0]+" can detect " + Fitbit.detect[0]);
		System.out.println("----------------------------------");
		System.out.println("Model : "+ Garmin.model[1]);
		System.out.println("Color : "+ Garmin.color[1]);
		System.out.println("Brand : "+ Garmin.brand[1]);
		Garmin.printMethod();
		System.out.println(Garmin.brand[1]+" can detect " + Garmin.detect[1]);
		System.out.println("----------------------------------");
		System.out.println("Model : "+ Suunto.model[2]);
		System.out.println("Color : "+ Suunto.color[2]);
		System.out.println("Brand : "+ Suunto.brand[2]);
		Suunto.printMethod();
		System.out.println(Suunto.brand[2]+" can detect " + Suunto.detect[2]);
		System.out.println("----------------------------------");
		System.out.println("--Thank you and have a nice day--");
	}

}
