package id.com.pelitabangsa.fragmentappsiqbal;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        Log.v("CREATING", "SECOND ACTIVITY");

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            finish();
            return;
        }

        if (saveInstanceState == null){
            SecondFragment detail = new SecondFragment();
            getFragmentManager().beginTransaction().add(android.R.id.content, detail).commit();
        }
    }
}
