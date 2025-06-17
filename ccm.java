import java.util.HashMap;
import java.util.Scanner;
public class ccm{
public static viod main(String[] args){
HshMap<String,String>countryCapital=new HashMap<>();
Scanner sc=new Scanner(System.in);
countryCapital.put("India","New Delhi");
countryCapital.put("USA","Washington D.C");
countryCapital.put("Japan","Tokyo");
countryCapital.put("France","Paris");
System.out.println("Enter a country to find its capital:");
String country=sc.nextLine();
if(countryCapitalKey(country)){
System.out.println("Capital of "+country+"is"+countryCapital.get(country));
}
else{
	System.out.println("Capital not found for"+country);
}
sc.close();
}
}
