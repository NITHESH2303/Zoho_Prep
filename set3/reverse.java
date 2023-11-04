package set3;

public class reverse {
    public static void main(String[] args) {
        String sentence = "the quick brown fox jumps over the lazy dog";
        String reversed = reverseSentence(sentence);
        System.out.println(reversed); // prints "dog lazy the over jumps fox brown quick the"
    }
    public static String reverseSentence(String sentence) {
        if (sentence.isEmpty()) {
            return sentence;
        }
        int lastSpace = sentence.lastIndexOf(' ');
        if (lastSpace == -1) {
            return sentence;
        }
        return reverseSentence(sentence.substring(lastSpace + 1)) + " " + reverseSentence(sentence.substring(0, lastSpace));
    }    
}
