package HashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class _1002_Find_Common_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr= {"bella","roller","roller"};
		find(arr);
	}

	public static void find(String[] arr)
	{
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		String str=arr[0];
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(int i=1;i<arr.length;i++)
		{
			HashMap<Character, Integer> kitne=new HashMap<Character, Integer>();
			
			for(int j=0;j<arr[i].length();j++)
			{
				char ch=arr[i].charAt(j);
				if(map.containsKey(ch))
				{
					kitne.put(ch, kitne.getOrDefault(ch, 0)+1);
				}
	
			}
			
			Iterator it = map.entrySet().iterator();
			while (it.hasNext())
			{
			   Entry<Character, Integer> item = (Entry<Character, Integer>) it.next();
			   Character ch=item.getKey();
			   if(!kitne.containsKey(ch))
				   map.remove(item.getKey());
				else if(kitne.get(ch)<map.get(ch))
					map.put(ch,kitne.get(ch));
			  
			}
			
		}
		
		
		
		List<String> ll=new ArrayList<>();
		
		for(Character ch:map.keySet())
		{
			int t=map.get(ch);
			while(t-->0)
				ll.add(ch+"");
		}
		
		System.out.println(ll);
		
	}
}
