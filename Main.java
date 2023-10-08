import java.util.Arrays;
import java.util.Scanner;

// 1.multiple of two no's and leap year or not
// public class Main {
// public static void main(String [] args){
// Scanner scan = new Scanner(System.in);
// System.out.println("Ente the first number:");
// int a = Integer.valueOf(scan.nextLine());
// // System.out.println("Ente the second number:");
// // int b = Integer.valueOf(scan.nextLine());
// // System.out.println(a+"*"+b+"=" +(a*b));
// if(a%4!=0)
// {
// System.out.println("Not A Leap year");
// }
// else if(a%100==0 && a%400!=0)
// {
// System.out.println("Not A Leap year");
// }
// else if(a%4==0){
// System.out.println("Is A Leap year");
// }
// }
// }

// 2.Avg of positive no's
// public class Main{
// public static void main(String [] args){
// Scanner sc = new Scanner(System.in);
// int value=0;
// int sum=0;
// while(true)
// {
// System.out.println("Enter the number:");
// int a= Integer.valueOf(sc.nextLine());
// if(a==0 )
// {
// break;
// }
// if(a>0)
// {
// value+=1;
// sum+=a;
// }
// }
// double avg = (sum * 1.0)/value;
// System.out.println("Avg if number is:"+avg);
// }
// }

// 3.Factorrial number
// public class Main{
// public static void main(String [] args){
// Scanner sc =new Scanner(System.in);
// int fact = 1;
// int a = Integer.valueOf(sc.nextLine());
// for(int i=1;i<=a;i++){
// fact*=i;
// }
// System.out.println("Factorrial " + a + "!"+ " is: "+fact);
// }
// }

// 4.Fibonacci series
// public class Main{
// public static void main(String [] args){
// Scanner sc = new Scanner(System.in);
// int a=0,b=1,c=0;
// int range = Integer.valueOf(sc.nextLine());
// System.out.print(a+" "+b);
// for(int i=2;i<range;i++)
// {
// c=a+b;
// System.out.print(" "+c);
// a=b;
// b=c;
// }
// }
// }

// 5.check wheather Palindrome number or not
// public class Main{
// public static void main(String []args){
// Scanner sc = new Scanner(System.in);
// int rem,rev=0;
// System.out.print("Enter the number:");
// int range = Integer.valueOf(sc.nextLine());
// int num1 = range;
// while(range!=0)
// {
// rem = range%10;
// rev = rev *10 + rem;
// range/=10;
// }
// if(num1==rev)
// {
// System.out.println(num1+" is Plindrome.");
// }
// else{
// System.out.println(num1+" is not a Plindrome.");
// }
// }
// }

// 6.check Armstrong number or not
// public class Main{
// public static void main(String [] args){
// Scanner sc = new Scanner(System.in);
// int sum=0;
// System.out.print("Enter the number: ");
// int range = Integer.valueOf(sc.nextLine());
// int num1 = range;
// while(range!=0)
// {
// int rem = range%10;
// sum +=Math.pow(rem,3);
// range/=10;
// }
// if(num1==sum)
// {
// System.out.println(num1+" is Armstrong no.");
// }
// else{
// System.out.println(num1+" is not Armstrong no.");
// }
// }
// }

// 7.Armstrong number in the range of 1000
// public class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the range: ");
// int range = sc.nextInt();
// for (int i = 1; i <= range; i++) {
// int num = i;
// if (num <= 9) {
// System.out.print(num + " ");
// } else {
// double sum = Math.pow(num % 10, 3) + Math.pow((num % 100 - num % 10) / 10, 3)
// +
// Math.pow((num % 1000 - num % 100) / 100, 3);
// if (sum == num) {
// System.out.print(num + " ");
// }
// }
// }
// }
// }

// 8.String to convert to Upper case or Lower case
// public class Main {
// public static void main(String[] args) {
// String message = "Hello World!";
// String uppercase = message.toUpperCase();
// String lowercase = message.toLowerCase();
// System.out.println("UpperCase " + uppercase);
// System.out.println("LowerCase " + lowercase);
// }
// }

// 9. Concat to strings
// public class Main {
// public static void main(String[] args) {
// String firstname = "Santhosh ";
// String lastname = "kumar A";
// String fullname = firstname.concat(lastname);
// System.out.println("fullname is " + fullname);
// }
// }

// 10.Getting input from user
// public class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the String: ");
// String str = sc.nextLine();
// System.out.println(str);
// }
// }

// 11.how many single word in a String
// public class Main {
// public static void main(String[] args) {
// int j = 0;
// String str = "Santhosh";
// char str1 = 'h';
// for (int i = 0; i < str.length(); i++) {
// if (str.charAt(i) == str1) {
// j++;
// }
// }
// System.out.println(j);
// }
// }

// 12. check wheather prime number or not
// public class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the number: ");
// int num = sc.nextInt();
// boolean flag = false;
// for (int i = 2; i <= num / 2; i++) {
// if (num % i == 0) {
// flag = true;
// break;
// }
// }
// if (!flag) {
// System.out.println(num + " is a prime number");
// } else {
// System.out.println(num + " is not a prime number");
// }
// }
// }

// 13.Reverse the string
// public class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the string: ");
// String str = sc.nextLine();
// int len = str.length();
// String nstr = " ";
// char ch;
// for (int i = 0; i < len; i++) {
// ch = str.charAt(i);
// nstr = ch + nstr;
// }
// System.out.println("The reverse string is " + nstr);
// }
// }

// 14. Frequecy of character in given string
// public class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the string: ");
// String str = sc.nextLine();
// int[] freq = new int[str.length()];
// // converts given string into character array
// char string[] = str.toCharArray();
// int len = str.length();
// for (int i = 0; i < len; i++) {
// freq[i] = 1;
// for (int j = i + 1; j < len; j++) {
// if (string[i] == string[j]) {
// freq[i]++;
// string[j] = '0';

// }
// }
// }
// System.out.println("Char and their corrps freq's is:");
// int len1 = freq.length;
// for (int i = 0; i < len1; i++) {
// if (string[i] != ' ' && string[i] != '0')
// System.out.println(string[i] + "-" + freq[i]);
// }
// }
// }

// 15. j how many vowels in the string
// public class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the string: ");
// String str = sc.nextLine();
// str = str.toLowerCase();
// int j = 0;
// for (int i = 0; i < str.length(); i++) {
// if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
// str.charAt(i) == 'u'
// || str.charAt(i) == 'o') {
// j++;
// }
// }
// System.out.println("Total vowels in string are: " + j);

// }
// }

// 16. frequency of vowels in string
// public class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the string: ");
// String str = sc.nextLine();
// int arr[] = new int[5];
// for (int i = 0; i < str.length(); i++) {
// if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
// arr[0]++;
// }
// if (str.charAt(i) == 'e' || str.charAt(i) == 'E') {
// arr[1]++;
// }
// if (str.charAt(i) == 'i' || str.charAt(i) == 'I') {
// arr[2]++;
// }
// if (str.charAt(i) == 'o' || str.charAt(i) == 'O') {
// arr[3]++;
// }
// if (str.charAt(i) == 'u' || str.charAt(i) == 'U') {
// arr[4]++;
// }
// }
// System.out.println("No of 'a' = " + arr[0]);
// System.out.println("No of 'e' = " + arr[1]);
// System.out.println("No of 'i' = " + arr[2]);
// System.out.println("No of 'o' = " + arr[3]);
// System.out.println("No of 'u' = " + arr[4]);
// }
// }

// 17. remove the specific character in string
// public class Main {
// static void removechar(String str, char remove) {
// int len = str.length();
// String new_string = "";
// char ch[] = str.toCharArray();
// for (int i = 0; i < len; i++) {
// if (ch[i] != remove) {
// new_string += ch[i];
// }
// }
// System.out.println(new_string);
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the string: ");
// String str = sc.nextLine();
// System.out.print("Enter remove char: ");
// char remove = sc.next().charAt(0);
// removechar(str, remove);
// }
// }

// 18.remove the repeat characterin string
// public class Main {
// static void removerepeated(String str) {
// int len = str.length();
// String new_string = "";
// char[] ch = str.toCharArray();
// int j;
// for (int i = 0; i < len; i++) {
// for (j = 0; j < i; j++) {
// if (ch[i] == ch[j]) {
// break;
// }
// }
// if (j == i) {
// new_string += ch[i];
// }
// }
// System.out.println(new_string);
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the string: ");
// String str = sc.nextLine();
// removerepeated(str);
// }
// }

// 19.Array to get input from user(one dimensional)
// public class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the number of elements: ");
// int num = sc.nextInt();
// int[] arr = new int[100];
// for (int i = 0; i < num; i++) {
// arr[i] = sc.nextInt();
// }
// System.out.print("Array of number are: ");
// for (int i = 0; i < num; i++) {
// System.out.print(arr[i] + " ");
// }
// }
// }

// 20.Accpet two dimensional array
// public class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int i, j;
// System.out.print("Enter the no of rows: ");
// int row = sc.nextInt();
// System.out.print("Enter the no of col's: ");
// int col = sc.nextInt();
// int arr[][] = new int[row][col];
// System.out.println("Enter the elements: ");
// for (i = 0; i < row; i++) {
// for (j = 0; j < col; j++) {
// arr[i][j] = sc.nextInt();
// }
// }
// System.out.println("The array are: ");
// for (i = 0; i < row; i++) {
// for (j = 0; j < col; j++) {
// System.out.print(arr[i][j] + " ");
// // throws the cursor to the next line

// }
// System.out.println();
// }
// }
// }

// 21.frequency of element in the array
// public class Main {
// public static void main(String[] args) {
// int[] arr = new int[] { 2, 5, 8, 6, 4, 7, 9, 7, 4, 5, 6, 3 };
// int[] arr1 = new int[arr.length];
// int vis = -1;
// for (int i = 0; i < arr.length; i++) {
// int j = 1;
// for (int j = i + 1; j < arr.length; j++) {
// if (arr[i] == arr[j]) {
// j++;
// // to avoid the same element again
// arr1[j] = vis;
// }
// }
// if (arr1[i] != vis) {
// arr1[i] = j;
// }
// }
// for (int i = 0; i < arr1.length; i++) {
// if (arr1[i] != vis) {
// System.out.println(arr[i] + " | " + arr1[i]);
// }
// }
// }
// }

// 22.left rotate the elements on array
// public class Main {
// public static void main(String[] args) {
// int[] arr = new int[] { 1, 7, 3, 4, 5 };
// int n = 3;
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// for (int i = 0; i < n; i++) {
// int first = arr[0], j;
// for (j = 0; j < arr.length - 1; j++) {
// arr[j] = arr[j + 1];
// }
// arr[j] = first;
// }
// System.out.println();
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }
// }

// 23.remove duplicate number in the array
// public class Main {
// public static void main(String[] args) {
// int[] arr = { 1, 5, 4, 8, 1, 2, 5, 8, 9, 7 };
// int[] temp = new int[arr.length];
// int j = 0;
// Arrays.sort(arr);
// for (int i = 0; i < arr.length - 1; i++) {
// if (arr[i] != arr[i + 1]) {
// temp[j] = arr[i];
// j++;
// }
// }
// temp[j] = arr[arr.length - 1];
// for (int i = 0; i <= j; i++) {
// System.out.print(temp[i] + " ");
// }
// }
// }

