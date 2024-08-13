package org.example.e87;

public class E87ClassAndObject {
    public static void main(String[] args) {
        Car c1=new Car();
        Car c2=new Car();

        c1.carColor="Black";
        c1.carYear=2019;
        c1.carMake="BMW";

        c2.carColor="White";
        c2.carYear=2018;
        c2.carMake="Toyota";

        System.out.println("Car color is "+c1.carColor+" and car year is "+c1.carYear+" and car model is "+c1.carMake);
        System.out.println("Car color is "+c2.carColor+" and car year is "+c2.carYear+" and car model is "+c2.carMake);
        //Car color is Black and car year is 2019 and car model is BMW
        //Car color is White and car year is 2018 and car model is Toyota
        // Create a class named 'Car'

        // Declare a String variable named 'carColor'
        // Declare an integer variable named 'carYear'
        // Declare a String variable named 'carMake'

        // Create the first object of the class 'Car'

        // Assign the value "Black" to the 'carColor' variable of the first object
        // Assign the value 2019 to the 'carYear' variable of the first object
        // Assign the value "BMW" to the 'carMake' variable of the first object

        // Create the second object of the class 'Car'

        // Assign the value "White" to the 'carColor' variable of the second object
        // Assign the value 2018 to the 'carYear' variable of the second object
        // Assign the value "Toyota" to the 'carMake' variable of the second object

        // Print the values of the properties for both objects in the specified format



    }
}
