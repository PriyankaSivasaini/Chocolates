package in.ac.nrtec.chocolateinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=(RecyclerView) findViewById(R.id.recyclerview);

        //preparing the data
        int chocolates[] = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,
                R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j};
        String names[]={"Alpenliebe","Bar one","Candyman","Dairy Milk","Eclairs",
                "Fruittella","Galaxy","Hersheys","IBar","Jolly Rancher"};
        LinearLayoutManager llm = new LinearLayoutManager(this);
        RecyclerAdapter adapter = new RecyclerAdapter(this,chocolates,names);
        rv.setAdapter(adapter);
        rv.setLayoutManager(llm);
    }
}
