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
		ArrayList<ItemType> ilist = new ArrayList<ItemType>();
		
		
		System.out.println("Enter the number of item types:");
		int n = Integer.valueOf(br.readLine());
		
		for(int i=0;i<n;i++)
		{
			String details[]=(br.readLine()).split(",");
			ilist.add(new ItemType(details[0], Double.valueOf(details[1]),Double.valueOf(details[2])));
		}
		
//		System.out.println(ilist);
		Comparator<ItemType> icp=(ItemType t1,ItemType t2)->(t1.getName()).compareTo(t2.getName());
		
		Collections.sort(ilist, icp);
//		System.out.println(ilist);
		System.out.format("%-10s %-10s %s\n","Name","Cost","Deposit");
		
		for(ItemType item:ilist)
		{
			System.out.format("%-10s %-10s %s\n",item.getName(),item.getCostPerDay(),item.getDeposit());
		}
		
	}
}
