package nurfitriyani.example.com.nurfitriyani_1202150242_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);

        Button pilihpesanan = (Button)findViewById(R.id.tombolPesan);
        pilihpesanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TakeAway.this,DaftarMenu.class));
            }
        });
    }
}
