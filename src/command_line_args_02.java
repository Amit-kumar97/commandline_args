public class command_line_args_02 {
    public static void main(String args[]) {
        String s1 = args[0];
        String s2 = args[1];
        if ((s1.equals("GLA")) && (s2.equals("Mathura")))
        {
            System.out.println(s1+" University "+s2);
        }
        else
        {
            System.out.println("AAA technologies Dehli");
        }
    }
}
