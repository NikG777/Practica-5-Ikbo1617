public class Rec {
        public static void recursion(int number)
        {
            if (number !=0)
            {
                recursion(number / 10);
                System.out.println(number % 10 + " ");
            }
        }

        public static void main(String[] args) {
            int number = 154;
            recursion(number);
        }
    }
