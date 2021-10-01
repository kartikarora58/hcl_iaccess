import java.io.BufferedReader;
import java.util.TreeMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.LinkedList;
import java.util.Queue;
import java.util.LinkedHashMap;
import java.io.FileReader;
import java.io.BufferedReader;

public class Main{
    
	public static void main(String args[]) throws Exception {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<User> ilist = new ArrayList<User>();
		
		
		System.out.println("Enter the number of users:");
		int n = Integer.valueOf(br.readLine());
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of User "+(i+1));
			String details[]=(br.readLine()).split(",");
			ilist.add(new User(details[0],details[1],details[2],details[3]));
		}
		

		Comparator<User> icp=(User t1,User t2)->(t1.getName()).compareTo(t2.getName());
		
		Collections.sort(ilist);
		Collections.reverse(ilist);
		System.out.println("The user details in reverse order:");
		System.out.printf("%-15s%-15s\n","Name","Mobile number");
		
		for(User item:ilist)
		{
			System.out.println(item);
		}
		
	}
}
