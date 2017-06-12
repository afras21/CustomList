package com.example.afrasali.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
public    ListView myList;
    //String[] things={"afras","google","fb","whatsapp"};
      public String[] pro={"adidas","nike","puma"};
      public  String[] descs={"style a","style b","style c"};
       public int[]  proimg={R.drawable.blckbryy,R.drawable.ios,R.drawable.ios};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myList = (ListView) findViewById(R.id.listView);
        CustomAdapter myAdapter=new CustomAdapter();
        myList.setAdapter(myAdapter);


    }


        class CustomAdapter extends BaseAdapter{


            @Override
            public int getCount() {
                return pro.length;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(int position, View view, ViewGroup viewGroup) {
                   view=getLayoutInflater().inflate(R.layout.list_item,null);
                ImageView img=(ImageView) view.findViewById(R.id.proimgs);
                TextView title=(TextView) view.findViewById(R.id.title);
                TextView descrip=(TextView)view.findViewById(R.id.desc);

                img.setImageResource(proimg[position]);
                descrip.setText(descs[position]);
                title.setText(pro[position]);

                return view;
            }
        }








        //istAdapter my= new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,things);
        //myList.setAdapter(my);

      /*  myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int i;
                Toast.makeText(MainActivity.this, ""+things[position], Toast.LENGTH_SHORT).show();
            }
        });*/
    }

