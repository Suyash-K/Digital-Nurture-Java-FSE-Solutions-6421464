public class BuilderDemo {
    public static void main(String[] args) {
        Computer basicPC = new Computer.Builder("Intel i5", "8GB").build();
        System.out.println(basicPC);

        Computer gamingPC = new Computer.Builder("AMD Ryzen 9", "32GB")
                                        .storage(1024)
                                        .enableGraphicsCard(true)
                                        .powerSupply("750W")
                                        .build();
        System.out.println(gamingPC);
    }
}