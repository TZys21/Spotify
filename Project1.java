
/**
 * @author Tyler Zysberg
 * 
 * Description: Spotify project 1 sortByStrings(s,t): Sort the letters in the string s by the order they occur in the string t. You can assume t will not have repetitive characters. For s = "weather" and t = "therapyw", the output should be sortByString(s, t) = "theeraw". For s = "good" and t = "odg", the output should be sortByString(s, t) = "oodg".
*/

public class Project1 {

	public static void main(String[] args) {
		
		String st1 = "good";
		String st2 = "odg";
		String newString = sortByString(st1, st2);
		
		System.out.println(newString);
		
	}
		
		public static String sortByString(String s, String t){
			
		
		String result = "";
		

		for(int i = 0; i < t.length(); i++)
		{
		    for(int j = 0; j < s.length(); j++){

		        if(t.charAt(i) == s.charAt(j)){
		            result+= s.charAt(j);
		        }
		    }
		}
			return result;
		}
	}
