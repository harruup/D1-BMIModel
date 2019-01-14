package com.example.hsdhillon13.bmi;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.TextView;
public class BMIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi_layout);

    }
    public void buttonClicked(View v)
    {
        EditText weightView = (EditText) findViewById(R.id.weightBox);
        String weight = weightView.getText().toString();
        EditText heightView = (EditText) findViewById(R.id.heightBox);
        String height = heightView.getText().toString();

        BMIModel myModel = new BMIModel(weight, height);
        String myBMI = myModel.getBMI();
        String myWeight = myModel.toPound();
        String myHeight = myModel.toFeetInch();

        ((TextView) findViewById(R.id.answer)).setText("Your weight is "+myWeight+"lb, your Height is "+myHeight + ", and your BMI is " +myBMI+".");

    }
}
/* testing github*/