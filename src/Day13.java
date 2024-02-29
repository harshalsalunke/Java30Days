import java.util.Stack;

public class Day13 {
	
	public static String reverseString(String str)
	{
		Stack<Character> stk=new Stack<Character>();
		for(char c : str.toCharArray())
		{
			stk.push(c);//Push to add element
		}
		StringBuilder reverse=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			reverse.append(stk.pop());//Pop is used to remove element
		}
		return new String(reverse);
		
	}

	public static void main(String[] args) {
		// reverse a string using a stack (LIFO)
		
		
		String str= "Hello World";
		System.out.println("Original String: "+str);
		String reverse=reverseString(str);
		System.out.println("Reversed String using Stack: "+reverse);
	
		
	}

}
