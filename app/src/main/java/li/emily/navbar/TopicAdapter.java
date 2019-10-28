package li.emily.navbar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.HashMap;

public class TopicAdapter extends RecyclerView.Adapter<TopicAdapter.TopicViewHolder>{

    private OnClickListener clickListener;
    private HashMap<Integer, String> topicMap;

    public TopicAdapter(HashMap<Integer, String> topicMap, OnClickListener clickListener){
        this.topicMap = topicMap;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public TopicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.topic_layout,parent,false);
        return new TopicViewHolder(v, clickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull TopicViewHolder holder, int position) {
        String topicName = topicMap.get(position);
        holder.topicName.setText(topicName);
    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class TopicViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView topicName;
        public TopicViewHolder(View v, OnClickListener clickListener){
            super(v);
            this.topicName = (TextView) v.findViewById(R.id.topic_layout_text);
        }

        @Override
        public void onClick(View view) {

        }
    }

    public interface OnClickListener{
        void onClick(int position);
    }
}
