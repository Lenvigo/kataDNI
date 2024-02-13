package edu;

public class DniCalculator {
    private final DniValidator validator;
    public DniCalculator(){
         this.validator= new DniValidator();
     }
    public DniCalculator(DniValidator validator) {
         this.validator = validator;
    }

    public char calculateLetter(int dniNumber) {
        if(!validator.isValidFormat(dniNumber)){
           throw new IllegalArgumentException("Invalid DNI format: " + dniNumber);
        }

        int remainder = dniNumber % 23;
        char[] letters = "TRWAGMYFPDXBNJZSQVHLCKE".toCharArray();
        return letters[remainder];
    }
}
