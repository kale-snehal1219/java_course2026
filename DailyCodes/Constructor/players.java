package DailyCodes.Constructor;

public class players {
    int jerNo;
    String playerName;
    players(int jNo,String name){
        jerNo = jNo;
        playerName = name;
        System.out.println("in player contructor");

    }
    void playerInfo(){
        System.out.println(jerNo);
        System.out.println(playerName);

    }
    public static void main(String[] args) {
        players obj = new players(12,"virat");
        obj.playerInfo();


    }

    
}
