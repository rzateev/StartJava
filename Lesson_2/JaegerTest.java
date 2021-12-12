public class JaegerTest { 
    public static void main(String[] args) {
        Jaeger jaegerStrikerEureka = new Jaeger();
        jaegerStrikerEureka.setModelName("Striker Eureka");
        jaegerStrikerEureka.setMark("Mark-5");
        jaegerStrikerEureka.setOrigin("Australia");
        jaegerStrikerEureka.setStatus("Destroyed");
        jaegerStrikerEureka.setSpeed(10);
        jaegerStrikerEureka.setWeapons("Assault Mount 3.25 Sting-Blades, WMB2x90 AKM Chest launcher");
        
        jaegerStrikerEureka.printInfo();
        jaegerStrikerEureka.move();
        jaegerStrikerEureka.scanKaiju();
        jaegerStrikerEureka.useVortexCannon();

        Jaeger jaegerGipsyDanger = new Jaeger();
        jaegerGipsyDanger.setModelName("Gipsy Danger");
        jaegerGipsyDanger.setMark("Mark-3");
        jaegerGipsyDanger.setOrigin("United States of America");
        jaegerGipsyDanger.setStatus("Destroyed");
        jaegerGipsyDanger.setSpeed(7);
        jaegerGipsyDanger.setWeapons("I-19 Plasmacaster (Plasma Cannon)[1] GD6 Chain Sword[1]");
        
        jaegerGipsyDanger.printInfo();
        jaegerGipsyDanger.move();
        jaegerGipsyDanger.scanKaiju();
        jaegerGipsyDanger.useVortexCannon();
    }
}