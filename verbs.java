import java.util.Scanner;

public class verbs {
	
	public static void main(String [] args){
		String first, second, third, fourth, stem;
		int conjugation, person, number, index;
		Scanner in = new Scanner(System.in);
		System.out.println("Let's conjugate verbs!");
		System.out.println("Enter the first principle part");
		first = in.nextLine();
		stem = first.substring(0, first.length()-1);
		System.out.println("Enter the second principle part");
		second = in.nextLine();
		System.out.println("Enter the third principle part");
		third = in.nextLine();
		System.out.println("Enter the fourth principle part");
		fourth = in.nextLine();
		System.out.println("Enter the conjugation");
		conjugation = in.nextInt();
		System.out.println("Enter the person (first, second, or third) as number");
		person = in.nextInt() - 1;
		System.out.println("Enter 1 for singular or 2 for plural");
		number = in.nextInt();
		if (number == 2){
			index = person + 3;
		}
		else{
			index = person;
		}
		
		System.out.println("Verb Synopsis:");
		
		if (conjugation == 1){
			FirstConj verb = new FirstConj(first, second, third, fourth, index);
			System.out.println(verb);
		}
		
		if (conjugation == 2){
			SecondConj verb = new SecondConj(first, second, third, fourth, index);
			System.out.println(verb);
		}
		
		if (conjugation == 3){
			ThirdConj verb = new ThirdConj(first, second, third, fourth, index);
			System.out.println(verb);
		}
		
		if (conjugation == 4){
			FourthConj verb = new FourthConj(first, second, third, fourth, index);
			System.out.println(verb);
		}
	}
}