package week9.DebuggingExercisesChapter12;
// This class determines the logarithm of a number
public class FixDebugTwelve1
{
    public static void main(String[] args) throws ArithmeticException
    {
        double num = -8.8, result;
        try
        {
            if(num <= 0)
                throw(new ArithmeticException());
            result = Math.log(num);
            System.out.println("Result is " + result);
        }
        catch(Exception e)
        {
            System.out.println("Error code: " + e.toString());
            System.out.println("Can't take logarithm for value of zero or lower");
            result = Math.log(-num);
            System.out.println("Converting the value to be positive, the result is: " + result);
        }
    }
}