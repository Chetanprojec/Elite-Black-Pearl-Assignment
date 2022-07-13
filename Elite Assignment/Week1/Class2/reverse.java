public class reverse {
    public static void main(String[] args) {

        int n = 199;
     int ans = 0;
        while (n > 0) {
            ans = ans * 10 + n % 10;
            n /= 10;
        }
        System.out.println(ans);
 
}
}
