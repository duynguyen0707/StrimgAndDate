import java.util.Scanner;

public class EntryPoint {
    public static String inputaString() {
        String s = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        s = sc.nextLine();

        return s;

    }
//    Given a string s, write a program that accepts s from the user and prints uppercase characters in s on the screen

    public static String printUpperCaseInString(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                s = s + str.charAt(i);
            }

        }
        return s;
    }

    //    Write a program that accepts a string s from the user and displays non-numeric characters in s on the screen
    public static String printNonNumbericInString(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                continue;
            } else
                s += str.charAt(i);

        }
        return s;
    }

    //    Given a string s and a character c. Write a program that accepts these two variables from the user and prints the occurrences of character c in s
    public static String concataCharacterToString(String str, Character c) {
        String sc = c.toString();
        String s = str.concat(sc);

        return s;

    }

    public static int sumOccurrencesCharacterInString(String str, Character c) {
        String str1 = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
//            if (c.equals(str.charAt(i)))
            if (str.charAt(i) == c) {
                count = count + 1;
            }

        }

        return count;
    }

    //    Nhập một chuỗi kí tự, đếm số lượng các từ trong chuỗi kí tự đó (các từ có thể cách nhau bằng nhiều khoảng trắng)
    public static int countCharacterInString(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isSpaceChar(str.charAt(i))) {
                continue;
            } else
                count += 1;
        }
        return count;
    }

    //    Nhập hai chuỗi kí tự s1, s2; nối chuỗi kí tự s2 vào sau chuỗi s1
    public static String concatStringToString(String str1, String str2) {

        String s = str1.concat(str2);

        return s;

    }

    //    Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược lại true
    public static boolean isContainNumberic(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                return false;

            }
        }

        return true;
    }

    //    Đếm số lượng ký tự nguyên âm và phụ âm xuất hiện trong chuỗi. Ví dụ chuỗi java có 2 nguyên âm a, 2 phụ âm j và v
    public static boolean isVowel(char str) {


        if (str == 'a' || str == 'o' || str == 'i' || str == 'u' || str == 'e') {
            return true;
        }


        return false;
    }

    public static int countVowelInString(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                count += 1;

            }

        }
        return count;
    }

    public static int countConsonantInString(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i)) || Character.isDigit(str.charAt(i))) {

                continue;
            }


            count += 1;

        }


        return count;
    }
}
