package firstprojects.com.ledblink;

import android.app.Activity;
import android.os.Bundle;

import firstprojects.com.ledblink.DefaultPreferenceFragment;

/**
 * Created by ganesh on 05-09-2016.
 */
public class SettingsActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getFragmentManager().beginTransaction().replace(android.R.id.content,
                new DefaultPreferenceFragment()).commit();
    }
}
