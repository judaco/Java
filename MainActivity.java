package elyadumi.example.userlist;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements Fragment_add_user.UserNameListener,Fragment_edit_user.UserNameEditListener {

    ListView listView;
    List<User> users;
    Button btnAddUser;
    MyArrayUserAdapter adapter;
    Button btnDeleteUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // House Keeping
        listView = (ListView) findViewById(R.id.listview_users);
        btnAddUser = (Button) findViewById(R.id.btnAdd);
        btnDeleteUser = (Button) findViewById(R.id.btnDeleteUser);
        users = new ArrayList<User>();
        adapter = new MyArrayUserAdapter(this,users);

        // Open New Fragment To Edit The User.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FragmentManager manager = getFragmentManager();
                Fragment_edit_user edit_user = new Fragment_edit_user();
                edit_user.setUser(users.get(position));
                edit_user.setListener(MainActivity.this);
                edit_user.setCancelable(false);
                edit_user.show(manager,"edit_user");


            }
        });

    }


    // ADD User To the List
    public void btn_add(View view) {
        FragmentManager manager = getFragmentManager();
        Fragment_add_user add_user = new Fragment_add_user();
        add_user.setCancelable(false);
        add_user.setListener(this);
        add_user.setDialogTitle("Enter Your ID");
        add_user.show(manager,"add_user");

    }


    @Override
    public void hasUserName(String add_name, String password) {
        User user = new User(add_name,password);
        users.add(user);
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }


    @Override
    public void edit_user() {
        adapter.notifyDataSetChanged();
    }
}
