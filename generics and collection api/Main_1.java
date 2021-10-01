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
		
		FileReader file = new FileReader("C:\\java\\eclipse\\e-box\\src\\input.txt");
		
		BufferedReader bfile = new BufferedReader(file);
		
		
		
		TreeMap<String, ArrayList<CallLog>> cmap= new TreeMap<String, ArrayList<CallLog>>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String line=bfile.readLine();
		while(line!=null)
		{
			String details[]=line.split(",");
			CallLog temp = new CallLog(details[0],details[1],sdf.parse(details[2]),sdf.parse(details[3]));
			if(cmap.containsKey(details[0]))
			{
				ArrayList<CallLog> temp_list=cmap.get(details[0]);
				temp_list.add(temp);
				cmap.put(details[0],temp_list);
			}
			else
			{
				ArrayList<CallLog> temp_list=new ArrayList<CallLog>();
				temp_list.add(temp);
				cmap.put(details[0],temp_list);
			}
			line=bfile.readLine();
		}
	
		
		for(Map.Entry<String, ArrayList<CallLog>> item:cmap.entrySet())
		{
			System.out.println("Calls made by "+item.getKey()+" :");
			ArrayList<CallLog> temp=item.getValue();
			for(CallLog temp_item:temp)
			{
				System.out.println("Number Called : "+temp_item.getNumberCalled()+"  Call Time: "+sdf.format(temp_item.getStartTime()));
				
			}
		}
		
		
		
	}
}
