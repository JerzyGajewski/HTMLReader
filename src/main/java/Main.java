import org.jsoup.Jsoup;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String url = "";
        String fName = "";
        if (args.length > 0){
            url = args[0];
            fName = args[1];
        }

        String html = Jsoup.connect(url).get().html();

        FileWriter fileWriter = new FileWriter(fName);
        fileWriter.write(html);
        fileWriter.close();
    }
}
