package org.example;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args)
    {
        int[] inputString = {1,2,3,4,5};

        for(int i = 0; i< inputString.length; i++){
            if (inputString[i] % 2 != 0){
                continue;
            }

                System.out.println(inputString[i]);



        }
    }

}
