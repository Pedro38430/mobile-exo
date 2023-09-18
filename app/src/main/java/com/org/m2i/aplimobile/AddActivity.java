package com.org.m2i.aplimobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import com.org.m2i.aplimobile.Item;
import java.util.ArrayList;
import java.util.List;

public class AddActivity extends AppCompatActivity {

    private EditText editTextNom;
    private EditText editTextPrix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        editTextNom = findViewById(R.id.editTextNom);
        editTextPrix = findViewById(R.id.editTextPrix);

        Button buttonConfirmer = findViewById(R.id.buttonConfirmer);
        buttonConfirmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String itemName = editTextNom.getText().toString();
                double itemPrice = Double.parseDouble(editTextPrix.getText().toString());

                Item newItem = new Item(itemName, itemPrice);


                List<Item> itemList = new ArrayList<>();
                itemList.add(newItem);

                Intent intent = new Intent(AddActivity.this, GraphActivity.class);
                intent.putParcelableArrayListExtra("itemList", (ArrayList<Item>) itemList);
                startActivity(intent);
            }
        });
    }
}
