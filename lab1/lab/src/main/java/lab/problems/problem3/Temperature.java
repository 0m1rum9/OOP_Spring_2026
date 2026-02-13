
package lab.problems.problem3;

/**
 * Temperature
 */
public class Temperature {
    private double value;
    private Scale scale;
    public Temperature(Scale scale) {
        this(0, scale);
    }
    public Temperature(double value) {
        this(value, Scale.Celcius);
    }
    public Temperature(double value, Scale scale) {
        this.value = value;
        this.scale = scale;
    }
    public Temperature() {
        this(0, Scale.Celcius);
    }
    public void setScale(Scale scale) {
        this.scale = scale;
    }
    public void setValue(double value) {
        this.value = value;
    }
    public void setScanelAndValue(Scale scale, double value) {
        this.setScale(scale);
        this.setValue(value);
    }
    public Scale getScale() {
        return this.scale;
    }
    public String getFahrenheit() {
        if(scale == Scale.Fahrenheit){
            return String.format("%f%c", value, scale.getCharForScale());
        }
        return String.format("%f%c", 9 * (value / 5) + 32, Scale.Fahrenheit.getCharForScale());
    }
    public String getCelcius() {
        if(scale == Scale.Celcius) {
            return String.format("%f%c", value, scale.getCharForScale());
        }
        return String.format("%f%s", (5 * (value  - 32)) / 9, Scale.Celcius.getCharForScale());
    }
    
}
