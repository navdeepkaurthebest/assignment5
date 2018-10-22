
package homeproject1;

import java.util.Scanner;


public class HomeProject1 {

    public static void main(String[] args) {

String[] nameList = new String[10];
nameList[0] = "Navdeep";
nameList[1] = "Pawan";
nameList[2] = "Manjot";
nameList[3] = "Simran";
int number = 0;
 
while (number < 4) {
menuPrint(nameList);
Scanner sc = new Scanner(System.in);
number = sc.nextInt();
 
if (number == 1) {
optionDiplay(nameList);
 
} else if (number == 2) {
optionInsert(nameList);
} else if (number == 3) {
optionswap(nameList);
}
}
if (number == 4) {
System.out.println("End of Project");
 
}
 
}
 
public static void menuPrint(String[] args) {
System.out.println("Main Menu");
System.out.println("STUDENT ID: 1795111");
System.out.println("STUDENT NAME: Navdeep Kaur");
System.out.println("");
System.out.println("1. Display the List");
System.out.println("2. Insert an element");
System.out.println("3. Swap the elements");
System.out.println("4. Quit");
System.out.println("Your Choice= ");
 
}
 
public static void optionDiplay(String[] vector) {
 
System.out.println("List Content=");
vectorPrint(vector);
System.out.println("");
System.out.println("");
String insert;
Scanner sc = new Scanner(System.in);
System.out.println("Press y to continue");
insert = sc.nextLine();
 
}
 
public static void vectorPrint(String[] vector) {
for (int i = 0; i < 10; i++) {
System.out.println((i + 1) + "." + vector[i]);
}
 
}
 
public static void optionInsert(String[] vector) {
String insert;
 
System.out.println("Insert an Element= ");
vectorPrint(vector);
Scanner keyboard = new Scanner(System.in);
String nameToInsert = new String();
 
int i;
int indexAsk;
System.out.println("Where do you want to insert?");
indexAsk = keyboard.nextInt();
keyboard.nextLine();
System.out.println("Please enter name= ");
nameToInsert = keyboard.nextLine();
 
for (i = 4; i > (indexAsk - 1); i--) {
vector[i] = vector[i - 1];
}
vector[indexAsk - 1] = nameToInsert;
vectorPrint(vector);
 
Scanner sc = new Scanner(System.in);
 
System.out.println("Press y to continue");
insert = sc.nextLine();
 
if (insert.equals("y") || insert.equals("Y")) {
optionInsert(vector);
 
} else {
System.out.println("End of the  insert excecution");
}
}
 
public static void optionswap(String[] vector) {
String insert;
 
System.out.println("Swap two numbers= ");
vectorPrint(vector);
Scanner keyboard = new Scanner(System.in);
int i, j;
System.out.println("From element= ");
i = keyboard.nextInt();
keyboard.nextLine();
System.out.println("To element= ");
j = keyboard.nextInt();
 
String n = null;
n = vector[i - 1];
vector[i - 1] = vector[j - 1];
vector[j - 1] = n;
vectorPrint(vector);
 
Scanner sc = new Scanner(System.in);
 
System.out.println("Press y to continue");
insert = sc.nextLine();
if (insert.equals("y") || insert.equals("Y")) {
optionswap(vector);
 
} else {
 
System.out.println("End of the swap excecution");
}
}
   
}
