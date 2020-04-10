package in.co.itasca.corona.medicine;

public class ShopKeeperModel {

    public ShopKeeperModel(String shopName, String mobileNo,  String address){

        this.shopName= shopName;
        this.mobileNo= mobileNo;

        this.address=address;

    }

    private  String shopName;
    private String mobileNo;
    private String address;






    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address = address;
    }


}
