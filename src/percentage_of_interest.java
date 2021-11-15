public class percentage_of_interest {
    public static void main(String args[]) {

        String gender = args[0];
        int age = Integer.parseInt(args[1]);

        System.out.println("The length of commandline argument is: "+args.length);
        if (gender == "Female")
        {
            if (age>1||age<58)
            {
                System.out.println("The percentage of interest is 8.2%.");
            }
            else if (age>59||age<100)
            {
                System.out.println("The percentage of interest is 9.2%.");
            }
        }
        else if (gender == "Male")
        {
            if (age>1||age<58)
            {
                System.out.println("The percentage of interest is 8.4%.");
            }
            else if (age>59||age<100)
            {
                System.out.println("The percentage of interest is 10.5%.");
            }

        }

    }
}
