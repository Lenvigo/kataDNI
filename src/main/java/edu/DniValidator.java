package edu;

public class DniValidator {

    public boolean isValidFormat(int dniNumber) {
        String dniString = String.valueOf(dniNumber);
        // {\\d+}digito entre 0-9 que se pueden repetir
        return dniString.length() == 8 && dniString.matches("\\d+");
    }

}
