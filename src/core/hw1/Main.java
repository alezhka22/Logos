package core.hw1;

public class Main {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(compateTo(s1, s2));
		System.out.println(s1.compareTo(s2));
	}

	static int compateTo(String s1, String s2) {
		int a = 0;
		int n = s1.length() - s2.length();
		if (n > 0) {
			a = check(s1, s2);
		} else if (n < 0) {
			a = check(s1, s2);
		} else {
			a = check(s1, s2);
		}
		return a;
	}

	static int check(String s1, String s2) {
		int c = 0;
		if (s1.length() > s2.length()) {
			for (int i = 0; i < s2.length(); i++) {
				if (s1.codePointAt(i) != s2.codePointAt(i)) {
					c = s1.codePointAt(i) - s2.codePointAt(i);
					return c;
				}
			}
		} else {
			for (int i = 0; i < s1.length(); i++) {
				if (s1.codePointAt(i) != s2.codePointAt(i)) {
					c = s1.codePointAt(i) - s2.codePointAt(i);
					return c;
				}
			}
		}
		if (s1.length() - s2.length() != 0) {
			c = s1.length() - s2.length();
			return c;
		}
		return c;
	}
}
