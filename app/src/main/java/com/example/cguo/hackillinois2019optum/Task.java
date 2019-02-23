package com.example.cguo.hackillinois2019optum;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Task {
    private int task_id;
    private String task_type;
    private int employee_id;
    private int patient_id;
    private String due_date;
    @SerializedName("prioirty_level")
    private String priority_level;

    public String getDue_date() {
        return due_date;
    }

    public String getPriority_level() {
        return priority_level;
    }

    public int getTask_id() {
        return task_id;
    }

    public String getTask_type() {
        return task_type;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public int getPatient_id() {
        return patient_id;
    }
}
