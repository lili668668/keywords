import java.util.Scanner;
public class EX02_03156225{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("輸入一個字串：");
    int[] counts = count(input.nextLine);
    for(int cnt = 0;cnt < counts.length;cnt++){
      System.out.printf("Counts[%d]=%d  ",cnt,counts[cnt]);
    }
  }
  public static int[] count(String str){
    int[] counts = new int[10];
    char[] strArray = str.toArray();
    for(int cnt = 0;cnt < strArray.length;cnt++){
      if(strArray[cnt] < '9' && strArray[cnt] > '0'){
        counts[strArray[cnt]-'0']
