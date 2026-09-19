class Eligibility{
	public static void main(String[] args){
		int age = 25;
		boolean Passtest = false;
		if (age>=18){
			if (Passtest){
				System.out.println("Eligible for driving licence");
			}else{
				System.out.println("Pass the driving test");
			}
		}else{
			System.out.println("Not eligible for driving licence");
		}
	}
}
