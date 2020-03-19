package Practice;

public class P5 {
	public static void main(String[] args) {
		
		String[] fruits= {"Apples", "Banana", "Kiwi", "Mango"};
		
		for(String fruit:fruits) {
			
			if(fruit.equals("Mango")) {
				System.out.println(fruit+" is my favorite fruit");
			}else {
				System.out.println(fruit);
			}
			System.out.println("---------------------------------------");
			for(int x=0; x<fruits.length; x++) {
				
			if(fruits.equals(fruits[3])) {
				
				System.out.println(fruits+" is my favorit fruits");
			} else {
				
				System.out.println(fruits[x]);
			}
				
				
			}
		}
	}

}
