import java.util.Scanner;
import java.io.File;

public class ReverseArray
{
  public static String[] getArrayOfLines(String fileName) throws Exception{
    Scanner sc = new Scanner(new File(fileName));
    int j = 100; //Initial length of array
    int i=0; //Index of the current line copied
    String[] oldArray = new String[j];
    String[] newArray = oldArray;
    while(sc.hasNextLine()) {
      //If we go beyond the array's length, we make a newer, bigger one and copy everything over
      if (i==j) {
        j+=100;
        newArray = new String[j];
        for(int k=0; k<oldArray.length; k++)
          newArray[k] = oldArray[k];
        oldArray = newArray;
      }
      
      newArray[i] = sc.nextLine();
      i++;
    } 
      return newArray;
  }
  
  public static void main(String[] args)
  {
    //If the amount of arguments is incorrect
    if (args.length != 1) {
      System.out.println("usage: ReverseArray <filename>");
      return;
    }
    
    String fileName = args[0];
    String[] stringArray;
    Scanner sc;
    try {
      File toReverse = new File(fileName);
      sc = new Scanner(new File(fileName));
      stringArray = ReverseArray.getArrayOfLines(fileName);
    }
    catch (Exception e) {System.out.println("File Not Found"); return;}
    for (int i = stringArray.length-1; i>=0; i--){
      if (stringArray[i]!=null)
        System.out.println(stringArray[i]);
    }
  }
}