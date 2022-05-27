package math;

public class Algorithm1 {
	   
	   public static int mcss_03(int[] a) {
	         
	         int n = a.length;
	         int max = Integer.MIN_VALUE;
	         int sum = 0;
	         
	         
	         for (int i=0; i<n-1; ++i)
	            for (int j=i+1; j<n; ++j) {
	               sum = a[j]-a[i];
	               System.out.println(sum);
	               max = Math.max(max,sum);
	               
	            }
	         return max;
	         
	      }

	   public static void main(String[] args) {
	   
	      int[] a = {8, 1, 5, 3, 7, 4};
	      System.out.println("최대 이익: "+mcss_03(a));

	   }

	}