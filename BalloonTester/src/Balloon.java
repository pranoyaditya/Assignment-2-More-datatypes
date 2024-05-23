public class Balloon {
    
    private double volume;

    // constructor
    public Balloon()
    {
        this.volume = 0.00;
    }

    // adds the given amount of air.
    public void addAir(double amount)
    {
        this.volume = this.volume + amount;
    }

    // returns the current volume.
    public double getVolume()
    {
        return this.volume;
    }

    // returns the current surface area of the ballon. Formula = 4*pi*r^2.
    public double getSurfaceArea()
    {
        double radius = getRadius();

        return 4*Math.PI*Math.pow(radius, 2.0);
    }

    // returns the current radius.
    public double getRadius()
    {
        // Volume of a sphere: V = (4/3) * π * r^3
        // Solve for r: r = (3V / 4π)^(1/3)

        return Math.cbrt((3*this.volume)/(4*Math.PI));
    }

}
