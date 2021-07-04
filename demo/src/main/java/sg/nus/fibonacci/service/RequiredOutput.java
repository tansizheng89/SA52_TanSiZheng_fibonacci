package sg.nus.fibonacci.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

@Service
public class RequiredOutput {

	
	private static int fib(int n)
    {
    if (n <= 1)
       return n;
    return fib(n-1) + fib(n-2);
    }
	
	public Map<String,List<Integer>> output(int userInput)
	{
		List<Integer> unsorted = new ArrayList<>();
		
		for(int i = 0; i<userInput;i++)
			unsorted.add(fib(i));
		
		List<Integer> sorted =  sortedFunc(unsorted);
		
		Map<String,List<Integer>> userOutput = new HashMap<String,List<Integer>>();
		userOutput.put("fibonacci", unsorted);
		userOutput.put("sorted", sorted);
		
		return userOutput;
		
	}
	
	private List<Integer> sortedFunc(List<Integer> unsorted)
	{
		
		List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();
		
		for(Integer n:unsorted)
		{
			if(n%2==0)
				even.add(n);
			else
				odd.add(n);
		}
		
		Collections.reverse(even);
		Collections.reverse(odd);
		
		List<Integer> combined =  Stream.concat(even.stream(), odd.stream()).collect(Collectors.toList());
		
		return combined;
		
		
	}
}
