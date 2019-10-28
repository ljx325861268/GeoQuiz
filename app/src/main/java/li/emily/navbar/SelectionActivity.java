package li.emily.navbar;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class SelectionActivity extends AppCompatActivity implements TopicAdapter.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection_geo_topic);

        TopicAdapter topicAdapter = new TopicAdapter(TopicDB.getTopicMap(), this);

        RecyclerView rv = findViewById(R.id.selection_rv);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(topicAdapter);

    }

    @Override
    public void onClick(int position) {
        System.out.println(position);
    }
}
