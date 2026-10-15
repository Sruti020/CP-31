import java.util.*;
public class Desorting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            boolean isSorted=true;
            for(int i=1;i<n;i++){
                if(arr[i-1]>arr[i]){
                    isSorted=false;
                    break;
                }
            }
            if(!isSorted){
                System.out.println(0);
            }else{
                int min=Integer.MAX_VALUE;
                for(int i=1;i<n;i++){
                    min=Math.min(min, arr[i]-arr[i-1]);
                }
                System.out.println((min/2)+1);
            }
        }
        sc.close();
    }
}
