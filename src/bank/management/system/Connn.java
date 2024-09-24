//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connn {
    Connection connection;
    Statement statement;

    public Connn() {
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "Fcypb9868@j");
            this.statement = this.connection.createStatement();
        } catch (Exception var2) {
            var2.printStackTrace();
        }

    }
}
