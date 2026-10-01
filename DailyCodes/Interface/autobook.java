package DailyCodes.Interface;
import java.util.*;

public interface autobook {
    void bookingplatform();
    void bookingprice();
    void Noofpasenger();

}
class candition1 implements autobook{
     Scanner sc = new Scanner(System.in);

     int size = sc.nextInt();

    // int arr[] = new int[size];
    public void bookingplatform(){
        String arr[] = new String[size];
        System.out.println("enter the name :");
        for(int i = 0;i<size;i++){
            arr[i]=sc.next();
        }
        System.out.println("platforms are:");
        for(int index =0;index<size;index++){
            System.out.println(arr[index]);
        }
        System.out.println("enter platform in which you prefer");
        String platFrom = sc.next();
        System.out.println(platFrom);
    }
    public void bookingprice(){
        int arr[] = new int[size];
        System.out.println("Enter all platforms price in according to above list:");
        for(int i = 0; i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter all platform prices:");
        for (int i = 0;i<size;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Enter your avg price:");
        double price = sc.nextDouble();
        int flag = 0;
        for(int i=0;i<size;i++){
            if(arr[i]<=price){
                flag = 1;
                System.out.println("confirm that one "+price);
            }
            if(flag==0){
                System.out.println("if you dont have time for waiting another auto you can take this one:");

            }else{
                System.out.println("this auto in you buget you can book this one which having price"+price);

            }
        }

    }
    public void Noofpasenger(){
        int arr[] = new int[size];
        System.out.println("Enter the No of passengers: ");
        int Nopassenger = sc.nextInt();
        if(Nopassenger==4){
            System.out.println("extra 20 rs");
        }
        else if(Nopassenger==5){
            System.out.println("40 rs extra");
        }
        else{
            System.out.println("not allowed");
        }
        
    }
}
class pasenger{
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        autobook obj = new candition1() ;
        obj.bookingplatform();
        obj.bookingprice();
        obj.Noofpasenger();
    }
}


