 class Student
{
    public static void main(String args[])
    {
        int marks=75;
        if(marks<=75)
        {
            System.out.println("You got Distinction");
        }
        else if(marks<=65)
        {
            System.out.println("You got first class");
        }
        else if(marks<=55){
            System.out.println("You got second class");
        }
        else if(marks<=45)
        {
            System.out.println("You got third class");
        }
        else if(marks<40)
        {
            System.out.println("You are pass only");
        }
        else
        {
            System.out.println("You are fail");
        }

    }
}