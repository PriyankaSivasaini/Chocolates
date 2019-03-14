package in.ac.nrtec.chocolateinfo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 14-09-2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewInfo>
{
    Context context;
    int images[];
    String chocoNames[];

    public RecyclerAdapter(Context context, int[] images, String[] chocoNames)
    {
        this.context = context;
        this.images = images;
        this.chocoNames = chocoNames;
    }

    @Override
    public RecyclerAdapter.ViewInfo onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(context).inflate(R.layout.myrow,parent,false);
        ViewInfo  vi = new ViewInfo(v);
        return vi;
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewInfo holder, int position)
    {
          holder.chocolate.setImageResource(images[position]);
          holder.chocolateName.setText(chocoNames[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class ViewInfo extends RecyclerView.ViewHolder
    {
        ImageView chocolate;
        TextView chocolateName;
        public ViewInfo(View itemView)
        {
            super(itemView);
            chocolate = (ImageView) itemView.findViewById(R.id.im);
            chocolateName = (TextView) itemView.findViewById(R.id.choconame);
        }
    }
}
