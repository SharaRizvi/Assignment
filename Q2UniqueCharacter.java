import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q2UniqueCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        Set<Character> strChars=new HashSet<>();
        for(Character c:str.toCharArray()){
            strChars.add(c);
        }
        System.out.println("Unique characters of string are: "+strChars);
    }
}
