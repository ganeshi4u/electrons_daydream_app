package firstprojects.com.ledblink;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by ganesh on 04-09-2016.
 */
public class Jumper3 extends FrameLayout {
    public static final int MOVE = 1;

    Runnable mRunnable = new Runnable() {
        public void run() {
            final View parent = (View) getParent();
            if (parent == null) return;

            // reposition in parent using setX() and setY()
            final float width = getMeasuredWidth();
            final float height = getMeasuredHeight();
            final float parentw = parent.getMeasuredWidth();
            final float parenth = parent.getMeasuredHeight();
            final float scale = 1 + (int) Math.round(Math.random() * 2);

            animate().x((float) Math.random() * (parentw - width))
                    .y((float) Math.random() * (parenth - height))
                    //.rotation(90 * (2 - (int)(Math.random() * 4)))
                    //.scaleX(scale).scaleY(scale)
                    .setDuration(1000);

            postDelayed(this, 100 + (int) (Math.random()*2000)); // let’s do this again, soon
        }
    };

    public Jumper3(Context context) {
        super(context);
    }

    public Jumper3(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Jumper3(Context context, AttributeSet attrs, int flags) {
        super(context, attrs, flags);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getHandler().post(mRunnable);
    }

}