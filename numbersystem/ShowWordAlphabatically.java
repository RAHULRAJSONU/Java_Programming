package raghusir.assignment;

import java.io.*;

class ShowWordAlphabatically {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a word : ");
		String n = br.readLine();
		// alphabetical(n);
		alphabet(n);
	}

	public static void alphabetical(String n) {
		int l = n.length();
		char b[] = new char[l];
		for (int i = 0; i < l; i++)
			b[i] = n.charAt(i);
		char t;
		for (int j = 0; j < l - 1; j++) {
			for (int k = 0; k < l - 1 - j; k++) {
				if (b[k] > b[k + 1]) {
					t = b[k];
					b[k] = b[k + 1];
					b[k + 1] = t;
				}
			}
		}
		System.out.println("\nOriginal word : " + n);
		System.out.print("Sorted word : ");
		for (int m = 0; m < l; m++)
			System.out.print(b[m]);
		System.out.print("\n");
	}

	public static void alphabet(String s) {
		char b1[] = s.toCharArray();
		int l = b1.length;
		int i = 0, j = 0;
		char a1[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };

		for (i = 0; i <= 25; i++) {
			for (j = 0; j < l; j++) {
				if (a1[i] == b1[j])
					System.out.print(a1[i]);
			}
		}

	}
}
