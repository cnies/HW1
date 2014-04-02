import java.util.*;
import java.io.File;

public class ReverseList
{
  public static void main(String[] args)
  {
    if (args.length < 1) {
      System.out.println("usage: ReverseArray <filename>");
      return;
    }
    String fileName = args[0];
    ArrayList<String> list = new ArrayList<String>();
    Scanner sc;
    try {
      File toReverse = new File(fileName);
      sc = new Scanner(new File(fileName));
    }
    catch (Exception e) {System.out.println("File Not Found"); return;}
    while(sc.hasNextLine()) {
      list.add(sc.nextLine());
    }
  }
}
