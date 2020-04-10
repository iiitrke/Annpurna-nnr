package in.co.itasca.corona.medicine;

import java.util.ArrayList;

public class ZoneShopKeeperModel {

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public ArrayList<ShopKeeperModel> getShopKeeperModelArrayList() {
        return shopKeeperModelArrayList;
    }

    public void setShopKeeperModelArrayList(ArrayList<ShopKeeperModel> shopKeeperModelArrayList) {
        this.shopKeeperModelArrayList = shopKeeperModelArrayList;
    }

    private String zoneName;
    private ArrayList<ShopKeeperModel> shopKeeperModelArrayList = new ArrayList<>();

    public ZoneShopKeeperModel(String zoneName, ArrayList<ShopKeeperModel> shopKeeperModelArrayList) {
        this.zoneName = zoneName;
        this.shopKeeperModelArrayList = shopKeeperModelArrayList;
    }


}
