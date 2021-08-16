public class App {
    public static void main(String[] args) {
//        String str= "Hello One Mount Group";
//        String s1="Java";
//        String s2= "Java";
//        String s3= "JAVA";
//        String s4="java";
////      char c = s4.charAt(0);
//        System.out.println(c);
        String s1 = EntryPoint.inputaString();
        String s2 = EntryPoint.inputaString();

        String upperCaseinString = EntryPoint.printUpperCaseInString(s1);
        System.out.format("UpperCaseInString: %s \n", upperCaseinString);

        String nonNumbericinString = EntryPoint.printNonNumbericInString(s1);
        System.out.format("Non Numberic in String:  %s \n", nonNumbericinString);
        Character c = 'c';

        String concat = EntryPoint.concataCharacterToString(s1, c);
        int sumCharCinString = EntryPoint.sumOccurrencesCharacterInString(concat, c);
        System.out.format("Sum of Character c in String:  %s \n", sumCharCinString);

        int sumCharInString = EntryPoint.countCharacterInString(s1);
        System.out.format("Sum of Character in String:  %s \n", sumCharInString);

        String concatString = EntryPoint.concatStringToString(s1, s2);
        System.out.format("Concat String is: %s \n", concatString);

        boolean isContainNumber = EntryPoint.isContainNumberic(s1);
        System.out.format("Is String contains Number: %s \n", isContainNumber);

        int countVowel = EntryPoint.countVowelInString(s1);
        int countConsonant = EntryPoint.countConsonantInString(s1);

        if (countVowel > 0) {
            System.out.format("Total Vowel in String: %s \n", countVowel);
        } else System.out.format("No vowel in String \n");

        if (countConsonant > 0) {
            System.out.format("Total Consonant in String: %s \n", countConsonant);
        } else System.out.format("No Consonant in String \n");

//    int  a =0;
//    int b=a;
//    a=10;
//
//    System.out.println(a);
//
//    System.out.println(b);
//
//    Integer A=0;
//    Integer B=A;
//    A=10;

    }
}