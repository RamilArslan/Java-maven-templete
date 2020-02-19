package app;

class Dog {
    private String name;

    public Dog(){

    }
    Dog(String name) {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void respond() {
        System.out.println("I am a dog. " + "My name is "  + name );
    }
    @Override
    public String toString() {
        return "Dog{" +
                " name= " + name;
    }

}

