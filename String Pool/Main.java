import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;

public class Main {
	public static void main(String args[]) throws Exception {
		
		HashMap<String, Integer> dayName=new HashMap<String, Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number of dates");
		int n =Integer.valueOf(br.readLine());
		Date date[]=new Date[n];
		String[] days= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal=Calendar.getInstance();
		String temp[]=new String[n];
		System.out.println("Enter dates of the events:(dd/MM/yyyy)");
		for(int i=0;i<n;i++)
		{
			date[i]=sdf.parse(br.readLine());
			cal.setTime(date[i]);
			temp[i]=days[cal.get(Calendar.DAY_OF_WEEK)-1];
		}
		
//		for(String item:temp)
//		{
//			System.out.println(item);
//		}
		for(String item:temp)
		{
			if ((dayName).containsKey(item))
			{
				dayName.put(item,dayName.get(item)+1);
			}
			else {
				dayName.put(item,1);
			}
		}
		
		
//		System.out.println(dayName);
		ArrayList<String> keys=new ArrayList<String>(dayName.keySet());
		ArrayList<Integer> values=new ArrayList<Integer>(dayName.values());
		Integer max_element=Collections.max(values);
		
		ArrayList<String> maxIndexes=new ArrayList<String>();
		for(int i=0;i<values.size();i++)
		{
			if (values.get(i) == max_element)
			{
				maxIndexes.add(keys.get(i));
			}
		}
		
//		int[] min=new int[maxIndexes.size()];
		ArrayList <Integer> min=new ArrayList<>();
		for(String item:maxIndexes)
		{
			
			for (int i=0;i<days.length;i++)
			{
				if((item).equals(days[i]))
				{
					min.add(i);
				}
			}
		}
		System.out.println("More number of events takes place on"+days[Collections.min(min)]);
		
		
		
		
		
		
		
		
	}
}
