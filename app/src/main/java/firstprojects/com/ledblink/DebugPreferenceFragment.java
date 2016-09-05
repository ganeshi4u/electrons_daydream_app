package firstprojects.com.ledblink;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import firstprojects.com.ledblink.R;

/**
 * Created by ganesh on 05-09-2016.
 */
public class DebugPreferenceFragment extends PreferenceFragment {

    public static final String KEY_INITIAL_BATTERY_LEVEL = "initial_battery_level";
    public static final String KEY_USE_FAKE_BATTERY_MONITOR = "use_fake_battery_monitor";
    public static final String KEY_WORK_IN_CONTINUOUS_MODE = "work_in_continuous_mode";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.debug_preferences);
    }
}
