package pl.blazej.szczypka.pets;

public class Park extends Cat{


    public static void main(String[] args) {
        Dog speedy = new Dog();
        Cat tofik = new Cat("Tofik", "grey", 8.7);
        System.out.println(tofik);
        tofik.setpetName("Lucy");
        System.out.println("Name changed on: " + tofik.getpetName());
        System.out.println("Say hello Lucy!");
        tofik.setWeight(4.9);
        System.out.println("New weight: " + tofik.getWeight());
        if(tofik.weight<9) {
            double r = tofik.weight;
            System.out.println("Feed the cat");
            for (; tofik.weight < 9; tofik.weight += 0.4){
            }
        }
        else{
            System.out.println("Kitty is not hungry anymore and sleeping well");
        }
        System.out.println("Kitty is not hungry anymore and sleeps well. Actuall weight is : " + tofik.getWeight());

        tofik.method(23,7);


        //Cat.method(6,7);

        //int x = tofik.inputKeybord.nextInt();
        //int y = tofik.inputKeybord.nextInt();

        /*Animals anim = new Animals(){ //jakim sposobem działa klasa Abstract, przecież nie powinna!
            int z = b;
            @Override
            void metoda() {
                System.out.println(super.metoda());
            }*/
        };

    }

