/**
 * Created by Алла on 25.08.2018.
 */
public class Human {
    private static int countId=1;
    private int age;
    private String name;
    private double growth;
    private int id;

    public Human(){
        this.id = countId++;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getGrowth() {
        return growth;
    }

    public int getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrowth(double growth) {
        this.growth = growth;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", growth=" + growth +
                ", id=" + id +
                '}';
    }
}
