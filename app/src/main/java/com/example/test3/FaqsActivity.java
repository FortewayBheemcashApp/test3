package com.example.test3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class FaqsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String mTitle[] = {"Facebook", "Whatsapp", "Twitter", "Instagram", "Youtube","Facebook", "Whatsapp", "Twitter", "Instagram", "Youtube"};
        String mDescription[] = {"Facebook Description \"Whatsapp Description\" \"Whatsapp Description\"", "Whatsapp Description", "Twitter Description", "Instagram Description", "Youtube Description","Facebook Description", "Whatsapp Description", "Twitter Description", "Instagram Description", "Youtube Description"};
        setContentView(R.layout.activity_faqs);
        ListView resultsListView = (ListView) findViewById(R.id.faqList);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription);
        resultsListView.setAdapter(adapter);
    }
    //Play video on youtube
    public void playVideo(View view)
    {
        Intent video=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?time_continue=1&v=JpOryiAvJ90"));
        startActivity(video);
    }

}
class MyAdapter extends ArrayAdapter<String> {

    Context context;
    String rTitle[];
    String rDescription[];

    MyAdapter (Context c, String title[], String description[]  ) {
        super(c, R.layout.list_items, R.id.textView2, title);
        this.context = c;
        this.rTitle = title;
        this.rDescription = description;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = layoutInflater.inflate(R.layout.list_items, parent, false);
        TextView myTitle = row.findViewById(R.id.textView1);
        TextView myDescription = row.findViewById(R.id.textView2);

        // now set our resources on views
        myTitle.setText(rTitle[position]);
        myDescription.setText(rDescription[position]);




        return row;
    }
}
