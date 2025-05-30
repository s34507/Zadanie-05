abstract class Animal {
    abstract void makeNoise();
    abstract void sleep();
}
class Lion extends Animal {
    @Override
    void makeNoise() {
        System.out.println("Ryczy");
    }
}
class Cat extends Animal {
    @Override
    void makeNoise() {
        System.out.println("Miauczy");
    }
}
class Wolf extends Animal {
    @Override
    void makeNoise() {
        System.out.println("Wyje");
    }
}
class Dog extends Animal {
    @Override
    void makeNoise() {
        System.out.println("Szczeka");
    }
}