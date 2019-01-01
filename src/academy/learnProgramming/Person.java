package academy.learnProgramming;

/**
 * Created by balajakka on 05/10/2018.
 */
public class Person {

    String firstName;
    private String lastName;
    private int age;



    public void setFirstName(String firstName){

        this.firstName = firstName;

    }
    public void setLastName(String lastName){

        this.lastName = lastName;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
}