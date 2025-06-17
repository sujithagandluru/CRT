import java.io.*;
public class FileReadWrite{
	public static void main(String[] args) {
        try {
FileWriter writer=new FileWriter("Output.txt");
Writer.write("Hello,java FileWriter!);
Writer.close();
FileReader reader=new FileReader("output.txt");
int ch;
while((ch=reader.read())!=-1){
System.out.println((char)ch);
}
reader.close();
		}catch (IOException e) {
            e.printStackTrace();
        }
    }
}

