package top.glimpse.fullscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.id1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PictureActivity.class);
                intent.putExtra("type", 1);
                MainActivity.this.startActivity(intent);
            }
        });

        findViewById(R.id.id2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PictureActivity.class);
                intent.putExtra("type", 2);
                MainActivity.this.startActivity(intent);
            }
        });

        findViewById(R.id.id3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PictureActivity.class);
                intent.putExtra("type", 3);
                MainActivity.this.startActivity(intent);
            }
        });

        findViewById(R.id.id4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PictureActivity.class);
                intent.putExtra("type", 4);
                MainActivity.this.startActivity(intent);
            }
        });

        findViewById(R.id.id5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PictureActivity.class);
                intent.putExtra("type", 5);
                MainActivity.this.startActivity(intent);
            }
        });

        findViewById(R.id.id6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PictureActivity.class);
                intent.putExtra("type", 6);
                MainActivity.this.startActivity(intent);
            }
        });
    }
}
