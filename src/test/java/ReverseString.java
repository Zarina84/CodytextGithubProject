public class ReverseString {

    public static void main(String[] args) {

        String word = "Codytex";
        StringBuffer word1 =new StringBuffer(word);
        String word2 ="";

        for (int i = word.length()-1;  i >=0; i--) {
            word2 = word2 + word.charAt(i);
        }
        System.out.println(word2);
    }

}
