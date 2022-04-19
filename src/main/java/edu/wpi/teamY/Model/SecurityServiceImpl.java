package edu.wpi.teamY.Model;

import edu.wpi.teamY.Model.Exception.DaoGetException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SecurityServiceImpl implements SecurityServiceRequestDAO {
  static Connection conn = DatabaseConnection.getConnection();

  @Override
  public List<SecurityService> getAllSecurityServiceReq() {
    List<SecurityService> securityServiceReqs = new ArrayList<>();
    try {
      Statement s = conn.createStatement();
      ResultSet rs = s.executeQuery("SELECT * FROM SECURITYSERVICEREQ");
      while (rs.next()) {
        securityServiceReqs.add(
            new SecurityService(
                rs.getString("nodeID"),
                rs.getString("priority"),
                rs.getString("status"),
                rs.getString("assignedEmployee"),
                rs.getString("additionalNotes")));
      }
      return securityServiceReqs;
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

  @Override
  public SecurityService getSecurityServiceReq(String nodeID) throws DaoGetException {
    try {
      PreparedStatement s =
          conn.prepareStatement("SELECT * FROM SECURITYSERVICEREQ WHERE NODEID = ?");
      s.setString(1, nodeID);
      ResultSet rs = s.executeQuery();
      if (rs.next()) {
        return new SecurityService(
            rs.getString("NODEID"),
            rs.getString("PRIORITY"),
            rs.getString("STATUS"),
            rs.getString("ASSIGNEDEMPLOYEE"),
            rs.getString("ADDITIONALNOTES"));
      } else {
        throw new DaoGetException(
            new Exception("No Medical Equipment Request with NodeID = " + nodeID));
      }

    } catch (SQLException e) {
      throw new DaoGetException(e);
    }
  }

  @Override
  public void addSecurityServiceReq(SecurityService ssreq) {
    try {
      PreparedStatement s =
          conn.prepareStatement(
              "INSERT INTO SECURITYSERVICEREQ (NODEID, PRIORITY, STATUS, ASSIGNEDEMPLOYEE, ADDITIONALNOTES) values (?, ?, ?, ?, ?)");
      s.setString(1, ssreq.getNodeID());
      s.setString(2, ssreq.getPriority());
      s.setString(3, ssreq.getStatus());
      s.setString(4, ssreq.getAssignedEmployee());
      s.setString(5, ssreq.getAdditionalNotes());
      s.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void updateSecurityServiceReq(SecurityService ssreq) {
    try {
      PreparedStatement s =
          conn.prepareStatement(
              "UPDATE SECURITYSERVICEREQ SET PRIORITY = ?, STATUS = ?, ASSIGNEDEMPLOYEE = ?, ADDITIONALNOTES = ? WHERE NODEID = ?");
      s.setString(1, ssreq.getPriority());
      s.setString(2, ssreq.getStatus());
      s.setString(3, ssreq.getAssignedEmployee());
      s.setString(4, ssreq.getAdditionalNotes());
      s.setString(5, ssreq.getNodeID());
      s.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void deleteSecurityServiceReq(SecurityService ssreq) {
    try {
      PreparedStatement s =
          conn.prepareStatement("DELETE FROM SECURITYSERVICEREQ WHERE NODEID = ?");
      s.setString(1, ssreq.getNodeID());
      s.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
