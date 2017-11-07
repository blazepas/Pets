package pl.blazej.szczypka.pets;

public class Park extends Cat {


    public static void main(String[] args) {
        int petToy = 2;
        if (petToy==0){
            System.out.println("You do not have toys for your pet, shame you! \n");
            petToy++;
        } else if (petToy==1){
            System.out.println("You have only one toy for your pet \n");
        } else if (petToy>=2){
            System.out.printf("You have %d toys for your pet, you love your pet. \n", petToy);
        }

        Dog speedy = new Dog();
        Cat tofik = new Cat("Tofik", "grey", 8.7);
        System.out.println(tofik);
        tofik.setpetName("Lucy");
        System.out.println("Name changed on: " + tofik.getpetName());
        System.out.println("Say hello Lucy!");
        tofik.setWeight(4.9);
        System.out.println("New weight: " + tofik.getWeight());
        if (tofik.weight < 9) {
            double r = tofik.weight;
            System.out.println("Feed the cat");
            for (; tofik.weight < 9; tofik.weight += 0.4) {
            }
        } else {
            System.out.println("Kitty is not hungry anymore and sleeping well");
        }
        System.out.println("Kitty is not hungry anymore and sleeps well. \nActuall weight is : " + tofik.getWeight());

        tofik.method(23, 7);

        //Cat.method(6,7);

        //int x = tofik.inputKeybord.nextInt();
        //int y = tofik.inputKeybord.nextInt();

//        Animals anim = new Animals(){ //jakim sposobem działa klasa Abstract, przecież nie powinna!
//            int z = b; // takim że utworzono ciało klasy zawieszonej w powietrzu
//            @Override
//            void metoda() {
//                System.out.println(super.metoda());
//            }
//        };

    }
        Animals animals = new Animals() {

        };
}