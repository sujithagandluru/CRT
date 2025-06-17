import java.util.HashSet;
class Student{
int rollNo;
String name;
public static void main(String[] args){
this.rollNo=rollNo;
this.name=name;
}
public String toString(){
	return "Roll No:"+rollNo+",Name:"+name;
}
}
public class HashSetWithOjects{
	HashSet<Student>StudentSet=new HashSet<>();
	StudentSet.add(new Student(101,"Alice"));
	StudentSet.add(new Student(102,"Bob"));
	StudentSet.add(new Student(101,"Alice"));
	System.out.println("Students in Set:");
	for(Students:StudentSet){
		System.out.println(s);
	}
}
}
		