package Lab1;

public class DataType {
    public static void main(String[] args) {
        int myNum = 5; //Integer (whole number)
        float myFloat = 5.99f; //floating point number
        char myLetter = 'A'; // Character
        boolean myBoolean = true; //Boolean
        String myText = "Hello";

        //Numbers
        /* Integer types: byte, short, int, long (stores whole numbers, positive or negative), without decimals
        Floating point types: float, double (numbers with a fractional part, containing one or more decimals)
        */
        byte myByteNumber = 100; // byte can store whole numbers from -128 to 127
        short MyShortNumber = 5000; // short can store whole numbers from -32768 to 32767
        int myIntNumber = 100000; // int can store whole number from -2147483648 to 2147483647
        long MyLongNumber = 150000000L; // long can store whole number from -9223372036854775808 to 9223372036854775807

        // float and double data types can store fractional numbers
        float myFloatNumber = 58.55f;
        double myDoubleNumber = 11.99d;

        //Scientific numbers - e to indicate the power of 10
        float myScientificFloatNmuber = 35e3f;
        double myScientificDoubleNumber = 12e4d;

        System.out.println("Floating point: "+ myScientificFloatNmuber);
        System.out.println("Floating point: "+ myScientificDoubleNumber);
        System.out.println("Floating point: "+ MyLongNumber);
        System.out.println("Floating point: "+ myByteNumber);
        
        //Boolean
        /*
        boolean data type which can only take the values true or false;
         */
        boolean isjavafun = true;
        boolean isfalsestate = false;

        System.out.println(isjavafun);
        System.out.println(isfalsestate);

        // Characters
        /*
        char data type is to store a single character. The character must be surrounded by the single quotes
         */
        char grade = 'A';
        System.out.println("Grade character: "+grade);

        //String
        String greeting ="Good Morning";
        System.out.println("String: "+greeting);
    }
}
