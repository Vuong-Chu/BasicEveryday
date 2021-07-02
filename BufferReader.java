import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;

public class BufferReader{
    public static void main(String[] args)  {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\minhv\\Desktop\\datafile.txt"));
            String columnNames = br.readLine();
            System.out.println(columnNames);
            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }


        try {
            URL url = new URL("https://datatxt.org/data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String columnNames = br.readLine();
            System.out.println(columnNames);
            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}