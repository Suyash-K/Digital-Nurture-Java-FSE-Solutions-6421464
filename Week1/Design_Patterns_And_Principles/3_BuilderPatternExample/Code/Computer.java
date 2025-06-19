public class Computer {
    private final String CPU;
    private final String RAM;

    private final int storage;      
    private final boolean graphicsCardEnabled;
    private final String powerSupply;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCardEnabled = builder.graphicsCardEnabled;
        this.powerSupply = builder.powerSupply;
    }

    @Override
    public String toString() {
        return "Computer specs:" +
               " CPU=" + CPU +
               ", RAM=" + RAM +
               ", Storage=" + storage + "GB" +
               ", Graphics=" + graphicsCardEnabled +
               ", PSU=" + powerSupply;
    }

    public static class Builder {
        private final String CPU;
        private final String RAM;

        private int storage = 256;
        private boolean graphicsCardEnabled = false;
        private String powerSupply = "400W";

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder storage(int gb) {
            this.storage = gb;
            return this;
        }

        public Builder enableGraphicsCard(boolean flag) {
            this.graphicsCardEnabled = flag;
            return this;
        }

        public Builder powerSupply(String psu) {
            this.powerSupply = psu;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
