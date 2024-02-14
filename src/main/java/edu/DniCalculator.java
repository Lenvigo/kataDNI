package edu;

//calculo de dni completo. Una vez validado el formato numerico, encuentra la letra corespondiente.
public class DniCalculator implements DniCalculatorInterface {

        private final DniValidator validator;
        private final LetterTable letterTable;


        public DniCalculator(DniValidator validator, LetterTable letterTable) {
                this.validator = validator;
                this.letterTable = letterTable;
        }


        public Dni calculateDni(long dniNumber) {
                if (!validator.isValidFormat(dniNumber)) {
                        return null;
                }

                int remainder = (int) (dniNumber % 23);
                char letter = letterTable.getLetter(remainder);
                return new Dni(dniNumber, letter);
        }
}

