# Work_with_SOLID

## Create an abstract class Airplane that will have methods:

- StartingEngines(), which will display how much time is left until ready to fly, where time is generated randomly in the range from [20,88].

- Takeoff() of the Plane which will deduce how many kilometers the plane will pass on a full tank of fuel. We generate random fractional number from zero to 1000

- Landing() of the Plane, which will display that the plane is landing.

Describe the dimensions of the aircraft in the fields of this class. (Length, width, weight,)

## Create class Aircraft Control. In the Aircraft Control class, create methods:

- moveUp(); - moveDown(); - moveLeft(); - moveRight().

When calling these methods, it is necessary to implement a random generation of a number that will represent the distance by which the ship will move.

## Create an Interface in which to describe the special features of the aircraft:

- TurboAcceleration(); - StealthTechnology(); - NuclearStrike().

## Create class Su-27. It is necessary to implement the connection between these classes so that the Su-27 had the opportunity to work with fields and methods of other classes. That is, imitation, composition, delegation.

It is necessary to redefine the interface methods in the Su-27 class to:

- Turbo Acceleration displays the speed that will be randomly generated and should be greater than the maximum speed of the Su-27 aircraft.
- The Stealth Technology method displayed on the screen that the aircraft is not visible for a randomly generated number.
- Nuclear Strike displayed a random number of nuclear warheads that will be dropped, but not more than 10.

Describe the fields: maximum speed, color, which to pass to the designer with the parameters.

## Create a Maine class, where to create a Main method, create a Su-27 object in it. And now we simulate the flight of an airplane.

A) Start the aircraft engines

B) Take off the plane

C) Move up, left, down, right

D) Turn on stealth technology

E) Conduct a nuclear strike

F) Turn on the turbo acceleration and run away

G) We land the plane
