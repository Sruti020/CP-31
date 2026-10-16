import java.util.*;
public  class ForbiddenInteger{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int x=sc.nextInt();
            if(x!=1){
                int i=1;
                System.out.println("YES");
                System.out.println(n);
                while(i<=n){
                    System.out.print(1+" ");
                    i++;
                }
                System.out.println();
            }
            else if(x==1 && k==1){
                System.out.println("No");
            }
            else{
                if(k>=2 && n%2==0){
                    System.out.println("Yes");
                    System.out.println(n/2);
                    int i=1;
                    while(i<=(n/2)){
                        System.out.print(2+" ");
                        i++;
                    }
                    System.out.println();
                }
                else if(k>=3 && n%2!=0){
                    System.out.println("Yes");
                    System.out.println((n-1)/2);
                    int i=1;
                    System.out.print(3+" ");
                    while(i<=(n-3)/2){
                        System.out.print(2+" ");
                        i++;
                    }
                    System.out.println();
                }
                else{
                    System.out.println("No");
                }
            }
        }
        sc.close();
    }
}