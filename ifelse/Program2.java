class Digits{
	public static void main(String[] args){
		int num = 34;
		if (num>=0 && num <=9){
			System.out.println("Single digit");
		}else if (num>=10 && num<=99){
			System.out.println("two digits");
		}else if (num>=100 && num<=999){
			System.out.println("three digits");
		}else{
			System.out.println("NUmber is more than three digit");
		}
	}
}

