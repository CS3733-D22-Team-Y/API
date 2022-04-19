package edu.wpi.teamY.Model;

import java.sql.*;
import java.util.List;

public interface SecurityServiceRequestDAO {
	List<SecurityService> getAllSecurityServiceReq();

	SecurityService getSecurityServiceReq(String requestNum);

	void addSecurityServiceReq(SecurityService ssreq);

	void updateSecurityServiceReq(SecurityService ssreq);

	void deleteSecurityServiceReq(SecurityService ssreq);
}
