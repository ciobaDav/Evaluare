package edu.step.conversion;

public class CurrencyConverter {
    private double exchangeRate;

    public CurrencyConverter(double exchangeRate) {
        setExchangeRate(exchangeRate);
    }

    // Metoda pentru setarea rata de conversie
    public void setExchangeRate(double exchangeRate) {
        if (exchangeRate <= 0) {
            System.out.println("Rata de schimb trebuie să fie mai mare decât zero.");
        } else {
            this.exchangeRate = exchangeRate;
            System.out.println("Rata de schimb a fost actualizată cu succes.");
        }
    }

    // Metoda pentru a calcula suma echivalentă în EUR pentru o sumă dată în MDL
    public double convertToEUR(double amountInMDL) {
        if (amountInMDL < 0) {
            System.out.println("Suma introdusă trebuie să fie mai mare sau egală cu zero.");
            return -1;
        }
        return amountInMDL / exchangeRate;
    }

    // Metoda pentru a calcula suma echivalentă în MDL pentru o sumă dată în EUR
    public double convertToMDL(double amountInEUR) {
        if (amountInEUR < 0) {
            System.out.println("Suma introdusă trebuie să fie mai mare sau egală cu zero.");
            return -1;
        }
        return amountInEUR * exchangeRate;
    }

    public static void main(String[] args) {

        CurrencyConverter converter = new CurrencyConverter(19.8);

        // Testarea conversiei
        System.out.println("100 MDL echivalent în EUR: " + converter.convertToEUR(100));
        System.out.println("100 EUR echivalent în MDL: " + converter.convertToMDL(100));

        // Actualizarea ratei de schimb și testarea conversiei cu noua rată
        converter.setExchangeRate(20.0);
        System.out.println("100 MDL echivalent în EUR (după actualizarea ratei de schimb): " + converter.convertToEUR(100));
        System.out.println("100 EUR echivalent în MDL (după actualizarea ratei de schimb): " + converter.convertToMDL(100));
    }
}



