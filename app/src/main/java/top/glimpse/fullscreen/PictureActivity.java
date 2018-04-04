package top.glimpse.fullscreen;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

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
                //隐藏状态栏、不稳定布局
                View decorView = getWindow().getDecorView();
                int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
                decorView.setSystemUiVisibility(uiOptions);
                getSupportActionBar().hide();
                break;
            case 2:
                //隐藏状态栏导航栏、不稳定布局
                View decorView2 = getWindow().getDecorView();
                int uiOptions2 = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN;
                decorView2.setSystemUiVisibility(uiOptions2);
                getSupportActionBar().hide();
                break;
            case 3:
                //隐藏状态栏、延伸布局、稳定布局
                View decorView3 = getWindow().getDecorView();
                int uiOptions3 = View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN;
//                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
                decorView3.setSystemUiVisibility(uiOptions3);
                getSupportActionBar().hide();
                break;
            case 4:
                //隐藏导航栏、延伸布局、稳定布局
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
                //隐藏状态栏导航栏、延伸布局、稳定布局、使用immerse
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
                //隐藏状态栏导航栏、延伸布局、稳定布局、使用immerse_sticky固定住
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
                //使状态栏导航栏变暗
                // This example uses decor view, but you can use any visible view.
                View decorView7 = getWindow().getDecorView();
                int uiOptions7 = View.SYSTEM_UI_FLAG_LOW_PROFILE;
                decorView7.setSystemUiVisibility(uiOptions7);
                getSupportActionBar().hide();
                break;
            case 8:
                //隐藏状态栏、不延伸布局、稳定布局
                View decorView8 = getWindow().getDecorView();
                int uiOptions8 = View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
                decorView8.setSystemUiVisibility(uiOptions8);
                getSupportActionBar().hide();
                break;

            case 10:
                //全屏不显示状态栏导航栏
                setFullscreen(false, false);
                break;
            case 11:
                //全屏显示状态栏隐藏导航栏
                setFullscreen(true, false);
                break;
            case 12:
                //全屏隐藏状态栏显示导航栏
                setFullscreen(false, true);
                break;
            case 13:
                //全屏显示状态栏导航栏
                setFullscreen(true, true);
                break;
            default:
                break;
        }
    }


    public void setFullscreen(boolean isShowStatusBar, boolean isShowNavigationBar) {
        int uiOptions = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;

        if (!isShowStatusBar) {
            uiOptions |= View.SYSTEM_UI_FLAG_FULLSCREEN;
        }
        if (!isShowNavigationBar) {
            uiOptions |= View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
        }
        getWindow().getDecorView().setSystemUiVisibility(uiOptions);

        //隐藏标题栏
        getSupportActionBar().hide();
        //设置状态栏导航栏背景颜色为透明
        setNavigationStatusColor(Color.TRANSPARENT);
    }

    public void setNavigationStatusColor(int color) {
        //VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setNavigationBarColor(color);
            getWindow().setStatusBarColor(color);
        }
    }

}
