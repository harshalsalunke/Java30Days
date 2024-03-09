import java.util.HashMap;

public class Day18 {

	public static void main(String[] args) {
		// Majority Element
		int list[] = { 2, 3, 8, 4, 8, 8, 8, 6, 7, 8 };
		int n = list.length;
		HashMap<Integer, Integer> count = new HashMap<>();
		int majorityElement = -1;

		for (int i : list) {
			int newCount = count.getOrDefault(i, 0) + 1;
			count.put(i, newCount);
			if (newCount >= n / 2) {
				majorityElement = i;
				break;
			}
		}
		System.out.println("Majority element is: " + majorityElement);

	}

}
