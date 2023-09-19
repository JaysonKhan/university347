package uz.gita.university347;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ReadActivity extends AppCompatActivity {
    ImageView imageView, imageBall;
    TextView name, link;
    TextView description;
    View telegram,instagram;

    Settings settings;
    int id;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.read_activity);

        settings = Settings.getInstance();

        wireUpWidgets();
        installKelganInfo();



    }

    private void installKelganInfo() {
        Intent intent = getIntent();
        id = intent.getIntExtra("infoId", 0);
        imageView.setImageResource(settings.getImageFrontId(id));
        name.setText(settings.getNameId(id));
        description.setText(settings.getDescriptionId(id));
        imageBall.setImageResource(settings.getInfoBall(id));

        link.setText("Batafsil malumot uchun: "+settings.getOliygohLink(id));

        telegram.setOnClickListener(view -> {
            Uri uri = Uri.parse(settings.getTelegramLink(id));
            Intent intent1 = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent1);
        });

        instagram.setOnClickListener(view -> {
            Uri uri = Uri.parse(settings.getInstagramLink(id));
            Intent intent1 = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent1);
        });
    }

    private void wireUpWidgets() {
        imageView = findViewById(R.id.imageView);
        name = findViewById(R.id.name);
        description =findViewById(R.id.description);

        telegram = findViewById(R.id.telegram);
        instagram = findViewById(R.id.instagram);

        link = findViewById(R.id.link_textview);
        imageBall = findViewById(R.id.infoBall);

    }
}

/*

    private void setDataToWidgets() {
        Bundle bundle = getIntent().getExtras();
        Book book = (Book) bundle.get("BOOK");
        bookTitle.setText(book.getBookTitle());
        bookAuthor.setText(book.getBookAuthor());
        bookDescription.setText(book.getBookDescription());
    }*/
