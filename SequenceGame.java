import java.util.*;
public class SequenceGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int b[]=new int[n];
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
            }
            int m=1;
            int a[]=new int[2*n];
            int i=1;
            a[0]=b[0];
            while(i<n){
                if(a[m-1]>b[i]){
                    a[m++]=b[i];
                    continue;
                }
                a[m++]=b[i];
                i++;
            }
            System.out.println(m);
            for(int j=0;j<m;j++){
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}