Vehicle Problem
--

#### Problem statement:

- Start with a base class of **Vehicle**, then creat a **Car** class that **inherit** from this base class.
- Finally, create another class, a **specific type of Car** that inherits from Car class.
- You should be able to **hand steering**, **changing gears**, and **moving** (**speed** in other words).
- You will want to decide where to put the appropriate state and behaviours (fields and methods).
- As mentioned above **changing gears**, **increasing/decreasing speed **should be included.
- For you specific type of vehicle you will want to add something specific for that type of car.

#### Solution:
**Vehicle.java**
```java
package com.learning.days041to060.days059;

public class Vehicle {

    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer() :: steering at " + this.currentDirection + " degree.");
    }

    public void move(int velocity, int direction) {
        this.currentVelocity = velocity;
        this.currentDirection = direction;

        System.out.println("Vehicle.move() :: Moving at " + this.currentVelocity + " in " + this.currentDirection + " direction.");
    }

    public void stop() {
        this.currentVelocity = 0;
        System.out.println("Vehicle.stop() :: current velocity " + this.currentVelocity);
    }
}
```

**Car.java**
```java
package com.learning.days041to060.days059;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear() :: Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity() :: Velocity " + speed + " direction " + direction);
        super.move(speed, direction);
    }
}
```

**Outlander.java**
```java
package com.learning.days041to060.days059;

public class Outlander extends Car {

    private int roadService;

    public Outlander(int roadService) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadService = roadService;
    }

    public void accelerate(int rate) {
        int newVelocity = super.getCurrentVelocity() + rate;

        if (newVelocity == 0) {
            super.stop();
            super.changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            super.changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            super.changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            super.changeGear(3);
        } else {
            super.changeGear(4);
        }

        if (newVelocity > 0) {
            super.changeVelocity(newVelocity, super.getCurrentDirection());
        }

    }
}
```

**VehicleDriver.java**
```java
package com.learning.days041to060.days059;

public class VehicleDriver {
    public static void main(String[] args) {

        Outlander outlander = new Outlander(36);

        outlander.steer(45);

        outlander.accelerate(30);
        System.out.println();

        outlander.accelerate(20);
        System.out.println();

        outlander.accelerate(-42);
        System.out.println();
    }
}
```

#### Explanation:

- Code is self explanatory.
 
#### Output
 ```
Vehicle.steer() :: steering at 45 degree.
Car.changeGear() :: Changed to 3 gear.
Car.changeVelocity() :: Velocity 30 direction 45
Vehicle.move() :: Moving at 30 in 45 direction.

Car.changeGear() :: Changed to 4 gear.
Car.changeVelocity() :: Velocity 50 direction 45
Vehicle.move() :: Moving at 50 in 45 direction.

Car.changeGear() :: Changed to 1 gear.
Car.changeVelocity() :: Velocity 8 direction 45
Vehicle.move() :: Moving at 8 in 45 direction.
```