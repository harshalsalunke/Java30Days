public class Day25 {

	public static void main(String[] args) {
		 int arr[] = { 5,1,3,4,6,8,4};
		 int max=arr[0];
		 for (int i : arr) {
	            if (i > max)
	                max = i;
	        }
	       boolean present[] = new boolean[max+1 ]; // +1 for 0-based indexing
	       // Mark numbers present in the array
	        for (int i : arr) {
	            present[i] = true;
	        }
	        boolean missingFound = false;
	        System.out.println("Missing numbers:");
	        // Check for missing numbers
	        for (int i = 0; i < present.length; i++) {
	            if (!present[i]) {
	                System.out.println(i);
	                missingFound = true;
	            }
	        }

	        if (!missingFound) {
	            System.out.println("There are no missing numbers.");
	        }
	}
		

}
