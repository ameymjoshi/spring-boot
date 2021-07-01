package io.amey.myapp.entity;

import java.util.ArrayList;
import java.util.List;

public class Task {

    private int id;
    private String title;
    private String longDesc;
    private long dueDate;
    private long remindDate;
    private String assignedTo;
    private List<String> labels = new ArrayList<String>();
    private List<String> state = new ArrayList<String>();
    
    public Task(int id, String title, String longDesc, long dueDate, long remindDate, String assignedTo,
            List<String> labels, List<String> state) {
        this.id = id;
        this.title = title;
        this.longDesc = longDesc;
        this.dueDate = dueDate;
        this.remindDate = remindDate;
        this.assignedTo = assignedTo;
        this.labels = labels;
        this.state = state;
    }

    public Task(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Task [assignedTo=" + assignedTo + ", dueDate=" + dueDate + ", id=" + id + ", labels=" + labels
                + ", longDesc=" + longDesc + ", remindDate=" + remindDate + ", state=" + state + ", title=" + title
                + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    public long getDueDate() {
        return dueDate;
    }

    public void setDueDate(long dueDate) {
        this.dueDate = dueDate;
    }

    public long getRemindDate() {
        return remindDate;
    }

    public void setRemindDate(long remindDate) {
        this.remindDate = remindDate;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public List<String> getState() {
        return state;
    }

    public void setState(List<String> state) {
        this.state = state;
    }

    
    
}
