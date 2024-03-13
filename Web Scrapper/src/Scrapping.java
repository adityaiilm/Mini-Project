import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Scrapping {
   static void urlBuffer(String urlString) throws IOException{
    StringBuffer urlStringBuffer = new  StringBuffer(); 
        URL url = new URL(urlString);
        BufferedReader br =new BufferedReader(new InputStreamReader(url.openStream()));
        while((urlStringBuffer.append(br.readLine()))!= null){
            File file = new File(urlString+".html");  //while we making the dialog box fro save the file we have to change the file object form this function
            FileWriter fw = new FileWriter(file);
            fw.append(urlStringBuffer);
            fw.close();
        }
        br.close();
    }
    public static void main(String[] args) throws IOException {
        
        urlBuffer("https://www.google.com");
    }
}
