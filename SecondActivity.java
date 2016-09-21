package comfragmentadvance.example.hackeru.mynewapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();//extends from Main Activity
        /*
        String firstName = intent.getStringExtra(MainActivity.FIRST_NAME);
        int age = intent.getIntExtra(MainActivity.AGE, -1);//value must be positive cannot be minus
        */
        //other option with Bundle
        Bundle extras = intent.getExtras();
        String firstName = extras.getString(MainActivity.FIRST_NAME);
        int age = extras.getInt(MainActivity.AGE, -1);

        Toast.makeText(this, intent.getStringExtra(MainActivity.FIRST_NAME), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, String.valueOf(age), Toast.LENGTH_SHORT).show();

    }

    public void btnGoBack(View view) {
        Intent intent = new Intent();//other role for the intent - put default constructor
        intent.putExtra("password", "1234");

        setResult(RESULT_OK);//the client accomplished the action successfully

        finish();
    }
}
