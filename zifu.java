package java_text;


public class zifu {  
	public static void main(String[] args) {
        String shortStr = "nba";
        String longStr = "nbaernbatnbaynbauinbaopnba";
        int count = searchCount(shortStr, longStr);
        System.out.println(+count);
    }

    public static int searchCount(String shortStr, String longStr) {
        int count = 0;
        while (longStr.indexOf(shortStr) != -1) {
            count++;
            longStr = longStr.substring(longStr.indexOf(shortStr)
                    + shortStr.length());
        }
        return count;
    }
}  
