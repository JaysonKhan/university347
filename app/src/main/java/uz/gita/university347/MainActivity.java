package uz.gita.university347;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;

    Settings settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        settings = Settings.getInstance();
        wireUpWidgets();
    }

    private void wireUpWidgets() {
        linearLayout = findViewById(R.id.kontener);
        LayoutInflater inflater = LayoutInflater.from(this);
        for (int i = 0; i < settings.getSIZE(); i++) {
            View view = inflater.inflate(R.layout.item_activity, linearLayout, false);

            view.<ImageView>findViewById(R.id.imageView).setImageResource(settings.getImageId(i));
            view.<TextView>findViewById(R.id.name).setText(settings.getNameId(i));

            int temp = i;
            view.setOnClickListener(view1 -> {
                Intent intent = new Intent(this, ReadActivity.class);
                intent.putExtra("infoId", temp);
                startActivity(intent);
            });
            linearLayout.addView(view);
        }

    }
}


