package testPackage;

/**
 * Title: GDSE59-1st-Sem
 * Description: Main Class
 * Created by abhishek_a on 10/19/2023
 * Email: abhishek_a@epiclanka.net
 * Company: Epic Lanka (Pvt) Ltd.
 * Java Version: 17
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("testPackage/Main.java is called");
        String name = null;

        for (int i = 0; i < args.length; i++) {
            if (args[i].startsWith("--name=")) {
                name = args[i].substring(7); // Get the value after "--name="
                break;
            }
        }

        if (name != null) {
            System.out.println("Name is: " + name);
        } else {
            System.out.println("Name parameter not provided.");
        }
    }
}
