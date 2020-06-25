package alpsgiken.co.jp.autominutesgenerator;

import android.content.Intent;
import android.provider.Settings;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NavigationView navigationView = findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        Log.i(TAG, "@@@@@@@@@@@@@@@@Item 1 Selected!");

        int id = item.getItemId();

        switch(item.getItemId()){
            case R.id.menu_item1:
                Log.d(TAG, "Item 1 Selected!");
                break;
            case R.id.menu_item2:
                Log.d(TAG, "Item 2 Selected!");
                Intent intent2 = new Intent();
                intent2.setAction(Settings.ACTION_DISPLAY_SETTINGS);
                startActivity(intent2);
                break;
            case R.id.menu_item3:
                Log.d(TAG, "Item 3 Selected!");
                Intent intent3 = new Intent();
                intent3.setAction(Settings.ACTION_DISPLAY_SETTINGS);
                startActivity(intent3);
                break;
            case R.id.menu_item4:
                Log.d(TAG, "Item 4 Selected!");
                break;
        }

        //DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawerLayout);
        //drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        Log.i(TAG, "@@@@@@@@@@@@@@@@Item 1 Selected!");

        int id = item.getItemId();

        switch(item.getItemId()){
            case R.id.menu_item1:
                Log.d(TAG, "Item 1 Selected!");
                Intent intent = new Intent();
                intent.setAction(Settings.ACTION_DISPLAY_SETTINGS);
                startActivity(intent);

                break;
            case R.id.menu_item2:
                Log.d(TAG, "Item 2 Selected!");
                Intent intent2 = new Intent();
                intent2.setAction(Settings.ACTION_DISPLAY_SETTINGS);
                startActivity(intent2);

                break;
            case R.id.menu_item3:
                Log.d(TAG, "Item 3 Selected!");
                break;
            case R.id.menu_item4:
                Log.d(TAG, "Item 4 Selected!");
                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawerLayout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
