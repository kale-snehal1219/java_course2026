package DailyCodes.Constructor;

public class blinkitorder {
    int quantity = 2;
    double totalamount = 450;
    static String deliveryService = "Blinkit";
    blinkitorder(){
        System.out.println("new order receviced");

    }
    void calculateBill(){
        System.out.println("order summary");
        System.out.println("Quantity:"+quantity);
        System.out.println("total Amount :"+totalamount);

    }
    static void deliverydetails(){
        System.out.println("delivery service:"+deliveryService);
        blinkitorder obj = new blinkitorder();
        System.out.println("Quantity:"+obj.quantity);
        System.out.println("Amount:"+obj.totalamount);
    }
    public static void main(String[] args) {
        blinkitorder order =new blinkitorder();
        order.calculateBill();
        deliverydetails();
    }

    
}
