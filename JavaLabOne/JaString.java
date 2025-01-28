package Lab1;

public class JaString {
    public static void main(String[] args) {
        String greeting = "Good Morning";
        //to find length
        System.out.println("Length of greeting: "+greeting.length());
        
        //to uppercase and lowercase
        System.out.println("Greeting to uppercase: "+greeting.toUpperCase());
        System.out.println("Greeting to lowercase: "+greeting.toLowerCase());

        // Finnding a character
        System.out.println("Find Good in greeting: "+greeting.indexOf("ing"));

        //Concatenation
        System.out.println(greeting.concat(" Sir"));

        //Special characters - use blackslash (\) escape character turns special character into string
        String text = "We are the students of \"Ncit-BCA\" ";
        System.out.println(text);
    }
}
