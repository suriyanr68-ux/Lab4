package com.example.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button NextButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Note note1 = new TextNote();
        note1.setTitle("Lab4");
        note1.setCreatedDate("29/04/2026");
        ((TextNote) note1).setContent("Do and send Lab4 before due date");

        note1.getSummary();

       Note textNote = new TextNote();
       textNote.title = "Study Java nakub";
       textNote.content = "Please, get me an A grade nahub khunkru";

        Checklist checklist = new Checklist("Daily Task", "Thing to do");
       checklist.title = "Daily Task";
       checklist.content = "Thing to day";

       User user1 = new NoteStudent ();
       user1.name = "Suriyan";
       user1.massage = "Please, get me an A grade.";

       NextButton = findViewById(R.id.button);
       NextButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                System.out.println("button clicked");
               Intent ContactUsActivity = new Intent(getApplicationContext(),ContactUsActivity.class);
               startActivity(ContactUsActivity);

           }
       });
    }
}