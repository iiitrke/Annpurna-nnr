package in.co.itasca.corona.medicine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ShopKeeperAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<ShopKeeperModel> shopKeeperModelArrayList;

    public ShopKeeperAdapter(Context context, ArrayList<ShopKeeperModel> shopKeeperModelArrayList) {

        this.context = context;
        this.shopKeeperModelArrayList = shopKeeperModelArrayList;
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
        return shopKeeperModelArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return shopKeeperModelArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ShopKeeperAdapter.ViewHolder holder;

        if (convertView == null) {
            holder = new ShopKeeperAdapter.ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item2, null, true);

            holder.shopName = (TextView) convertView.findViewById(R.id.shopName);
            holder.mobileNo = (TextView) convertView.findViewById(R.id.mobileNo);

            convertView.setTag(holder);
        } else {
            // the getTag returns the viewHolder object set as a tag to the view
            holder = (ShopKeeperAdapter.ViewHolder) convertView.getTag();
        }

        ShopKeeperModel skmodel = shopKeeperModelArrayList.get(position);
        holder.shopName.setText(skmodel.getShopName());
        holder.mobileNo.setText(skmodel.getMobileNo());

        return convertView;
    }

    private class ViewHolder {

        protected TextView shopName, mobileNo;

    }
}
