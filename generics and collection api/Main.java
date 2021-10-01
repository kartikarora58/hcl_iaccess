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
		
		FileReader file = new FileReader("C:\\Users\\HP\\Downloads\\input_new.txt");
		
		BufferedReader bfile = new BufferedReader(file);
		
		
		
		HashSet<Customer> cset = new HashSet<Customer>();
		
		
		String line=bfile.readLine();
		while(line!=null)
		{
			String details[]=line.split(",");
			Customer temp = new Customer(details[0], details[1]);
			
			cset.add(temp);
			
			line=bfile.readLine();
		}
	
		
		ArrayList<Customer> clist = new ArrayList<Customer>(cset);
		Collections.sort(clist);
		System.out.printf("%-20s %-20s\n","Name","Address");
		
		for(Customer item:clist)
		{
			System.out.printf("%-20s %-20s\n",item.getName(),item.getAddress());
		}
		
		
		
	}
}
