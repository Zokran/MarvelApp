package hr.zokran.marveleapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        //TODO only 5 can be added, not 6...Put stories and events into one, with tab layout?
        switch (item.getItemId()) {
            case R.id.navigation_characters:
                return true;
            case R.id.navigation_comics:
                return true;
            case R.id.navigation_series:
                return true;
            case R.id.navigation_creators:
                return true;
            case R.id.navigation_events:
                return true;
            case R.id.navigation_stories:
                return true;
        }
        return false;
    }
}
