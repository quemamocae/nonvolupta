public class LotteryChecker {

    public static boolean contain(int[] lottoticket, int num) {
        for (int i = 0; i < lottoticket.length; i++) {
            if (lottoticket[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] ticket = {5, 12, 23, 34, 45, 56};
        int numberToCheck = 23;

        boolean result = contain(ticket, numberToCheck);
        
        System.out.println("Number " + numberToCheck + " is in the ticket: " + result);
    }
}
