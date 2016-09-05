package firstprojects.com.ledblink;

import android.service.dreams.DreamService;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;
import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

import firstprojects.com.ledblink.R;

/**
 * Created by ganesh on 04-09-2016.
 */
public class clock extends DreamService {
    @Override
    public void onDreamingStarted() {
        super.onDreamingStarted();
        setFullscreen(true);
        setScreenBright(false);
        setContentView(R.layout.clock);
    }

}
