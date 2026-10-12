import java.util.*;
public class UnitedWeStand{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int b[]=new int[n];
            int c[]=new int[n];
            int max=Integer.MIN_VALUE;
            int count=0;
            for(int i=0;i<n;i++){
                max=Math.max(max, a[i]);
            }
            for(int i=0;i<n;i++){
                if(a[i]==max) count++;
            }
            if(count==n){
                System.out.println(-1);
            }
            else{
                int idx1=0;
                int idx2=0;
                for(int i=0;i<n;i++){
                    if(a[i]==max){
                        c[idx2++]=max;
                    }else{
                        b[idx1++]=a[i];
                    }
                }
                System.out.println(idx1+" "+idx2);
                for(int i=0;i<idx1;i++){
                    System.out.print(b[i]+" ");
                }
                System.out.println();
                for(int i=0;i<idx2;i++){
                    System.out.print(c[i]+" ");
                }
                System.out.println();

            }
        }
        sc.close();
    }
}