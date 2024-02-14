package edu;
//validador de formato numerico del dni.

    public class DniValidator implements DniValidatorInterface {

        private static final String DNI_REGEX = "^\\d+$";
        // {\\d+}digito entre 0-9 que se pueden repetir
        @Override
        public boolean isValidFormat(long dniNumber) {
            return dniNumber >= 0 && String.valueOf(dniNumber).matches(DNI_REGEX);
        }
    }

