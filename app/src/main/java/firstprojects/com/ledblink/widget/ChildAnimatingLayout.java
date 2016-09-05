package firstprojects.com.ledblink.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * Created by ganesh on 05-09-2016.
 */
public class ChildAnimatingLayout extends FrameLayout {

    public ChildAnimatingLayout(Context context) {
        //XXX In FrameLayout super(context) is called here
        super(context);
    }

    public ChildAnimatingLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ChildAnimatingLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

}