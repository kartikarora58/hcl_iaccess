import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main2 {
	public static void main(String args[]) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Item details");
		String item = br.readLine();
		
		StringTokenizer st = new StringTokenizer(item,",");
		
		String arr[]=new String[st.countTokens()];
		int i=0;
		while(st.hasMoreTokens())
		{
			arr[i]=st.nextToken();
			i++;
		}
		
//		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
		System.out.printf("%-15s %-15s %-15s\n","Number","Item Type","Vendor");
		System.out.printf("%-15s %-15s %-15s\n",arr[0],arr[1],arr[2]);

		
		
	}
}
