package org.testcode;

import javax.servlet.http.HttpServletResponse;
import org.util.C;

public class AClean {

    public void suspiciousCall(java.sql.Statement statement, String sql, HttpServletResponse response) throws java.sql.SQLException {    
        sql = C.utilQuery(sql);
        int count = statement.executeUpdate(sql);
        org.owasp.benchmark.helpers.DatabaseHelper.outputUpdateComplete(sql, response);
    }

}
