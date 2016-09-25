package il.co.hackeru.lesson26_broadcastreceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent("MY_SPECIFIC_ACTION");
        intent.putExtra("key1", "Shalev is a Mafioner");
        //sendBroadcast(intent);//the priority is not important - //between 0-1000 - default = 0
        sendOrderedBroadcast(intent, null, );//there is meaning to the priority
    }
}
