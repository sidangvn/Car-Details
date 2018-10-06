# Car-Details


Class Exercise:
Car class (40 pts) – Car.java
Car Driver (20 pts) – CarTest.java
Please make sure to include your pledge in each code
The deadline for this code is April. 9th 11:59 pm
Class Exercise

Write a class called Car that contains instance data that represents the make, model, and year of the car. Define constructors to initialize these values. Include accessor(getter) and mutator(setter) methods for all instance data, and a toString method that returns the data of the car. Create a driver class called CarTest, whose main method instantiates and updates several Car objects.

In the Car Class, you will need:

Three private members to store data for the make model and year
Two constructors:
The first constructor should not accept any values during instantiation (This constructor can initialize the members to an ‘empty string or dash - i.e. “ - “ - or 0).
The second constructor should accept three values for the members during instantiation.
Accessors and Mutators for each private member of the class
A toString method to output the information on each car
 

In the CarTest driver, you will need:

At three Car objects:
Two of the three objects can be initialized with hardcoded data
One should be initialized with the constructor that accepts no parameters
A Scanner Object to read get information on the third car
Local variables to store information on the third car (and pass it on to the object’s private members)
To test the accessors and mutators you made:
You must use at least one accessor method from the first two Car objects
You must use the mutator to update at least one characteristic from the first two Car objects
 

Here is some sample output: (Note: your output does not have to follow the same narrative. You can be as creative as you want in order to test the class and objects.)

Here is the information I have on Mr. Smith's three cars: 
2015     Ford     Taurus
2007     Honda   Accord
0     -     -

Whoops! It seems we do not have the info on one of his cars!
Enter the information for the third car here: 
Make: Hyundai
Model: Elantra
Year: 2014
Mr. Smith traded the Taurus for another Ford from the same year.
Enter the new Ford model: Explorer
Mr. Smith sold the 2007 Accord to buy a more current version.
Enter the new year for the Accord: 2017

Here is the updated information I now have on Mr. Smith's three cars: 
2015     Ford     Explorer
2017     Honda   Accord
2014     Hyundai     Elantra
