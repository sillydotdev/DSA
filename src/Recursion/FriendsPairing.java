public class FriendsPairing {

    public static int friendsPairing(int n) {
        if(n == 1 || n == 2) {
            return n;
        }

        // int single = friendsPairing(n-1);
        // int pair = (n-1) * friendsPairing(n-2);    //(n-1) is pairways... friendsPairing(n-2) is pairs
        // return single + pair;

        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
    
}
