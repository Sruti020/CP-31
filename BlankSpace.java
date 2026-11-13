import java.util.*;
public class BlankSpace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int max=0;
            int count=0;
            for(int a: arr){
                if(a==0){
                    count++;
                    max=Math.max(count, max);
                }
                else{
                    count=0;
                }
            }
            System.out.println(max);
        }
        sc.close();
    }
}