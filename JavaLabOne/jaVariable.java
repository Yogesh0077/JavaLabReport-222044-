package Lab1;

public class jaVariable {
    public static void main(String[] args) {
        //Variable declaration consist of datatype and variable name
        int myAge; //int datatype and variable name myage
        String myName; // string datatype
        boolean isTired; // boolean datatype
        // variable with initial value
        int mySize, numShoes=50;
        // declare multiple variable name with same type
        String firstName, lastName;
        firstName="Yogesh";
        lastName="Shrestha";
        //String concatenation
        String fullName=firstName.concat(lastName);
        System.out.println("Fullname: "+fullName);

        int x=5, y=6;
        //Addition of variable type
        System.out.println("Addition of x and y : "+(x+y));
        //Assign one variable to another
        y=x;
        System.out.println("After assing x value to y : "+(y+x));
        //Descriptive variable name - GOOD
        int minutesPerHour=60;
        //Short variable name - OK but not so easy to understand
        int m=60;

        //Real Example
        String studentName = "Yogesh Shrestha";
        int studentId = 44;
        int studentAge = 20;
        String studentAddress = "KTM";

        //Area of rectangle
        double length = 4.5;
        double width = 10.2;
        JavaVariable javaVariable = new JavaVariable();
        double area = javaVariable.areaOfRectangle(length,width);
        System.out.println("Area of rectangle: "+ area);
    }
}
