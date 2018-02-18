package nurfitriyani.example.com.nurfitriyani_1202150242_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.BreakIterator;

public class DineIn extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {
    private EditText namapemesan;
    private static final String TAG = MainActivity.class.getSimpleName() ;
    private String mSpinnerLabel = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        Spinner spinner = (Spinner) findViewById(R.id.mejaberapa);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.NomorMeja, android.R.layout.simple_spinner_item);


        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }

        Button pilihpesanan = (Button)findViewById(R.id.pilihpesanan);
        pilihpesanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DineIn.this,DaftarMenu.class));
            }
        });


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        mSpinnerLabel = adapterView.getItemAtPosition(i).toString();
        showText(view);
        Log.d(TAG, getString(R.string.nothing_selected));
    }

    private void showText(View view) {
        namapemesan = (EditText) findViewById(R.id.namapemesan);
        String showString = (namapemesan.getText().toString());

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
