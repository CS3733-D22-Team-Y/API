package edu.wpi.teamY.Model;

import java.util.List;
import java.sql.*;

public class SecurityServiceImpl implements SecurityServiceRequestDAO{
	static Connection conn = DatabaseConnection.getConnection();

	@Override
	public List<SecurityService> getAllSecurityServiceReq() {
		return null;
	}

	@Override
	public SecurityService getSecurityServiceReq(String requestNum) {
		return null;
	}

	@Override
	public void addSecurityServiceReq(SecurityService ssreq) {

	}

	@Override
	public void updateSecurityServiceReq(SecurityService ssreq) {

	}

	@Override
	public void deleteSecurityServiceReq(SecurityService ssreq) {

	}
}
