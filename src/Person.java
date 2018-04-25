public class Person {
    private String name;
    private int age;
    private float wage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    public Person(String name, int age, float wage) {
        this.name = name;
        this.age = age;
        this.wage = wage;
    }
}
