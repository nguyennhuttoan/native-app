package vn.edu.greenwich.mynativeappgw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String btnLoginName = getResources().getString(R.string.btn_submit);
        String notification_01 = getResources().getString(R.string.notification_01);

        Toast.makeText(this, notification_01, Toast.LENGTH_LONG).show();

        Button btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setText(btnLoginName);
        btnLogin.setOnClickListener(btnLogin_Click);
    }

    private View.OnClickListener btnLogin_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Boolean isValid = true;
            TextView tvError = findViewById(R.id.tvError);

            TextView tvPropertyName = findViewById(R.id.inputPropertyName);
            TextView tvPropertyAddress = findViewById(R.id.inputPropertyAddress);
            TextView tvPropertyType = findViewById(R.id.inputPropertyType);
            TextView tvBedroom = findViewById(R.id.inputBedroom);
            TextView tvDate = findViewById(R.id.inputDate);
            TextView tvPropertyPrice = findViewById(R.id.inputPropertyPrice);
            TextView tvFurnitureType = findViewById(R.id.inputPropertyFurnitureType);
            TextView tvNote = findViewById(R.id.inputPropertyNote);
            TextView tvReporter = findViewById(R.id.inputPropertyReporter);

            String error = "";
            String propertyName = tvPropertyName.getText().toString();
            String propertyAddress = tvPropertyAddress.getText().toString();
            String propertyType = tvPropertyType.getText().toString();
            String propertyBedroom = tvBedroom.getText().toString();
            String propertyDate = tvDate.getText().toString();
            String propertyPrice = tvPropertyPrice.getText().toString();
            String propertyFurniture = tvFurnitureType.getText().toString();
            String propertyNote = tvNote.getText().toString();
            String propertyReporter = tvReporter.getText().toString();

            String notification_02 = getResources().getString(R.string.notification_02);

            if (TextUtils.isEmpty(propertyName)) {
                isValid = false;
                error += "* Property name cannot be blank.\n";
            }

            if (TextUtils.isEmpty(propertyAddress)) {
                isValid = false;
                error += "* Property address cannot be blank.\n";
            }

            if (TextUtils.isEmpty(propertyType)) {
                isValid = false;
                error += "* Property type cannot be blank.\n";
            }

            if (TextUtils.isEmpty(propertyBedroom)) {
                isValid = false;
                error += "* Property bedroom cannot be blank.\n";
            }

            if (TextUtils.isEmpty(propertyDate)) {
                isValid = false;
                error += "* Property date cannot be blank.\n";
            }

            if (TextUtils.isEmpty(propertyPrice)) {
                isValid = false;
                error += "* Price cannot be blank.\n";
            }

            if (TextUtils.isEmpty(propertyReporter)) {
                isValid = false;
                error += "* Reporter name cannot be blank.\n";
            }

            if (isValid) {
//                Toast.makeText(v.getContext(), username + "-" + password, Toast.LENGTH_LONG).show();

                Intent testActivity = new Intent(v.getContext(), TestActivity.class);

                testActivity.putExtra("propertyName", propertyName);
                testActivity.putExtra("propertyAddress", propertyAddress);
                testActivity.putExtra("propertyType", propertyType);
                testActivity.putExtra("propertyBedroom", propertyBedroom);
                testActivity.putExtra("propertyDate", propertyDate);
                testActivity.putExtra("propertyPrice", propertyPrice);
                testActivity.putExtra("propertyFurniture", propertyFurniture);
                testActivity.putExtra("propertyNote", propertyNote);
                testActivity.putExtra("propertyReporter", propertyReporter);

                startActivity(testActivity);
                finish();
            } else {
                tvError.setText(error);
            }

        }
    };
}