
/**
 * @author Tyler Zysberg
 * 
 * Description: Spotify project 2 - DecodeString(s): Given an encoded string, return its corresponding decoded string.
 *
 */
public class Project2 {

	public static void main(String[] args) {
		
		String a = "2[b3[a]]";
		
		String newString = decodeString(a);
		
		System.out.println(newString);
		
		

	}
	public static String decodeString(String s) {
        
		StringBuilder new1  = new StringBuilder();
        int i = 0;
       
        while (i < s.length()) 
        	{
        	if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
            {
                new1.append(s.charAt(i));
                i++;
            } 
            else{
                int j = i;
                while (s.charAt(j) >= '0' && s.charAt(j) <= '9'){
                	j++;
                }
                int repeat = Integer.parseInt(s.substring(i, j));
                int stack = 1;
                i = j + 1;
                j = i;
                while (stack > 0) 
                {
                    char c = s.charAt(j++);
                    if (c == '[') stack++;
                    else if (c == ']') stack--;
                }
                String st2 = decodeString(s.substring(i, j - 1));
                for (int k = 0; k < repeat; k++) new1.append(st2);
                i = j;
            }
        }
        return new1.toString();
    }

}
