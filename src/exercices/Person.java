package exercices;

public class Person {

    // TODO 1. Add the following private attributes :
    // - name (String)
    // - age (int)
    // - wilder (boolean)
    String name;
    int age;
    boolean wilder;


    // TODO 2. Add a Constructor with name and age arguments (in this order)
    // This constructor must initialize name and age attributes
    Object Persona(String name, int age){
        this.name = name;
        this.age = age;
    }

    // TODO 3. Add getter method for name attribute

    public static String getName(){
        return this.name;
    }


    // TODO 4. Add setter method for name attribute


    public static Void setName(String param_name){
        this.name = param_name;
    }

    // TODO 5. Add getter method for age attribute

    public static int getAge(){
        return this.age;
    }



    // TODO 6. Add setter method for age attribute

    public static Void setAge(int param_age){
        this.age = param_age;
    }

    // TODO 7. Add getter method for wilder attribute

    public static boolean getWilder(){
        return this.wilder;
    }

    // TODO 8. Add setter method for wilder attribute

    public static void setWilder(boolean param_wilder){
        this.wilder = param_wilder;
    }


    // TODO 9. Create a method 'whoAmI' that returns "My name is {name} and I'm {age}"
    // where you replace {name} and {age} with attributes values

    public static String whoAmI(){
        return "My name is " + this.name + " and I'm " + this.age;
    }


    // Do not remove this empty constructor !
    public Person() {
    }
}
