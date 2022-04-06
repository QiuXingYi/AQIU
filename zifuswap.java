package java_text;

import java.util.Arrays;


public class zifuswap {      
    public static void main(String[] args) {
    	String s = "20 78 9 -7 88 36 29";
    	String [] s_arr = s.split(" ");
    	int[] arr=new int[s_arr.length];
        for (int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(s_arr[i]);
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length ;i++ )
		{
			if(i < arr.length-1)
				System.out.print(arr[i]+" ");
			else
				System.out.print(arr[i]+" ");
		}
		System.out.println();
    }
}
