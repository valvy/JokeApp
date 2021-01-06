package nl.hvanderheijden.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToMain(View v) {

        final Intent intent = new Intent(this,SecondaryActivity.class);
        final Bundle bundle = new Bundle();
        bundle.putString("hello", "world");
        intent.putExtras(bundle);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        Log.d(MainActivity.class.getName(), "Hello world");
        startActivity(intent);
    }

}