import java.util.*;
public class UnitArray{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int nOne=0;
            for(int i=0;i<n;i++){
                if(arr[i] == -1) nOne++;
            }
            int op=0;
            while(nOne>n/2){
                op++;
                nOne--;
            }
            if(nOne%2!=0) op++;
            System.out.println(op);
        }
        sc.close();
    }
}