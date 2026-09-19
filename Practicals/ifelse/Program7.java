class loan{
        public static void main(String[] args){
                int age = 25;
                int income = 45000;
                if (age>=21 && age<=60){
                        if(income<=30000){
                                System.out.println(" eligible for loan");
                        }else{
                                System.out.println("not eligible due to income");
                        }
                }else{
                        System.out.println("not eligible due to age");
                }
        }
}
