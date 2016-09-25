package il.co.hackeru.lesson26_broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by hackeru on 25/09/2016.
 */
public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String key1 = intent.getStringExtra("key1");
        Toast.makeText(context, "key1 " + key1 , Toast.LENGTH_SHORT).show();
        abortBroadcast();//stop the string, don't call to the other brodacasts
    }
}
