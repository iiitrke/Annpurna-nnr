package in.co.itasca.corona.medicine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    private ArrayList<ZoneModel> zoneModelArrayList;
    private ListView listView;
    private TextView textViewClick;
    private Context context = this;
    private BusinessLogic bl =null;

    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        bl = BLFactory.getInstance().getBLInstance();
        super.onCreate(savedInstanceState);
        mAuth = FirebaseAuth.getInstance();


        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        textViewClick = findViewById(R.id.scope);

        textViewClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, GovtOrderActivity.class);
                startActivity(intent);
            }
        });



        zoneModelArrayList  = populateList();

        ZoneAdaptor foodAdapter = new ZoneAdaptor(this,  zoneModelArrayList);
        listView.setAdapter(foodAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               ZoneModel model =  zoneModelArrayList.get(position);


                Toast.makeText(MainActivity.this, model.getZoneName()+"", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, ZoneDetailActivity.class);
                intent.putExtra("zoneName", model.getZoneName());
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
      //  updateUI(currentUser);

    }

    private ArrayList<ZoneModel> populateList() {
//        ArrayList<ZoneModel> list = new ArrayList<>();
        ArrayList<ZoneModel> list = bl.getZoneModel();
        return list;
    }
}
