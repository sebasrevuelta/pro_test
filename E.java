package org.testcode;

import javax.servlet.http.HttpServletResponse;
import org.util.C;

public class E {

    public void suspiciousCall(java.sql.Statement statement, String sql, HttpServletResponse response) throws java.sql.SQLException {    
        int count = statement.executeUpdate(sql);
        C.checkSQLQuery(sql);
        org.owasp.benchmark.helpers.DatabaseHelper.outputUpdateComplete(sql, response);
    }

}
