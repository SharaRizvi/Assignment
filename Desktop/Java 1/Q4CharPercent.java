import java.util.Scanner;

public class Q4CharPercent {

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        int upperCaseLen = str.length()-str.replaceAll("[A-Z]", "").length();
        int lowerCaseLen = str.length()-str.replaceAll("[a-z]", "").length();
        int specialCharLen = str.length()-str.replaceAll("\\W", "").length();//special characters
        int digitsLen = str.length()-str.replaceAll("[0-9]", "").length();
        int totalLen = upperCaseLen + lowerCaseLen + digitsLen + specialCharLen;
        System.out.println("Total characters: " + totalLen);
        System.out.println("Upper Case characters: " + lowerCaseLen);
        System.out.println("Lower Case characters: " + upperCaseLen);
        System.out.println("Digits: " + digitsLen);
        System.out.println("Special characters: " + specialCharLen);
        float upperCasePercent = ((float) upperCaseLen) / totalLen * 100;
        float lowerCasePercent = ((float) lowerCaseLen) / totalLen * 100;
        float digitsPercent = ((float) digitsLen) / totalLen * 100;
        float specialCharPercent = ((float) specialCharLen) / totalLen * 100;
        System.out.println();
        System.out.println("Upper Case characters percentage: " + lowerCasePercent);
        System.out.println("Lower Case characters percentage: " + upperCasePercent);
        System.out.println("Digits percentage: " + digitsPercent);
        System.out.println("Special characters percentage: " + specialCharPercent);
    }

}
