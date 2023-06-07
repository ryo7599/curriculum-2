package check;
//pet.javaをつけたす
//Constans.javaをつけたす

public class Main {
	public static void main(String[] args) { 
		printName("渡邉","亮");
		Pet pet = new Pet("java吉","hoge");
		   pet.introduce();
		RobotPet RobotPet = new RobotPet("R2D2","ルーク");
		   RobotPet.introduce();
		   
	}
	
	
	
	
	private static void printName(String firstName, String lastName) {
		System.out.println(firstName + lastName);
		
		
		
	}

}

