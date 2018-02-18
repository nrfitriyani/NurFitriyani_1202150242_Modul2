package nurfitriyani.example.com.nurfitriyani_1202150242_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        new Timer().schedule(new TimerTask() { //meminta timer untuk melakukan intent ke activity lain dengan durasi tertentu
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),MainActivity.class)); // intent ke main activity
            }
        },2000); //durasi timer intent selama 2 detik
    }
}
