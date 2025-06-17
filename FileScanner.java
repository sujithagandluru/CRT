import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileScanner{
    public static void main(String[] args) throws FileNotFoundException {
Scanner sc=new Scanner(new File("data.txt"));
while(sc.hasNextLine()){
System.out.println(sc.nextLine());
}
sc.close();
	}
}