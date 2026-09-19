class scholarship{
	public static void main(String[] args){
		int marks = 86;
		int income = 450000;
		if (marks>=75){
			if(income<=300000){
				System.out.println("Student is eligible for scholarship");
			}else{
				System.out.println("Student is not eligible due to income");
			}
		}else{
			System.out.println("Student not eligible due to marks");
		}
	}
}
