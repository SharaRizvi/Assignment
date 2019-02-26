import java.util.Scanner;

public class Q4CountPercent {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        int upperCaseLen=0, lowerCaseLen=0, specialCharLen=0, digitsLen=0, totalLen;
        float upperCasePercent, lowerCasePercent, digitsPercent, specialCharPercent;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>=97&&ch<=122)
                upperCaseLen++;
            else if(ch>=65 && ch<=90)
                lowerCaseLen++;
            else if(Character.isDigit(ch))
                digitsLen++;
            else
                specialCharLen++;
        }
        totalLen = upperCaseLen + lowerCaseLen + digitsLen + specialCharLen;
        System.out.println("Total characters: " + totalLen);
        System.out.println("Upper Case characters: " + lowerCaseLen);
        System.out.println("Lower Case characters: " + upperCaseLen);
        System.out.println("Digits: " + digitsLen);
        System.out.println("Special characters: " + specialCharLen);
        upperCasePercent = ((float) upperCaseLen) / totalLen * 100;
        lowerCasePercent = ((float) lowerCaseLen) / totalLen * 100;
        digitsPercent = ((float) digitsLen) / totalLen * 100;
        specialCharPercent = ((float) specialCharLen) / totalLen * 100;
        System.out.println();
        System.out.println("Upper Case characters percentage: " + lowerCasePercent);
        System.out.println("Lower Case characters percentage: " + upperCasePercent);
        System.out.println("Digits percentage: " + digitsPercent);
        System.out.println("Special characters percentage: " + specialCharPercent);
    }
}