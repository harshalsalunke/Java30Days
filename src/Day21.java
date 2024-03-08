
public class Day21 {

	public static void main(String[] args) {

		String arr[] = {"abcde", "abcdef", "abcxyz", "abctech"};
		String prefix = arr[0];

		for (int i = 1; i < arr.length; i++) {

			while (arr[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
			}
		}

		if (prefix.isEmpty()) {
			System.out.println("There is no common prefix");
		} else
			System.out.println("Prefix is: " + prefix);

	}

}
