class Calculator {
    
    // add two integers
    int add (int a , int b) {
        return a + b ;
    }
    
    // multiply two integers
    int multiply (int a , int b) {
        return a * b;
    }
    
    // square a number
    int square (int a) {
         return a * a;
    }

public static void main(String[] args){
    
    Calculator cal = new Calculator();
   
   // Expression 1: (3*4 + 5*7)^2
   int part1 = cal.multiply(3 , 4);    //3 *4
   int part2 = cal.multiply(5 , 7);    //5 *7
   int sum   = cal.add(part1 , part2);
   int result1 = cal.square(sum);
   
   System.out.println("Result 1: "+ result1);
   
   // Expression 2: (4+7)^2 + (8+3)^2  
   int sum2 = cal.add(4, 7);
   int square1 = cal.square(sum2);
   int sum3 = cal.add(8, 3);
   int square2 = cal.square(sum3);
   int result2 = cal.add(square1, square2);
   
   System.out.println("Result 2: "+ result2);
}
}