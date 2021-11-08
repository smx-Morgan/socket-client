public class Student {
    public String name;
    public int num;
    public int age;
    public  Student(int x){
        this.age =x;
        name = "song";
        num = (int) (Math.random()*1000);
        System.out.println("my name is "+name);
    }
    public void num(){
        System.out.println(num);
        System.out.println("my age is "+age);
    }
}