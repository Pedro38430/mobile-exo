package com.org.m2i.aplimobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.org.m2i.aplimobile.Item;
import java.util.List;

public class GraphActivity extends AppCompatActivity {

    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);

        List<Item> itemList = getIntent().getParcelableArrayListExtra("itemList");

        for (Item item : itemList) {
            System.out.println("Nom : " + item.getName() + ", Prix : " + item.getPrice());
        }

        addButton = findViewById(R.id.add_button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GraphActivity.this, AddActivity.class);
                startActivity(intent);
            }
        });
    }
}


