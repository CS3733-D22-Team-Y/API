package edu.wpi.teamY.Model;

import edu.wpi.teamY.Model.Exception.DaoGetException;
import java.sql.*;
import java.util.List;

public interface SecurityServiceRequestDAO {
  List<SecurityService> getAllSecurityServiceReq();

  SecurityService getSecurityServiceReq(String nodeID) throws DaoGetException;

  void addSecurityServiceReq(SecurityService ssreq);

  void updateSecurityServiceReq(SecurityService ssreq);

  void deleteSecurityServiceReq(SecurityService ssreq);
}
