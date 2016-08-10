/**
 * Created by swamys01 on 06/05/2016.
 */
public class RegexExample {

    public static void main(String args[]) {
        String str = "<title>BBCIndonesia.com Dunia</title> <description>BBC Information Syndication RSS Feed</description>" +
                " <link>http://www.bbc.com/indonesia/dunia</link> <language>id</language> <pubDate>Thu, 19 May 2016 15:58:13 GMT</pubDate> <item>" +
                "<pubDate>Thu, 19 May 2016 15:58:13 GMT</pubDate>";

//        if(str.matches("(?s).*Device.*not supported.*")){
//            System.out.println("I am matched");
//        }

        String after = str.replaceFirst("<pubDate>.*<\\/pubDate>", "");
        System.out.println(after);

        //.*Device .* not supported.(.*)\\s.*\\s.*\\s.*\\s.

    }
}
