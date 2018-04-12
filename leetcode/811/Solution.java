import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//import java.util.stream.
class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap<>();
        
        String[] pieces;
        Integer currentCount = 0;
        int count = 0;
        for (String s : cpdomains) {
        	System.out.println("Evaluating " + s);
        	pieces = s.split("[\\s\\.]");
        	String currentDomain = "";
        	for (int i = pieces.length-1; i >= 1; i--) {
        		if (i == pieces.length-1) {
        			currentDomain = pieces[i];
        		} else {
        			currentDomain = pieces[i] + "." + currentDomain;
        		}
        		count = Integer.parseInt(pieces[0]);
        		currentCount = map.get(currentDomain);
        		if (currentCount != null) {
        			count += currentCount;
        		}
        		map.put(currentDomain, count);
        	}
        	count = Integer.parseInt(pieces[0]);
        }
        
        ArrayList<String> answers = new ArrayList<>();
        map.forEach( (k,v) -> {
        	answers.add(v + " " + k);
        });
        return answers;
    }
    
    public static void main(String[] args) {
    	
    	String[] inputs = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
    	Solution sol = new Solution();
    	List<String> output = sol.subdomainVisits(inputs);
    	output.forEach(s -> {
    		System.out.println(s);
    	});
    }
}