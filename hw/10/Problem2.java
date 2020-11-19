public class Problem2 {
    public static void main(String[] args) {
        Animal[] list = new Animal[5];
        list[0] = new Chicken();
        list[0].setWeight(4.5);
        list[1] = new Tiger();
        list[1].setWeight(46.6);
        list[2] = new Chicken();
        list[2].setWeight(1.5);
        list[3] = (Animal)(list[0].clone());
        list[3].setWeight(7.5);
        list[4] = (Animal)(list[1].clone());
        java.util.Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println("weight: " + list[i].getWeight());
        }
    }
}
abstract class Animal implements Comparable<Animal>, Cloneable{
    private double weight;

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public abstract String sound();

    @Override
    public Object clone(){
        try{
            return super.clone();
        }
        catch(CloneNotSupportedException ex){
            return null;
        }
    }

    @Override
    public int compareTo(Animal a){
        if (weight<a.weight){
            return -1;
        }
        else if (a.weight>weight){
            return 1;
        }
        else{
            return 0;
        }
    }

} 
class Chicken extends Animal {
    public String sound(){
        return "Chicken: cock-a-doodle-doo";
    }
}
class Tiger extends Animal {
    public String sound(){
        return "Tiger: RROOAARR";
    }
}