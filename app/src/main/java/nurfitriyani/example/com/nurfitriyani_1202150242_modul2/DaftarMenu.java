package nurfitriyani.example.com.nurfitriyani_1202150242_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {

        private static RecyclerView.Adapter adapter;
        private RecyclerView.LayoutManager layoutManager;
        private static RecyclerView recyclerView;
        private static ArrayList<Menu> data;
        static View.OnClickListener myOnClickListener;
        private static ArrayList<Integer> removedItems;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_daftar_menu);

            myOnClickListener = new MyOnClickListener(this);

            recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
            recyclerView.setHasFixedSize(true);

            layoutManager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setItemAnimator(new DefaultItemAnimator());

            data = new ArrayList<Menu>();
            for (int i = 0; i < MyData.nama.length; i++) {
                data.add(new Menu(
                        MyData.nama[i],
                        MyData.harga[i],
                        MyData.gambar[i]
                ));
            }

            removedItems = new ArrayList<Integer>();

            adapter = new RecyclerViewAdapter(data);
            recyclerView.setAdapter(adapter);
        }


        private static class MyOnClickListener implements View.OnClickListener {

            private final Context context;

            private MyOnClickListener(Context context) {
                this.context = context;
            }

            @Override
            public void onClick(View v) {
                showItem(v);
            }

            private void showItem(View v) {
                int selectedItemPosition = recyclerView.getChildPosition(v);
                RecyclerView.ViewHolder viewHolder
                        = recyclerView.findViewHolderForPosition(selectedItemPosition);
                TextView textViewName
                        = (TextView) viewHolder.itemView.findViewById(R.id.txtnamamenu);
                String selectedName = (String) textViewName.getText();

            }
        }




}


