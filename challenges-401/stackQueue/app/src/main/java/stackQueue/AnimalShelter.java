package stackQueue;

public class AnimalShelter {

    Queue<Animal> dog=new Queue<>();
    Queue<Animal> cat=new Queue<>();
    Queue<Animal> otherAnimals=new Queue<>();

    public void enqueue(Animal animal){

        if(animal instanceof Dog){
            dog.Enqueue(animal);

        }
        else if(animal instanceof Cat){
            cat.Enqueue(animal);
        }
        else{
            otherAnimals.Enqueue(animal);
        }


    }

    public String dequeue(String pref){

        if(pref=="dog"){
            if(this.dog.isEmpty()) {
                this.dog.Dequeue();
            }
        }else if(pref=="cat"){
            if (this.cat.isEmpty()) {
                this.cat.Dequeue();
            }
        }else{
            return null;
        }
        return pref;

    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "dog=" + dog +
                ", cat=" + cat +
                ", otherAnimals=" + otherAnimals +
                '}';
    }
}
