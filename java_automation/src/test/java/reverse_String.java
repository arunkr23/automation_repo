public class reverse_String {

    public static void main(String[] args) {
        String a = "Arun";
        // Method 1

        StringBuilder sb = new StringBuilder(a);
        String reverse = sb.reverse().toString();
        System.out.println(reverse);

        //Method 2
        String reverse_1 = "";
        for (int i=reverse.length()-1;i>=0;i--)
        {
            reverse_1 = reverse_1.concat(String.valueOf(reverse.charAt(i)));
        }
        System.out.println(reverse_1);

    }
}
