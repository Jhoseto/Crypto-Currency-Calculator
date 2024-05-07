package serezliev.CryptoConvertor.Model;

public class CryptoCurrencyModel {
    private String id;
    private String rank;
    private String symbol;
    private String name;
    private String supply;
    private String maxSupply;
    private String marketCapUsd;
    private String volumeUsd24Hr;
    private String priceUsd;
    private String changePercent24Hr;
    private String vwap24Hr;
    private String explorer;




    public String getId() {
        return id;
    }

    public CryptoCurrencyModel setId(String id) {
        this.id = id;
        return this;
    }

    public String getRank() {
        return rank;
    }

    public CryptoCurrencyModel setRank(String rank) {
        this.rank = rank;
        return this;
    }

    public String getSymbol() {
        return symbol;
    }

    public CryptoCurrencyModel setSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public String getName() {
        return name;
    }

    public CryptoCurrencyModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getSupply() {
        return supply;
    }

    public CryptoCurrencyModel setSupply(String supply) {
        this.supply = supply;
        return this;
    }

    public String getMaxSupply() {
        return maxSupply;
    }

    public CryptoCurrencyModel setMaxSupply(String maxSupply) {
        this.maxSupply = maxSupply;
        return this;
    }

    public String getMarketCapUsd() {
        return marketCapUsd;
    }

    public CryptoCurrencyModel setMarketCapUsd(String marketCapUsd) {
        this.marketCapUsd = marketCapUsd;
        return this;
    }

    public String getVolumeUsd24Hr() {
        return volumeUsd24Hr;
    }

    public CryptoCurrencyModel setVolumeUsd24Hr(String volumeUsd24Hr) {
        this.volumeUsd24Hr = volumeUsd24Hr;
        return this;
    }

    public String getPriceUsd() {
        return priceUsd;
    }

    public CryptoCurrencyModel setPriceUsd(String priceUsd) {
        this.priceUsd = priceUsd;
        return this;
    }

    public String getChangePercent24Hr() {
        return changePercent24Hr;
    }

    public CryptoCurrencyModel setChangePercent24Hr(String changePercent24Hr) {
        this.changePercent24Hr = changePercent24Hr;
        return this;
    }

    public String getVwap24Hr() {
        return vwap24Hr;
    }

    public CryptoCurrencyModel setVwap24Hr(String vwap24Hr) {
        this.vwap24Hr = vwap24Hr;
        return this;
    }

    public String getExplorer() {
        return explorer;
    }

    public CryptoCurrencyModel setExplorer(String explorer) {
        this.explorer = explorer;
        return this;
    }
}
