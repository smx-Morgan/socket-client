public class Student_test {
    public static void main(String[] args) {
        Student student = new Student(10);
        student.num();
        Cat cat1 = new Cat();
        cat1.age = 5;
        cat1.name = "guaiguai";
        cat1.run();
    }
}
 class Cat {
    public String name;
    public int age;
    public void run(){
        String name = "daidai";
        int age = 3;
        System.out.println("这是："+this.name+" g"+this.age+" 岁了");

    }
}

