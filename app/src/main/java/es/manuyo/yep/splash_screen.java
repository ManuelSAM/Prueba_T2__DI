package es.manuyo.yep;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class splash_screen extends AppCompatActivity {

    private static final int
            SPLASH_DISPLAY_LENGTH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        TextView myTitle = (TextView) findViewById(R.id.Title);
        TextView mySubtitle = (TextView) findViewById(R.id.Subtitle);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");
        myTitle.setTypeface(myFont);
        mySubtitle.setTypeface(myFont);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(splash_screen.this, Login.class);
                splash_screen.this.startActivity(mainIntent);
                //overridePendingTransition(R.anim.out_left, R.anim.in_right);
                splash_screen.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
