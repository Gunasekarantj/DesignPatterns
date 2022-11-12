package DesignPatterns.CreationalPattern.AbstractFactoryPattern;

/**
 * The type Icici.
 */
public class ICICI implements Bank {
    private final String BNAME;

    /**
     * Instantiates a new Icici.
     */
    public ICICI() {
        BNAME = "ICICI BANK";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
