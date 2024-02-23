import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Day7 {

	public static void main(String[] args) {
		// Anagram Checker
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first string");
		String str1=scan.nextLine().toLowerCase();
		System.out.println("Enter second string");
		String str2=scan.nextLine().toLowerCase();
		HashSet<Character> hstr1=new HashSet<Character>();
		HashSet<Character> hstr2=new HashSet<Character>();
		for(int i =0;i<str1.length();i++){
			hstr1.add(str1.charAt(i));}
		for(int i =0;i<str2.length();i++){
			hstr2.add(str2.charAt(i));}
		boolean t= hstr1.equals(hstr2);
		if(t)
			System.out.println(str1+" and "+str2+" are anagrams of each other");
		else
			System.out.println(str1+" and "+str2+" are NOT anagrams of each other");
		}
}
