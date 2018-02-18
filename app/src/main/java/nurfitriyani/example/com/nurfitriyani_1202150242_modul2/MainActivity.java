package nurfitriyani.example.com.nurfitriyani_1202150242_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener { //memakai implement class oncheckedchangelistener

    public String pilihan ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "Nur Fitriani 1202150242", Toast.LENGTH_SHORT).show(); //memunculkan toast NAMA NIM

        RadioGroup radioGrup = (RadioGroup)findViewById(R.id.radioGroup); //inisialisasi radio group
        final RadioButton dineIn = (RadioButton)findViewById(R.id.pilihDine); //inisialisasi radiobutton dinein
        RadioButton takeAway = (RadioButton)findViewById(R.id.pilihTake); //inisialisasi radio button takeaway
        radioGrup.setOnCheckedChangeListener(this); //inisialisasi oncheckedchangelistener pada radiogroup

        Button pesan = (Button) findViewById(R.id.tombolPesen); //inisialisai tombol pesen

        pesan.setOnClickListener(new View.OnClickListener() { //jika tombol pesan di pencet/click
            @Override
            public void onClick(View view) {
                if(pilihan == "Dine In"){
                    startActivity(new Intent(MainActivity.this,DineIn.class)); //jika yang di check dini in tombol akan mengintent ke dine in
                }else{
                    startActivity(new Intent(MainActivity.this,TakeAway.class)); //ini juga jika yang di check take away tombol akan mengintent ke tacke away
                }
                Toast.makeText(MainActivity.this, pilihan, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onCheckedChanged(RadioGroup group,
                                 int checkedId) {
        if(checkedId==R.id.pilihDine) //jika memilih radiobutton dinein
        {
            pilihan="Dine In"; //isi variable pilihan dine in

        }
        if(checkedId==R.id.pilihTake)//jika memilih radiobutton take away
        {
            pilihan="Take Away"; //isi variable pilihan take away
        }

    }



}
