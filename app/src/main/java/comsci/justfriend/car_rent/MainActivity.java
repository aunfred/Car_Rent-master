package comsci.justfriend.car_rent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private UserTABLE objUserTABLE;
    private CarTABLE  objCarTABLE;
    private ListTABLE objListTABLE;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connected SQLite
        connectedSQLite();
    }

    private void connectedSQLite() {
        objUserTABLE = new UserTABLE(this);
        objCarTABLE = new CarTABLE(this);
        objListTABLE = new ListTABLE(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;


    }
}
