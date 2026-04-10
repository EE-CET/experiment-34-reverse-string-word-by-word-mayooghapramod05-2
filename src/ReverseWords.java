import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextLine()) return;
            String s = sc.nextLine().trim();
            if (s.isEmpty()) return;

            String[] words = s.split("\\s+");

            for (int i = words.length - 1; i >= 0; i--) {
                System.out.print(words[i] + (i == 0 ? "" : " "));
            }
            System.out.println();
        }
    }
}

