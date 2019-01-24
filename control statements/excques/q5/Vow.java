import java.util.Scanner;
  class Vow 
{

        public static void main(String[] args)
        {
            Scanner s1 = new Scanner(System.in);

            System.out.print("Input an alphabet: ");
            String input = s1.next().toLowerCase();  //using tolowercase so as to keep vowels declaration small //

            boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
            boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
            boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
                    || input.equals("o") || input.equals("u");

            if (input.length() > 1)
            {
                System.out.println("Error : Not a single character.");
            }
            else if (!(uppercase || lowercase))
            {
                System.out.println("Error : Neither lowercase or uppercase");
            }
            else if (vowels)
            {
                System.out.println("Inputted letter is Vowel");
            }
            else
            {
                System.out.println("Inputted letter is Consonant");
            }
        }
}