package com.saurabhawathare.recylerview01;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    final ArrayList<ContactModel> arryContact = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerContact);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Adding contacts to the array list
        arryContact.add(new ContactModel(R.drawable.a, "Liam Alexander Carter\n", "9876543210"));
        arryContact.add(new ContactModel(R.drawable.b, "Noah Benjamin Reed\n", "9876543210"));
        arryContact.add(new ContactModel(R.drawable.c, "Oliver James Harrison\n", "9876543210"));
        arryContact.add(new ContactModel(R.drawable.d, "Olivia Grace Thompson\n", "9876543210"));
        arryContact.add(new ContactModel(R.drawable.e, "Emma Rose Carter\n", "9876543210"));
        arryContact.add(new ContactModel(R.drawable.f, "Ava Elizabeth Mitchell\n", "9876543210"));
        arryContact.add(new ContactModel(R.drawable.g, "Elijah Michael Brooks\n", "9876543210"));
        arryContact.add(new ContactModel(R.drawable.h, "James Henry Walker\n", "9876543210"));
        arryContact.add(new ContactModel(R.drawable.i, "William Lucas Turner\n", "9876543210"));
        arryContact.add(new ContactModel(R.drawable.j, "Sophia Marie Davis\n", "9876543210"));
        arryContact.add(new ContactModel(R.drawable.k, "Abigail Faith Morgan\n", "9876543210"));
        arryContact.add(new ContactModel(R.drawable.l, "Ella Katherine Turner\n", "9876543210"));
        arryContact.add(new ContactModel(R.drawable.m, "Benjamin Samuel Clark\n", "9876543210"));
        arryContact.add(new ContactModel(R.drawable.n, "Lucas Daniel Hayes\n", "9876543210"));
        arryContact.add(new ContactModel(R.drawable.o, "Isabella Jane Parker\n", "9876543210"));
        arryContact.add(new ContactModel(R.drawable.p, "Mia Charlotte Brooks\n", "9876543210"));
        arryContact.add(new ContactModel(R.drawable.q, "Amelia Rose Anderson\n", "9876543210"));
        arryContact.add(new ContactModel(R.drawable.r, "Henry Ethan Morgan\n", "9876543210"));
        arryContact.add(new ContactModel(R.drawable.s, "Alexander Thomas Bennett\n", "9876543210"));
        arryContact.add(new ContactModel(R.drawable.t, "Harper Annette Collins\n", "9876543210"));
        arryContact.add(new ContactModel(R.drawable.u, "Ethan William Foster\n", "9876543210"));
        arryContact.add(new ContactModel(R.drawable.v, "Evelyn Claire Richardson\n", "9876543210"));
        arryContact.add(new ContactModel(R.drawable.w, "Jackson Matthew Davis\n", "9876543210"));
        arryContact.add(new ContactModel(R.drawable.x, "Sebastian Oliver Price\n", "9876543210"));

        // Setting the adapter for the RecyclerView
        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, arryContact);
        recyclerView.setAdapter(adapter);
    }
}
