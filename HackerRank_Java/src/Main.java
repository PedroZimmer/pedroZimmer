import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'decryptMessage' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING encryptedMessage as parameter.
     */

    public static String decryptMessage(String encryptedMessage) {

        String[] words = encryptedMessage.split(" ");
        List<String> reversedWords = new ArrayList<>();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedWords.add(reversedWord.toString());
        }
        Collections.reverse(reversedWords);
        String reversedSentence = String.join(" ", reversedWords);


        Pattern pattern = Pattern.compile("([a-zA-Z])(\\d+)");
        Matcher matcher = pattern.matcher(reversedSentence);
        StringBuilder decryptedSentence = new StringBuilder();
        int prevIndex = 0;
        while (matcher.find()) {
            decryptedSentence.append(reversedSentence, prevIndex, matcher.start());
            char letter = matcher.group(1).charAt(0);
            int frequency = Integer.parseInt(matcher.group(2));
            decryptedSentence.append(String.valueOf(letter).repeat(Math.max(0, frequency)));
            prevIndex = matcher.end();
        }
        decryptedSentence.append(reversedSentence.substring(prevIndex));
        return decryptedSentence.toString();
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String encryptedMessage = bufferedReader.readLine();

        String result = Result.decryptMessage(encryptedMessage);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
