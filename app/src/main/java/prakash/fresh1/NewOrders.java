package prakash.fresh1;

import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;



        import android.content.Context;
        import android.content.Intent;

        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.ListView;
        import android.widget.TextView;

        import java.util.ArrayList;
        import java.util.List;

        import static android.R.attr.data;
        import static android.R.layout.simple_list_item_1;


public class NewOrders extends AppCompatActivity {

    ListView lv ;
    Info data = new Info();

    Button menu ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_order);

        data.NamingFn();
        MyListAdapter adapter = new MyListAdapter(this,data.progNames,data.quantity,data.prices);
        lv = (ListView)findViewById(R.id.list);
        lv.setAdapter(adapter);
        menu = (Button)findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(NewOrders.this,MainActivity.class);
                i.putExtra("n",data.progNames);
                i.putExtra("q",data.quantity);
                i.putExtra("p",data.prices);
                startActivity(i);
            }
        });

    }
}


