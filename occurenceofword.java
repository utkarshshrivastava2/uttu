package assignment;

import java.util.Scanner;
public class occurenceofword{

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.println("Enter the article");
String scr1 = sc.nextLine();
System.out.println("Enter the word u want");
String scr2 = sc.nextLine();

match(scr1,scr2);

}
public static void match(String s1, String s2) {

int count = 0;
String temp = "";

for(int i=0; i<s1.length(); i++) {

if(s1.charAt(i) != ' ') {
temp = temp + s1.charAt(i);

}else {
if (s2.equals(temp))
{
count ++;
}
temp = "";
}
}
if(s2.equals(temp)) {
count ++;
}
System.out.println(count);
return;

}

}

