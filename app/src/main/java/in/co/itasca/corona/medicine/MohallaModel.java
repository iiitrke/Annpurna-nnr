package in.co.itasca.corona.medicine;

public class MohallaModel {
    private String mohallaName;
    private String zoneName;


    public String getMohallaName() {
        return mohallaName;
    }

    public void setMohallaName(String mohallaName) {
        this.mohallaName = mohallaName;
    }

    public ShopKeeperModel[] getShopkeepers() {
        return shopkeepers;
    }

    public void setShopkeepers(ShopKeeperModel[] shopkeepers) {
        this.shopkeepers = shopkeepers;
    }

    private ShopKeeperModel[] shopkeepers;

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }
}
