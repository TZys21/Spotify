import java.lang.reflect.Array;

/**
 * @author Tyler Zysberg
 * 
 * Description: Spotify project 3 -ChangePossibilities(amount,amount): Your quirky boss collects rare, old coins. They found out you're a programmer and asked you to solve something they've been wondering for a long time.
Write a function that, given an amount of money and an array of coin denominations, computes the number of ways to make the amount of money with coins of the available denominations.
Example: for amount=4 (4¢) and denominations=[1,2,3] (1¢, 2¢ and 3¢), your program would output 4—the number of ways to make 4¢ with those denominations:
1¢, 1¢, 1¢, 1¢
1¢, 1¢, 2¢
1¢, 3¢
2¢, 2¢
*
* 
 */

public class project3 {
	
	public static void main(String[] args) {
	
		int examount = 4;
		int[] excoins = {1,2,3};
		
		int newcount = findCombinationsCount(examount, excoins);
		System.out.println(newcount);
		
	}
	
	static int findCombinationsCount(int amount, int coins[]) {
	    return findCombinationsCount(amount, coins, 0);
	}
	

	static int findCombinationsCount(int amount, int coins[], int checkInd) 
		{
	    if (amount == 0){
	        return 1;
	    }
	    else if (amount < 0 || coins.length == checkInd){
	        return 0;
	    }
	    else {
	        int withFirstCoin = findCombinationsCount(amount-coins[checkInd], coins, checkInd);
	        int withoutFirstCoin = findCombinationsCount(amount, coins, checkInd+1);
	        return withFirstCoin + withoutFirstCoin;
	    }
	}
	
	
    }
	
	
	

	
	



