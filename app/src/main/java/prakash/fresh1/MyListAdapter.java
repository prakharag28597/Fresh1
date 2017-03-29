package prakash.fresh1;

import android.widget.ArrayAdapter;



        import android.app.Activity;
        import android.support.annotation.NonNull;
        import android.support.annotation.Nullable;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.TextView;

public class MyListAdapter extends ArrayAdapter<String>
{
    private final Activity context ;
    private final String[] progNames ;
    private final int[] quantity ;
    private final int[] prices ;

    public MyListAdapter(Activity context, String[] progNames,int[] quantity,int[] prices)
    {
        super(context,R.layout.activity_item,progNames);
        this.context = context;
        this.progNames = progNames;
        this.quantity = quantity ;
        this.prices = prices ;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_item,null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.name);
        txtTitle.setText(progNames[position]);

        TextView price = (TextView) rowView.findViewById(R.id.price);
        price.setText("Rs. "+Integer.toString(prices[position]));

        final TextView q = (TextView)rowView.findViewById(R.id.q) ;
        q.setText(Integer.toString(quantity[position]));

        Button b1 = (Button)rowView.findViewById(R.id.b1);
        Button b2 = (Button)rowView.findViewById(R.id.b2);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(quantity[position]>0)
                {
                    --quantity[position] ;
                }
                q.setText(Integer.toString(quantity[position]));
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                ++quantity[position] ;
                q.setText(Integer.toString(quantity[position]));
            }
        });
        return rowView ;
    }
}
