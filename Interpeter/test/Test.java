package test;

// import lexer.Scanner;
// import lexer.Token;
import lexer.Tag;

public class Test {
	
	// public static void main(String[] args){
		
	// 	Scanner scanner = new Scanner();
	// 	System.out.println(scanner.read(scanner.PATH));

	// 	Token token = scanner.scan();

	// 	while(token != null){
	// 		System.out.println(token);
	// 		token = scanner.scan();
	// 	}
	// }
	
	public static void main(String[] args){

		Tag tag = Tag.MINUS;

		switch(tag){
			case Tag.MINUS:
				System.out.println("nothing");
		}
	}
}