package seedu.connoisseur.recommendation;

public class Recommendation {
    protected String title;
    protected String category;
    protected int priceLow;
    protected int priceHigh;
    protected String recommendedBy;
    protected static int MAX_RANGE_OF_PRICE = 5;

    /**
     * Creates a recommendation.
     *
     * @param inputTitle        title of the recommendation
     * @param inputCategory     category of the recommendation
     * @param inputPriceLow     price of the recommendation
     * @param inputPriceHigh    price of the recommendation
     * @param inputBy           description of the recommended person
     */
    public Recommendation(String inputTitle, String inputCategory, 
            int inputPriceLow, int inputPriceHigh, String inputBy) {
        this.title = inputTitle;
        this.category = inputCategory;
        this.priceLow = inputPriceLow;
        this.priceHigh = inputPriceHigh;
        this.recommendedBy = inputBy;
    }

    /**
     * Gets the title of the recommendation.
     *
     * @return title of recommendation
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the recommendation.
     *
     * @param newTitle new title to be set
     */
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    /**
     * Gets the category of the recommendation.
     *
     * @return category of the recommendation as a string
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the category of the recommendation.
     *
     * @param newCategory new category of recommendation
     */
    public void setCategory(String newCategory) {
        this.category = newCategory;
    }

    /**
     * Gets the lower bound price of the recommendation.
     *
     * @return lower bound price of the recommendation as an double
     */
    public int getPriceLow() {
        return priceLow;
    }

    /**
     * Gets the higher bound price of the recommendation.
     *
     * @return higher bound price of the recommendation as an double
     */
    public int getPriceHigh() {
        return priceHigh;
    }

    /**
     * Gets the description that recommended the area.
     *
     * @return recommended by description as a string
     */
    public String getRecommendedBy() {
        return recommendedBy;
    }

    /**
     * Sets the description that recommended the area.
     *
     * @param newBy new description to be set
     */
    public void setDescription(String newBy) {
        this.recommendedBy = newBy;
    }

    /**
     * Converts the price to visual form.
     *
     * @return pricing range of the experience as a string
     */
    public String dollarRange() {
        String dollarRange = Integer.toString(priceLow) + " - " + Integer.toString(priceHigh);
        return dollarRange;
    }
}
