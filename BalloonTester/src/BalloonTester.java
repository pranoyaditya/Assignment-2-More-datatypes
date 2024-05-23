public class BalloonTester {
    
    public static void main(String args[])
    {
        Balloon balloon = new Balloon();

        // Adds 100 cm^3 air.
        balloon.addAir(100);
        System.out.printf("\nCurrent volume: %.2f\n",balloon.getVolume());
        System.out.printf("Current Surface Area: %.2f\n",balloon.getSurfaceArea());
        System.out.printf("Current radius: %.2f\n",balloon.getRadius());


        // Adds again 100 cm^3 air.

        System.out.println("\nAfter addding another 100 cm^3 of air.");
        balloon.addAir(100);
        System.out.printf("\nCurrent volume: %.2f\n",balloon.getVolume());
        System.out.printf("Current Surface Area: %.2f\n",balloon.getSurfaceArea());
        System.out.printf("Current radius: %.2f\n",balloon.getRadius());

    }
}
