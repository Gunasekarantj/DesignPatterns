package DesignPatterns.CreationalPattern.AbstractFactoryPattern;

/**
 * The type Sbi.
 */
public class SBI implements Bank {
    private final String BNAME;

    /**
     * Instantiates a new Sbi.
     */
    public SBI() {
        BNAME = "SBI BANK";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
