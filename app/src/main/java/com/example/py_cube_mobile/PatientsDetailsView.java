package com.example.py_cube_mobile;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PatientsDetailsView extends RecyclerView.Adapter<PatientsDetailsView.PatientListView> {
    ArrayList<PatientDo> patientList;
    Context context;

    public PatientsDetailsView(ArrayList<PatientDo> patientList, Context context) {
        this.patientList = patientList;
        this.context = context;
    }

    @NonNull
    @Override
    public PatientListView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.patient_detail_view, parent, false);

        return new PatientListView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PatientListView holder, int position) {
        PatientDo patientDo = patientList.get(position);
        holder.tv_Patient_Id.setText(patientDo.getPatientId());
        holder.tv_sample_Id.setText(patientDo.getSampleId());
        holder.tv_MRN_No.setText(patientDo.getMRNNo());
        holder.tv_surgical_Site.setText(patientDo.getSurgicalSite());
        holder.tv_Destination_lab.setText(patientDo.getDestinationlab());
        holder.tv_Date.setText(patientDo.getDate());
         holder.tv_ViewDetails.setText("View Details");
         if(position== patientList.size()-1){
             holder. rb_select.setBackgroundResource(R.drawable.bottum_liftside);
         }
        holder.rb_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!patientDo.isSelected()) {
                    patientDo.setSelected(true);
                    holder.tv_Patient_Id.setBackgroundColor(Color.rgb(255, 237, 117));
                    holder.tv_sample_Id.setBackgroundColor(Color.rgb(255, 237, 117));
                    holder.tv_MRN_No.setBackgroundColor(Color.rgb(255, 237, 117));
                    holder.tv_surgical_Site.setBackgroundColor(Color.rgb(255, 237, 117));
                    holder.tv_Destination_lab.setBackgroundColor(Color.rgb(255, 237, 117));
                    holder.tv_Date.setBackgroundColor(Color.rgb(255, 237, 117));
                    holder.tv_ViewDetails.setBackgroundColor(Color.rgb(255, 237, 117));
                    holder.rb_select.setBackgroundColor(Color.rgb(255, 237, 117));
                } else {
                    patientDo.setSelected(false);
                    holder.rb_select.setChecked(false);
                    holder.tv_Patient_Id.setBackgroundColor(Color.rgb(250, 250, 250));
                    holder.tv_sample_Id.setBackgroundColor(Color.rgb(250, 250, 250));
                    holder.tv_MRN_No.setBackgroundColor(Color.rgb(250, 250, 250));
                    holder.tv_surgical_Site.setBackgroundColor(Color.rgb(250, 250, 250));
                    holder.tv_Destination_lab.setBackgroundColor(Color.rgb(250, 250, 250));
                    holder.tv_Date.setBackgroundColor(Color.rgb(250, 250, 250));
                    holder.tv_ViewDetails.setBackgroundColor(Color.rgb(250, 250, 250));
                    holder.rb_select.setBackgroundColor(Color.rgb(250, 250, 250));

                }
            }
        });

    }


    @Override
    public int getItemCount() {
        return patientList.size();
    }

    public static class PatientListView extends RecyclerView.ViewHolder {

        TextView tv_Patient_Id, tv_sample_Id, tv_MRN_No, tv_surgical_Site, tv_Destination_lab,
                tv_Date, tv_ViewDetails;
        RadioButton rb_select;

        public PatientListView(@NonNull View itemView) {
            super(itemView);
            rb_select = itemView.findViewById(R.id.rb_select);
            tv_Patient_Id = itemView.findViewById(R.id.tv_Patient_Id);
            tv_sample_Id = itemView.findViewById(R.id.tv_sample_Id);
            tv_MRN_No = itemView.findViewById(R.id.tv_MRN_No);
            tv_surgical_Site = itemView.findViewById(R.id.tv_surgical_Site);
            tv_Destination_lab = itemView.findViewById(R.id.tv_Destination_lab);
            tv_Date = itemView.findViewById(R.id.tv_Date);
            tv_ViewDetails = itemView.findViewById(R.id.tv_ViewDetails);
        }
    }
}
