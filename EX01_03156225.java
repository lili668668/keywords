import java.util.Scanner
public class EX01_03156225{
  public static void main (String[] arts){
    Scanner input = new Scanner(System.in);
    System.out.print("輸入一個字串：");
    String string = input.nextLine();
    System.out.print("輸入一個字元：");
    char character = input.nextChar();
    System.out.printf("%c在%s出現%d次",character, string,count(string,character));
  }
  public static int count(String str , char c){
    char[] strArray = str.toArray();
    int count = 0;
    for (int cnt = 0;cnt < strArray.length;cnt++){
      if ( strArray[cnt] == c ){
        count++;
      }
    }
    return count;
  }
}
