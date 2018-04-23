package com.example.a16046512.sgholiday;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView lv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lv=(ListView)this.findViewById(R.id.lvcategory);



        String cate[]=new String[]{"Secular","Ethnic & Religion"};

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,cate);

        lv.setAdapter(adapter);
//test
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                String itemValues=(String)lv.getItemAtPosition(position);
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);

                intent.putExtra("cate",itemValues);
                startActivity(intent);
            }
        });





    }
}
