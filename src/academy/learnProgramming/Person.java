package academy.learnProgramming;

/**
 * Created by balajakka on 05/10/2018.
 */
public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){

        this.firstName = firstName;

    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
}