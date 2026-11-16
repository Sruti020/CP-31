import java.util.*;
public class OneAndTwo {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int total2=0;
            for(int i=0;i<n;i++){
                if(arr[i]==2){
                    total2++;
                }
            }
            if(total2 % 2 !=0){
                System.out.println(-1);
            }
            else{
                int count=0;
                int k=-1;
                for(int i=0;i<n-1;i++){
                    if(arr[i]==2){
                        count++;
                    }
                    if(count== total2/2){
                        k=i+1;
                        break;
                    }
                }
                System.out.println(k);
            }
        }
        sc.close();
    }
}
