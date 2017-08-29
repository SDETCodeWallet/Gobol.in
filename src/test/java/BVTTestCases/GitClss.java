package BVTTestCases;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class GitClss {

	public static void main(String[] args) {
		// arrayConcept();
		// factorial();
		// palindrome();
	}

	public static void palindrome() {
		int r, sum = 0, temp;
		String test = "shubham";
		int t = test.length();
		int i;
		for (i = t - 1; i >= 0; i--) {
			char value = test.charAt(i);
			System.out.print(value);
		}

	}

	public static void factorial() {
		int i, fact = 1;

		int number = 5;

		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of " + number + " is:" + fact);
	}

	public static void fabanocciseries() {
		int n1 = 0, n2 = 1, n3, i, count = 10;
		System.out.println(n1 + "" + n2);

	}

	public static void arrayConcept() {
		Object[] ar = { "shubham", "goyal", "passed" };
		LinkedList<Object> inttest = new LinkedList<Object>();
		inttest.add("Shubham");
		inttest.add(786);
		inttest.add("Goyal");
		Iterator<Object> itr = inttest.listIterator();

		while (itr.hasNext() == true) {
			inttest.remove();
			break;
		}
		System.out.println(inttest.get(0));
		System.out.println(inttest.get(1));
		System.out.println(inttest.get(2));
		Set<Object> testset = new HashSet<Object>();

		// testset.add("String");
		// testset.add("String");
		// testset.add("test");
		// testset.add(52);
		// testset.add("my name is khan");
		//
		// Iterator<Object> valuetest = testset.iterator();
		// while (valuetest.hasNext() == true) {
		// System.out.println(valuetest.next());
		// }

	}

}
