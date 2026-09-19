import java.util.*;
class demo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("enetr the no od rows");
                int rows = sc.nextInt();
		for(int i = 1;i<=rows;i++){
			for(int j = 1;j<=rows;j++){
				if(i%2==1){
					System.out.print('#'+"\t");
				}else{
					System.out.print('$'+"\t");
				}
			}
			System.out.println();
		}
	}
}
