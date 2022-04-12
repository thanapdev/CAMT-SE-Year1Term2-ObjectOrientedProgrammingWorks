//thanapong yamkamol
//642115022

package lab10;

public class wordMethod {
    public static void main(String[] args) {
        System.out.println(countWord("This sentence has too many words in it"));
    }

    public static int countWord(String word){
        String[] splitWord = word.split("\\s+");
        return splitWord.length;
    }
}
