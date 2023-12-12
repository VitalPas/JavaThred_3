package ord.example.homework.first;

public enum TaxRates {
    TAX_BEFORE_MILLION(0.08, 1_000_000),
    TAX_BEFORE_TWO_MILLION(0.10, 2_000_000),
    TAX_AFTER_TWO_MILLION(0.13, Long.MAX_VALUE);

    private double taxRate;
    private long limit;

    TaxRates(double taxeRate, long limit) {
        this.taxRate = taxeRate;
        this.limit = limit;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public long getLimit() {
        return limit;
    }
}
