import java.util.Arrays;

public class Day4 {

	public static void main(String[] args) {
		//Maximum Element in an Array
		int arr[]= {1,76,2,4,55};
		int max=Arrays.stream(arr).max().orElse(0);
		System.out.println("Maximum with Stream:"+max);
		

	}

}
