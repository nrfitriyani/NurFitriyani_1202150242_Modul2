package nurfitriyani.example.com.nurfitriyani_1202150242_modul2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private ArrayList<Menu> dataSet;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.textViewName = (TextView) itemView.findViewById(R.id.txtnamamenu);
            this.textViewVersion = (TextView) itemView.findViewById(R.id.txthargamenu);
            this.imageViewIcon = (ImageView) itemView.findViewById(R.id.imgmenu);
        }
    }

    public RecyclerViewAdapter(ArrayList<Menu> data) {
        this.dataSet = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listview_menu, parent, false);

        view.setOnClickListener(DaftarMenu.myOnClickListener);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(dataSet.get(listPosition).getNama());
        textViewVersion.setText(dataSet.get(listPosition).getHarga());
        imageView.setImageResource(dataSet.get(listPosition).getGambar());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}