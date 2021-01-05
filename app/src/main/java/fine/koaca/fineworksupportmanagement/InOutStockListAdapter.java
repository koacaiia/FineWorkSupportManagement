package fine.koaca.fineworksupportmanagement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class InOutStockListAdapter extends RecyclerView.Adapter<InOutStockListAdapter.ListViewHolder>{
    ArrayList<InOutStockList>  list;


    public InOutStockListAdapter(ArrayList<InOutStockList> list){
        this.list=list;

    }

    @NonNull
    @Override
    public InOutStockListAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.in_out_stock_list,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InOutStockListAdapter.ListViewHolder holder, int position) {
        holder.date.setText(list.get(position).getDate());
        holder.in.setText(list.get(position).getIn());
        holder.out.setText(list.get(position).getOut());
        holder.remark.setText(list.get(position).getRemark());
        holder.stock.setText(list.get(position).getStock());
    }

    @Override
    public int getItemCount() {

        return list.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView date;
        TextView in;
        TextView out;
        TextView stock;
        TextView remark;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            this.date=itemView.findViewById(R.id.in_out_stock_date);
            this.in=itemView.findViewById(R.id.in_out_stock_in);
            this.out=itemView.findViewById(R.id.in_out_stock_out);
            this.remark=itemView.findViewById(R.id.in_out_stock_remark);
            this.stock=itemView.findViewById(R.id.in_out_stock_stock);
        }
    }
}
