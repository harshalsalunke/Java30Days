import java.util.HashMap;

public class Day18 {

	public static void main(String[] args) {
		// Majority Element
		int list[] = { 2, 3, 3, 5, 4, 7, 8, 3, 3 };
		HashMap<Integer, Integer> count = new HashMap<>();
		for (int i : list) {
			if (count.containsKey(i)) {
				count.put(i, count.get(i) + 1);
			} else {
				count.put(i, 1);
			}
		}
		int majorityElement = -1;
		int maxCount = 0;
		for (int num : count.keySet()) {
			int cnt = count.get(num);
			if (cnt > maxCount) {
				majorityElement = num;
				maxCount = cnt;
			}
		}
		System.out.println("Majority element is: " + majorityElement);

	}

}
