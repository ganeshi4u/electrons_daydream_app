package firstprojects.com.ledblink;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by ganesh on 05-09-2016.
 */
public class DefaultPreferenceFragment extends PreferenceFragment  {

    //This constants should be in sync with preferences.xml
    public static final String KEY_NORMAL_BRIGHTNESS_MODE = "normal_brightness_mode";
    public static final String KEY_NIGHT_MODE = "night_mode";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preferences);
    }
}
