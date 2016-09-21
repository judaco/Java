package comfragmentadvance.example.hackeru.mynewapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    public static final int REQUEST_CODE = 4;
    public static final String AGE = null;
    public static final String FIRST_NAME = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void btnClick(View view) {
        //Intent intent= new Intent(this,SecondActivity.class);
        Intent intent = new Intent("MyAction");
        //intent.putExtra(FIRST_NAME, "Juda");
        //intent.putExtra(AGE, 29);

        Bundle extras = new Bundle();
        extras.putString(FIRST_NAME, "Juda");
        extras.putInt(AGE, 29);

        intent.putExtras(extras);
        //startActivity(intent.createChooser(intent, "Please Choose"));
        startActivityForResult(intent, REQUEST_CODE);
    }
}
