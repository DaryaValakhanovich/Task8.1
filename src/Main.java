import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String s = "Nature has always been a favourite theme for poets. " +
                "Storms and adventures on the sea have inspired them to write stirring verses. " +
                "Great forests have led them to write solemn songs. " +
                "Mountains and valleys, hills and meadows, too, have given them inspiration. " +
                "And, indeed, can you find anyone who would not be thrilled by the beauties of nature, " +
                "who would not be stirred by the charms of shape, colour and motion?";
        String[] s2 = (s + " ").split("\\p{P}?[ \\t\\n\\r]+");
        Collection<String> newText = new HashSet<>();
        newText.addAll(Arrays.asList(s2));
        for (String word : newText) {
            int number = 0;
            for (String words2 : s2){
                if (word.equals(words2)){
                    number ++;
                }
            }
            System.out.println(word + " " + number);
        }
    }
}
