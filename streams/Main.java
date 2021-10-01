import java.io.BufferedReader;
import java.util.TreeMap;
import java.util.stream.Stream;
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
import java.util.List;
import java.util.Queue;
import java.util.LinkedHashMap;
import java.io.FileReader;
import java.io.BufferedReader;

public class Main{
    
	public static void main(String args[]) throws Exception {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		System.out.println("Enter no. of Books");
		int n = Integer.valueOf(br.readLine());
		ArrayList<Book> blist= new ArrayList<>(n);

		System.out.println("Enter the book details in CSV format");
		
		for(int i=0;i<n;i++)
		{
			String details[]=(br.readLine()).split(",");
			blist.add(new Book(details[0], details[1], details[2], Double.valueOf(details[3])));
		}
		
		
		System.out.println("List of Distinct Books");
		
		System.out.format("%-20s %-20s %-10s %s\n","Title","Category","Author","Price");
		blist.stream().distinct().forEach(System.out::print);
		
		
		


		
		
	}
}
