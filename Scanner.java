import java.io.File;
import java.util.Scanner;
public class Scanner{
    public static void main(String[] args) throws IOException {
Scanner sc=new Scanner(new File("data.txt"));
while(sc.hasNextLine()){
System.out.println(sc.nextLine());
}
sc.close();
	}
}