package check;

import constans.Constans;

public class Main {
	public static void main(String[] args) { 
		printName("渡邉","亮");
		Pet pet = new Pet(Constans.CHECK_CLASS_JAVA,Constans.CHECK_CLASS_HOGE);
		   pet.introduce();
		RobotPet RobotPet = new RobotPet(Constans.CHECK_CLASS_R2D2,Constans.CHECK_CLASS_LUKE);
		   RobotPet.introduce();
		   
	}
	
	
	
	
	private static void printName(String firstName, String lastName) {
		System.out.println(firstName + lastName);
		
		
		
	}

}

