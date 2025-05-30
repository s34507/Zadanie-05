abstract class Animal {
    abstract void makeNoise();
    abstract void sleep();
    abstract void roam();
}

class Felidae extends Animal {
    @Override
    void roam() {
        System.out.println("Przemiszcza się solo.");
    }
}

class Canidae extends Animal {
    @Override
    void roam() {
        System.out.println("Porusza się w grupie.");
    }
}

class Lion extends Animal {
    @Override
    void makeNoise() {
        System.out.println("Ryczy");
    }
}
class Tigers extends Animal {
    @Override
    void makeNoise() {
        System.out.println("Warczy");
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
class Fox extends Animal {
    @Override
    void makeNoise() {
        System.out.println("Krzyczy");
    }
}