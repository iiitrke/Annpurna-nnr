package in.co.itasca.corona.medicine;

import java.util.ArrayList;

public class ZoneModel {

    private String zoneName;
    private String mohallaName;
    private String zoneId;
    private String mohallaId;

    public ArrayList<ShopKeeperModel> getShopKeeperModelsArrayList() {
        return shopKeeperModelsArrayList;
    }

    public void setShopKeeperModelsArrayList(ArrayList<ShopKeeperModel> shopKeeperModelsArrayList) {
        this.shopKeeperModelsArrayList = shopKeeperModelsArrayList;
    }

    private ArrayList<ShopKeeperModel> shopKeeperModelsArrayList= null;



    public ZoneModel(String zoneName, String mohallaName){
        this.mohallaName=mohallaName;
        this.zoneName= zoneName;
    }



    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }



    public String getMohallaName() {
        return mohallaName;
    }

    public void setMohallaName(String mohallaName) {
        this.mohallaName = mohallaName;
    }

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getMohallaId() {
        return mohallaId;
    }

    public void setMohallaId(String mohallaId) {
        this.mohallaId = mohallaId;
    }


}
