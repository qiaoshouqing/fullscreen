package top.glimpse.fullscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PictureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);

//        findViewById(R.id.picture).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                View decorView3 = getWindow().getDecorView();
//                int uiOptions3 = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN;
////                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
//                decorView3.setSystemUiVisibility(uiOptions3);
//                getSupportActionBar().hide();
//            }
//        });

        int type = getIntent().getIntExtra("type", 1);

        switch (type) {
            case 1:
                View decorView = getWindow().getDecorView();
                int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
                decorView.setSystemUiVisibility(uiOptions);
                getSupportActionBar().hide();
                break;
            case 2:
                View decorView2 = getWindow().getDecorView();
                int uiOptions2 = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN;
                decorView2.setSystemUiVisibility(uiOptions2);
                getSupportActionBar().hide();
                break;
            case 3:
                View decorView3 = getWindow().getDecorView();
                int uiOptions3 = View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN;
//                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
                decorView3.setSystemUiVisibility(uiOptions3);
                getSupportActionBar().hide();
                break;
            case 4:
                View decorView4 = getWindow().getDecorView();
                int uiOptions4 = View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
//                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
                decorView4.setSystemUiVisibility(uiOptions4);
                getSupportActionBar().hide();
                break;
            case 5:
                View decorView5 = getWindow().getDecorView();
                int uiOptions5 = View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_IMMERSIVE;
                decorView5.setSystemUiVisibility(uiOptions5);
                getSupportActionBar().hide();
                break;
            case 6:
                View decorView6 = getWindow().getDecorView();
                int uiOptions6 = View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
                decorView6.setSystemUiVisibility(uiOptions6);
                getSupportActionBar().hide();
                break;
            case 7:
                // This example uses decor view, but you can use any visible view.
                View decorView7 = getWindow().getDecorView();
                int uiOptions7 = View.SYSTEM_UI_FLAG_LOW_PROFILE;
                decorView7.setSystemUiVisibility(uiOptions7);
                break;
            case 8:
                View decorView8 = getWindow().getDecorView();
                int uiOptions8 = View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
                decorView8.setSystemUiVisibility(uiOptions8);
                getSupportActionBar().hide();
                break;
            default:
                break;
        }
    }


    private void setFullscreen() {
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;


        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);}

}
