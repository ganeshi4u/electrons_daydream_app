package firstprojects.com.ledblink;

import android.app.Activity;
import android.os.Bundle;

import firstprojects.com.ledblink.DebugPreferenceFragment;

/**
 * Created by ganesh on 05-09-2016.
 *
 * Activity containing debug settings
 **/
public class DebugSettingsActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getFragmentManager().beginTransaction().replace(android.R.id.content,
                new DebugPreferenceFragment()).commit();
    }
}
