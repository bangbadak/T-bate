//package com.techtown.t_bate;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.EditText;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.ArrayList;
//
//public class PostingAdapter extends RecyclerView.Adapter<PostingAdapter.ViewHolder> {
//    private ArrayList<Posting> mData;
//
//    // 생성자에서 데이터 리스트 객체를 전달받음.
//    public PostingAdapter(ArrayList<Posting> list) {
//        mData = list ;
//    }
//
//    // onCreateViewHolder() - 아이템 뷰를 위한 뷰홀더 객체 생성하여 리턴.
//    @Override
//    public PostingAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        Context context = parent.getContext() ;
//        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;
//
//        View view = inflater.inflate(R.layout.activity_main, parent, false) ;
//        PostingAdapter.ViewHolder vh = new PostingAdapter.ViewHolder(view) ;
//
//        return vh ;
//    }
//
//    // onBindViewHolder() - position에 해당하는 데이터를 뷰홀더의 아이템뷰에 표시.
//    @Override
//    public void onBindViewHolder(ViewHolder holder, int position) {
//
//        Posting item = mData.get(position) ;
//
//        holder.postingName.setText(item.getPostingName()); ;
//        holder.postingContent.setText(item.getPostingContent()) ;
//    }
//
//    // getItemCount() - 전체 데이터 갯수 리턴.
//    @Override
//    public int getItemCount() {
//        return mData.size() ;
//    }
//
//    // 아이템 뷰를 저장하는 뷰홀더 클래스.
//    public class ViewHolder extends RecyclerView.ViewHolder {
//        EditText postingName ;
//        EditText postingContent ;
//
//
//        ViewHolder(View itemView) {
//            super(itemView) ;
//
//
//            postingName = itemView.findViewById(R.id.postingName);
//            postingContent = itemView.findViewById(R.id.postingContent);
//            // 뷰 객체에 대한 참조. (hold strong reference)
//        }
//    }
//}