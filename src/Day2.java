
public class Day2 {

	public static void main(String[] args) {
		//Reverse a String
		String str="Learn Java";
		StringBuilder reverse=new StringBuilder();
		 // Iterate through the characters of the string in reverse order and append them to the StringBuilder
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }
		System.out.println("Original String:"+str);
		System.out.println("Reversed String:"+reverse);

	}

}
