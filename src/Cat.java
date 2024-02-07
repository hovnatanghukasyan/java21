public class Cat extends AnimalNew implements Cloneable {

    int age;
    int weight = 1;
    @Override
    void makeSound() {
        System.out.println("myau");
    }

    @Override
    public int hashCode() {
        return age * weight;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return hashCode() == cat.hashCode();
    }

    public Cat getCat(){
        try {
            return (Cat) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
