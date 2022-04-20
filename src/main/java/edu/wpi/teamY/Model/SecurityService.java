package edu.wpi.teamY.Model;

import javax.persistence.*;

@Entity
@Table(name = "SecurityService")
public class SecurityService implements StringArrayConv {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int id;

  String nodeID;
  String priority;
  String status;
  String assignedEmployee;
  String additionalNotes;

  public SecurityService() {}

  public SecurityService(
      String nodeID,
      String priority,
      String status,
      String assignedEmployee,
      String additionalNotes) {
    this.nodeID = nodeID;
    this.priority = priority;
    this.status = status;
    this.assignedEmployee = assignedEmployee;
    this.additionalNotes = additionalNotes;
  }

  public String getNodeID() {
    return nodeID;
  }

  public void setNodeID(String nodeID) {
    this.nodeID = nodeID;
  }

  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getAssignedEmployee() {
    return assignedEmployee;
  }

  public void setAssignedEmployee(String assignedEmployee) {
    this.assignedEmployee = assignedEmployee;
  }

  public String getAdditionalNotes() {
    return additionalNotes;
  }

  public void setAdditionalNotes(String additionalNotes) {
    this.additionalNotes = additionalNotes;
  }

  @Override
  public String[] toStringArray() {
    return new String[0];
  }

  @Override
  public void fromStringArray(String[] args) {}
}
