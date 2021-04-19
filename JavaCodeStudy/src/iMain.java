import java.io.*;
public class iMain {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What's your name? ");
        String name = reader.readLine();
        System.out.print("What's your lastname? ");
        String lastname = reader.readLine();
        System.out.print("How old are you? ");
        String age = reader.readLine();

        int iAge = Integer.parseInt(age);

        System.out.println("My name is "+name + " "+lastname+" My ages is "+ (iAge+1));

    }
}