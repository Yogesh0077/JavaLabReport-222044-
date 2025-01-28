package labtwo;

import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {

//        singleTryCatch();
//        nestedTryCatch();
        try {
            validateAge(0);
        } catch (IOException e) {

            throw new RuntimeException(e);
        }
        System.out.println("rest of the code");
    }

    static void singleTryCatch(){
        //try block containing exception prone code
        try{
            System.out.println("try Block:: Begin");
            int[] myArray=new int[5];
//            System.out.println("Array element 10 : " + myArray[10]);
            myArray[5]=10/0;
        }
        //multiple catch blocks
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception :: Divide by zero!!");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds :: Accessed index out of bounds");
        }
        catch(Exception e)
        {
            System.out.println("Exception :: " + e.getMessage ());
        }finally {
            System.out.println("Finally block");
        }
    }

    static void nestedTryCatch(){
        //Main try block
        try{
            //try block1
            try{
                System.out.println("Try Block1");
                int num =15/0;
                System.out.println(num);
            }
            catch(ArithmeticException e1){
                System.out.println("Block1 Exception: e1");
            }
            //try block2
            try{
                System.out.println("Try Block2");
                int num =100/0;
                System.out.println(num);
            }
            catch(ArrayIndexOutOfBoundsException e2){
                System.out.println("Block2 Exception: e2");
            }
            System.out.println("General statement after Block1 and Block2");
        }
        catch(ArithmeticException e3){
            System.out.println("Main Block Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e4){
            System.out.println("Main Block ArrayIndexOutOfBoundsException");
        }
        catch(Exception e5){
            System.out.println("Main Block General Exception");
        }
    }

    static void validateAge(int age) throws IOException {
        if(age == 0){
            throw new IOException("IO exception");
        }
        if(age < 18){
            throw new ArithmeticException("Not eligible to vote and drive");
        }else{
            System.out.println("Eligible to vote and drive");
        }

    }
}
