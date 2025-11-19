public class Primes {
    public static void main(String[] args) {
        int main_number = Integer.parseInt(args[0]);
        int index = 2;
        boolean flag = true;
        int counter = 0;
        System.out.println("Prime numbers up to " +main_number+ ":");
        while (flag);
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
        System.out.println("There are " +counter+ "primes between 2 and " +main_number);
    }
    public static boolean Is_Prime (int number_check)
    {
        int index_check = 2;
        boolean flag = true;
        while (flag) 
        {
            if (number_check == 2)
            {
                flag = false;
            }
            
            if (number_check % index_check == 0)
            {
                flag = true;
            }
            index_check++;
            if (number_check == index_check)
            {
                flag = false;
            }
        }
        return flag;
    }

}