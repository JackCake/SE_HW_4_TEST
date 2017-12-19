package letterGrade;

import java.util.Scanner;

public class LetterGrade {
	
	public static char scoreConvertToLetter(int score){
		if(score<0 || score>100){
			return 'X';
		}else if(score>=90){
			return 'A';
		}else if(score>=80 && score<90){
			return 'B';
		}else if(score>=70 && score<80){
			return 'C';
		}else if(score>=60 && score<70){
			return 'D';
		}else{
			return 'F';
		}
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String isExit;
		do{
			System.out.print("Please input the score:");
			int score=Integer.parseInt(sc.nextLine());
			System.out.println("Convert the score " + score + " to a letter grade " + scoreConvertToLetter(score));
			System.out.print("Do you want to exit?(y/n)");
			isExit = sc.nextLine();
		}while(!isExit.equals("y"));
		sc.close();
	}

}
