import java.util.HashSet;
import java.util.Scanner;
 
public class AntonandLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String anton = sc.nextLine();
 
        HashSet<Character> set = new HashSet<>();
 
        for (int i = 0; i < anton.length(); i++) {
            char ch = anton.charAt(i);
 
            if (ch >= 'a' && ch <= 'z') {
                set.add(ch);
            }
        }
 
        System.out.println(set.size());
    }
}
