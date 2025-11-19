public class Primes {
    public static void main(String[] args) {
        int main_number = Integer.parseInt(args[0]);
        int index = 2;
        boolean flag = true;
        int counter = 0;
        System.out.println("Prime numbers up to " +main_number+ ":");
        while (flag)
        {
            if (main_number == index) 
            {
                flag = false;
            }
            if (Is_Prime(index)) 
            {
                System.out.println(index);
                counter ++;
            }
            index++;
        }
        int per = (int) (((double) counter / main_number) * 100);
        System.out.println("There are " +counter+ " primes between 2 and " +main_number+ " (" + per+ "% are primes)");
    }
    public static boolean Is_Prime (int number_check)
    {
        if (number_check == 2)
            {
                return true;
            }
        for (int i=2; i<= number_check; i++)
            {
                if (i == number_check)
                {
                    return true;
                }
                if (number_check % i == 0)
                {
                    return false;
                }
            }
            return true;
    }

}