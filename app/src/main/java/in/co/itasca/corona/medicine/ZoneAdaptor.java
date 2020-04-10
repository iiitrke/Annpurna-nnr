package in.co.itasca.corona.medicine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ZoneAdaptor extends BaseAdapter {
    private Context context;
    private ArrayList<ZoneModel> zoneModelArrayList;

    public ZoneAdaptor(Context context, ArrayList<ZoneModel> zoneModelArrayList) {

        this.context = context;
        this.zoneModelArrayList = zoneModelArrayList;
    }


    @Override
    public int getViewTypeCount() {
        return getCount();
    }
    @Override
    public int getItemViewType(int position) {

        return position;
    }

    @Override
    public int getCount() {
        return zoneModelArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return zoneModelArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item, null, true);

            holder.mohallaNameHolder = (TextView) convertView.findViewById(R.id.mohallaNameView);
            holder.zonenameHolder = (TextView) convertView.findViewById(R.id.zoneNameView);

            convertView.setTag(holder);
        }else {
            // the getTag returns the viewHolder object set as a tag to the view
            holder = (ViewHolder)convertView.getTag();
        }

        holder.mohallaNameHolder.setText(zoneModelArrayList.get(position).getMohallaName());
        holder.zonenameHolder.setText(String.valueOf(zoneModelArrayList.get(position).getZoneName()));

        return convertView;
    }

    private class ViewHolder {

        protected TextView mohallaNameHolder, zonenameHolder;

    }










}
