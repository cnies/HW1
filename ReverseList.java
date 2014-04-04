
/*
Name: Christopher Nies
ID: A11393577
LOGIN: cs12sfl
*/
import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;

public class ReverseList
{
	public static void main(String[] args)
	{
		if (args.length != 1) {
			System.out.println("usage: ReverseList <filename>");
			return;
    		}
		String fileName = args[0];
		Scanner sc; 
		LinkedList<String> list = new LinkedList<String>();
		try {
			sc = new Scanner(new File(fileName));
			while (sc.hasNextLine()){
				list.push(sc.nextLine());
			}
		}
		catch (Exception e) {
			System.out.println("File Not Found");
			return;
		}
		sc.close();
		while (list.size()>0){
			System.out.println(list.pop());
		}
	}
}
