package leetcode;

//Print element appear more than n/2 times
import java.util.ArrayList;
import java.util.HashMap;

public class MajorityElement {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(2);
		list.add(2);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);

		System.out.println(majorityEle(list));
	}

	public static int majorityEle(ArrayList<Integer> list) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < list.size(); i++) {
			int num = list.get(i);
			if (map.containsKey(num)) {

				map.put(num, map.get(num) + 1);

			} else {

				map.put(num, 1);

			}
		}
		for (Integer key : map.keySet()) {

			if (map.get(key) > list.size() / 2) {

				return key;
			}

		}
		return -1;

	}
}
