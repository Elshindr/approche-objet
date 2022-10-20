package fr.diginamic.liste;

/**
 * The enum Continent.
 */
public enum Continent {
    /**
     * Afrique continent.
     */
    AFRIQUE("Afrique"),
    /**
     * Amerique continent.
     */
    AMERIQUE("Amérique"),
    /**
     * Antartique continent.
     */
    ASIE("Asie"),
    /**
     * Euasie continent.
     */
    EUROPE("Europe"),
    /**
     * Oceanie continent.
     */
    OCEANIE("Océanie");

    /**
     * The Name.
     */
    private String name;

     Continent(String name) {
        this.name = name;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }
}
