package prakash.fresh1;

import android.support.v7.app.AppCompatActivity;



        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.EditText;
        import android.widget.LinearLayout;
        import android.widget.ScrollView;
        import android.widget.TextView;

public class OrdersPlaced extends AppCompatActivity {
    String[] n ;
    int[] q ;
    int[] p ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders_placed);


        Intent i = getIntent();
        n = i.getStringArrayExtra("n");
        q = i.getIntArrayExtra("q");
        p = i.getIntArrayExtra("p");

        LinearLayout lli = (LinearLayout)findViewById(R.id.lli);
        TextView total = (TextView)findViewById(R.id.total);

        int c = 0 ;
        for(int idx=0;idx<26;++idx)
        {
            c = c + q[idx]*p[idx] ;
            if(q[idx]!=0)
            {
                TextView tt = new TextView(this);
                tt.setTextSize(35);
                tt.setText("  " + n[idx] + "          " + Integer.toString(p[idx]) + "          " + Integer.toString(q[idx]));
                lli.addView(tt);
            }
        }
        total.setTextSize(40);
        total.setText(" Total : Rs. " + Integer.toString(c) + "/-");
    }
}
