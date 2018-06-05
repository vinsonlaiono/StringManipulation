public class StringManipulatorTesting {
    
    public String trimAndConcat(String str1, String str2) {
        String first = str1.trim();
        String second = str2.trim();
        String sentence = first.concat(second);

        return sentence;
    }
    public String getIndexOrNull(String str1, Character letter){
        String sentence = str1;
        Character character = letter;

        int a = str1.indexOf(letter);

        return Integer.toString(a);
    }
    public String concatSubstring(String str1, int num1, int num2, String str2){
        String sentence = str1.substring(num1, num2) + str2;
        return sentence;
    }

}