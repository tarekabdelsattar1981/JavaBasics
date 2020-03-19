package Practice;

public class PracticeArrays {
public static void main(String[] args) {
	
	char [] names= {'T', 'A', 'R', 'E', 'K'};
	
	for(int x=0; x<names.length; x++) {
		
		System.out.print(names[x]);
	}
	System.out.println();
	System.out.println("-------------------------------------------");
	for(char name:names) {
		System.out.print(name);
	}
}
}