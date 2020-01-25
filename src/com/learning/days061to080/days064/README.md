Car Problem (Polymorphism)
--

#### Problem statement:

- Create a base class **Car**
- It should have few fields that would be appropriate for a generic **car** class.
- **engine**, **cylinder**, **wheels** etc.
- constructor should initialize **cylinders** (number of) and **name**, and set **wheels to 4**.
- and **engine to true**. **Cylinder** and **names** would be passed parameters.
- Create appropriate getters
- create some methods like **startEngine**, **accelerate**, and **brake**
- show a message for each in base class
- Now create **3 sub class** for your favorite **vehicle**.
- Override the appropriate methods to demonstrate polymorphism in use. 

#### Solution:
**Car.java**
```java
package com.learning.days061to080.days064;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;

        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {
        System.out.println( getClass().getSimpleName() + ".startEngine() :: starting engine.");
    }

    public void accelerate() {
        System.out.println(getClass().getSimpleName() + ".accelerate() :: car is accelerating.");
    }

    public void brake() {
        System.out.println(getClass().getSimpleName() + ".brake() :: brake is applied, car is stopping.");
    }
}
```

**Mitsubishi.java**
```java
package com.learning.days061to080.days064;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + ".startEngine() :: starting engine.");
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().getSimpleName() + ".accelerate() :: car is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName() + ".brake() :: brake is applied, car is stopping.");
    }
}
```

**Ford.java**
```java
package com.learning.days061to080.days064;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + ".startEngine() :: starting engine.");
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().getSimpleName() + ".accelerate() :: car is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName() + ".brake() :: brake is applied, car is stopping.");
    }
}
```

**Holden.java**
```java
package com.learning.days061to080.days064;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + ".startEngine() :: starting engine.");
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().getSimpleName() + ".accelerate() :: car is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName() + ".brake() :: brake is applied, car is stopping.");
    }
}
```

**CarDriver.java**
```java
package com.learning.days061to080.days064;

public class CarDriver {
    public static void main(String[] args) {

        Car car = new Car(8, "Base Car");
        car.startEngine();
        car.accelerate();
        car.brake();

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRW 4WD");
        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();

        Ford ford = new Ford(6, "Ford Nissan");
        ford.startEngine();
        ford.accelerate();
        ford.brake();

        Holden holden = new Holden(6, "Holden Commodore");
        holden.startEngine();
        holden.accelerate();
        holden.brake();
    }
}
```

#### Explanation:

- Code is self explanatory.
- **Polymorphism** is same name but different behaviour.
- In the above example `statEngine` method is same in base and sub class but when we called that method it is behaving different.

#### Output
 ```
Car.startEngine() :: starting engine.
Car.accelerate() :: car is accelerating.
Car.brake() :: brake is applied, car is stopping.
Mitsubishi.startEngine() :: starting engine.
Mitsubishi.accelerate() :: car is accelerating.
Mitsubishi.brake() :: brake is applied, car is stopping.
Ford.startEngine() :: starting engine.
Ford.accelerate() :: car is accelerating.
Ford.brake() :: brake is applied, car is stopping.
Holden.startEngine() :: starting engine.
Holden.accelerate() :: car is accelerating.
Holden.brake() :: brake is applied, car is stopping.
```