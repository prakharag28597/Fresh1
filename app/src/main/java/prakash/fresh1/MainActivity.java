package prakash.fresh1;

import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView newOrders ;
    TextView ordersPlaced ;
    String[] n ;
    int[] q ;
    int[] p ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        newOrders = (TextView) findViewById(R.id.button1);
        ordersPlaced = (TextView) findViewById(R.id.button2);

        newOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,NewOrders.class);
                startActivity(i);
            }
        });

        Intent i = getIntent();
        n = i.getStringArrayExtra("n");
        q = i.getIntArrayExtra("q");
        p = i.getIntArrayExtra("p");



        ordersPlaced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n != null && p != null && q != null)
                {
                    Intent k = new Intent(MainActivity.this,OrdersPlaced.class);
                    k.putExtra("n",n);
                    k.putExtra("q",q);
                    k.putExtra("p",p);
                    startActivity(k);
                }
            }
        });

    }
}