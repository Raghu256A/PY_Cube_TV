package com.example.py_cube_mobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv_detailsList;
    TextView tv_totalPatients;
    ArrayList<PatientDo> patientList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcv_detailsList = findViewById(R.id.rcv_detailsList);
        tv_totalPatients = findViewById(R.id.tv_totalPatients);
        PatientDo temp1= new PatientDo();
        patientList = new ArrayList<>();
        temp1.setPatientId("000001");
        temp1.setSampleId("Specimen A1054");
        temp1.setMRNNo("345768");
        temp1.setSurgicalSite("A");
        temp1.setDestinationlab("Lab A");
        temp1.setDate("05/02/24");
        patientList.add(temp1);
        PatientDo temp2= new PatientDo();
        PatientDo temp3= new PatientDo();

        temp2.setDate("05/02/24");
        temp3.setDate("05/02/24");
        temp2.setDestinationlab("Lab A");
        temp3.setDestinationlab("Lab A");
        temp2.setSurgicalSite("A");
        temp3.setSurgicalSite("A");
        temp2.setMRNNo("345769");
        temp3.setMRNNo("345770");
        temp2.setSampleId("Specimen A1055");
        temp3.setSampleId("Specimen A1056");
        temp2.setPatientId("000002");
        temp3.setPatientId("000003");
        patientList.add(temp2);
        patientList.add(temp3);
        tv_totalPatients.setText(patientList.size()+"");
        rcv_detailsList.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        rcv_detailsList.setAdapter(new PatientsDetailsView(patientList,this));
    }

}