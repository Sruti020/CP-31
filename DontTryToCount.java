import java.util.*;
public class DontTryToCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String x=sc.next();
            String s= sc.next();
            int op=0;
            while(!x.contains(s)){
                x=x+x;
                n=2*n;
                op++;
                if(n>2*m && !x.contains(s)) break;
            }
            if(x.contains(s)){
                System.out.println(op);
            }
            else{
                System.out.println(-1);
            }
        }
        sc.close();
    }
}