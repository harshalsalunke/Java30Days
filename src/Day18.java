import java.util.HashMap;

public class Day18 {

	public static void main(String[] args) {
		// Majority Element
		int newCount=1;
		int list[] = { 2, 3, 8, 4, 8, 8, 8, 6, 7, 8 };
		int n = list.length;
		HashMap<Integer, Integer> count = new HashMap<>();
		int majorityElement = -1;

		for (int i : list) {
			newCount = count.getOrDefault(i, 0) + 1;
			if (newCount >= n / 2) {
				majorityElement = i;
				break;
			}else count.put(i, newCount);
		}
		System.out.println("Majority element is: " + majorityElement);

	}

}
