import java.util.*;
class demo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("enetr the no od rows");
                int rows = sc.nextInt();
                //char ch = 'A';
                //int num = ;
                for(int i = 1;i<=rows;i++){
                        //char ch = 'A';
                        int num = rows;
                        for(int j = 1;j<=rows;j++){
                                if(j%2==1){
                                	System.out.print((char)(num+96)+"\t");
				}else{
					System.out.print(num+"\t");
				}
				num--;

                        
                        }

                        System.out.println();
                }
	}
}
