import java.util.Scanner;

public class ArrangingBooks {
	static String swap(String str, int i, int j)
    {
        if (j == str.length() - 1)
            return str.substring(0, i) + str.charAt(j)
                + str.substring(i + 1, j) + str.charAt(i);
 
        return str.substring(0, i) + str.charAt(j)
            + str.substring(i + 1, j) + str.charAt(i)
            + str.substring(j + 1, str.length());
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int swaps = 0;
		String line = sc.nextLine();
		for(int i = 0; i < line.length(); i++) {
			if(line.charAt(i) == 'S') {
				for(int j = i + 1; j < line.length(); j++) {
					if(line.charAt(j) == 'M') {
						line = swap(line, i, j);
						swaps++;
						break;
					}
				}
			}
			if(line.charAt(i) == 'M') {
				for(int j = i + 1; j < line.length(); j++) {
					if(line.charAt(j) == 'L') {
						line = swap(line, i, j);
						swaps++;
						break;
					}
				}
			}
		}
		System.out.print(swaps);
	}
}
