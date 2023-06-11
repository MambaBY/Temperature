public class CelsiusToKelvin implements Converter{
    @Override
    public double converter(double a) {
        return a + 273.15;
    }
}
