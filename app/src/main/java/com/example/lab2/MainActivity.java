package com.example.lab2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
       note1.title = "Lab4";
       note1.content = "Do and sent Lab4 before due date";
       note1.createdDate = "29/04/2026";
       note1.getSummary();

       TextNote textNote = new TextNote();
       textNote.title = "Study Java nakub";
       textNote.content = "Please, get me an A grade nahub khunkru";

       Checklist checklist = new Checklist();
       checklist.title = "Daily Task";
       checklist.content = "Thing to day";

       User user1 = new User ();
       user1.name = "Suriyan";
       user1.massage = "Please, get me an A grade.";
    }
}