class Person
{
  private String name,city;
  public Person(String name,String city)
  {
      this.name=name;
      this.city=city;
  }
  public Person(String name)
  {
      this(name,"Unknown");
  }
  public void showData()
  {
      System.out.println("Name is "+name);
      System.out.println("City is "+city);
  }
}
class demo
{
  public static void main(String args[])
  {
      Person a=new Person("Nitin","Nagpur");
      a.showData();
      Person b=new Person("Amit");
      b.showData();
  }
}