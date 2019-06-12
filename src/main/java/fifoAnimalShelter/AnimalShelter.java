package fifoAnimalShelter;

public class AnimalShelter {

    protected Queue cat;
    protected Queue dog;

    public AnimalShelter(){
        this.cat = new Queue();
        this.dog = new Queue();
    }

    /**
     * Adds the animal "cat" into the queue
     *
     * @param cat cat string
     */
    public void enqueueCat(Cat cat){
        this.cat.enqueue(cat);
    }

    /**
     * Adds the animal "dog" into the queue
     *
     * @param dog dog string
     */
    public void enqueueDog(Dog dog){
        this.dog.enqueue(dog);
    }

    /**
     * Removes the animal "cat" from the queue
     *
     * @param cat cat object
     * @return cat object
     */
    public Object dequeueCat(Cat cat){
        return this.cat.dequeue();
    }


    /**
     * Removes the animal "dog" from the queue
     *
     * @param dog dog object
     * @return dog object
     */
    public Object dequeueDog(Dog dog){
        return this.dog.dequeue();
    }

    /**
     * Returns null if animal pref is other than cat or dog
     *
     * @return null
     */
    public Object dequeue(){
        return null;
    }

}
