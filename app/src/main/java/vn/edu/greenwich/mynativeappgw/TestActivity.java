package vn.edu.greenwich.mynativeappgw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        TextView tvPropertyName = findViewById(R.id.tvPropertyName_Confirm);
        TextView tvPropertyAddress = findViewById(R.id.tvPropertyAddress_Confirm);
        TextView tvPropertyType = findViewById(R.id.tvPropertyType_Confirm);
        TextView tvBedroom = findViewById(R.id.tvPropertyBedroom_Confirm);
        TextView tvDate = findViewById(R.id.tvDate_Confirm);
        TextView tvPropertyPrice = findViewById(R.id.tvPropertyPrice_Confirm);
        TextView tvFurnitureType = findViewById(R.id.tvPropertyFurniture_Confirm);
        TextView tvNote = findViewById(R.id.tvPropertyNote_Confirm);
        TextView tvReporter = findViewById(R.id.tvPropertyReporter_Confirm);

        Intent intent = getIntent();

        String propertyName = intent.getStringExtra("propertyName");
        String propertyAddress = intent.getStringExtra("propertyAddress");
        String propertyType = intent.getStringExtra("propertyType");
        String propertyBedroom = intent.getStringExtra("propertyBedroom");
        String propertyDate = intent.getStringExtra("propertyDate");
        String propertyPrice = intent.getStringExtra("propertyPrice");
        String propertyFurniture = intent.getStringExtra("propertyFurniture");
        String propertyNote = intent.getStringExtra("propertyNote");
        String propertyReporter = intent.getStringExtra("propertyReporter");

        tvPropertyName.setText(propertyName);
        tvPropertyAddress.setText(propertyAddress);
        tvPropertyType.setText(propertyType);
        tvBedroom.setText(propertyBedroom);
        tvDate.setText(propertyDate);
        tvPropertyPrice.setText(propertyPrice);
        tvFurnitureType.setText(propertyFurniture);
        tvNote.setText(propertyNote);
        tvReporter.setText(propertyReporter);
    }
}