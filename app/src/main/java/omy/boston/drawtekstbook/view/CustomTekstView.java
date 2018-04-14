package omy.boston.drawtekstbook.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by LosFrancisco on 08-Apr-17.
 */

public class CustomTekstView extends View {


    public CustomTekstView(Context context) {
        super(context);
    }

    public CustomTekstView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomTekstView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas){
        canvas.drawColor(Color.WHITE);

        //Android one
        Paint paint = new Paint();
        paint.setColor(Color.MAGENTA);
        canvas.drawText("Android", 29,29, paint);

        //Android drugi
        Path path = new Path();
        path.addArc(new RectF(10,50,90,200), 237, 90);
        paint.setColor(Color.CYAN);
        canvas.drawTextOnPath("Android", path, 0, 0, paint);

        //Android treći
        float[] los = new float[]{
                20, 80,
                29, 83,
                36, 80,
                39, 83,
                52, 80,
                62, 83,
                68, 80 };
        paint.setColor(Color.GREEN);
        canvas.drawPosText("Android", los, paint);
        }
}
