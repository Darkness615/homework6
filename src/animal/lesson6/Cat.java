package animal.lesson6;

import javax.naming.Name;


public class Cat extends Animal
{
    private String Name;


    public Cat(String Name)
    {
        super(200, 0);
        this.Name=Name;
    }



    @Override
    public void swim(int distance)
    {
        System.out.println(String.format("Cat %s no swimming ",Name));

    }


    @Override
    public void run(int distance)
    {
        if(distance<=getMaxRundistance()) {
            System.out.println(String.format("Cat %s is running ", Name) + distance);
        }
        else
        {
            System.out.println(String.format("Cat %s no running more than:  ",Name) + getMaxRundistance());
        }
    }
}
