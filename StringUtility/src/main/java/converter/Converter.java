package converter;

public class Converter {
    public String convertReverse(String str) {
        return new StringBuilder().append(str).reverse().toString();
    }

    public String convertCapitalize(String str) {
        return str.toUpperCase();
    }

    public String convertLowercase(String str) {
        return str.toLowerCase();
    }
}
