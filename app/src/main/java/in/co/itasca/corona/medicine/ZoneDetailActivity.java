package in.co.itasca.corona.medicine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ZoneDetailActivity extends AppCompatActivity {
    private ListView listView;
    private Context context = this;
    private BusinessLogic bl =null;
    private ArrayList<ShopKeeperModel> modelsArrayList;

    private String txtPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zone_detail);

        Intent intent = getIntent();
        String zoneName = intent.getStringExtra("zoneName");
        TextView  text2 = findViewById(R.id.textView2);
        text2.setText(zoneName);
        String mohallas = BLFactory.getInstance().getBLInstance().getMohallaString(zoneName);
        TextView  text4 = findViewById(R.id.textView4);
        text4.setText(mohallas);


        listView = findViewById(R.id.listView2);
        modelsArrayList  = BLFactory.getInstance().getBLInstance().getZoneShopKeeperModel(zoneName).getShopKeeperModelArrayList();

        ShopKeeperAdapter adapter = new ShopKeeperAdapter(this, modelsArrayList);
        listView.setAdapter(adapter);




//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                ShopKeeperModel model =  modelsArrayList.get(position);
//
//
//                Toast.makeText(ZoneDetailActivity.this, model.getMobileNo()+"", Toast.LENGTH_SHORT).show();
//            //    Intent intent = new Intent(context, ZoneDetailActivity.class);
//             //   intent.putExtra("zoneName", model.getZoneName());
//              //  startActivity(intent);
//
//                txtPhone = model.getMobileNo();
//                callPhoneNumber();
//
//
//
//
//            }
//        });


        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                ShopKeeperModel model =  modelsArrayList.get(position);


                Toast.makeText(ZoneDetailActivity.this, model.getMobileNo()+"", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(context, ZoneDetailActivity.class);
                //   intent.putExtra("zoneName", model.getZoneName());
                //  startActivity(intent);

                txtPhone = model.getMobileNo();
                callPhoneNumber();
                return false;
            };
        });





    }


    public void callPhoneNumber()
    {
        try
        {
            if(Build.VERSION.SDK_INT > 22)
            {
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(ZoneDetailActivity.this, new String[]{Manifest.permission.CALL_PHONE}, 101);
                    return;
                }

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + txtPhone));
                startActivity(callIntent);

            }
            else {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + txtPhone));
                startActivity(callIntent);
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults)
    {
        if(requestCode == 101)
        {
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED)
            {
                callPhoneNumber();
            }
        }
    }
}
