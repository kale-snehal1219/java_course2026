class Divisible{
	public static void main(String[] args){
		int num = 2000;
		if (num%10==0){
			if (num > 100){
				System.out.println("Number is multiple by 10 aqnd greater than 100");
			}else{
				System.out.println("Number is multiple by 10 but smaller then 100");
			}
		}else{
			System.out.println("Number is not divisible by 10");
		}
	}
}
