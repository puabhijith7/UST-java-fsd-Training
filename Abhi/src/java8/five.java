package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
//square list of numbers and filter out numbers greater than 100 and then find avg

 

public class five {
    public static void main(String[] args) {
        List <Integer> list =new ArrayList();
        Integer[] arr = new Integer[] { 100, 100, 9, 8, 200 };
        list = Arrays.asList(arr);
       
  
    
        OptionalDouble avg = list.stream().mapToInt(i -> i * i).filter(n -> n > 100).average();
         
       
         
        if (avg.isPresent())
            System.out.println(avg.getAsDouble());
    }
}