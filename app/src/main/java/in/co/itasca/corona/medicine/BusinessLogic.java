package in.co.itasca.corona.medicine;

import java.util.ArrayList;
import java.util.Iterator;

public class BusinessLogic {

    public BusinessLogic() {
        populateZoneModel();

    }

    private ArrayList<ZoneShopKeeperModel> zoneShopKeeperModelArrayList = new ArrayList<>();

    static public final String zoneName = "Civil Lines Zone-1";
    static public final String zone2Name = "Mohanpura Zone-2";
    static public final String zone3Name = "Ganeshpur Zone-3";
    static public final String zone4Name = "Ram Nagar Zone-4";
    static public final String zone5Name = "Amber Talab Zone-5";
    static public final String zone6Name = "Sot & Satti Zone-6";


    ArrayList<ZoneModel> zonemodels = null;

    public ArrayList<ZoneModel> getZoneModel() {
        return zonemodels;
    }

    public ArrayList<ZoneModel> populateZoneModel() {
        if (zonemodels == null)
            zonemodels = new ArrayList<ZoneModel>();


        ZoneModel zone1Model = new ZoneModel("Civil Lines Zone-1", "Sherpur");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zoneName, "Adarsh Nagar");
        zonemodels.add(zone1Model);

        zone1Model = new ZoneModel(zoneName, "Solanipuram");
        zonemodels.add(zone1Model);

        zone1Model = new ZoneModel(zoneName, "Khanjarpur");
        zonemodels.add(zone1Model);

        zone1Model = new ZoneModel(zoneName, "C.B.R.I");
        zonemodels.add(zone1Model);

        zone1Model = new ZoneModel(zoneName, "I.I.T");
        zonemodels.add(zone1Model);

        zone1Model = new ZoneModel(zoneName, "Civil Lines Madhya");
        zonemodels.add(zone1Model);

        zone1Model = new ZoneModel(zoneName, "Jadugar Road");
        zonemodels.add(zone1Model);





        populateZone1ShopkeeperArrayLIst();

        populateZone2Model();
        populateZone2ShopkeeperArrayLIst();

        populateZone3Model();
        populateZone3ShopkeeperArrayLIst();

        populateZone4Model();
        populateZone4ShopkeeperArrayLIst();

        populateZone5Model();
        populateZone5ShopkeeperArrayLIst();

        populateZone6Model();
        populateZone6ShopkeeperArrayLIst();
        return zonemodels;
    }


    public ArrayList<ZoneModel> populateZone2Model() {
        ZoneModel zone1Model = new ZoneModel(zone2Name, "Mohanpura");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zone2Name, "Defence Colony");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zone2Name, "South Civil LInes");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zone2Name, "Akash Deep Enclave");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zone2Name, "Ashaf Nagar");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zone2Name, "Mohamadpur");
        zonemodels.add(zone1Model);
        populateZone2ShopkeeperArrayLIst();
        return zonemodels;
    }

    public ArrayList<ZoneModel> populateZone3Model() {
        ZoneModel zone1Model = new ZoneModel(zone3Name, "Mohanpura");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zone3Name, "Defence Colony");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zone3Name, "South Civil LInes");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zone3Name, "Akash Deep Enclave");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zone3Name, "Ashaf Nagar");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zone3Name, "Mohamadpur");
        zonemodels.add(zone1Model);
        return zonemodels;
    }

    public ArrayList<ZoneModel> populateZone4Model() {
        ZoneModel zone1Model = new ZoneModel(zone4Name, "ShivPuram");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zone4Name, "Subhash Nagar");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zone4Name, "Krishna Nagar");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zone4Name, "Salempur");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zone4Name, "Ram Nagar");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zone4Name, "Sunhera");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zone4Name, "Matlabpur");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zone4Name, "Kashipur");
        zonemodels.add(zone1Model);
        return zonemodels;
    }

    public ArrayList<ZoneModel> populateZone5Model() {
        ZoneModel zone1Model = new ZoneModel(zone5Name, "Maktool Puri");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zone5Name, "Purvi Deen Dayal");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zone5Name, "Saket");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zone5Name, "Chawmandi");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zone5Name, "Avas Vikas");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zone5Name, "Amber Talab");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zone5Name, "Purani Tehsil");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zone5Name, "Sanjay Gandhi Colony");
        zonemodels.add(zone1Model);
        return zonemodels;
    }

    public ArrayList<ZoneModel> populateZone6Model() {
        ZoneModel zone1Model = new ZoneModel(zone6Name, "World Bank Colony");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zone6Name, "Sot Mohalla");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zone6Name, "Satti Mohalla");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zone6Name, "Mahigran");
        zonemodels.add(zone1Model);
        zone1Model = new ZoneModel(zone6Name, "Bharat Nagar");
        zonemodels.add(zone1Model);

        return zonemodels;
    }




    public ZoneShopKeeperModel getZoneShopKeeperModel(String zoneName) {
        ZoneShopKeeperModel model = null;
        Iterator it = zoneShopKeeperModelArrayList.iterator();
        while (it.hasNext()) {
            model = (ZoneShopKeeperModel) it.next();
            if (model.getZoneName().equals(zoneName))
                return model;
        }
        return null;

    }


    private ShopKeeperModel[] convertToModelArray(ArrayList<ShopKeeperModel> arraylist) {
        int len = arraylist.size();
        ShopKeeperModel[] models = new ShopKeeperModel[len];
        models = (ShopKeeperModel[]) arraylist.toArray();
        return models;

    }


    private void populateZone1ShopkeeperArrayLIst() {
        ArrayList<ShopKeeperModel> shops = new ArrayList<>();
        ShopKeeperModel sm = new ShopKeeperModel("Janta Medicare", "7895333683", "Civil Lines");
        shops.add(sm);


//        sm = new ShopKeeperModel("Satish Medical Store", "9897276916", "Lal Kurti");
//        shops.add(sm);

//        sm = new ShopKeeperModel(" ", "9758988926", "Malakpur Chungi");
//        shops.add(sm);
//
//        sm = new ShopKeeperModel("Mahadev Provision Store", "9997540526", "Solanipuram");
//        shops.add(sm);
//
//        sm = new ShopKeeperModel("Kings Store", "7351324715", "Civil Lines");
//        shops.add(sm);
//
//        sm = new ShopKeeperModel("Milk Bar", "9997472220", "Civil Lines");
//        shops.add(sm);
//
//        sm = new ShopKeeperModel("Needs Super Store", "9760016360", "Civil Lines");
//        shops.add(sm);
//
//        sm = new ShopKeeperModel("Fair Deals Provision Store", "9997040881", "Civil Lines");
//        shops.add(sm);
//
//        sm = new ShopKeeperModel("Sai Fruit Shop", "7417365742", "Civil Lines");
//        shops.add(sm);
//
//        sm = new ShopKeeperModel("Easyday", "9136980599", "Civil Lines");
//        shops.add(sm);
//
//        sm = new ShopKeeperModel("Kanha Departmental Store", "8755981815", "Civil Lines");
//        shops.add(sm);

        ZoneShopKeeperModel zskm = new ZoneShopKeeperModel(zoneName, shops);
        zoneShopKeeperModelArrayList.add(zskm);
    }

    private void populateZone2ShopkeeperArrayLIst() {
        ArrayList<ShopKeeperModel> shops = new ArrayList<>();
        ShopKeeperModel sm = new ShopKeeperModel("Kapil Medicos", "9927130833", "---");
        shops.add(sm);
        sm = new ShopKeeperModel("Satish Medical Store", "9837352251", "Lal Kurti");
        shops.add(sm);
//        sm = new ShopKeeperModel("Virendra Vegetable & Fruits", "9756807719", "Double Phatak");
//        shops.add(sm);
//        sm = new ShopKeeperModel("EasyDay", "8826235637", "Mohanpura");
//        shops.add(sm);
//        sm = new ShopKeeperModel("Tomar Dairy", "7017369599", "Akash Deep Enclave");
//        shops.add(sm);
//        sm = new ShopKeeperModel("Hemant Department Store", "8449595948", "South Civil Lines");
//        shops.add(sm);
//        sm = new ShopKeeperModel("Sethi Dairy", "9520083095", "South Civil Lines");
//        shops.add(sm);
//        sm = new ShopKeeperModel("Shakumbhari Fruits & Vegetable", "8630275651", "Civil Lines");
//        shops.add(sm);
//        sm = new ShopKeeperModel("Ganga Dairy", "9897858468", "Colonel Enclave Chowk");
//        shops.add(sm);
//        sm = new ShopKeeperModel("Anubhav Department Store", "8171378081", "South Civil Lines");
//        shops.add(sm);

        ZoneShopKeeperModel zskm = new ZoneShopKeeperModel(zone2Name, shops);
        zoneShopKeeperModelArrayList.add(zskm);
    }

    private void populateZone3ShopkeeperArrayLIst() {
        ArrayList<ShopKeeperModel> shops = new ArrayList<>();
        ShopKeeperModel sm = new ShopKeeperModel("Ganpati Medical Store", "9808734414", "Ganeshpur");
        shops.add(sm);
        sm = new ShopKeeperModel("Ganpati Medical Store", "9808734414", "Ganesh Chowk");
        shops.add(sm);
//        sm = new ShopKeeperModel("Amit Agarwal Provision Store", "9808163616", "Ganeshpur");
//        shops.add(sm);
//        sm = new ShopKeeperModel("EasyDay", "9208107816", "BSM Tiraha");
//        shops.add(sm);
        ZoneShopKeeperModel zskm = new ZoneShopKeeperModel(zone3Name, shops);
        zoneShopKeeperModelArrayList.add(zskm);
    }

    private void populateZone4ShopkeeperArrayLIst() {
        ArrayList<ShopKeeperModel> shops = new ArrayList<>();
        ShopKeeperModel sm = new ShopKeeperModel("Om Medicare", "9897727535", "Shiv Chowk");
        shops.add(sm);
        sm = new ShopKeeperModel("Sanskar Medical", "9760753683", "Kashipur");
        shops.add(sm);
        sm = new ShopKeeperModel("Himanshu Sharma", "9897921309", "Rajendra Nagar");
        shops.add(sm);
//        sm = new ShopKeeperModel("Ajanta Provision Store", "7983812968", "Azad Nagar");
//        shops.add(sm);
//        sm = new ShopKeeperModel("Upyogi Vastu Bhandar", "9760005537", "Azad Nagar");
//        shops.add(sm);
//        sm = new ShopKeeperModel("Kohli Provision Store", "9837314003", " ");
//        shops.add(sm);
//        sm = new ShopKeeperModel("Manoj Provision Store", "7456987705", " ");
//        shops.add(sm);
//        sm = new ShopKeeperModel("GunGun Provision Store", "7417407753", "Sunhera");
//        shops.add(sm);
//        sm = new ShopKeeperModel("Rohit Provision Store", "8218377745", " ");
//        shops.add(sm);
//        sm = new ShopKeeperModel("UK Provision Store", "9045376477", "Paniyala Road");
//        shops.add(sm);
//        sm = new ShopKeeperModel("Arav Provision Store", "9027325343", " ");
//        shops.add(sm);
//        sm = new ShopKeeperModel("Arora Provision Store", "9897069797", " ");
//        shops.add(sm);
//        sm = new ShopKeeperModel("Pandey Departmental", "9410371171", "Civil Lines");
//        shops.add(sm);



        ZoneShopKeeperModel zskm = new ZoneShopKeeperModel(zone4Name, shops);
        zoneShopKeeperModelArrayList.add(zskm);
    }


    private void populateZone5ShopkeeperArrayLIst() {
        ArrayList<ShopKeeperModel> shops = new ArrayList<>();
        ShopKeeperModel sm = new ShopKeeperModel("Ambe Medical Agency", "9358881779", "Mathura Vihar");
        shops.add(sm);
        sm = new ShopKeeperModel("Vashno Medicose", "9412979167", "Chandrapuri");
        shops.add(sm);
        sm = new ShopKeeperModel("Sharda Medical Store", "9897276916", "Main Bazar");
        shops.add(sm);
        sm = new ShopKeeperModel("Mahadev Medicare", "6398777450", "BSM Chowk");
        shops.add(sm);
        sm = new ShopKeeperModel("Ambay Medical Store", "9837733445", "Avas Vikas");
        shops.add(sm);
//        sm = new ShopKeeperModel("Continental Enterprises", "9045357337", "Purva Deen Dayal ");
//        shops.add(sm);
        sm = new ShopKeeperModel("Antra Medicose", "9639650549", "Purva Deen Dayal");
        shops.add(sm);
//        sm = new ShopKeeperModel("Shri Vinayak Provision Store", "9719078832", "Maktool Puri");
//        shops.add(sm);
//        sm = new ShopKeeperModel("Jeevan Das Achraj Lal Provision Store", "9897944558", "Anaj Mandi");
//        shops.add(sm);
//        sm = new ShopKeeperModel("Dayal Store", "9760920973", "Saket");
//        shops.add(sm);


        ZoneShopKeeperModel zskm = new ZoneShopKeeperModel(zone5Name, shops);
        zoneShopKeeperModelArrayList.add(zskm);
    }

    private void populateZone6ShopkeeperArrayLIst() {
        ArrayList<ShopKeeperModel> shops = new ArrayList<>();

        ShopKeeperModel sm = new ShopKeeperModel("Jeet Medical Store", "9997552555", "Main Bazar");
        shops.add(sm);
        sm = new ShopKeeperModel("Sagar Medicose", "8449774786", "Mahigran");
        shops.add(sm);
        sm = new ShopKeeperModel("Uttarakhand Medical Store", "9927476573", "Satti Mohalla");
        shops.add(sm);
        sm = new ShopKeeperModel("Hindustan Medical", "9897506136", "Satti Street");
        shops.add(sm);
        sm = new ShopKeeperModel("Janta Medicose", "9897074322", "Main Bazar");
        shops.add(sm);
//        sm = new ShopKeeperModel("Shivam Foods Atta Chakki", "9897238848", "Mahigran");
//        shops.add(sm);
//        sm = new ShopKeeperModel("Shafik Provision Store", "9897036970", "Rampur Road");
//        shops.add(sm);


        ZoneShopKeeperModel zskm = new ZoneShopKeeperModel(zone6Name, shops);
        zoneShopKeeperModelArrayList.add(zskm);
    }

    public ArrayList<ShopKeeperModel> getShopKeeperModelArrayList(String zoneName) {
        Iterator it = zoneShopKeeperModelArrayList.iterator();
        while (it.hasNext()) {
            ZoneShopKeeperModel model = (ZoneShopKeeperModel) it.next();
            if (model.getZoneName().equals(zoneName)) {
                return model.getShopKeeperModelArrayList();
            }
        }

        return  null;
    }

    public String getMohallaString(String zoneName){
        StringBuilder sb = new StringBuilder();
        Iterator it = zonemodels.iterator();
        while (it.hasNext()){
            ZoneModel model = (ZoneModel) it.next();
            if(model.getZoneName().equals(zoneName)) {
                sb.append(model.getMohallaName());
                sb.append(", ");
            }
        }
        String value = sb.toString();
        return value;
    }
}



