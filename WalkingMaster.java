import java.util.*;
public class WalkingMaster{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int r=d-b;
            int l=a+d-b-c;
            if(r<0 || l<0){
                System.out.println(-1);
            }
            else{
                System.out.println(l+r);
            }
        }
        sc.close();
    }
}