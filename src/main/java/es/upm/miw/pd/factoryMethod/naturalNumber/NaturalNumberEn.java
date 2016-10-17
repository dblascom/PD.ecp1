package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEn extends NaturalNumber {
    
        private int value;

        private static final String[] textValue = {"zero", "one", "two", "three", "four", "five"};

        public NaturalNumberEn(int value) {
            super(value);
        }

        public String getTextValue() {
          
                return NaturalNumberEn.textValue[this.value];
         
        }
    }
