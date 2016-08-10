
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReplaceChar {

    public static void main(String[] args) {

        String content;
        try {
            content = new String(Files.readAllBytes(Paths.get(args[2])));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        ReplaceChar replaceChar = new ReplaceChar();
        System.out.print(replaceChar.replace(args[0], args[1], content));
    }

    private String replace(String replaceRegExp, String replacingChar, String content) {
        return content.replaceAll(replaceRegExp, replacingChar);

    }

}
