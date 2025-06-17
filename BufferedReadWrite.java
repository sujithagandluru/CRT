import java.io.*;
public class BufferedReadWrite{
    public static void main(String[] args){
        try {
            // Writing to file using BufferedWriter
            BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
            bw.write("First Line");
            bw.newLine();
            bw.write("Second Line");
            bw.close();

            // Reading from file using BufferedReader
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
