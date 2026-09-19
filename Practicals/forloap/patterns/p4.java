import java.util.*;
class demo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("enetr the no od rows");
                int rows = sc.nextInt();
                for(int i = 1;i<=rows;i++){
			int num = i;
                        for(int j = 1;j<=rows;j++){
                               
                               System.out.print(num+"\t");
			       num+=i;
                                
                        }

                        System.out.println();
                }
        }
}
