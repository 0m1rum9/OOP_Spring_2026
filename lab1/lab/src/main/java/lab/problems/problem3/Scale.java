package lab.problems.problem3;

public enum Scale {
    Celcius('C'),
    Fahrenheit('F');
    private char charForScale;
    Scale(char charForScale) {
        this.charForScale = charForScale;
    }
    public char getCharForScale() {
        return charForScale;
    }
}
