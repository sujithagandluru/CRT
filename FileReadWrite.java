import java.io.*;
public class FileReadWrite{
	public static void main(String[] args) throws IOException {
FileWriter writer=new FileWriter("Output.txt");
writer.write("Hello,java FileWriter!");
writer.close();
FileReader reader=new FileReader("output.txt");
int ch;
while((ch=reader.read())!=-1){
System.out.print((char)ch);
}
reader.close();		
    }
}

