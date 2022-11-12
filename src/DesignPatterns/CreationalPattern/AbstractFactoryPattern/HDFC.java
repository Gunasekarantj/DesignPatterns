package DesignPatterns.CreationalPattern.AbstractFactoryPattern;

/**
 * The type Hdfc.
 */
public class HDFC implements Bank {
    private final String BNAME;

    /**
     * Instantiates a new Hdfc.
     */
    public HDFC() {
        BNAME = "HDFC BANK";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
