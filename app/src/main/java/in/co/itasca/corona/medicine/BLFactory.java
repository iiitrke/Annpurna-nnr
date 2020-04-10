package in.co.itasca.corona.medicine;

public class BLFactory {
    private static   BLFactory factory= null;
    private BusinessLogic bl = null;
    private BLFactory(){
    }
  public static BLFactory getInstance (){
        if(factory==null){
            factory= new BLFactory();
        }
        return  factory;
    }

    public BusinessLogic getBLInstance(){

        if (bl==null)
        bl =new BusinessLogic();
        return bl;
    }

//    public  ArrayList<ZoneModel> getZoneModel(){
//        ArrayList<ZoneModel> zonemodels = new ArrayList<ZoneModel>();
//            ZoneModel zone1Model = new ZoneModel("Civil Lines Zone-1", "Sherpur");
//        zonemodels.add(zone1Model);
//        zone1Model = new ZoneModel("Civil Lines Zone-1", "Adarsh Nagar");
//        zonemodels.add(zone1Model);
//
//        zone1Model = new ZoneModel("Civil Lines Zone-1", "Solanipuram");
//        zonemodels.add(zone1Model);
//
//        zone1Model = new ZoneModel("Civil Lines Zone-1", "Khanjarpur");
//        zonemodels.add(zone1Model);
//
//        zone1Model = new ZoneModel("Civil Lines Zone-1", "C.B.R.I");
//        zonemodels.add(zone1Model);
//
//        zone1Model = new ZoneModel("Civil Lines Zone-1", "I.I.T");
//        zonemodels.add(zone1Model);
//
//        zone1Model = new ZoneModel("Civil Lines Zone-1", "Civil Lines Madhya");
//        zonemodels.add(zone1Model);
//
//        zone1Model = new ZoneModel("Civil Lines Zone-1", "Jadugar Road");
//        zonemodels.add(zone1Model);
//
//        return zonemodels;

//            String zone1="Civil Lines Zone-1";
//            zone1Model.setZoneName(zone1);
//            zonemodels.add(zone1Model);
//
//        ZoneModel zone2Model = new ZoneModel();
//        zone1Model.setZoneName("Mohanpur Zone-2");
//        zonemodels.add(zone2Model);
//
//        ZoneModel zone3Model = new ZoneModel();
//        zone1Model.setZoneName("Ganeshpur Zone-3");
//        zonemodels.add(zone3Model);
//
//        ZoneModel zone4Model = new ZoneModel();
//        zone1Model.setZoneName("Ramnagar Zone-4");
//        zonemodels.add(zone2Model);
//
//        ZoneModel zone5Model = new ZoneModel();
//        zone1Model.setZoneName("Amber Talab Zone-5");
//        zonemodels.add(zone5Model);
//
//        ZoneModel zone6Model = new ZoneModel();
//        zone1Model.setZoneName("Satti Sot Zone-6");
//        zonemodels.add(zone6Model);
//
//        int lenZone = zonemodels.size();
//        ZoneModel[] zoneModelArray= new ZoneModel[lenZone];
//        zoneModelArray= (ZoneModel[]) zonemodels.toArray();
//
//        /// Zone 1 Mohalla
//        ArrayList<MohallaModel> mohallaModelsArrayList = new ArrayList<>();
//        MohallaModel mm1= new MohallaModel();
//        mm1.setMohallaName("Sherpur");
//        mm1.setZoneName(zone1);
//        mohallaModelsArrayList.add(mm1);
//
//        MohallaModel mm2= new MohallaModel();
//        mm2.setMohallaName("Adarsh Nagar");
//        mm2.setZoneName(zone1);
//        mohallaModelsArrayList.add(mm2);
//
//        MohallaModel mm3= new MohallaModel();
//        mm3.setMohallaName("Solanipuram");
//        mm3.setZoneName(zone1);
//        mohallaModelsArrayList.add(mm3);
//
//        MohallaModel mm4= new MohallaModel();
//        mm4.setMohallaName("Khanjarpur");
//        mm4.setZoneName(zone1);
//        mohallaModelsArrayList.add(mm4);
//
//        MohallaModel mm5= new MohallaModel();
//        mm5.setMohallaName("C.B.R.I");
//        mm5.setZoneName(zone1);
//        mohallaModelsArrayList.add(mm5);
//
//        MohallaModel mm6= new MohallaModel();
//        mm6.setMohallaName("I.I.T");
//        mm6.setZoneName(zone1);
//        mohallaModelsArrayList.add(mm6);
//
//
//        MohallaModel mm7= new MohallaModel();
//        mm7.setMohallaName("Civil Lines Madhya");
//        mm7.setZoneName(zone1);
//        mohallaModelsArrayList.add(mm7);
//
//        MohallaModel mm8= new MohallaModel();
//        mm8.setMohallaName("Jadugar Road");
//        mm8.setZoneName(zone1);
//        mohallaModelsArrayList.add(mm8);
//
//        int lenmm = mohallaModelsArrayList.size();
//        MohallaModel[] mmModelArray= new MohallaModel[lenmm];
//        mmModelArray= (MohallaModel[]) mohallaModelsArrayList.toArray();
//        zone1Model.setMohallas(mmModelArray);
//
///// Zone -2
//        zone1= "Mohanpura Zone-2";
//        mohallaModelsArrayList = new ArrayList<>();
//        MohallaModel mm9= new MohallaModel();
//        mm9.setMohallaName("MohanPura Uttar");
//        mm9.setZoneName(zone1);
//        mohallaModelsArrayList.add(mm9);
//
//        MohallaModel mm10= new MohallaModel();
//        mm10.setMohallaName("MohanPura Dakshi");
//        mm10.setZoneName(zone1);
//        mohallaModelsArrayList.add(mm10);
//
//        MohallaModel mm11= new MohallaModel();
//        mm11.setMohallaName("Defence Colony");
//        mm11.setZoneName(zone1);
//        mohallaModelsArrayList.add(mm11);
//
//        MohallaModel mm12= new MohallaModel();
//        mm12.setMohallaName("Asaf Nagar");
//        mm12.setZoneName(zone1);
//        mohallaModelsArrayList.add(mm12);
//
//        MohallaModel mm13= new MohallaModel();
//        mm13.setMohallaName("South Civil Lines");
//        mm13.setZoneName(zone1);
//        mohallaModelsArrayList.add(mm13);
//
//          lenmm = mohallaModelsArrayList.size();
//          mmModelArray= new MohallaModel[lenmm];
//        mmModelArray= (MohallaModel[]) mohallaModelsArrayList.toArray();
//        zone2Model.setMohallas(mmModelArray);

      //  return zonemodels;


//    }
}
