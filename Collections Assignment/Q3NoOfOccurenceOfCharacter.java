import java.util.*;

public class Q3NoOfOccurenceOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        List<Character> strCharsList = new LinkedList<>();
        Set<Character> strCharsSet=new HashSet<>();
        for (Character c : str.toCharArray()) {
            strCharsList.add(c);
            strCharsSet.add(c);
        }
        for(Character c:strCharsSet){
            int freq=Collections.frequency(strCharsList,c);
            System.out.println("Frequency of character "+c+" is: "+freq);
        }
    }
}
