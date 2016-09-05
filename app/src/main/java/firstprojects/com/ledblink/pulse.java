package firstprojects.com.ledblink;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.service.dreams.DreamService;

import firstprojects.com.ledblink.widget.ChildAnimatingLayout;
import firstprojects.com.ledblink.widget.ViewAnimatorProviderFactory;

/**
 * Created by ganesh on 05-09-2016.
 */
public class pulse extends DreamService {
    @Override
    public void onDreamingStarted() {
        super.onDreamingStarted();
        setFullscreen(true);
        setScreenBright(false);
        setContentView(R.layout.pulse);
        setInteractive(false);

        ChildAnimatingLayout animatingLayout = (ChildAnimatingLayout) findViewById(R.id.animating_layout);
        animatingLayout.setViewAnimationProvider(ViewAnimatorProviderFactory.getViewAnimatorProvider(this));

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        setScreenBright(preferences.getBoolean(DefaultPreferenceFragment.KEY_NORMAL_BRIGHTNESS_MODE, false));

        boolean nightMode = preferences.getBoolean(DefaultPreferenceFragment.KEY_NIGHT_MODE, true);
        //In night mode decrease alpha to 0.3
        animatingLayout.setAlpha(nightMode ? 0.3f : 1.0f);
    }
}

