package org.testcode;

import javax.servlet.http.HttpServletResponse;
import org.util.C;

public class A {

    public void suspiciousCall(java.sql.Statement statement, String sql, HttpServletResponse response) throws java.sql.SQLException {    
        SQL = C.fixQuery(sql);
        int count = statement.executeUpdate(sql);
        org.owasp.benchmark.helpers.DatabaseHelper.outputUpdateComplete(sql, response);
    }

}
