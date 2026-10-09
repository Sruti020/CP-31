import java.util.*;
public class TargetPractice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int total=0;
            for(int i=0;i<10;i++){
                String str=sc.next();
                for(int j=0;j<10;j++){
                    if(str.charAt(j)=='X'){
                        int point=Math.min(Math.min(i, j), Math.min(9-i, 9-j));
                        total=total+point+1;
                    }
                }
            }
            System.out.println(total);
        }
    }
}